package com.erp.db.service;

import java.util.List;

import com.erp.db.base.IBaseService;
import com.erp.db.model.OrderItem;

/***
 * 
 * @author dev003
 *
 */
public interface IOrderItemService extends IBaseService<OrderItem, Integer>
{
    public static final String SERVICE_NAME = "IOrderItemService";

    public List<OrderItem> listByOrderId(Integer orderId);

}
