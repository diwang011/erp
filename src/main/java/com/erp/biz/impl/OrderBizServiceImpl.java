package com.erp.biz.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.apache.axis.utils.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.biz.IOrderBizService;
import com.erp.biz.api.handle.OrderHandele;
import com.erp.biz.api.handle.impl.BaseHandele;
import com.erp.biz.api.model.order.ChargeType;
import com.erp.biz.api.model.order.ChargesType;
import com.erp.biz.api.model.order.Order;
import com.erp.biz.api.model.order.OrderLineType;
import com.erp.biz.api.model.order.RefundChargeType;
import com.erp.biz.api.model.order.RefundType;
import com.erp.biz.api.model.order.ShippingInfoType;
import com.erp.biz.api.model.order.TrackingInfoType;
import com.erp.biz.model.Data;
import com.erp.biz.util.Helper;
import com.erp.common.Common;
import com.erp.db.model.Charges;
import com.erp.db.model.OrderItem;
import com.erp.db.model.Orders;
import com.erp.db.model.ShippingInfo;
import com.erp.db.model.UserInfo;
import com.erp.db.service.IChargesService;
import com.erp.db.service.IOrderItemService;
import com.erp.db.service.IOrdersService;
import com.erp.db.service.IShippingInfoService;
import com.erp.model.OrderCondition;
import com.erp.model.TrackingInfo;
import com.erp.view.model.ViewCharge;
import com.erp.view.model.ViewOrderItem;
import com.erp.view.model.ViewOrders;
import com.erp.view.model.ViewRefund;
import com.erp.view.model.ViewShippingInfo;

/**
 * 
 * @author dev003
 *
 */
@Service("IOrderBizService")
@Transactional(rollbackFor = { Exception.class })
public class OrderBizServiceImpl extends BaseBizService implements IOrderBizService
{
    @Resource
    private IOrdersService orderService;
    @Resource
    private IOrderItemService orderItemService;
    @Resource
    private IChargesService chargesService;
    @Resource
    private IShippingInfoService shippingInfoService;

    @Override
    public Boolean saveOrder(String poId, UserInfo user) throws Exception
    {
        if (user == null)
        {
            return false;
        }
        List<Order> orders = getOrderList(poId, user);
        for (Order order : orders)
        {
            int i = saveOneOrder(order, user);
            if (i != 1)
            {
                return false;
            }
        }
        return true;
    }

    private int saveOneOrder(Order order, UserInfo user)
    {
        String status = order.getOrderLines().getOrderLine().get(0).getOrderLineStatuses().getOrderLineStatus().get(0)
                .getStatus().name();
        String purchaseOrderId = order.getPurchaseOrderId();
        List<Orders> orderList = orderService.listByPoId(purchaseOrderId, null, user.getId());
        Orders oo = null;
        int i = 0;
        if (orderList != null && orderList.size() > 0)
        {
            oo = orderList.get(0);
            oo.setOrderStatus(status);
            i = orderService.update(oo);
        }
        else
        {
            oo = conversionOrder(order, user.getId(), status);
            i = orderService.insert(oo);
            saveShipingInfo(order.getShippingInfo(), oo.getId());
        }
        saveOrderItem(oo.getId(), order);
        return i;
    }

    private void saveOrderItem(Integer orderId, Order order)
    {
        orderItemService.deleteByOrderId(orderId);
        List<OrderLineType> lineTypes = order.getOrderLines().getOrderLine();
        for (int j = 0; j < lineTypes.size(); j++)
        {
            OrderLineType line = lineTypes.get(j);
            OrderItem entity = new OrderItem();
            entity.setSku(line.getItem().getSku());
            entity.setLineNumber(line.getLineNumber());
            entity.setUnit(line.getOrderLineQuantity().getUnitOfMeasurement());
            entity.setOrderId(orderId);
            entity.setAmount(line.getOrderLineQuantity().getAmount() == null ? 0.0
                    : Helper.String2BigDecimal(line.getOrderLineQuantity().getAmount()).doubleValue());
            entity.setProductName(line.getItem().getProductName());
            entity.setOrderStatus(line.getOrderLineStatuses().getOrderLineStatus().get(0).getStatus().name());
            TrackingInfoType trackingInfoType = line.getOrderLineStatuses().getOrderLineStatus().get(0)
                    .getTrackingInfo();
            if (trackingInfoType != null)
            {
                entity.setCarrierName(trackingInfoType.getCarrierName().getCarrier().name());
                entity.setTrackingNumber(trackingInfoType.getTrackingNumber());
                entity.setMethodCode(trackingInfoType.getMethodCode().name());
                entity.setShipDate(Helper.convertToDate(trackingInfoType.getShipDateTime()));
            }
            orderItemService.insert(entity);
            saveCharges(line, entity.getId());
        }
    }

