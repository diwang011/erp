package com.erp.biz.api.handle.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.erp.biz.api.handle.PromotionHandele;
import com.erp.biz.api.model.price.FeedHeaderType;
import com.erp.biz.api.model.price.ItemIdentifierType;
import com.erp.biz.api.model.price.ItemPriceType;
import com.erp.biz.api.model.price.MoneyType;
import com.erp.biz.api.model.price.Price;
import com.erp.biz.api.model.price.PriceFeed;
import com.erp.biz.api.model.price.PriceType;
import com.erp.biz.api.model.price.PricingListType;
import com.erp.biz.api.model.price.PricingType;
import com.erp.biz.api.model.price.ProcessModeType;
import com.erp.biz.api.model.promopricing.Pricing;
import com.erp.biz.api.model.promopricing.PromotionalResponse;
import com.erp.biz.api.model.response.CurrencyCode;
import com.erp.biz.api.model.response.FeedAcknowledgement;
import com.erp.biz.api.model.response.ItemPriceResponse;
import com.erp.biz.util.Helper;
import com.erp.biz.util.JAXBUtil;
import com.erp.biz.util.XmlExercise;
import com.erp.common.HttpMethod;
import com.erp.db.model.UserInfo;
import com.erp.model.Promotional;

@Service
public class PromotionHandeleImpl extends BaseHandele implements PromotionHandele
{
    private static final Logger LOGGER = LogManager.getLogger(PromotionHandeleImpl.class);

    /**
     * 获取促销详细
     * 
     * @param sku
     * @return
     * @throws Exception
     */
    @Override
    public Promotional getPromotionalPrices(String sku, UserInfo user) throws Exception
    {
        String finalUrl = baseUrl + "v3/promo/sku/" + Helper.urlEscapeProcessing(sku);
        HttpMethod httpMethod = HttpMethod.GET;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), false);
        Promotional res = null;
        String xml = null;
        try
        {
            String requestBoby = null;
            xml = baseSend(finalUrl, map, httpMethod, requestBoby);
            // xml="<?xml version=\"1.0\" encoding=\"UTF-8\"
            // standalone=\"yes\"?>"+xml.substring(xml.indexOf("<payload"),xml.indexOf("</payload>")+10);
            String xmlreplace = xml.replace(
                    "<payload xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ns2:itemPriceType\">",
                    "<payload>").replace(" xmlns:ns2=\"http://walmart.com/\"", "");
            xmlreplace = xmlreplace.replace("ns2:", "");
            LOGGER.info(xmlreplace);
            String json = XmlExercise.xml2json(xmlreplace);
            json = json.replace("@", "");
            LOGGER.info(json);
            PromotionalResponse p = JSON.parseObject(json, PromotionalResponse.class);
            Pricing pricing = p.getPayload().getPricingList().getPricing();
            String currentPrice = pricing.getCurrentPrice().getValue().getAmount();
            String comparisonPrice = pricing.getComparisonPrice().getValue().getAmount();
            String effectiveDate = pricing.getEffectiveDate();
            String expirationDate = pricing.getExpirationDate();
            String priceType = pricing.getCurrentPriceType();
            String promoId = pricing.getPromoId();
            res = new Promotional(sku, currentPrice, comparisonPrice, effectiveDate, expirationDate, priceType,
                    promoId);
            // res = JAXBUtil.converyToJavaBean(xml, ServiceResponse.class);
        }
        catch (Exception e)
        {
            throwError(xml);
        }
        return res;

    }

    /**
     * 批量更新促销
     * 
     * @param sku
     * @param currency
     * @param amount
     * @return
     * @throws Exception
     */
    @Override
    public FeedAcknowledgement bulkUpdatePromotionalPrice(List<Promotional> promotionals, UserInfo user)
            throws Exception
    {
        String finalUrl = baseUrl + "v3/feeds?feedType=promo";
        HttpMethod httpMethod = HttpMethod.POST;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), true);
        FeedAcknowledgement res = null;
        String xml = null;
        try
        {

            PriceFeed price = bildPriceFeed(promotionals);
            String requestBoby = JAXBUtil.convertToXml(price);
            xml = baseSend(finalUrl, map, httpMethod, requestBoby);
            res = JAXBUtil.converyToJavaBean(xml, FeedAcknowledgement.class);
        }
        catch (Exception e)
        {
            throwError(xml);
        }
        return res;

    }

    /**
     * 单个更新或者删除促销
     * 
     * @param sku
     * @param currency
     * @param amount
     * @return
     * @throws Exception
     */
    @Override
    public ItemPriceResponse updatePromotionalPrice(Promotional promotional, ProcessModeType type, UserInfo user)
            throws Exception
    {
        String finalUrl = baseUrl + "v3/price?promo=true";
        HttpMethod httpMethod = HttpMethod.PUT;
        Map<String, Map<String, Object>> map = createMap(finalUrl, httpMethod.name(), user.getConsumerId(),
                user.getPrivateKey(), false);
        ItemPriceResponse res = null;
        String xml = null;
        try
        {

            ItemPriceType price = bildPrice(promotional, type);
            String requestBoby = JAXBUtil.convertToXml(price);
            xml = baseSend(finalUrl, map, httpMethod, requestBoby);
            res = JAXBUtil.converyToJavaBean(xml, ItemPriceResponse.class);
        }
        catch (Exception e)
        {
            throwError(xml);
        }
        return res;

    }

    private static ItemPriceType bildPrice(Promotional promotional, ProcessModeType type)
    {
        ItemPriceType price = new ItemPriceType();
        ItemIdentifierType itemIdentifier = new ItemIdentifierType();
        itemIdentifier.setSku(promotional.getSku());
        price.setItemIdentifier(itemIdentifier);
        PricingListType pricingList = new PricingListType();
        PricingType pricing = new PricingType();
        pricing.setCurrentPrice(bildPrice(CurrencyCode.USD.name(), promotional.getCurrentPrice()));
        pricing.setComparisonPrice(bildPrice(CurrencyCode.USD.name(), promotional.getComparisonPrice()));
        pricing.setProcessMode(type);
        pricing.setEffectiveDate(
                Helper.convertToXMLGregorianCalendar(Helper.convertUTCToDate(promotional.getEffectiveString())));
        pricing.setExpirationDate(
                Helper.convertToXMLGregorianCalendar(Helper.convertUTCToDate(promotional.getExpirationString())));
        pricing.setCurrentPriceType(PriceType.valueOf(promotional.getPriceType()));
        pricingList.getPricing().add(pricing);
        price.setPricingList(pricingList);
        return price;
    }

    private static Price bildPrice(String currency, String amount)
    {
        Price currentPrice = new Price();
        MoneyType moneyType = new MoneyType();
        moneyType.setAmount(Helper.String2BigDecimal(amount));
        // moneyType.setCurrency(currency);
        currentPrice.setValue(moneyType);
        return currentPrice;
    }

    private PriceFeed bildPriceFeed(List<Promotional> promotionals)
    {
        PriceFeed price = new PriceFeed();
        FeedHeaderType priceHeader = new FeedHeaderType();
        priceHeader.setVersion("1.51");
        priceHeader.setFeedDate(Helper.convertToXMLGregorianCalendar(new Date()));
        price.setPriceHeader(priceHeader);
        for (Promotional promotional : promotionals)
        {
            ItemPriceType priceType = bildPrice(promotional, ProcessModeType.UPSERT);
            priceType.getPricingList().setReplaceAll(Boolean.TRUE);
            price.getPrice().add(priceType);
        }
        return price;
    }

}
