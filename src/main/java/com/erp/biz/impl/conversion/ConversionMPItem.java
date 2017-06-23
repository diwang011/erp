package com.erp.biz.impl.conversion;

import java.util.Date;
import java.util.List;

import com.erp.biz.api.model.mp.*;
import com.erp.biz.api.model.mp.MPOffer.*;
import com.erp.biz.model.*;
import com.erp.biz.util.Helper;

public class ConversionMPItem
{
    public static MPItemFeed bildMPItemFeed(List<List<Object>> dataList, String fileName)
    {
        MPItemFeed mpItemFeed = new MPItemFeed();
        for (List<Object> list : dataList)
        {
            mpItemFeed.setMPItemFeedHeader(bildMPItemFeedHeader(fileName, fileName));
            for (Object oo : list)
            {
                if (oo instanceof CommonTable)
                {
                    CommonTable item = (CommonTable) oo;
                    mpItemFeed.getMPItem().add(bildMPItem(item, oo));
                }
            }
        }
        return mpItemFeed;
    }

    static Category bildCategory(CommonTable item, Object oo)
    {
        Category category = new Category();
        if (oo instanceof ElectronicsAccessoriesTable)
        {
            ElectronicsAccessoriesTable row = (ElectronicsAccessoriesTable) oo;
            Electronics electronics = new Electronics();
            electronics.setElectronicsAccessories(ConversionElectronicsAccessories.buldElectronicsAccessories(row));
            category.setElectronics(electronics);
        }
        if (oo instanceof SportAndRecreationOtherTable)
        {
            SportAndRecreationOtherTable row = (SportAndRecreationOtherTable) oo;
            SportAndRecreation sportAndRecreation = new SportAndRecreation();
            sportAndRecreation
                    .setSportAndRecreationOther(ConversionSportAndRecreationOther.buldSportAndRecreationOther(row));
            category.setSportAndRecreation(sportAndRecreation);
        }
        return category;
    }

    private static MPItemFeedHeader bildMPItemFeedHeader(String requestId, String requestBatchId)
    {
        MPItemFeedHeader mpItemFeedHeader = new MPItemFeedHeader();
        // mpItemFeedHeader.setRequestId(requestId);
        // mpItemFeedHeader.setRequestBatchId(requestId);
        mpItemFeedHeader.setVersion("3.1");
        mpItemFeedHeader.setMart("WALMART_US");
        mpItemFeedHeader.setFeedDate(Helper.convertToXMLGregorianCalendar(new java.util.Date()));
        return mpItemFeedHeader;
    }

    private static MPItem bildMPItem(CommonTable item, Object oo)
    {
        String sku = item.getSku();
        List<String> productIdTypes = item.getProductIdType();
        List<String> productIds = item.getProductId();
        MPItem mpItem = new MPItem();
        mpItem.setProcessMode("CREATE");
        mpItem.setFeedDate(Helper.convertToXMLGregorianCalendar(new Date()));
        mpItem.setSku(sku);

        mpItem.setProductIdentifiers(bildProductIdentifiers(productIds, productIdTypes));

        mpItem.setMPOffer(bildMPOffer(item));

        mpItem.setMPProduct(bildMPProduct(item, oo));
        return mpItem;
    }

    private static ProductIdentifiers bildProductIdentifiers(List<String> ids, List<String> types)
    {
        ProductIdentifiers productIdentifiers = new ProductIdentifiers();
        for (int i = 0; i < ids.size(); i++)
        {
            ProductIdentifier productIdentifier = new ProductIdentifier();
            productIdentifier.setProductId(ids.get(i));
            productIdentifier.setProductIdType(types.get(i));
            productIdentifiers.getProductIdentifier().add(productIdentifier);
        }
        return productIdentifiers;
    }

    private static MPProduct bildMPProduct(CommonTable item, Object oo)
    {
        String productName = item.getProductName();
        String productIdUpdate = item.getProductIdUpdate();
        String skuUpdate = item.getSkuUpdate();
        List<String> productAttributeNames = item.getProductAttributeName();
        List<String> productAttributeValues = item.getProductAttributeValue();
        String msrp = item.getMsrp();

        MPProduct product = new MPProduct();
        product.setProductName(productName);
        product.setMsrp(Helper.String2BigDecimal(msrp));
        product.setAdditionalProductAttributes(
                bildAdditionalProductAttributes(productAttributeNames, productAttributeValues));
        product.setProductIdUpdate(productIdUpdate);
        product.setSkuUpdate(skuUpdate);

        product.setCategory(bildCategory(item, oo));
        return product;
    }

    private static AdditionalProductAttributes bildAdditionalProductAttributes(List<String> productAttributeNames,
            List<String> productAttributeValues)
    {
        if (productAttributeNames == null || productAttributeValues == null)
        {
            return null;
        }
        AdditionalProductAttributes additionalProductAttributes = new AdditionalProductAttributes();
        for (int i = 0; i < productAttributeNames.size(); i++)
        {
            AdditionalProductAttribute additionalProductAttribute = new AdditionalProductAttribute();
            additionalProductAttribute.setProductAttributeName(productAttributeNames.get(i));
            additionalProductAttribute.getProductAttributeValue().add(productAttributeValues.get(i));
            additionalProductAttributes.getAdditionalProductAttribute().add(additionalProductAttribute);
        }
        return additionalProductAttributes;
    }

