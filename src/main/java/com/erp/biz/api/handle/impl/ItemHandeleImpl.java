package com.erp.biz.api.handle.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.axis.utils.StringUtils;
import org.springframework.stereotype.Service;

import com.erp.biz.api.handle.ItemHandele;
import com.erp.biz.api.model.mp.MPItemFeed;
import com.erp.biz.api.model.response.FeedAcknowledgement;
import com.erp.biz.api.model.response.ItemResponse;
import com.erp.biz.api.model.response.ItemResponses;
import com.erp.biz.api.model.response.ItemRetireResponse;
import com.erp.biz.util.Helper;
import com.erp.biz.util.JAXBUtil;
import com.erp.common.HttpMethod;
import com.erp.db.model.UserInfo;

@Service
public class ItemHandeleImpl extends BaseHandele implements ItemHandele
{
    /**
     * 获取产品信息
     * 
     * @param sku
     * @param offset
     * @return
     * @throws Exception
     */
    @Override
    public List<ItemResponse> getItem(String sku, int offset, UserInfo user) throws Exception
    {
        sku = StringUtils.isEmpty(sku) ? "" : sku;
        String finalUrl = baseUrl + "v3/items/" + Helper.urlEscapeProcessing(sku) + "?offset=" + offset;
        HttpMethod httpMethod = HttpMethod.GET;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), false);

        List<ItemResponse> list = new ArrayList<>();
        String xml = null;
        String requestBoby = null;
        try
        {
            xml = baseSend(finalUrl, map, httpMethod, requestBoby);
            ItemResponses itemViews = JAXBUtil.converyToJavaBean(xml, ItemResponses.class);
            list.addAll(itemViews.getItemResponse());
            if (itemViews != null && itemViews.getItemResponse().size() >= 20)
            {
                list.addAll(getItem(sku, offset + 20, user));
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
    @Override
    public FeedAcknowledgement uploadSku(MPItemFeed mpItemFeed, UserInfo user) throws Exception
    {
        String finalUrl = baseUrl + "v3/feeds?feedType=item";
        HttpMethod httpMethod = HttpMethod.POST;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), true);
        FeedAcknowledgement acknowledgement = null;
        String xml = null;
        try
        {
            String requestBoby = JAXBUtil.convertToXml(mpItemFeed);
            xml = baseSend(finalUrl, map, httpMethod, requestBoby);
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
     * @throws Exception
     */
    @Override
    public ItemRetireResponse retireItem(String sku, UserInfo user) throws Exception
    {
        String finalUrl = baseUrl + "v3/items/" + Helper.urlEscapeProcessing(sku);
        HttpMethod httpMethod = HttpMethod.DELETE;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), false);
        ItemRetireResponse detail = null;
        try
        {
            String requestBoby = null;
            String xml = baseSend(finalUrl, map, httpMethod, requestBoby);
            detail = JAXBUtil.converyToJavaBean(xml, ItemRetireResponse.class);
        }
        catch (Exception e)
        {
            throw e;
        }
        return detail;
    }
}
