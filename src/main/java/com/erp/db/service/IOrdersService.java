package com.erp.db.service;

import com.erp.db.base.IBaseService;
import com.erp.db.model.Orders;

import java.util.List;

/***
 * 
 * @author dev003
 *
 */
public interface IOrdersService extends IBaseService<Orders, Integer>
{
    public static final String SERVICE_NAME = "IOrderService";

    public List<Orders> listByPoId(String purchaseOrderId, Integer offset, Integer userId);

    public int deleteByUserId(Integer userId);

    public Integer count(String purchaseOrderId, Integer userId);

}
