package com.erp.biz.api.handle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.erp.biz.api.model.order.*;
import com.erp.biz.model.Data;
import com.erp.biz.util.Helper;
import com.erp.biz.util.HttpClientHelper;
import com.erp.biz.util.JAXBUtil;
import com.erp.common.Common;
import com.erp.controller.ItemController;

public class OrderHandele extends BaseHandele
{
    private static final Logger LOGGER = LogManager.getLogger(ItemController.class);

    public OrderHandele(String consumerId, String privateEncodedStr)
    {
        super(consumerId, privateEncodedStr);
    }

    /**
     * 获取订单
     * 
     * @param finalUrl
     * @return
     * @throws Exception
     */
    public List<Order> getAllOrders(String finalUrl) throws Exception
    {
        // String finalUrl = baseUrl + "v3/orders?createdStartDate=" + createdStartDate;
        HttpClientHelper httpClient = createHttpClient(finalUrl, Common.GET);

        List<Order> orderList = new ArrayList<>();
        String xml = null;
        try
        {
            LOGGER.info(finalUrl);
            xml = httpClient.doHttpGet(finalUrl);
            LOGGER.info(xml);
            OrdersListType ordersListType = JAXBUtil.converyToJavaBean(xml, OrdersListType.class);
            MetaType meta = ordersListType.getMeta();
            List<Order> orders = ordersListType.getElements().getOrder();
            orderList.addAll(orders);
            if (meta != null && meta.getNextCursor() != null)
            {
                String nextUrl = baseUrl + "v3/orders" + meta.getNextCursor();
                orderList.addAll(getAllOrders(nextUrl));
            }
        }
        catch (Exception e)
        {
            throwError(xml);
        }
        // return orderList;
        return acknowledgedOrderList(orderList);
    }

    private List<Order> acknowledgedOrderList(List<Order> orderList)
    {
        for (Order order : orderList)
        {
            String purchaseOrderId = order.getPurchaseOrderId();
            OrderLineStatusValueType orderStatus = order.getOrderLines().getOrderLine().get(0).getOrderLineStatuses()
                    .getOrderLineStatus().get(0).getStatus();
            if (OrderLineStatusValueType.CREATED.equals(orderStatus))
            {
                Order acknowledgeOrder = acknowledgeOrder(purchaseOrderId);
                // 暂时call api2次
                if (acknowledgeOrder == null)
                {
                    acknowledgeOrder(purchaseOrderId);
                }
            }
        }
        return orderList;
    }

    /**
     * 确认订单
     * 
     * @param purchaseOrderId
     * @return
     */
    private Order acknowledgeOrder(String purchaseOrderId)
    {
        String requestUrl = baseUrl + "v3/orders/" + purchaseOrderId + "/acknowledge";
        HttpClientHelper httpClient = createHttpClient(requestUrl, Common.POST);
        Order acknowledgeOrder = null;
        try
        {
            String xml = httpClient.doHttpPost(requestUrl, null);
            acknowledgeOrder = JAXBUtil.converyToJavaBean(xml, Order.class);
        }
        catch (Exception e)
        {
            LOGGER.info("acknowledge order purchaseOrderId as:" + purchaseOrderId + "," + e);
        }
        return acknowledgeOrder;
    }

    /**
     * 上传Tracking
     * 
     * @param purchaseOrderId
     * @param lineNumbers
     * @param trackingNumber
     * @param carrier
     * @param methodCode
     * @param shipDateTime
     * @return
     * @throws Exception
     */
    public Order fulfillOneOrder(String purchaseOrderId, List<Data> datas, String trackingNumber, String carrier)
            throws Exception
    {
        String requestUrl = baseUrl + "v3/orders/" + purchaseOrderId + "/shipping";
        HttpClientHelper httpClient = createHttpClient(requestUrl, Common.POST);
        Order order = null;
        String xml = null;
        try
        {
            LOGGER.info(requestUrl);
            OrderShipment orderShipment = setOrderShipment(datas, trackingNumber, carrier);
            String requestBoby = JAXBUtil.convertToXml(orderShipment);
            LOGGER.info(purchaseOrderId + ": " + requestBoby);
            xml = httpClient.doHttpPost(requestUrl, requestBoby);
            order = JAXBUtil.converyToJavaBean(xml, Order.class);

        }
        catch (Exception e)
        {
            throwError(xml);
        }
        return order;
    }

    /**
     * 取消一个订单
     * 
     * @param purchaseOrderId
     * @param list
     * @throws Exception
     */
    public Order cancellingOrder(String purchaseOrderId, List<Data> list) throws Exception
    {
        String requestUrl = baseUrl + "v3/orders/" + purchaseOrderId + "/cancel";
        HttpClientHelper httpClient = createHttpClient(requestUrl, Common.POST);
        Order order = null;
        String xml = null;
        try
        {
            LOGGER.info(requestUrl);
            OrderCancellation orderLines = setOrderCancell(list);
            String str = JAXBUtil.convertToXml(orderLines);
            LOGGER.info(str);
            xml = httpClient.doHttpPost(requestUrl, str);
            LOGGER.info(xml);
            order = JAXBUtil.converyToJavaBean(xml, Order.class);

        }
        catch (Exception e)
        {
            throwError(xml);
        }
        return order;
    }

