package com.erp.view.model;

public class ViewRefund
{
    private String refundId;
    private String refundComments;

    private String chargeName;
    private Double chargeAmount;
    private String chargeCurrency;

    private String taxName;
    private Double taxAmount;
    private String taxCurrency;

    private String refundReason;

    public String getRefundId()
    {
        return refundId;
    }

    public void setRefundId(String refundId)
    {
        this.refundId = refundId;
    }

    public String getRefundComments()
    {
        return refundComments;
    }

    public void setRefundComments(String refundComments)
    {
        this.refundComments = refundComments;
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

    public String getRefundReason()
    {
        return refundReason;
    }

    public void setRefundReason(String refundReason)
    {
        this.refundReason = refundReason;
    }

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
