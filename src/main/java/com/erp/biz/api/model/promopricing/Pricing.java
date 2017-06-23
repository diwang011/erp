package com.erp.biz.api.model.promopricing;

public class Pricing
{
    private String effectiveDate;

    private String expirationDate;

    private String promoId;

    private CurrentPrice currentPrice;

    private String currentPriceType;

    private ComparisonPrice comparisonPrice;

    public void setEffectiveDate(String effectiveDate)
    {
        this.effectiveDate = effectiveDate;
    }

    public String getEffectiveDate()
    {
        return this.effectiveDate;
    }

    public void setExpirationDate(String expirationDate)
    {
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate()
    {
        return this.expirationDate;
    }

    public void setPromoId(String promoId)
    {
        this.promoId = promoId;
    }

    public String getPromoId()
    {
        return this.promoId;
    }

    public void setCurrentPrice(CurrentPrice currentPrice)
    {
        this.currentPrice = currentPrice;
    }

    public CurrentPrice getCurrentPrice()
    {
        return this.currentPrice;
    }

    public void setCurrentPriceType(String currentPriceType)
    {
        this.currentPriceType = currentPriceType;
    }

    public String getCurrentPriceType()
    {
        return this.currentPriceType;
    }

    public void setComparisonPrice(ComparisonPrice comparisonPrice)
    {
        this.comparisonPrice = comparisonPrice;
    }

    public ComparisonPrice getComparisonPrice()
    {
        return this.comparisonPrice;
    }
}
