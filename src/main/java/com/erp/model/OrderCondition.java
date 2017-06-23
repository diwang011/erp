package com.erp.model;

public class OrderCondition
{
    private String purchaseOrderId;
    private String lineNumber;

    public String getLineNumber()
    {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber)
    {
        this.lineNumber = lineNumber;
    }

    public String getPurchaseOrderId()
    {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(String purchaseOrderId)
    {
        this.purchaseOrderId = purchaseOrderId;
    }
}
