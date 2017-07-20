package com.erp.biz.api.handle;

import java.util.List;

import com.erp.biz.api.model.inventory.Inventory;
import com.erp.biz.api.model.response.FeedAcknowledgement;
import com.erp.biz.model.Data;
import com.erp.db.model.UserInfo;

public interface InventoryHandele
{

    /**
     * 根据sku获取库存信息
     * 
     * @param sku
     * @return
     * @throws Exception
     */
    public Inventory getInventoryForItem(String sku, UserInfo user) throws Exception;

    /**
     * 单个更新库存
     * 
     * @param sku
     * @param amount
     * @param fulfillmentLagTime
     * @return
     * @throws Exception
     */
    public Inventory updateInventoryForItem(String sku, String amount, int fulfillmentLagTime, UserInfo user)
            throws Exception;

    /**
     * 批量更新库存
     * 
     * @param list
     * @return
     * @throws Exception
     */
    public FeedAcknowledgement bulkUpdateInventory(List<Data> list, UserInfo user) throws Exception;

}