    private void saveShipingInfo(ShippingInfoType shippingInfoType, Integer orderId)
    {
        ShippingInfo ship = new ShippingInfo();
        BeanUtils.copyProperties(shippingInfoType.getPostalAddress(), ship);
        ship.setOrderId(orderId);
        ship.setPhone(shippingInfoType.getPhone());
        ship.setEstimatedDeliveryDate(Helper.convertToDate(shippingInfoType.getEstimatedDeliveryDate()));
        ship.setEstimatedShipDate(Helper.convertToDate(shippingInfoType.getEstimatedShipDate()));
        shippingInfoService.insert(ship);
    }

    private void saveCharges(OrderLineType line, Integer orderItemId)
    {
        chargesService.deleteByOrderItemId(orderItemId, null);
        ChargesType listCharge = line.getCharges();
        RefundType listRefund = line.getRefund();
        if (listCharge != null)
        {
            for (ChargeType charge : listCharge.getCharge())
            {
                String refundReason = null;
                saveCharge(orderItemId, charge, refundReason, Common.CHARGE);

            }
        }
        if (listRefund != null)
        {
            for (RefundChargeType refundChargeType : listRefund.getRefundCharges().getRefundCharge())
            {
                ChargeType charge = refundChargeType.getCharge();
                String refundReason = refundChargeType.getRefundReason().name();
                saveCharge(orderItemId, charge, refundReason, Common.REFUND_CHARGE);
            }
        }
    }

    private void saveCharge(Integer orderItemId, ChargeType charge, String refundReason, String type)
    {
        Charges charges = new Charges();
        charges.setChargeAmount(charge.getChargeAmount().getAmount().doubleValue());
        charges.setChargeCategory(type);
        charges.setChargeCurrency(charge.getChargeAmount().getCurrency().name());
        charges.setChargeName(charge.getChargeName());
        charges.setChargeType(charge.getChargeType());
        charges.setOrderItemId(orderItemId);
        charges.setRefundReason(refundReason);
        if (charge.getTax() != null)
        {
            charges.setTaxAmount(charge.getTax().getTaxAmount().getAmount().doubleValue());
            charges.setTaxCurrency(charge.getTax().getTaxAmount().getCurrency().name());
            charges.setTaxName(charge.getTax().getTaxName());
        }
        chargesService.insert(charges);
    }

    @Resource
    private OrderHandele orderHandele;

    private List<Order> getOrderList(String poId, UserInfo user) throws Exception
    {
        String finalUrl = BaseHandele.baseUrl + "v3/orders?createdStartDate=" + Common.CREATED_START_DATE;
        if (!StringUtils.isEmpty(poId))
        {
            finalUrl = finalUrl + "&purchaseOrderId=" + poId;
        }
        List<Order> orders = null;
        try
        {
            orders = orderHandele.getAllOrders(finalUrl, user);
        }
        catch (Exception e)
        {
            try
            {
                orders = orderHandele.getAllOrders(finalUrl, user);
            }
            catch (Exception e1)
            {
                throw e1;

            }
        }
        return orders;
    }

    private Orders conversionOrder(Order fromBean, Integer userId, String status)
    {
        Orders toBean = new Orders();
        BeanUtils.copyProperties(fromBean, toBean);
        toBean.setOrderStatus(status);
        toBean.setUserId(userId);
        toBean.setOrderDate(Helper.convertToDate(fromBean.getOrderDate()));
        return toBean;
    }

    @Override
    public Boolean cancelOrder(OrderCondition condition, UserInfo user) throws Exception
    {
        if (user == null)
        {
            return false;
        }
        Order order = null;
        try
        {
            String purchaseOrderId = condition.getPurchaseOrderId();
            String lineNumber = condition.getLineNumber();
            List<Data> list = ListOrderItemData(purchaseOrderId, user, lineNumber);
            order = orderHandele.cancellingOrder(purchaseOrderId, list, user);
            saveOneOrder(order, user);
        }
        catch (Exception e)
        {
            throw e;

        }
        if (order == null)
        {
            return false;
        }
        return true;
    }

