package com.erp.biz;

import java.util.List;

import com.erp.biz.api.model.order.Order;
import com.erp.db.model.Orders;
import com.erp.model.OrderCondition;
import com.erp.model.TrackingInfo;

/***
 * 
 * @author dev003
 *
 */
public interface IOrderBizService
{
    public static final String SERVICE_NAME = "IOrderBizService";

    public Boolean saveOrder(String purchaseOrderId, Integer userId) throws Exception;

    public Boolean cancelOrder(OrderCondition condition, Integer userId) throws Exception;

    public Boolean refundOrder(OrderCondition condition, Integer userId) throws Exception;

    public Boolean uplodTracking(TrackingInfo trackingInfo, Integer userId) throws Exception;

    public List<Orders> listByPoId(String purchaseOrderIds, Integer offset, Integer userId);

    public Integer count(String purchaseOrderId, Integer userId);

    public Order getItemDetail(String purchaseOrderId, Integer userId) throws Exception;;

}
