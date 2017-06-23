package com.erp.biz.api.handle;

import java.util.ArrayList;
import java.util.List;

import org.apache.axis.utils.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.erp.biz.api.model.mp.MPItemFeed;
import com.erp.biz.api.model.response.FeedAcknowledgement;
import com.erp.biz.api.model.response.ItemResponse;
import com.erp.biz.api.model.response.ItemResponses;
import com.erp.biz.api.model.response.ItemRetireResponse;
import com.erp.biz.util.Helper;
import com.erp.biz.util.HttpClientHelper;
import com.erp.biz.util.JAXBUtil;
import com.erp.common.Common;
import com.erp.controller.ItemController;

public class ItemHandele extends BaseHandele
{
    private static final Logger LOGGER = LogManager.getLogger(ItemController.class);

    public ItemHandele(String consumerId, String privateEncodedStr)
    {
        super(consumerId, privateEncodedStr);
    }

    /**
     * 获取产品信息
     * 
     * @param sku
     * @param offset
     * @return
     * @throws Exception
     */
    public List<ItemResponse> getItem(String sku, int offset) throws Exception
    {
        sku = StringUtils.isEmpty(sku) ? "" : sku;
        String finalUrl = baseUrl + "v3/items/" + Helper.urlEscapeProcessing(sku) + "?offset=" + offset;
        HttpClientHelper httpClient = createHttpClient(finalUrl, Common.GET);

        List<ItemResponse> list = new ArrayList<>();
        String xml = null;
        try
        {
            LOGGER.info(finalUrl);
            xml = httpClient.doHttpGet(finalUrl);
            LOGGER.info(xml);
            ItemResponses itemViews = JAXBUtil.converyToJavaBean(xml, ItemResponses.class);
            list.addAll(itemViews.getItemResponse());
            if (itemViews != null && itemViews.getItemResponse().size() >= 20)
            {
                list.addAll(getItem(sku, offset + 20));
            }
        }
        catch (Exception e)
        {
            throwError(xml);
        }
        return list;
    }

    /**
     * 上传产品
     * 
     * @param mpItemFeed
     * @return
     * @throws Exception
     */
    public FeedAcknowledgement uploadSku(MPItemFeed mpItemFeed) throws Exception
    {
        String requestUrl = baseUrl + "v3/feeds?feedType=item";
        HttpClientHelper httpClient = createHttpClient(requestUrl, Common.POST);
        FeedAcknowledgement acknowledgement = null;
        String xml = null;
        try
        {
            LOGGER.info(requestUrl);
            String requestBoby = JAXBUtil.convertToXml(mpItemFeed);
            LOGGER.info(requestBoby);
            xml = httpClient.doHttpPostMultipart(requestUrl, requestBoby);
            LOGGER.info(xml);
            acknowledgement = JAXBUtil.converyToJavaBean(xml, FeedAcknowledgement.class);

        }
        catch (Exception e)
        {
            throwError(xml);
        }
        return acknowledgement;
    }

    /**
     * 删除一个产品
     * 
     * @param sku
     * @return
     */
    public ItemRetireResponse retireItem(String sku)
    {
        String finalUrl = baseUrl + "v3/items/" + Helper.urlEscapeProcessing(sku);
        HttpClientHelper httpClient = createHttpClient(finalUrl, Common.DELETE);
        ItemRetireResponse detail = null;
        try
        {
            LOGGER.info(finalUrl);
            String xml = httpClient.doHttpDelete(finalUrl);
            LOGGER.info(xml);
            detail = JAXBUtil.converyToJavaBean(xml, ItemRetireResponse.class);
        }
        catch (Exception e)
        {
        }
        return detail;
    }
}
