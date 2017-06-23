package com.erp.biz.api.handle;

import java.math.BigDecimal;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
import com.erp.biz.util.HttpClientHelper;
import com.erp.biz.util.JAXBUtil;
import com.erp.common.Common;
import com.erp.controller.ItemController;

public class PriceHandele extends BaseHandele
{
    private static final Logger LOGGER = LogManager.getLogger(ItemController.class);

    public PriceHandele(String consumerId, String privateEncodedStr)
    {
        super(consumerId, privateEncodedStr);
    }

    /**
     * 单个更新价格
     * 
     * @param sku
     * @param currency
     * @param amount
     * @return
     * @throws Exception
     */
    public ItemPriceResponse updatePrice(String sku, String currency, String amount) throws Exception
    {
        String finalUrl = baseUrl + "v3/price";
        HttpClientHelper httpClient = createHttpClient(finalUrl, Common.PUT);
        ItemPriceResponse itemPriceRes = null;
        String xml = null;
        try
        {
            LOGGER.info(finalUrl);
            ItemPriceType price = bildPrice(sku, currency, amount);
            String requestBoby = JAXBUtil.convertToXml(price);
            LOGGER.info(requestBoby);
            xml = httpClient.doHttpPut(finalUrl, requestBoby);
            LOGGER.info(xml);
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
    public FeedAcknowledgement updateBulkPrices(List<Data> list) throws Exception
    {

        String finalUrl = baseUrl + "v3/feeds?feedType=price";
        HttpClientHelper httpClient = createHttpClient(finalUrl, Common.POST);
        FeedAcknowledgement acknowledgement = null;
        String xml = null;
        try
        {
            LOGGER.info(finalUrl);
            PriceFeed priceFeed = bildPriceFeed(list);
            String requestBoby = JAXBUtil.convertToXml(priceFeed);
            LOGGER.info(requestBoby);
            xml = httpClient.doHttpPostMultipart(finalUrl, requestBoby);
            LOGGER.info(xml);
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
