package com.erp.biz.model;

public class Data
{
    private String sku;
    private String amount;
    private String currency;
    private Integer fulfillmentLagTime;
    private Integer lineNumber;
    private String unitOfMeasurement;

    public Data()
    {
    }

    public Data(String sku, String amount)
    {
        super();
        this.sku = sku;
        this.amount = amount;
    }

    public Data(Integer lineNumber, String amount, String unitOfMeasurement)
    {
        super();
        this.lineNumber = lineNumber;
        this.amount = amount;
        this.unitOfMeasurement = unitOfMeasurement;
    }

    public Data(String sku, String amount, Integer fulfillmentLagTime)
    {
        super();
        this.sku = sku;
        this.amount = amount;
        this.fulfillmentLagTime = fulfillmentLagTime;
    }

    public Data(String sku, String amount, String currency)
    {
        super();
        this.sku = sku;
        this.amount = amount;
        this.currency = currency;
    }

    public String getSku()
    {
        return sku;
    }

    public void setSku(String sku)
    {
        this.sku = sku;
    }

    public String getAmount()
    {
        return amount;
    }

    public void setAmount(String amount)
    {
        this.amount = amount;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public Integer getFulfillmentLagTime()
    {
        return fulfillmentLagTime;
    }

    public void setFulfillmentLagTime(Integer fulfillmentLagTime)
    {
        this.fulfillmentLagTime = fulfillmentLagTime;
    }

    public Integer getLineNumber()
    {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber)
    {
        this.lineNumber = lineNumber;
    }

    public String getUnitOfMeasurement()
    {
        return unitOfMeasurement;
    }

    public void setUnitOfMeasurement(String unitOfMeasurement)
    {
        this.unitOfMeasurement = unitOfMeasurement;
    }

}