    /**
     * 退款
     * 
     * @param purchaseOrderId
     * @param list
     * @return
     * @throws Exception
     */
    public Order refund(String purchaseOrderId, List<OrderLineType> list) throws Exception
    {
        String requestUrl = baseUrl + "v3/orders/" + purchaseOrderId + "/refund";
        HttpClientHelper httpClient = createHttpClient(requestUrl, Common.POST);
        Order order = null;
        String xml = null;
        try
        {
            LOGGER.info(requestUrl);
            OrderRefund orderLines = setOrderRefund(list);
            String str = JAXBUtil.convertToXml(orderLines);
            LOGGER.info(str);
            xml = httpClient.doHttpPost(requestUrl, str);
            LOGGER.info(xml);
            order = JAXBUtil.converyToJavaBean(xml, Order.class);

        }
        catch (Exception e)
        {
            throwError(xml);
        }
        return order;
    }

    private static OrderRefund setOrderRefund(List<OrderLineType> list)
    {
        OrderRefund orders = new OrderRefund();
        RefundLinesType orderLines = new RefundLinesType();
        for (OrderLineType data : list)
        {
            RefundLineType order = new RefundLineType();
            RefundsType refunds = new RefundsType();
            RefundType refundType = new RefundType();
//            String refundComments = "test";
//            refundType.setRefundComments(refundComments);
            RefundChargesType refundCharges = new RefundChargesType();
            for (ChargeType type : data.getCharges().getCharge())
            {
                RefundChargeType refundChargeType = new RefundChargeType();
                refundChargeType.setRefundReason(ReasonCodesType.CUSTOMER_CHANGED_MIND);
                ChargeType charge = new ChargeType();
                charge.setChargeType(type.getChargeType());
                charge.setChargeName(type.getChargeName());
                MoneyType chargeAmount= type.getChargeAmount();
                chargeAmount.setAmount(Helper.bigDecimal2Negative(chargeAmount.getAmount()));
                charge.setChargeAmount(chargeAmount);
                TaxType taxType = type.getTax();
                if (taxType != null)
                {
                    TaxType tax = new TaxType();
                    tax.setTaxName(taxType.getTaxName());
                    MoneyType taxAmoun=taxType.getTaxAmount();
                    taxAmoun.setAmount(Helper.bigDecimal2Negative(taxAmoun.getAmount()));
                    tax.setTaxAmount(taxAmoun);
                    charge.setTax(tax);
                }
                refundChargeType.setCharge(charge);
                refundCharges.getRefundCharge().add(refundChargeType);
            }
            refundType.setRefundCharges(refundCharges);
            refunds.getRefund().add(refundType);

            String lineNumber = data.getLineNumber();
            order.setLineNumber(lineNumber);
            order.setRefunds(refunds);

            orderLines.getOrderLine().add(order);
        }
        orders.setOrderLines(orderLines);
        return orders;
    }

    private static OrderCancellation setOrderCancell(List<Data> list)
    {
        OrderCancellation cancellation = new OrderCancellation();
        CancelLinesType orderLines = new CancelLinesType();
        for (Data data : list)
        {
            String amount = data.getAmount();
            amount = amount.substring(0, amount.indexOf("."));
            CancelLineType order = new CancelLineType();
            CancelLineStatusesType orderLineStatuses = new CancelLineStatusesType();
            CancelLineStatusType lineStatusType = new CancelLineStatusType();
            lineStatusType.setStatus(OrderLineStatusValueType.CANCELLED);
            QuantityType statusQuantity = new QuantityType();
            statusQuantity.setAmount(amount);
            statusQuantity.setUnitOfMeasurement(data.getUnitOfMeasurement());
            lineStatusType.setStatusQuantity(statusQuantity);
            lineStatusType.setCancellationReason(CancellationReasonType.CANCEL_BY_SELLER);
            orderLineStatuses.getOrderLineStatus().add(lineStatusType);
            String lineNumber = data.getLineNumber() + "";
            order.setLineNumber(lineNumber);
            order.setOrderLineStatuses(orderLineStatuses);
            orderLines.getOrderLine().add(order);
        }
        cancellation.setOrderLines(orderLines);
        return cancellation;
    }

    private static OrderShipment setOrderShipment(List<Data> datas, String trackingNumber, String carrier)
    {
        OrderShipment orderShipment = new OrderShipment();
        ShippingLinesType orderLines = new ShippingLinesType();
        for (Data data : datas)
        {
            String amount = data.getAmount();
            amount = amount.substring(0, amount.indexOf("."));
            ShippingLineType shippingLine = new ShippingLineType();
            shippingLine.setLineNumber(data.getLineNumber() + "");
            ShipLineStatusesType orderLineStatuses = new ShipLineStatusesType();
            ShipLineStatusType shipLineStatusType = new ShipLineStatusType();
            shipLineStatusType.setStatus(OrderLineStatusValueType.SHIPPED);

            TrackingInfoType trackingInfo = new TrackingInfoType();
            CarrierNameType carrierName = new CarrierNameType();
            CarrierType carrierType = CarrierType.fromValue(carrier);
            carrierName.setCarrier(carrierType);
            trackingInfo.setCarrierName(carrierName);
            trackingInfo.setMethodCode(ShippingMethodCodeType.STANDARD);
            trackingInfo.setTrackingNumber(trackingNumber);
            trackingInfo.setShipDateTime(Helper.convertToXMLGregorianCalendar(new Date()));
            shipLineStatusType.setTrackingInfo(trackingInfo);

            QuantityType statusQuantity = new QuantityType();
            statusQuantity.setAmount(amount);
            statusQuantity.setUnitOfMeasurement(data.getUnitOfMeasurement());
            shipLineStatusType.setStatusQuantity(statusQuantity);

            orderLineStatuses.getOrderLineStatus().add(shipLineStatusType);
            shippingLine.setOrderLineStatuses(orderLineStatuses);
            orderLines.getOrderLine().add(shippingLine);
        }
        orderShipment.setOrderLines(orderLines);
        return orderShipment;
    }
}
