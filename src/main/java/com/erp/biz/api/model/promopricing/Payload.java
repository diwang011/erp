package com.erp.biz.api.model.promopricing;

public class Payload
{
    private ItemIdentifier itemIdentifier;

    private PricingList pricingList;

    public void setItemIdentifier(ItemIdentifier itemIdentifier)
    {
        this.itemIdentifier = itemIdentifier;
    }

    public ItemIdentifier getItemIdentifier()
    {
        return this.itemIdentifier;
    }

    public void setPricingList(PricingList pricingList)
    {
        this.pricingList = pricingList;
    }

    public PricingList getPricingList()
    {
        return this.pricingList;
    }
}
