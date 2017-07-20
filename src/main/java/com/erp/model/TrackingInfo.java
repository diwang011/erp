package com.erp.model;

public class TrackingInfo extends OrderCondition
{
    private String purchaseOrderId;
    private String trackingNumber;
    private String carrierName;

    public String getPurchaseOrderId()
    {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId)
    {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getTrackingNumber()
    {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber)
    {
        this.trackingNumber = trackingNumber;
    }

    public String getCarrierName()
    {
        return carrierName;
    }

    public void setCarrierName(String carrierName)
    {
        this.carrierName = carrierName;
    }

}
