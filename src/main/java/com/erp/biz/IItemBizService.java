package com.erp.biz;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.erp.db.model.Item;
import com.erp.model.Promotional;

/***
 * 
 * @author dev003
 *
 */
public interface IItemBizService
{
    public static final String SERVICE_NAME = "IItemService";

    public Boolean saveItem(String sku, Integer userId) throws Exception;

    public Boolean updatePrice(Item item, Integer userId) throws Exception;

    public Boolean updateInventory(Item item, Integer userId) throws Exception;

    public Promotional getPromotion(String sku, Integer userId) throws Exception;

    public Boolean addPromotion(Promotional promotional, Integer userId) throws Exception;

    public Boolean deletePromotion(String sku, Integer userId) throws Exception;

    public String updateBulkInventory(MultipartFile multipartFile, Integer userId) throws Exception;

    public String updateBulkPrice(MultipartFile multipartFile, Integer userId) throws Exception;

    public List<Item> list(String sku, Integer offset, Integer userId);

    public String exportPrice(String sku, Integer userId);

    public String exportInventory(String sku, Integer userId);

    public Integer count(String sku, Integer userId);

    public Boolean retireItem(String sku, Integer userId) throws Exception;

    public Boolean bulkAddPromotion(MultipartFile file, Integer userId) throws Exception;

}
