package com.erp.db.service;

import java.util.List;

import com.erp.db.base.IBaseService;
import com.erp.db.model.Charges;

/***
 * 
 * @author dev003
 *
 */
public interface IChargesService extends IBaseService<Charges, Integer>
{
    public static final String SERVICE_NAME = "IChargesService";
    
    public List<Charges> listByOrderItemId(Integer orderId);

    public int deleteByOrderItemId(Integer orderItemId,String type);
}