    private static MPOffer bildMPOffer(CommonTable item)
    {
        String productTaxCode = item.getProductTaxCode();
        String price = item.getPrice();
        String ShippingWeight_measure = item.getShippingWeight_measure();
        String ShippingWeight_unit = item.getShippingWeight_unit();
        String startDate = item.getStartDate();
        String endDate = item.getEndDate();
        String minimumAdvertisedPrice = item.getMinimumAdvertisedPrice();
        String mustShipAlone = item.getMustShipAlone();
        String shipsInOriginalPackaging = item.getShipsInOriginalPackaging();
        List<String> additionalOfferAttributeNames = item.getAdditionalOfferAttributeName();
        List<String> additionalOfferAttributeValues = item.getAdditionalOfferAttributeValue();
        String shippingOverrideAction = item.getShippingOverrideAction();
        List<String> shippingOverrideIsShippingAlloweds = item.getShippingOverrideIsShippingAllowed();
        List<String> shippingOverrideShipMethods = item.getShippingOverrideShipMethod();
        List<String> shippingOverrideshipPrices = item.getShippingOverrideshipPrice();
        List<String> shippingOverrideShipRegions = item.getShippingOverrideShipRegion();

        MPOffer mpOffer = new MPOffer();
        mpOffer.setPrice(Helper.String2BigDecimal(price));
        mpOffer.setProductTaxCode(Helper.String2BigInteger(productTaxCode));
        mpOffer.setShippingWeight(bildShippingWeight(ShippingWeight_measure, ShippingWeight_unit));

        mpOffer.setAdditionalOfferAttributes(
                bildAdditionalOfferAttributes(additionalOfferAttributeNames, additionalOfferAttributeValues));
        mpOffer.setMinimumAdvertisedPrice(Helper.String2BigDecimal(minimumAdvertisedPrice));
        mpOffer.setMustShipAlone(mustShipAlone);
        mpOffer.setShippingOverrides(bildShippingOverrides(shippingOverrideAction, shippingOverrideIsShippingAlloweds,
                shippingOverrideShipMethods, shippingOverrideshipPrices, shippingOverrideShipRegions));
        mpOffer.setShipsInOriginalPackaging(shipsInOriginalPackaging);
        mpOffer.setStartDate(Helper.convertToXMLGregorianCalendarByString(startDate));
        mpOffer.setEndDate(Helper.convertToXMLGregorianCalendarByString(endDate));
        return mpOffer;
    }

    static ShippingWeight bildShippingWeight(String measure, String unit)
    {
        if (measure == null || unit == null)
        {
            return null;
        }
        ShippingWeight shippingWeight = new ShippingWeight();
        shippingWeight.setUnit(unit);
        shippingWeight.setMeasure(Helper.String2BigDecimal(measure));
        return shippingWeight;
    }

    static ShippingOverrides bildShippingOverrides(String shippingOverrideAction,
            List<String> shippingOverrideIsShippingAlloweds, List<String> shippingOverrideShipMethods,
            List<String> shippingOverrideshipPrices, List<String> shippingOverrideShipRegions)
    {
        ShippingOverrides shippingOverrides = null;
        if (shippingOverrideAction != null)
        {
            shippingOverrides = new ShippingOverrides();
            shippingOverrides.setShippingOverrideAction(shippingOverrideAction);
        }
        if (shippingOverrideIsShippingAlloweds != null && shippingOverrideShipMethods != null
                && shippingOverrideshipPrices != null && shippingOverrideShipRegions != null)
        {
            if (shippingOverrides == null)
            {
                shippingOverrides = new ShippingOverrides();
            }
            for (int i = 0; i < shippingOverrideIsShippingAlloweds.size(); i++)
            {
                ShippingOverride shippingOverride = new ShippingOverride();
                shippingOverride.setShippingOverrideIsShippingAllowed(shippingOverrideIsShippingAlloweds.get(i));
                shippingOverride.setShippingOverrideShipMethod(shippingOverrideShipMethods.get(i));
                shippingOverride
                        .setShippingOverrideshipPrice(Helper.String2BigDecimal(shippingOverrideshipPrices.get(i)));
                shippingOverride.setShippingOverrideShipRegion(shippingOverrideShipRegions.get(i));
                shippingOverrides.getShippingOverride().add(shippingOverride);
            }
        }
        return shippingOverrides;
    }

    static AdditionalOfferAttributes bildAdditionalOfferAttributes(List<String> additionalOfferAttributeNames,
            List<String> additionalOfferAttributeValues)
    {
        if (additionalOfferAttributeNames == null || additionalOfferAttributeValues == null)
        {
            return null;
        }
        AdditionalOfferAttributes additionalOfferAttributes = new AdditionalOfferAttributes();
        for (int i = 0; i < additionalOfferAttributeNames.size(); i++)
        {
            AdditionalOfferAttribute additionalOfferAttribute = new AdditionalOfferAttribute();
            additionalOfferAttribute.setAdditionalOfferAttributeName(additionalOfferAttributeNames.get(i));
            additionalOfferAttribute.getAdditionalOfferAttributeValue().add(additionalOfferAttributeValues.get(i));
            additionalOfferAttributes.getAdditionalOfferAttribute().add(additionalOfferAttribute);
        }
        return additionalOfferAttributes;
    }

}
