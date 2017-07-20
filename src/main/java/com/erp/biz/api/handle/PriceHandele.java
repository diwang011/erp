package com.erp.biz.api.handle;

import java.util.List;

import com.erp.biz.api.model.response.FeedAcknowledgement;
import com.erp.biz.api.model.response.ItemPriceResponse;
import com.erp.biz.model.Data;
import com.erp.db.model.UserInfo;

public interface PriceHandele
{
    /**
     * 单个更新价格
     * 
     * @param sku
     * @param currency
     * @param amount
     * @return
     * @throws Exception
     */
    public ItemPriceResponse updatePrice(String sku, String currency, String amount, UserInfo user) throws Exception;

    /**
     * 批量更新价格
     * 
     * @param list
     * @return
     * @throws Exception
     */
    public FeedAcknowledgement updateBulkPrices(List<Data> list, UserInfo user) throws Exception;

}
