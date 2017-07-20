package com.erp.biz.api.handle;

import com.erp.biz.api.model.response.FeedRecordResponse;
import com.erp.biz.api.model.response.PartnerFeedResponse;
import com.erp.db.model.UserInfo;

public interface FeedHandele
{

    /**
     * 获取所有Feed
     * 
     * @return
     * @throws Exception
     */
    public FeedRecordResponse getFeedsv3(String feedId, UserInfo user) throws Exception;

    /**
     * 获取Feed详情
     * 
     * @param feedId
     * @return
     * @throws Exception
     */
    public PartnerFeedResponse getFeedsv3ByFeedId(String feedId, UserInfo user) throws Exception;

}