    @Override
    public Boolean refundOrder(ViewCharge condition, UserInfo user) throws Exception
    {
        if (user == null)
        {
            return false;
        }
        Order order = null;
        try
        {
            String purchaseOrderId = condition.getPurchaseOrderId();
            Order orderType = getOrderList(purchaseOrderId, user).get(0);
            if (orderType == null || orderType.getOrderLines() == null)
            {
                return false;
            }
            List<OrderLineType> list = filter(condition, orderType);
            order = orderHandele.refund(purchaseOrderId, list, user);
            saveOneOrder(order, user);
        }
        catch (Exception e)
        {
            throw e;

        }
        if (order == null)
        {
            return false;
        }
        return true;
    }

    /**
     * 过滤退款的item
     * 
     * @param condition
     * @param orderType
     * @return
     */
    private List<OrderLineType> filter(ViewCharge condition, Order orderType)
    {
        String lineNumber = condition.getLineNumber();
        Integer chargesId = condition.getId();
        Double chargeAmount = condition.getChargeAmount();
        Double taxAmount = condition.getTaxAmount();
        List<OrderLineType> list = orderType.getOrderLines().getOrderLine();
        if (lineNumber != null)
        {
            String chargeType = getChargeType(chargesId);
            Iterator<OrderLineType> lists = list.iterator();
            while (lists.hasNext())
            {
                OrderLineType data = (OrderLineType) lists.next();
                if (!lineNumber.equals(data.getLineNumber()))
                {
                    lists.remove();
                }
                else
                {
                    List<ChargeType> chargeTypes = data.getCharges().getCharge();
                    if (chargeType != null)
                    {
                        Iterator<ChargeType> chargeList = chargeTypes.iterator();
                        while (chargeList.hasNext())
                        {
                            ChargeType charge = (ChargeType) chargeList.next();
                            if (!chargeType.equals(charge.getChargeType()))
                            {
                                chargeList.remove();
                            }
                            else
                            {
                                BigDecimal amount = charge.getChargeAmount().getAmount();
                                if (chargeAmount != null)
                                {
                                    charge.getChargeAmount().setAmount(
                                            new BigDecimal(chargeAmount).setScale(3, BigDecimal.ROUND_HALF_UP));
                                }
                                if (charge.getTax() != null)
                                {
                                    BigDecimal tax = charge.getChargeAmount().getAmount()
                                            .multiply(charge.getTax().getTaxAmount().getAmount());
                                    BigDecimal taxRate = tax.divide(amount, 3, BigDecimal.ROUND_HALF_UP);
                                    // 如果前端没有输入值，就根据历史价格算出税率，再根据退款金额计算需要退的税额
                                    taxAmount = taxAmount == null ? taxRate.doubleValue() : taxAmount;
                                    charge.getTax().getTaxAmount()
                                            .setAmount(new BigDecimal(taxAmount).setScale(3, BigDecimal.ROUND_HALF_UP));
                                }

                            }
                        }
                    }
                }
            }
        }
        return list;
    }

    private String getChargeType(Integer chargesId)
    {
        if (chargesId == null)
        {
            return null;
        }
        Charges charge = chargesService.queryById(chargesId);
        return charge == null ? null : charge.getChargeType();
    }

    @Override
    public Boolean uplodTracking(TrackingInfo trackingInfo, UserInfo user) throws Exception
    {
        if (user == null)
        {
            return false;
        }
        Order order = null;
        try
        {
            String purchaseOrderId = trackingInfo.getPurchaseOrderId();
            List<Data> list = ListOrderItemData(purchaseOrderId, user, trackingInfo.getLineNumber());
            order = orderHandele.fulfillOneOrder(purchaseOrderId, list, trackingInfo.getTrackingNumber(),
                    trackingInfo.getCarrierName(), user);
            saveOneOrder(order, user);
        }
        catch (Exception e)
        {
            throw e;

        }
        if (order == null)
        {
            return false;
        }
        return true;
    }

