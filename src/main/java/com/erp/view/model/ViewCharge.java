package com.erp.view.model;

import com.erp.model.OrderCondition;

public class ViewCharge extends OrderCondition
{
    private String chargeName;
    private Double chargeAmount;
    private String chargeCurrency;
    
    private String taxName;
    private Double taxAmount;
    private String taxCurrency;

    public String getChargeName()
    {
        return chargeName;
    }

    public void setChargeName(String chargeName)
    {
        this.chargeName = chargeName;
    }

    public Double getChargeAmount()
    {
        return chargeAmount;
    }

    public void setChargeAmount(Double chargeAmount)
    {
        this.chargeAmount = chargeAmount;
    }

    public String getTaxName()
    {
        return taxName;
    }

    public void setTaxName(String taxName)
    {
        this.taxName = taxName;
    }

    public Double getTaxAmount()
    {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount)
    {
        this.taxAmount = taxAmount;
    }

    public String getChargeCurrency()
    {
        return chargeCurrency;
    }

    public void setChargeCurrency(String chargeCurrency)
    {
        this.chargeCurrency = chargeCurrency;
    }

    public String getTaxCurrency()
    {
        return taxCurrency;
    }

    public void setTaxCurrency(String taxCurrency)
    {
        this.taxCurrency = taxCurrency;
    }

}
