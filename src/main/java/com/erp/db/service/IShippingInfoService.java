package com.erp.db.service;

import java.util.List;

import com.erp.db.base.IBaseService;
import com.erp.db.model.ShippingInfo;

/***
 * 
 * @author dev003
 *
 */
public interface IShippingInfoService extends IBaseService<ShippingInfo, Integer>
{
    public static final String SERVICE_NAME = "IShippingInfoService";
    
    public List<ShippingInfo> listByOrderId(Integer orderId);

}
