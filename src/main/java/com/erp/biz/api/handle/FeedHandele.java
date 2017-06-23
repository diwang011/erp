package com.erp.biz.api.handle;

import org.apache.axis.utils.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.erp.biz.api.model.response.FeedRecordResponse;
import com.erp.biz.api.model.response.PartnerFeedResponse;
import com.erp.biz.util.HttpClientHelper;
import com.erp.biz.util.JAXBUtil;
import com.erp.common.Common;
import com.erp.controller.ItemController;

public class FeedHandele extends BaseHandele
{
    private static final Logger LOGGER = LogManager.getLogger(ItemController.class);

    public FeedHandele(String consumerId, String privateEncodedStr)
    {
        super(consumerId, privateEncodedStr);
    }

    /**
     * 获取所有Feed
     * 
     * @return
     * @throws Exception
     */
    public FeedRecordResponse getFeedsv3(String feedId) throws Exception
    {
        String finalUrl = baseUrl + "v3/feeds";
        if (!StringUtils.isEmpty(feedId))
        {
            finalUrl = finalUrl + "?feedId=" + feedId;
        }
        HttpClientHelper httpClient = createHttpClient(finalUrl, Common.GET);
        LOGGER.info(finalUrl);
        FeedRecordResponse detail = null;
        String xml = null;
        try
        {
            xml = httpClient.doHttpGet(finalUrl);
            LOGGER.info(xml);
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
    public PartnerFeedResponse getFeedsv3ByFeedId(String feedId) throws Exception
    {
        String finalUrl = baseUrl + "v3/feeds/" + feedId + "?includeDetails=true";
        HttpClientHelper httpClient = createHttpClient(finalUrl, Common.GET);
        PartnerFeedResponse detail = null;
        String xml = null;
        try
        {
            LOGGER.info(finalUrl);
            xml = httpClient.doHttpGet(finalUrl);
            LOGGER.info(xml);
            detail = JAXBUtil.converyToJavaBean(xml, PartnerFeedResponse.class);
        }
        catch (Exception e)
        {
            throwError(xml);
        }
        return detail;
    }

}
