package com.erp.model;

public class FeedItemDetails
{
    private String sku;
    private String ingestionStatus;
    private String ingestionErrors;

    public String getSku()
    {
        return sku;
    }

    public void setSku(String sku)
    {
        this.sku = sku;
    }

    public String getIngestionStatus()
    {
        return ingestionStatus;
    }

    public void setIngestionStatus(String ingestionStatus)
    {
        this.ingestionStatus = ingestionStatus;
    }

    public String getIngestionErrors()
    {
        return ingestionErrors;
    }

    public void setIngestionErrors(String ingestionErrors)
    {
        this.ingestionErrors = ingestionErrors;
    }

}
