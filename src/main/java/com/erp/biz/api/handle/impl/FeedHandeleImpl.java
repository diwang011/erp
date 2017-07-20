package com.erp.biz.api.handle.impl;

import java.util.Map;

import org.apache.axis.utils.StringUtils;
import org.springframework.stereotype.Service;

import com.erp.biz.api.handle.FeedHandele;
import com.erp.biz.api.model.response.FeedRecordResponse;
import com.erp.biz.api.model.response.PartnerFeedResponse;
import com.erp.biz.util.JAXBUtil;
import com.erp.common.HttpMethod;
import com.erp.db.model.UserInfo;

@Service
public class FeedHandeleImpl extends BaseHandele implements FeedHandele
{
    /**
     * 获取所有Feed
     * 
     * @return
     * @throws Exception
     */
    @Override
    public FeedRecordResponse getFeedsv3(String feedId, UserInfo user) throws Exception
    {
        String finalUrl = baseUrl + "v3/feeds";
        if (!StringUtils.isEmpty(feedId))
        {
            finalUrl = finalUrl + "?feedId=" + feedId;
        }
        HttpMethod httpMethod = HttpMethod.GET;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), false);
        FeedRecordResponse detail = null;
        String xml = null;
        String requestBoby = null;
        try
        {
            xml = baseSend(finalUrl, map, httpMethod, requestBoby);
            detail = JAXBUtil.converyToJavaBean(xml, FeedRecordResponse.class);
        }
        catch (Exception e)
        {
            throwError(xml);
        }
        return detail;
    }

    /**
     * 获取Feed详情
     * 
     * @param feedId
     * @return
     * @throws Exception
     */
    @Override
    public PartnerFeedResponse getFeedsv3ByFeedId(String feedId, UserInfo user) throws Exception
    {
        String finalUrl = baseUrl + "v3/feeds/" + feedId + "?includeDetails=true";
        HttpMethod httpMethod = HttpMethod.GET;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), false);
        PartnerFeedResponse detail = null;
        String xml = null;
        String requestBoby = null;
        try
        {
            xml = baseSend(finalUrl, map, httpMethod, requestBoby);
            detail = JAXBUtil.converyToJavaBean(xml, PartnerFeedResponse.class);
        }
        catch (Exception e)
        {
            throwError(xml);
        }
        return detail;
    }

}
