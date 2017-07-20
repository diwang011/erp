package com.erp.biz;

import java.util.List;

import com.erp.db.model.Orders;
import com.erp.db.model.UserInfo;
import com.erp.model.OrderCondition;
import com.erp.model.TrackingInfo;
import com.erp.view.model.ViewCharge;
import com.erp.view.model.ViewOrders;

/***
 * 
 * @author dev003
 *
 */
public interface IOrderBizService
{
    public static final String SERVICE_NAME = "IOrderBizService";

    public Boolean saveOrder(String purchaseOrderId, UserInfo user) throws Exception;

    public Boolean cancelOrder(OrderCondition condition, UserInfo user) throws Exception;

    public Boolean refundOrder(ViewCharge condition, UserInfo user) throws Exception;

    public Boolean uplodTracking(TrackingInfo trackingInfo, UserInfo user) throws Exception;

    public List<Orders> listByPoId(String purchaseOrderIds, Integer offset, UserInfo user);

    public Integer count(String purchaseOrderId, UserInfo user);

    public ViewOrders getItemDetail(String purchaseOrderId, UserInfo user) throws Exception;;

}
