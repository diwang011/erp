package com.erp.biz.api.handle;

import java.util.LinkedHashMap;
import java.util.Map;

import com.erp.biz.util.FieldNameAndHeaderMapping;
import com.erp.biz.util.Reportable;

public class BaseCsvable implements Reportable
{
    protected String sku;
    protected String productName;
    protected String productIdType;
    protected String productId;
    protected String shortDescription;
    protected String productTaxCode;
    protected String brand;
    protected String mainImageUrl;
    protected String price;
    protected String measure;
    protected String unit;

    private FieldNameAndHeaderMapping fieldHeaderMapping = null;

    @Override
    public FieldNameAndHeaderMapping fetchFieldNameAndHeaderMapping()
    {
        if (fieldHeaderMapping == null)
        {
            fieldHeaderMapping = new FieldNameAndHeaderMapping();
            Map<String, String> fieldHeaderMap = new LinkedHashMap<String, String>();
            fieldHeaderMap.put("sku", "sku");
            fieldHeaderMap.put("productName", "productName");
            fieldHeaderMap.put("productIdType", "productIdType");
            fieldHeaderMap.put("productId", "productId");
            fieldHeaderMap.put("shortDescription", "shortDescription");
            fieldHeaderMap.put("productTaxCode", "productTaxCode");
            fieldHeaderMap.put("brand", "brand");
            fieldHeaderMap.put("mainImageUrl", "mainImageUrl");
            fieldHeaderMap.put("price", "Price");
            fieldHeaderMap.put("measure", "measure");
            fieldHeaderMap.put("unit", "unit");
            fieldHeaderMapping.setFieldNameCsvHeaderMap(fieldHeaderMap);
        }
        return fieldHeaderMapping;
    }

    public String getSku()
    {
        return sku;
    }

    public void setSku(String sku)
    {
        this.sku = sku;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getProductIdType()
    {
        return productIdType;
    }

    public void setProductIdType(String productIdType)
    {
        this.productIdType = productIdType;
    }

    public String getProductId()
    {
        return productId;
    }

    public void setProductId(String productId)
    {
        this.productId = productId;
    }

    public String getShortDescription()
    {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription)
    {
        this.shortDescription = shortDescription;
    }

    public String getProductTaxCode()
    {
        return productTaxCode;
    }

    public void setProductTaxCode(String productTaxCode)
    {
        this.productTaxCode = productTaxCode;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getMainImageUrl()
    {
        return mainImageUrl;
    }

    public void setMainImageUrl(String mainImageUrl)
    {
        this.mainImageUrl = mainImageUrl;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }

    public String getMeasure()
    {
        return measure;
    }

    public void setMeasure(String measure)
    {
        this.measure = measure;
    }

    public String getUnit()
    {
        return unit;
    }

    public void setUnit(String unit)
    {
        this.unit = unit;
    }

    public FieldNameAndHeaderMapping getFieldHeaderMapping()
    {
        return fieldHeaderMapping;
    }

    public void setFieldHeaderMapping(FieldNameAndHeaderMapping fieldHeaderMapping)
    {
        this.fieldHeaderMapping = fieldHeaderMapping;
    }

}
