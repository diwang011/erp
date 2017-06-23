package com.erp.model;

import java.util.LinkedHashMap;
import java.util.Map;

import com.erp.biz.util.FieldNameAndHeaderMapping;
import com.erp.biz.util.Reportable;

public class InventoryInfo implements Reportable
{
    private String sku;
    private String amount;
    private Integer fulfillmentLagTime;
    private FieldNameAndHeaderMapping fieldHeaderMapping = null;

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

    public Integer getFulfillmentLagTime()
    {
        return fulfillmentLagTime;
    }

    public void setFulfillmentLagTime(Integer fulfillmentLagTime)
    {
        this.fulfillmentLagTime = fulfillmentLagTime;
    }

    @Override
    public FieldNameAndHeaderMapping fetchFieldNameAndHeaderMapping()
    {
        if (fieldHeaderMapping == null)
        {
            fieldHeaderMapping = new FieldNameAndHeaderMapping();
            Map<String, String> fieldHeaderMap = new LinkedHashMap<String, String>();
            fieldHeaderMap.put("sku", "sku");
            fieldHeaderMap.put("amount", "amount");
            fieldHeaderMap.put("fulfillmentLagTime", "fulfillmentLagTime");
            fieldHeaderMapping.setFieldNameCsvHeaderMap(fieldHeaderMap);
        }
        return fieldHeaderMapping;
    }

}
