package com.erp.biz.api.model.promopricing;

public class ItemIdentifier
{
    private String sku;

    private String offerId;

    public void setSku(String sku)
    {
        this.sku = sku;
    }

    public String getSku()
    {
        return this.sku;
    }

    public void setOfferId(String offerId)
    {
        this.offerId = offerId;
    }

    public String getOfferId()
    {
        return this.offerId;
    }
}
