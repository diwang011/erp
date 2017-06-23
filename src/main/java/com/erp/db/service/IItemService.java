package com.erp.db.service;

import com.erp.db.base.IBaseService;
import com.erp.db.model.Item;

import java.util.List;

/***
 * 
 * @author dev003
 *
 */
public interface IItemService extends IBaseService<Item, Integer>
{
    public static final String SERVICE_NAME = "IItemService";

    public List<Item> list(String sku, Integer offset, Integer userId);

    public int deleteByUserIdAndSku(String sku, Integer userId);

    public Integer count(String sku, Integer userId);

}
