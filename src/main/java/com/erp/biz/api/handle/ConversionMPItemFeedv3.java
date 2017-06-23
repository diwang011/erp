package com.erp.biz.api.handle;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

import com.erp.biz.api.model.mp.*;
import com.erp.biz.api.model.mp.MPOffer.ShippingWeight;
import com.erp.biz.api.model.response.CurrencyCode;
import com.erp.biz.api.model.response.Money;
import com.erp.biz.util.Helper;
import com.erp.biz.util.Reportable;

import org.apache.axis.utils.StringUtils;

public class ConversionMPItemFeedv3
{

    @SuppressWarnings("unchecked")
    public static MPItemFeed bildMPItemFeed(List<? extends Reportable> dataList, String key)
    {
        MPItemFeed mpItemFeed = null;
        Reportable row = dataList.get(0);
        System.out.println("list size:" + dataList.size());
        if (row instanceof BaseCsvable)
        {
            System.out.println("BaseCsvable...");
            mpItemFeed = conversionBaseCsvable((List<BaseCsvable>) dataList, key);

        }
        return mpItemFeed;
    }

    private static MPItemFeed conversionBaseCsvable(List<BaseCsvable> dataList, String key)
    {
        MPItemFeed mpItemFeed = new MPItemFeed();
        Iterator<BaseCsvable> it = dataList.iterator();
        while (it.hasNext())
        {
            BaseCsvable bc = it.next();
            mpItemFeed.getMPItem().add(bildMPItem(bc));
            mpItemFeed.setMPItemFeedHeader(bildMPItemFeedHeader(key, key));
        }
        return mpItemFeed;
    }

    private static MPItemFeedHeader bildMPItemFeedHeader(String requestId, String requestBatchId)
    {
        MPItemFeedHeader mpItemFeedHeader = new MPItemFeedHeader();
        mpItemFeedHeader.setRequestId(requestId);
        mpItemFeedHeader.setRequestBatchId(requestBatchId);
        mpItemFeedHeader.setVersion("3.1");
        mpItemFeedHeader.setMart("WALMART_US");
        mpItemFeedHeader.setFeedDate(Helper.convertToXMLGregorianCalendar(new java.util.Date()));
        return mpItemFeedHeader;
    }

    private static MPItem bildMPItem(BaseCsvable item)
    {
        MPItem mpItem = new MPItem();
        String sku = StringUtils.isEmpty(item.getSku()) ? null : item.getSku();
        String productName = StringUtils.isEmpty(item.getProductName()) ? null : item.getProductName();
        String productIdType = StringUtils.isEmpty(item.getProductIdType()) ? null : item.getProductIdType();
        String productId = StringUtils.isEmpty(item.getProductId()) ? null : item.getProductId();
        String description = StringUtils.isEmpty(item.getShortDescription()) ? null : item.getShortDescription();
        String productTaxCode = StringUtils.isEmpty(item.getProductTaxCode()) ? null : item.getProductTaxCode();
        String brand = StringUtils.isEmpty(item.getBrand()) ? null : item.getBrand();
        String mainImageUrl = StringUtils.isEmpty(item.getMainImageUrl()) ? null : item.getMainImageUrl();
        String price = StringUtils.isEmpty(item.getPrice()) ? null : item.getPrice();
        String measure = StringUtils.isEmpty(item.getMeasure()) ? null : item.getMeasure();
        String unit = StringUtils.isEmpty(item.getUnit()) ? null : item.getUnit();

        mpItem.setSku(sku);

        ProductIdentifiers productIdentifiers = new ProductIdentifiers();
        productIdentifiers = bildProductIdentifiers(productId, productIdType, productIdentifiers);
        mpItem.setProductIdentifiers(productIdentifiers);

        MPOffer mpOffer = new MPOffer();
        mpOffer.setPrice(Helper.String2BigDecimal(price));
        mpOffer.setProductTaxCode(new BigInteger(productTaxCode));
        ShippingWeight shippingWeight = new ShippingWeight();
        shippingWeight.setUnit(unit);
        shippingWeight.setMeasure(Helper.String2BigDecimal(measure));
        mpOffer.setShippingWeight(shippingWeight);
        mpItem.setMPOffer(mpOffer);

        MPProduct product = new MPProduct();
        product.setProductName(productName);

        Category category = new Category();
        Electronics electronics = new Electronics();
        ElectronicsAccessories electronicsAccessories = new ElectronicsAccessories();
        electronicsAccessories.setBrand(brand);
        electronicsAccessories.setShortDescription(description);
        electronicsAccessories.setMainImageUrl(mainImageUrl);
        electronics.setElectronicsAccessories(electronicsAccessories);
        category.setElectronics(electronics);
        product.setCategory(category);

        mpItem.setMPProduct(product);
        return mpItem;
    }

