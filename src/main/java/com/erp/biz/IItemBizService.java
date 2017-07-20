package com.erp.biz;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.erp.db.model.Item;
import com.erp.db.model.UserInfo;
import com.erp.model.Promotional;

/***
 * 
 * @author dev003
 *
 */
public interface IItemBizService
{
    public static final String SERVICE_NAME = "IItemService";

    public Boolean saveItem(String sku, UserInfo user) throws Exception;

    public Boolean updatePrice(Item item, UserInfo user) throws Exception;

    public Boolean updateInventory(Item item, UserInfo user) throws Exception;

    public Promotional getPromotion(String sku, UserInfo user) throws Exception;

    public Boolean addPromotion(Promotional promotional, UserInfo user) throws Exception;

    public Boolean deletePromotion(String sku, UserInfo user) throws Exception;

    public String updateBulkInventory(MultipartFile multipartFile, UserInfo user) throws Exception;

    public String updateBulkPrice(MultipartFile multipartFile, UserInfo user) throws Exception;

    public List<Item> list(String sku, Integer offset, UserInfo user);

    public String exportPrice(String sku, UserInfo user);

    public String exportInventory(String sku, UserInfo user);

    public Integer count(String sku, UserInfo user);

    public Boolean retireItem(String sku, UserInfo user) throws Exception;

    public Boolean bulkAddPromotion(MultipartFile file, UserInfo user) throws Exception;

}
