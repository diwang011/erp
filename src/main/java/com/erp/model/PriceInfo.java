package com.erp.model;

import java.util.LinkedHashMap;
import java.util.Map;

import com.erp.biz.util.FieldNameAndHeaderMapping;
import com.erp.biz.util.Reportable;

public class PriceInfo implements Reportable
{
    private String sku;
    private String amount;
    private String currency;
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

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    @Override
    public FieldNameAndHeaderMapping fetchFieldNameAndHeaderMapping()
    {
        if (fieldHeaderMapping == null)
        {
            fieldHeaderMapping = new FieldNameAndHeaderMapping();
            Map<String, String> fieldHeaderMap = new LinkedHashMap<String, String>();
            fieldHeaderMap.put("sku", "sku");
            fieldHeaderMap.put("currency", "currency");
            fieldHeaderMap.put("amount", "amount");
            fieldHeaderMapping.setFieldNameCsvHeaderMap(fieldHeaderMap);
        }
        return fieldHeaderMapping;
    }

}
