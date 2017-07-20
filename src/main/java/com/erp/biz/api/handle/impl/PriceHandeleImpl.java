package com.erp.biz.api.handle.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.erp.biz.api.handle.PriceHandele;
import com.erp.biz.api.model.price.FeedHeaderType;
import com.erp.biz.api.model.price.ItemIdentifierType;
import com.erp.biz.api.model.price.ItemPriceType;
import com.erp.biz.api.model.price.MoneyType;
import com.erp.biz.api.model.price.Price;
import com.erp.biz.api.model.price.PriceFeed;
import com.erp.biz.api.model.price.PricingListType;
import com.erp.biz.api.model.price.PricingType;
import com.erp.biz.api.model.response.FeedAcknowledgement;
import com.erp.biz.api.model.response.ItemPriceResponse;
import com.erp.biz.model.Data;
import com.erp.biz.util.JAXBUtil;
import com.erp.common.HttpMethod;
import com.erp.db.model.UserInfo;

@Service
public class PriceHandeleImpl extends BaseHandele implements PriceHandele
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
    @Override
    public ItemPriceResponse updatePrice(String sku, String currency, String amount, UserInfo user) throws Exception
    {
        String finalUrl = baseUrl + "v3/price";
        HttpMethod httpMethod = HttpMethod.PUT;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), false);
        ItemPriceResponse itemPriceRes = null;
        String xml = null;
        try
        {
            ItemPriceType price = bildPrice(sku, currency, amount);
            String requestBoby = JAXBUtil.convertToXml(price);
            xml = baseSend(finalUrl, map, HttpMethod.PUT, requestBoby);
            itemPriceRes = JAXBUtil.converyToJavaBean(xml, ItemPriceResponse.class);
        }
        catch (Exception e)
        {
            throwError(xml);
        }
        return itemPriceRes;
    }

    /**
     * 批量更新价格
     * 
     * @param list
     * @return
     * @throws Exception
     */
    @Override
    public FeedAcknowledgement updateBulkPrices(List<Data> list, UserInfo user) throws Exception
    {

        String finalUrl = baseUrl + "v3/feeds?feedType=price";
        HttpMethod httpMethod = HttpMethod.POST;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), true);
        FeedAcknowledgement acknowledgement = null;
        String xml = null;
        try
        {
            PriceFeed priceFeed = bildPriceFeed(list);
            String requestBoby = JAXBUtil.convertToXml(priceFeed);
            xml = baseSend(finalUrl, map, httpMethod, requestBoby);
            acknowledgement = JAXBUtil.converyToJavaBean(xml, FeedAcknowledgement.class);
        }
        catch (Exception e)
        {
            throwError(xml);
        }
        return acknowledgement;

    }

    private static PriceFeed bildPriceFeed(List<Data> list)
    {
        PriceFeed feed = new PriceFeed();
        FeedHeaderType feedHeaderType = new FeedHeaderType();
        feedHeaderType.setVersion("1.5");
        feed.setPriceHeader(feedHeaderType);
        for (Data data : list)
        {
            feed.getPrice().add(bildPrice(data.getSku(), data.getCurrency(), data.getAmount()));
        }
        return feed;
    }

    private static ItemPriceType bildPrice(String sku, String currency, String amount)
    {
        ItemPriceType price = new ItemPriceType();
        ItemIdentifierType itemIdentifier = new ItemIdentifierType();
        itemIdentifier.setSku(sku);
        price.setItemIdentifier(itemIdentifier);
        PricingListType pricingList = new PricingListType();
        PricingType pricing = new PricingType();
        Price p = new Price();
        MoneyType moneyType = new MoneyType();
        moneyType.setAmount(new BigDecimal(amount));
        moneyType.setCurrency(currency);
        p.setValue(moneyType);
        pricing.setCurrentPrice(p);
        pricingList.getPricing().add(pricing);
        price.setPricingList(pricingList);
        return price;
    }
}
