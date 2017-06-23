package com.erp.biz.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.apache.axis.utils.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.erp.biz.IOrderBizService;
import com.erp.biz.api.handle.BaseHandele;
import com.erp.biz.api.handle.OrderHandele;
import com.erp.biz.api.model.order.Order;
import com.erp.biz.api.model.order.OrderLineStatusType;
import com.erp.biz.api.model.order.OrderLineStatusValueType;
import com.erp.biz.api.model.order.OrderLineType;
import com.erp.biz.model.Data;
import com.erp.biz.util.Helper;
import com.erp.common.Common;
import com.erp.db.model.OrderItem;
import com.erp.db.model.Orders;
import com.erp.db.model.UserInfo;
import com.erp.db.service.IOrderItemService;
import com.erp.db.service.IOrdersService;
import com.erp.model.OrderCondition;
import com.erp.model.TrackingInfo;

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

    @Override
    public Boolean saveOrder(String poId, Integer userId) throws Exception
    {
        UserInfo user = getUserById(userId);
        if (user == null)
        {
            return false;
        }
        List<Order> orders = getOrderList(poId, user);
        for (Order order : orders)
        {
            String status = order.getOrderLines().getOrderLine().get(0).getOrderLineStatuses().getOrderLineStatus()
                    .get(0).getStatus().name();
            String purchaseOrderId = order.getPurchaseOrderId();
            List<Orders> orderList = orderService.listByPoId(purchaseOrderId, null, userId);
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
                oo = conversionOrder(order, userId, status);
                i = orderService.insert(oo);
                for (OrderLineType line : order.getOrderLines().getOrderLine())
                {
                    OrderItem entity = new OrderItem();
                    entity.setSku(line.getItem().getSku());
                    entity.setLineNumber(line.getLineNumber());
                    entity.setUnit(line.getOrderLineQuantity().getUnitOfMeasurement());
                    entity.setOrderId(oo.getId());
                    entity.setAmount(line.getOrderLineQuantity().getAmount() == null ? 0.0
                            : Helper.String2BigDecimal(line.getOrderLineQuantity().getAmount()).doubleValue());
                    orderItemService.insert(entity);
                }
            }
            if (i != 1)
            {
                return false;
            }
        }
        return true;
    }

    private List<Order> getOrderList(String poId, UserInfo user) throws Exception
    {
        String consumerId = user.getConsumerId();
        String privateEncodedStr = user.getPrivateKey();
        OrderHandele orderHandele = new OrderHandele(consumerId, privateEncodedStr);
        String finalUrl = BaseHandele.baseUrl + "v3/orders?createdStartDate=" + Common.CREATED_START_DATE;
        if (!StringUtils.isEmpty(poId))
        {
            finalUrl = finalUrl + "&purchaseOrderId=" + poId;
        }
        List<Order> orders = null;
        try
        {
            orders = orderHandele.getAllOrders(finalUrl);
        }
        catch (Exception e)
        {
            try
            {
                orders = orderHandele.getAllOrders(finalUrl);
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
    public Boolean cancelOrder(OrderCondition condition, Integer userId) throws Exception
    {
        UserInfo user = getUserById(userId);
        if (user == null)
        {
            return false;
        }
        String consumerId = user.getConsumerId();
        String privateEncodedStr = user.getPrivateKey();
        Order order = null;
        try
        {
            OrderHandele orderHandele = new OrderHandele(consumerId, privateEncodedStr);
            String purchaseOrderId = condition.getPurchaseOrderId();
            String lineNumber = condition.getLineNumber();
            List<Data> list = ListOrderItemData(purchaseOrderId, userId);
            if (lineNumber != null)
            {
                Iterator<Data> lists = list.iterator();
                while (lists.hasNext())
                {
                    Data data = (Data) lists.next();
                    if (!lineNumber.equals(data.getLineNumber()+""))
                    {
                        lists.remove();
                    }
                }
            }
            order = orderHandele.cancellingOrder(purchaseOrderId, list);
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
    public Boolean refundOrder(OrderCondition condition, Integer userId) throws Exception
    {
        UserInfo user = getUserById(userId);
        if (user == null)
        {
            return false;
        }
        String consumerId = user.getConsumerId();
        String privateEncodedStr = user.getPrivateKey();
        Order order = null;
        OrderHandele orderHandele = new OrderHandele(consumerId, privateEncodedStr);
        try
        {
            String purchaseOrderId = condition.getPurchaseOrderId();
            String lineNumber = condition.getLineNumber();
            Order orderType = getItemDetail(purchaseOrderId, userId);
            if (orderType == null || orderType.getOrderLines() == null)
            {
                return false;
            }
            List<OrderLineType> list = orderType.getOrderLines().getOrderLine();
            if (lineNumber != null)
            {
                Iterator<OrderLineType> lists = list.iterator();
                while (lists.hasNext())
                {
                    OrderLineType data = (OrderLineType) lists.next();
                    if (!lineNumber.equals(data.getLineNumber()))
                    {
                        lists.remove();
                    }
                }
            }
            order = orderHandele.refund(purchaseOrderId, list);
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
    public Boolean uplodTracking(TrackingInfo trackingInfo, Integer userId) throws Exception
    {
        UserInfo user = getUserById(userId);
        if (user == null)
        {
            return false;
        }
        String consumerId = user.getConsumerId();
        String privateEncodedStr = user.getPrivateKey();
        Order order = null;
        OrderHandele orderHandele = new OrderHandele(consumerId, privateEncodedStr);
        try
        {
            List<Data> list = ListOrderItemData(trackingInfo.getPurchaseOrderId(), userId);
            order = orderHandele.fulfillOneOrder(trackingInfo.getPurchaseOrderId(), list,
                    trackingInfo.getTrackingNumber(), trackingInfo.getCarrierName());
        }
        catch (Exception e)
        {
            throw e;

        }
        if (order == null)
        {
            return false;
        }
        return throwExceptionByStatus(order);
    }

    private boolean throwExceptionByStatus(Order order)
    {
        boolean flag = true;
        List<OrderLineType> orderLines = order.getOrderLines().getOrderLine();
        for (OrderLineType orderLine : orderLines)
        {
            List<OrderLineStatusType> orderStatus = orderLine.getOrderLineStatuses().getOrderLineStatus();
            for (OrderLineStatusType orderLineStatusType : orderStatus)
            {
                if (!OrderLineStatusValueType.SHIPPED.equals(orderLineStatusType.getStatus()))
                {
                    flag = false;
                }
            }
        }
        return flag;
    }

    private List<Data> ListOrderItemData(String purchaseOrderId, Integer userId)
    {
        List<Data> list = new ArrayList<Data>();
        List<Orders> orderList = orderService.listByPoId(purchaseOrderId, null, userId);
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
        return list;
    }

    @Override
    public List<Orders> listByPoId(String purchaseOrderId, Integer offset, Integer userId)
    {
        return orderService.listByPoId(purchaseOrderId, offset, userId);
    }

    @Override
    public Integer count(String purchaseOrderId, Integer userId)
    {
        return orderService.count(purchaseOrderId, userId);
    }

    @Override
    public Order getItemDetail(String purchaseOrderId, Integer userId) throws Exception
    {
        Order order = new Order();
        UserInfo user = getUserById(userId);
        if (user == null)
        {
            return order;
        }
        List<Order> orders = getOrderList(purchaseOrderId, user);
        if (orders.size() > 0)
        {
            order = orders.get(0);
        }
        return order;
    }

}
