package com.erp.biz.api.handle.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.erp.biz.api.handle.OrderHandele;
import com.erp.biz.api.model.order.*;
import com.erp.biz.model.Data;
import com.erp.biz.util.Helper;
import com.erp.biz.util.JAXBUtil;
import com.erp.common.HttpMethod;
import com.erp.db.model.UserInfo;

@Service
public class OrderHandeleImpl extends BaseHandele implements OrderHandele
{
    private static final Logger LOGGER = LogManager.getLogger(OrderHandeleImpl.class);

    /**
     * 获取订单
     * 
     * @param finalUrl
     * @return
     * @throws Exception
     */
    @Override
    public List<Order> getAllOrders(String finalUrl, UserInfo user) throws Exception
    {
        HttpMethod httpMethod = HttpMethod.GET;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), false);

        List<Order> orderList = new ArrayList<>();
        String xml = null;
        try
        {
            String requestBoby = null;
            xml = baseSend(finalUrl, map, httpMethod, requestBoby);
            OrdersListType ordersListType = JAXBUtil.converyToJavaBean(xml, OrdersListType.class);
            MetaType meta = ordersListType.getMeta();
            List<Order> orders = ordersListType.getElements().getOrder();
            orderList.addAll(orders);
            if (meta != null && meta.getNextCursor() != null)
            {
                String nextUrl = baseUrl + "v3/orders" + meta.getNextCursor();
                orderList.addAll(getAllOrders(nextUrl, user));
            }
        }
        catch (Exception e)
        {
            throwError(xml);
        }
        // return orderList;
        return acknowledgedOrderList(orderList, user);
    }

    private List<Order> acknowledgedOrderList(List<Order> orderList, UserInfo user)
    {
        for (Order order : orderList)
        {
            String purchaseOrderId = order.getPurchaseOrderId();
            OrderLineStatusValueType orderStatus = order.getOrderLines().getOrderLine().get(0).getOrderLineStatuses()
                    .getOrderLineStatus().get(0).getStatus();
            if (OrderLineStatusValueType.CREATED.name().equals(orderStatus.name()))
            {
                Order acknowledgeOrder = acknowledgeOrder(purchaseOrderId, user);
                // 暂时call api2次
                if (acknowledgeOrder == null)
                {
                    acknowledgeOrder(purchaseOrderId, user);
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
    @Override
    public Order acknowledgeOrder(String purchaseOrderId, UserInfo user)
    {
        String finalUrl = baseUrl + "v3/orders/" + purchaseOrderId + "/acknowledge";
        HttpMethod httpMethod = HttpMethod.POST;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), false);
        Order acknowledgeOrder = null;
        try
        {
            String requestBoby = null;
            String xml = baseSend(finalUrl, map, httpMethod, requestBoby);
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
    @Override
    public Order fulfillOneOrder(String purchaseOrderId, List<Data> datas, String trackingNumber, String carrier,
            UserInfo user) throws Exception
    {
        String finalUrl = baseUrl + "v3/orders/" + purchaseOrderId + "/shipping";
        HttpMethod httpMethod = HttpMethod.POST;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), false);
        Order order = null;
        String xml = null;
        try
        {
            OrderShipment orderShipment = setOrderShipment(datas, trackingNumber, carrier);
            String requestBoby = JAXBUtil.convertToXml(orderShipment);
            xml = baseSend(finalUrl, map, httpMethod, requestBoby);
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
    @Override
    public Order cancellingOrder(String purchaseOrderId, List<Data> list, UserInfo user) throws Exception
    {
        String finalUrl = baseUrl + "v3/orders/" + purchaseOrderId + "/cancel";
        HttpMethod httpMethod = HttpMethod.POST;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), false);
        Order order = null;
        String xml = null;
        try
        {
            OrderCancellation orderLines = setOrderCancell(list);
            String requestBoby = JAXBUtil.convertToXml(orderLines);
            xml = baseSend(finalUrl, map, httpMethod, requestBoby);
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
    @Override
    public Order refund(String purchaseOrderId, List<OrderLineType> list, UserInfo user) throws Exception
    {
        String finalUrl = baseUrl + "v3/orders/" + purchaseOrderId + "/refund";
        HttpMethod httpMethod = HttpMethod.POST;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), false);
        Order order = null;
        String xml = null;
        try
        {
            OrderRefund orderLines = setOrderRefund(list);
            String requestBoby = JAXBUtil.convertToXml(orderLines);
            xml = baseSend(finalUrl, map, httpMethod, requestBoby);
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
            // String refundComments = "test";
            // refundType.setRefundComments(refundComments);
            RefundChargesType refundCharges = new RefundChargesType();
            for (ChargeType type : data.getCharges().getCharge())
            {
                RefundChargeType refundChargeType = new RefundChargeType();
                refundChargeType.setRefundReason(ReasonCodesType.CUSTOMER_CHANGED_MIND);
                ChargeType charge = new ChargeType();
                charge.setChargeType(type.getChargeType());
                charge.setChargeName(type.getChargeName());
                MoneyType chargeAmount = type.getChargeAmount();
                chargeAmount.setAmount(Helper.bigDecimal2Negative(chargeAmount.getAmount()));
                charge.setChargeAmount(chargeAmount);
                TaxType taxType = type.getTax();
                if (taxType != null)
                {
                    TaxType tax = new TaxType();
                    tax.setTaxName(taxType.getTaxName());
                    MoneyType taxAmoun = taxType.getTaxAmount();
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
