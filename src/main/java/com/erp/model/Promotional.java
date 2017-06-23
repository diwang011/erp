package com.erp.model;

import java.util.LinkedHashMap;
import java.util.Map;

import com.erp.biz.util.FieldNameAndHeaderMapping;
import com.erp.biz.util.Reportable;

public class Promotional implements Reportable
{
    private String sku;
    private String currentPrice;
    private String comparisonPrice;
    private String effectiveDate;
    private String expirationDate;
    private String priceType;
    private String promoId;
    private FieldNameAndHeaderMapping fieldHeaderMapping = null;

    public String getSku()
    {
        return sku;
    }

    public void setSku(String sku)
    {
        this.sku = sku;
    }

    public String getCurrentPrice()
    {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice)
    {
        this.currentPrice = currentPrice;
    }

    public String getComparisonPrice()
    {
        return comparisonPrice;
    }

    public void setComparisonPrice(String comparisonPrice)
    {
        this.comparisonPrice = comparisonPrice;
    }

    public String getEffectiveDate()
    {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate)
    {
        this.effectiveDate = effectiveDate;
    }

    public String getExpirationDate()
    {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate)
    {
        this.expirationDate = expirationDate;
    }

    public String getPriceType()
    {
        return priceType;
    }

    public void setPriceType(String priceType)
    {
        this.priceType = priceType;
    }

    public Promotional()
    {
    }

    public Promotional(String sku, String currentPrice, String comparisonPrice, String effectiveDate,
            String expirationDate, String priceType, String promoId)
    {
        super();
        this.sku = sku;
        this.currentPrice = currentPrice;
        this.comparisonPrice = comparisonPrice;
        this.effectiveDate = effectiveDate;
        this.expirationDate = expirationDate;
        this.priceType = priceType;
        this.promoId = promoId;
    }

    public String getPromoId()
    {
        return promoId;
    }

    public void setPromoId(String promoId)
    {
        this.promoId = promoId;
    }

    @Override
    public FieldNameAndHeaderMapping fetchFieldNameAndHeaderMapping()
    {
        if (fieldHeaderMapping == null)
        {
            fieldHeaderMapping = new FieldNameAndHeaderMapping();
            Map<String, String> fieldHeaderMap = new LinkedHashMap<String, String>();
            fieldHeaderMap.put("sku", "sku");
            fieldHeaderMap.put("currentPrice", "currentPrice");
            fieldHeaderMap.put("comparisonPrice", "comparisonPrice");
            fieldHeaderMap.put("effectiveDate", "effectiveDate");
            fieldHeaderMap.put("expirationDate", "expirationDate");
            fieldHeaderMap.put("priceType", "priceType");
            fieldHeaderMapping.setFieldNameCsvHeaderMap(fieldHeaderMap);
        }
        return fieldHeaderMapping;
    }

}
