package com.erp.biz.api.handle;

import java.util.List;

import com.erp.biz.api.model.price.ProcessModeType;
import com.erp.biz.api.model.response.FeedAcknowledgement;
import com.erp.biz.api.model.response.ItemPriceResponse;
import com.erp.db.model.UserInfo;
import com.erp.model.Promotional;

public interface PromotionHandele
{
    /**
     * 获取促销详细
     * 
     * @param sku
     * @return
     * @throws Exception
     */
    public Promotional getPromotionalPrices(String sku, UserInfo user) throws Exception;

    /**
     * 批量更新促销
     * 
     * @param sku
     * @param currency
     * @param amount
     * @return
     * @throws Exception
     */
    public FeedAcknowledgement bulkUpdatePromotionalPrice(List<Promotional> promotionals, UserInfo user)
            throws Exception;

    /**
     * 单个更新或者删除促销
     * 
     * @param sku
     * @param currency
     * @param amount
     * @return
     * @throws Exception
     */
    public ItemPriceResponse updatePromotionalPrice(Promotional promotional, ProcessModeType type, UserInfo user)
            throws Exception;

}