    private List<Data> ListOrderItemData(String purchaseOrderId, UserInfo user, String lineNum)
    {
        List<Data> list = new ArrayList<Data>();
        List<Orders> orderList = orderService.listByPoId(purchaseOrderId, null, user.getId());
        if (orderList != null && orderList.size() > 0)
        {
            Integer orderId = orderList.get(0).getId();
            List<OrderItem> items = orderItemService.listByOrderId(orderId);
            for (OrderItem orderItem : items)
            {
                Integer lineNumber = Integer.parseInt(orderItem.getLineNumber());
                Data data = new Data(lineNumber, orderItem.getAmount() + "", orderItem.getUnit());
                list.add(data);
            }
        }
        if (lineNum != null)
        {
            Iterator<Data> lists = list.iterator();
            while (lists.hasNext())
            {
                Data data = (Data) lists.next();
                if (!lineNum.equals(data.getLineNumber() + ""))
                {
                    lists.remove();
                }
            }
        }
        return list;
    }

    @Override
    public List<Orders> listByPoId(String purchaseOrderId, Integer offset, UserInfo user)
    {
        return orderService.listByPoId(purchaseOrderId, offset, user.getId());
    }

    @Override
    public Integer count(String purchaseOrderId, UserInfo user)
    {
        return orderService.count(purchaseOrderId, user.getId());
    }

    @Override
    public ViewOrders getItemDetail(String purchaseOrderId, UserInfo user) throws Exception
    {
        ViewOrders order = new ViewOrders();
        if (user == null)
        {
            return order;
        }
        Integer orderId = null;
        List<Orders> orders = listByPoId(purchaseOrderId, null, user);
        if (orders.size() > 0)
        {
            orderId = orders.get(0).getId();
        }
        List<OrderItem> orderItemList = orderItemService.listByOrderId(orderId);
        List<ViewOrderItem> items = new ArrayList<ViewOrderItem>();
        for (OrderItem item : orderItemList)
        {
            ViewOrderItem viewOrderItem = new ViewOrderItem();
            BeanUtils.copyProperties(item, viewOrderItem);
            if (item.getAmount() != null)
                viewOrderItem.setInv_amount_unit(item.getAmount() + " (" + item.getUnit() + ")");
            if (item.getCarrierName() != null)
                viewOrderItem.setTrackingInfo(item.getCarrierName() + ":" + item.getTrackingNumber());
            List<Charges> chargesList = chargesService.listByOrderItemId(item.getId());
            List<ViewCharge> charges = new ArrayList<ViewCharge>();
            List<ViewRefund> refunds = new ArrayList<ViewRefund>();
            for (Charges charge : chargesList)
            {
                String type = charge.getChargeCategory();
                if (Common.CHARGE.equals(type))
                {
                    ViewCharge viewCharge = new ViewCharge();
                    BeanUtils.copyProperties(charge, viewCharge);
                    // viewCharge.setChargeAmount(charge.getChargeAmount() + " (" + charge.getChargeCurrency() + ")");
                    // if (charge.getTaxAmount() != null)
                    // viewCharge.setTaxAmount(charge.getTaxAmount() + " (" + charge.getTaxCurrency() + ")");
                    viewCharge.setPurchaseOrderId(purchaseOrderId);
                    viewCharge.setLineNumber(item.getLineNumber());
                    charges.add(viewCharge);
                }
                else if (Common.REFUND_CHARGE.equals(type))
                {
                    ViewRefund viewCharge = new ViewRefund();
                    BeanUtils.copyProperties(charge, viewCharge);
                    // viewCharge.setChargeAmount(charge.getChargeAmount() + " (" + charge.getChargeCurrency() + ")");
                    // if (charge.getTaxAmount() != null)
                    // viewCharge.setTaxAmount(charge.getTaxAmount() + " (" + charge.getTaxCurrency() + ")");
                    refunds.add(viewCharge);
                }
            }
            viewOrderItem.setCharges(charges);
            viewOrderItem.setRefunds(refunds);
            items.add(viewOrderItem);
        }
        order.setItems(items);
        ViewShippingInfo shippingInfo = new ViewShippingInfo();
        List<ShippingInfo> shippingInfoList = shippingInfoService.listByOrderId(orderId);
        BeanUtils.copyProperties(shippingInfoList.get(0), shippingInfo);
        order.setShippingInfo(shippingInfo);
        return order;
    }

}