    private static void bildSwatchImages(String swatchImageURL, String swatchVariantAttribute,
            SportAndRecreationOther.SwatchImages swatchImages)
    {
        SportAndRecreationOther.SwatchImages.SwatchImage swatchImage = new SportAndRecreationOther.SwatchImages.SwatchImage();
        swatchImage.setSwatchVariantAttribute(swatchVariantAttribute);
        swatchImage.setSwatchImageUrl(swatchImageURL);
        swatchImages.getSwatchImage().add(swatchImage);
    }

    private static AdditionalProductAttributes bildAdditionalProductAttribute(String name, String value,
            AdditionalProductAttributes additionalProductAttributes)
    {
        if (StringUtils.isEmpty(name) || StringUtils.isEmpty(value))
        {
            return additionalProductAttributes;
        }
        AdditionalProductAttribute additionalProductAttribute1 = new AdditionalProductAttribute();
        additionalProductAttribute1.setProductAttributeName(name);
        additionalProductAttributes.getAdditionalProductAttribute().add(additionalProductAttribute1);
        return additionalProductAttributes;
    }

    private static ProductIdentifiers bildProductIdentifiers(String id, String type,
            ProductIdentifiers productIdentifiers)
    {
        if (StringUtils.isEmpty(id) || StringUtils.isEmpty(type))
        {
            return productIdentifiers;
        }
        ProductIdentifier productIdentifier = new ProductIdentifier();
        productIdentifier.setProductId(id);
        productIdentifier.setProductIdType(type);
        productIdentifiers.getProductIdentifier().add(productIdentifier);
        return productIdentifiers;
    }

    private static Money bildMoney(String amount, String currency)
    {
        if (StringUtils.isEmpty(amount) || StringUtils.isEmpty(currency))
        {
            return null;
        }
        Money minPrice = new Money();
        minPrice.setAmount(Helper.String2BigDecimal(amount));
        minPrice.setCurrency(CurrencyCode.fromValue(currency));
        return minPrice;
    }

    private static SportAndRecreationOther.AssembledProductWeight fromWeightUnit(String unit, String measure)
    {
        if (StringUtils.isEmpty(unit) || StringUtils.isEmpty(measure))
        {
            return null;
        }
        SportAndRecreationOther.AssembledProductWeight assembledProductWeight = new SportAndRecreationOther.AssembledProductWeight();
        assembledProductWeight.setUnit(unit);
        assembledProductWeight.setMeasure(Helper.String2BigDecimal(measure));
        return assembledProductWeight;
    }

    private static SportAndRecreationOther.AssembledProductLength fromLengthUnit(String unit, String measure)
    {
        if (StringUtils.isEmpty(unit) || StringUtils.isEmpty(measure))
        {
            return null;
        }
        SportAndRecreationOther.AssembledProductLength lengthUnit = new SportAndRecreationOther.AssembledProductLength();
        lengthUnit.setUnit(unit);
        lengthUnit.setMeasure(Helper.String2BigDecimal(measure));
        return lengthUnit;
    }

    private static SportAndRecreationOther.AssembledProductHeight fromHeightUnit(String unit, String measure)
    {
        if (StringUtils.isEmpty(unit) || StringUtils.isEmpty(measure))
        {
            return null;
        }
        SportAndRecreationOther.AssembledProductHeight lengthUnit = new SportAndRecreationOther.AssembledProductHeight();
        lengthUnit.setUnit(unit);
        lengthUnit.setMeasure(Helper.String2BigDecimal(measure));
        return lengthUnit;
    }

    private static SportAndRecreationOther.AssembledProductWidth fromWidthUnit(String unit, String measure)
    {
        if (StringUtils.isEmpty(unit) || StringUtils.isEmpty(measure))
        {
            return null;
        }
        SportAndRecreationOther.AssembledProductWidth lengthUnit = new SportAndRecreationOther.AssembledProductWidth();
        lengthUnit.setUnit(unit);
        lengthUnit.setMeasure(Helper.String2BigDecimal(measure));
        return lengthUnit;
    }

}
