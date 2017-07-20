package com.erp.biz.api.handle;

import java.util.List;

import com.erp.biz.api.model.mp.MPItemFeed;
import com.erp.biz.api.model.response.FeedAcknowledgement;
import com.erp.biz.api.model.response.ItemResponse;
import com.erp.biz.api.model.response.ItemRetireResponse;
import com.erp.db.model.UserInfo;

public interface ItemHandele
{

    /**
     * 获取产品信息
     * 
     * @param sku
     * @param offset
     * @return
     * @throws Exception
     */
    public List<ItemResponse> getItem(String sku, int offset, UserInfo user) throws Exception;

    /**
     * 上传产品
     * 
     * @param mpItemFeed
     * @return
     * @throws Exception
     */
    public FeedAcknowledgement uploadSku(MPItemFeed mpItemFeed, UserInfo user) throws Exception;

    /**
     * 删除一个产品
     * 
     * @param sku
     * @return
     */
    public ItemRetireResponse retireItem(String sku, UserInfo user) throws Exception;
}
