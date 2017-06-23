package com.erp.biz.api.model.promopricing;

public class PricingList
{
    private String replaceAll;

    private Pricing pricing;

    public void setReplaceAll(String replaceAll)
    {
        this.replaceAll = replaceAll;
    }

    public String getReplaceAll()
    {
        return this.replaceAll;
    }

    public void setPricing(Pricing pricing)
    {
        this.pricing = pricing;
    }

    public Pricing getPricing()
    {
        return this.pricing;
    }
}
