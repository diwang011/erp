package com.erp.biz.api.handle;

import java.util.List;

import com.erp.biz.api.model.order.*;
import com.erp.biz.model.Data;
import com.erp.db.model.UserInfo;

public interface OrderHandele
{
    /**
     * 获取订单
     * 
     * @param finalUrl
     * @return
     * @throws Exception
     */
    public List<Order> getAllOrders(String finalUrl, UserInfo user) throws Exception;

    /**
     * 确认订单
     * 
     * @param purchaseOrderId
     * @return
     */
    public Order acknowledgeOrder(String purchaseOrderId, UserInfo user);

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
    public Order fulfillOneOrder(String purchaseOrderId, List<Data> datas, String trackingNumber, String carrier,
            UserInfo user) throws Exception;

    /**
     * 取消一个订单
     * 
     * @param purchaseOrderId
     * @param list
     * @throws Exception
     */
    public Order cancellingOrder(String purchaseOrderId, List<Data> list, UserInfo user) throws Exception;

    /**
     * 退款
     * 
     * @param purchaseOrderId
     * @param list
     * @return
     * @throws Exception
     */
    public Order refund(String purchaseOrderId, List<OrderLineType> list, UserInfo user) throws Exception;

}
