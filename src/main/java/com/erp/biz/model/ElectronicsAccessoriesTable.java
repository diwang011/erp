package com.erp.biz.model;

import java.util.List;

public class ElectronicsAccessoriesTable extends CommonTable
{
    private String sku;
    private String productName;
    private List<String> productIdType;
    private List<String> productId;
    private String shortDescription;
    private String ProductTaxCode;
    private String brand;
    private String mainImageUrl;
    private String price;
    private String ShippingWeight_measure;
    private String ShippingWeight_unit;

    private List<String> keyFeatures;
    private String manufacturer;
    private String manufacturerPartNumber;
    private String modelNumber;
    private String multipackQuantity;
    private String countPerPack;
    private String count;
    private String pieceCount;
    private String ProductIdUpdate;
    private String SkuUpdate;
    private List<String> productSecondaryImageURL;
    private String msrp;
    private String MinimumAdvertisedPrice;
    private String StartDate;
    private String EndDate;
    private String MustShipAlone;
    private List<String> ShippingOverrideIsShippingAllowed;
    private List<String> ShippingOverrideShipMethod;
    private List<String> ShippingOverrideShipRegion;
    private List<String> ShippingOverrideshipPrice;
    private String color;
    private List<String> colorCategory;
    private String size;
    private String screenSize_measure;
    private String screenSize_unit;
    private List<String> compatibleBrands;
    private String compatibleDevices;
    private String shipsInOriginalPackaging;
    private String assembledProductLength_measure;
    private String assembledProductLength_unit;
    private String assembledProductWidth_measure;
    private String assembledProductWidth_unit;
    private String assembledProductHeight_measure;
    private String assembledProductHeight_unit;
    private String assembledProductWeight_measure;
    private String assembledProductWeight_unit;
    private String variantGroupId;
    private List<String> variantAttributeNames;
    private String isPrimaryVariant;
    private List<String> swatchVariantAttribute;
    private List<String> swatchImageUrl;
    private String isProp65WarningRequired;
    private String prop65WarningText;
    private String batteryTechnologyType;
    private String isChemical;
    private List<String> connections;
    private List<String> memoryCardType;
    private String opticalDrive;
    private String tvAndMonitorMountType;
    private String maximumLoadWeight_measure;
    private String maximumLoadWeight_unit;
    private String maximumScreenSize_measure;
    private String maximumScreenSize_unit;
    private String minimumScreenSize_measure;
    private String minimumScreenSize_unit;
    private List<String> recordableMediaFormats;
    private List<String> headphoneFeatures;
    private List<String> wirelessTechnologies;
    private List<String> audioFeatures;
    private String peakAudioPowerCapacity_measure;
    private String peakAudioPowerCapacity_unit;
    private String audioPowerOutput_measure;
    private String audioPowerOutput_unit;
    private String dataTransferRate_measure;
    private String dataTransferRate_unit;

    private String microphoneTechnology;
    private String numberOfSpeakers;
    private String mountingPattern;
    private String movementDetection;
    private String headphoneStyle;
    private List<String> features;
    private String keywords;

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

    public List<String> getProductIdType()
    {
        return productIdType;
    }

    public void setProductIdType(List<String> productIdType)
    {
        this.productIdType = productIdType;
    }

    public List<String> getProductId()
    {
        return productId;
    }

    public void setProductId(List<String> productId)
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
        return ProductTaxCode;
    }

    public void setProductTaxCode(String productTaxCode)
    {
        ProductTaxCode = productTaxCode;
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

    public String getShippingWeight_measure()
    {
        return ShippingWeight_measure;
    }

    public void setShippingWeight_measure(String shippingWeight_measure)
    {
        ShippingWeight_measure = shippingWeight_measure;
    }

    public String getShippingWeight_unit()
    {
        return ShippingWeight_unit;
    }

    public void setShippingWeight_unit(String shippingWeight_unit)
    {
        ShippingWeight_unit = shippingWeight_unit;
    }

    public List<String> getKeyFeatures()
    {
        return keyFeatures;
    }

    public void setKeyFeatures(List<String> keyFeatures)
    {
        this.keyFeatures = keyFeatures;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    public String getManufacturerPartNumber()
    {
        return manufacturerPartNumber;
    }

    public void setManufacturerPartNumber(String manufacturerPartNumber)
    {
        this.manufacturerPartNumber = manufacturerPartNumber;
    }

    public String getModelNumber()
    {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber)
    {
        this.modelNumber = modelNumber;
    }

    public String getMultipackQuantity()
    {
        return multipackQuantity;
    }

    public void setMultipackQuantity(String multipackQuantity)
    {
        this.multipackQuantity = multipackQuantity;
    }

    public String getCountPerPack()
    {
        return countPerPack;
    }

    public void setCountPerPack(String countPerPack)
    {
        this.countPerPack = countPerPack;
    }

    public String getCount()
    {
        return count;
    }

    public void setCount(String count)
    {
        this.count = count;
    }

    public String getPieceCount()
    {
        return pieceCount;
    }

    public void setPieceCount(String pieceCount)
    {
        this.pieceCount = pieceCount;
    }

    public String getProductIdUpdate()
    {
        return ProductIdUpdate;
    }

    public void setProductIdUpdate(String productIdUpdate)
    {
        ProductIdUpdate = productIdUpdate;
    }

    public String getSkuUpdate()
    {
        return SkuUpdate;
    }

    public void setSkuUpdate(String skuUpdate)
    {
        SkuUpdate = skuUpdate;
    }

    public List<String> getProductSecondaryImageURL()
    {
        return productSecondaryImageURL;
    }

    public void setProductSecondaryImageURL(List<String> productSecondaryImageURL)
    {
        this.productSecondaryImageURL = productSecondaryImageURL;
    }

    public String getMsrp()
    {
        return msrp;
    }

    public void setMsrp(String msrp)
    {
        this.msrp = msrp;
    }

    public String getMinimumAdvertisedPrice()
    {
        return MinimumAdvertisedPrice;
    }

    public void setMinimumAdvertisedPrice(String minimumAdvertisedPrice)
    {
        MinimumAdvertisedPrice = minimumAdvertisedPrice;
    }

    public String getStartDate()
    {
        return StartDate;
    }

    public void setStartDate(String startDate)
    {
        StartDate = startDate;
    }

    public String getEndDate()
    {
        return EndDate;
    }

    public void setEndDate(String endDate)
    {
        EndDate = endDate;
    }

    public String getMustShipAlone()
    {
        return MustShipAlone;
    }

    public void setMustShipAlone(String mustShipAlone)
    {
        MustShipAlone = mustShipAlone;
    }

    public List<String> getShippingOverrideIsShippingAllowed()
    {
        return ShippingOverrideIsShippingAllowed;
    }

    public void setShippingOverrideIsShippingAllowed(List<String> shippingOverrideIsShippingAllowed)
    {
        ShippingOverrideIsShippingAllowed = shippingOverrideIsShippingAllowed;
    }

    public List<String> getShippingOverrideShipMethod()
    {
        return ShippingOverrideShipMethod;
    }

    public void setShippingOverrideShipMethod(List<String> shippingOverrideShipMethod)
    {
        ShippingOverrideShipMethod = shippingOverrideShipMethod;
    }

    public List<String> getShippingOverrideShipRegion()
    {
        return ShippingOverrideShipRegion;
    }

    public void setShippingOverrideShipRegion(List<String> shippingOverrideShipRegion)
    {
        ShippingOverrideShipRegion = shippingOverrideShipRegion;
    }

    public List<String> getShippingOverrideshipPrice()
    {
        return ShippingOverrideshipPrice;
    }

    public void setShippingOverrideshipPrice(List<String> shippingOverrideshipPrice)
    {
        ShippingOverrideshipPrice = shippingOverrideshipPrice;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public List<String> getColorCategory()
    {
        return colorCategory;
    }

    public void setColorCategory(List<String> colorCategory)
    {
        this.colorCategory = colorCategory;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public String getScreenSize_measure()
    {
        return screenSize_measure;
    }

    public void setScreenSize_measure(String screenSize_measure)
    {
        this.screenSize_measure = screenSize_measure;
    }

    public String getScreenSize_unit()
    {
        return screenSize_unit;
    }

    public void setScreenSize_unit(String screenSize_unit)
    {
        this.screenSize_unit = screenSize_unit;
    }

    public List<String> getCompatibleBrands()
    {
        return compatibleBrands;
    }

    public void setCompatibleBrands(List<String> compatibleBrands)
    {
        this.compatibleBrands = compatibleBrands;
    }

    public String getCompatibleDevices()
    {
        return compatibleDevices;
    }

    public void setCompatibleDevices(String compatibleDevices)
    {
        this.compatibleDevices = compatibleDevices;
    }

    public String getShipsInOriginalPackaging()
    {
        return shipsInOriginalPackaging;
    }

    public void setShipsInOriginalPackaging(String shipsInOriginalPackaging)
    {
        this.shipsInOriginalPackaging = shipsInOriginalPackaging;
    }

    public String getAssembledProductLength_measure()
    {
        return assembledProductLength_measure;
    }

    public void setAssembledProductLength_measure(String assembledProductLength_measure)
    {
        this.assembledProductLength_measure = assembledProductLength_measure;
    }

    public String getAssembledProductLength_unit()
    {
        return assembledProductLength_unit;
    }

    public void setAssembledProductLength_unit(String assembledProductLength_unit)
    {
        this.assembledProductLength_unit = assembledProductLength_unit;
    }

    public String getAssembledProductWidth_measure()
    {
        return assembledProductWidth_measure;
    }

    public void setAssembledProductWidth_measure(String assembledProductWidth_measure)
    {
        this.assembledProductWidth_measure = assembledProductWidth_measure;
    }

    public String getAssembledProductWidth_unit()
    {
        return assembledProductWidth_unit;
    }

    public void setAssembledProductWidth_unit(String assembledProductWidth_unit)
    {
        this.assembledProductWidth_unit = assembledProductWidth_unit;
    }

    public String getAssembledProductHeight_measure()
    {
        return assembledProductHeight_measure;
    }

    public void setAssembledProductHeight_measure(String assembledProductHeight_measure)
    {
        this.assembledProductHeight_measure = assembledProductHeight_measure;
    }

    public String getAssembledProductHeight_unit()
    {
        return assembledProductHeight_unit;
    }

    public void setAssembledProductHeight_unit(String assembledProductHeight_unit)
    {
        this.assembledProductHeight_unit = assembledProductHeight_unit;
    }

    public String getAssembledProductWeight_measure()
    {
        return assembledProductWeight_measure;
    }

    public void setAssembledProductWeight_measure(String assembledProductWeight_measure)
    {
        this.assembledProductWeight_measure = assembledProductWeight_measure;
    }

    public String getAssembledProductWeight_unit()
    {
        return assembledProductWeight_unit;
    }

    public void setAssembledProductWeight_unit(String assembledProductWeight_unit)
    {
        this.assembledProductWeight_unit = assembledProductWeight_unit;
    }

    public String getVariantGroupId()
    {
        return variantGroupId;
    }

    public void setVariantGroupId(String variantGroupId)
    {
        this.variantGroupId = variantGroupId;
    }

    public List<String> getVariantAttributeNames()
    {
        return variantAttributeNames;
    }

    public void setVariantAttributeNames(List<String> variantAttributeNames)
    {
        this.variantAttributeNames = variantAttributeNames;
    }

    public String getIsPrimaryVariant()
    {
        return isPrimaryVariant;
    }

    public void setIsPrimaryVariant(String isPrimaryVariant)
    {
        this.isPrimaryVariant = isPrimaryVariant;
    }

    public List<String> getSwatchVariantAttribute()
    {
        return swatchVariantAttribute;
    }

    public void setSwatchVariantAttribute(List<String> swatchVariantAttribute)
    {
        this.swatchVariantAttribute = swatchVariantAttribute;
    }

    public List<String> getSwatchImageUrl()
    {
        return swatchImageUrl;
    }

    public void setSwatchImageUrl(List<String> swatchImageUrl)
    {
        this.swatchImageUrl = swatchImageUrl;
    }

    public String getIsProp65WarningRequired()
    {
        return isProp65WarningRequired;
    }

    public void setIsProp65WarningRequired(String isProp65WarningRequired)
    {
        this.isProp65WarningRequired = isProp65WarningRequired;
    }

    public String getProp65WarningText()
    {
        return prop65WarningText;
    }

    public void setProp65WarningText(String prop65WarningText)
    {
        this.prop65WarningText = prop65WarningText;
    }

    public String getBatteryTechnologyType()
    {
        return batteryTechnologyType;
    }

    public void setBatteryTechnologyType(String batteryTechnologyType)
    {
        this.batteryTechnologyType = batteryTechnologyType;
    }

    public String getIsChemical()
    {
        return isChemical;
    }

    public void setIsChemical(String isChemical)
    {
        this.isChemical = isChemical;
    }

    public List<String> getConnections()
    {
        return connections;
    }

    public void setConnections(List<String> connections)
    {
        this.connections = connections;
    }

    public List<String> getMemoryCardType()
    {
        return memoryCardType;
    }

    public void setMemoryCardType(List<String> memoryCardType)
    {
        this.memoryCardType = memoryCardType;
    }

    public String getOpticalDrive()
    {
        return opticalDrive;
    }

    public void setOpticalDrive(String opticalDrive)
    {
        this.opticalDrive = opticalDrive;
    }

    public String getTvAndMonitorMountType()
    {
        return tvAndMonitorMountType;
    }

    public void setTvAndMonitorMountType(String tvAndMonitorMountType)
    {
        this.tvAndMonitorMountType = tvAndMonitorMountType;
    }

    public String getMaximumLoadWeight_measure()
    {
        return maximumLoadWeight_measure;
    }

    public void setMaximumLoadWeight_measure(String maximumLoadWeight_measure)
    {
        this.maximumLoadWeight_measure = maximumLoadWeight_measure;
    }

    public String getMaximumLoadWeight_unit()
    {
        return maximumLoadWeight_unit;
    }

    public void setMaximumLoadWeight_unit(String maximumLoadWeight_unit)
    {
        this.maximumLoadWeight_unit = maximumLoadWeight_unit;
    }

    public String getMaximumScreenSize_measure()
    {
        return maximumScreenSize_measure;
    }

    public void setMaximumScreenSize_measure(String maximumScreenSize_measure)
    {
        this.maximumScreenSize_measure = maximumScreenSize_measure;
    }

    public String getMaximumScreenSize_unit()
    {
        return maximumScreenSize_unit;
    }

    public void setMaximumScreenSize_unit(String maximumScreenSize_unit)
    {
        this.maximumScreenSize_unit = maximumScreenSize_unit;
    }

    public String getMinimumScreenSize_measure()
    {
        return minimumScreenSize_measure;
    }

    public void setMinimumScreenSize_measure(String minimumScreenSize_measure)
    {
        this.minimumScreenSize_measure = minimumScreenSize_measure;
    }

    public String getMinimumScreenSize_unit()
    {
        return minimumScreenSize_unit;
    }

    public void setMinimumScreenSize_unit(String minimumScreenSize_unit)
    {
        this.minimumScreenSize_unit = minimumScreenSize_unit;
    }

    public List<String> getRecordableMediaFormats()
    {
        return recordableMediaFormats;
    }

    public void setRecordableMediaFormats(List<String> recordableMediaFormats)
    {
        this.recordableMediaFormats = recordableMediaFormats;
    }

    public List<String> getHeadphoneFeatures()
    {
        return headphoneFeatures;
    }

    public void setHeadphoneFeatures(List<String> headphoneFeatures)
    {
        this.headphoneFeatures = headphoneFeatures;
    }

    public List<String> getAudioFeatures()
    {
        return audioFeatures;
    }

    public void setAudioFeatures(List<String> audioFeatures)
    {
        this.audioFeatures = audioFeatures;
    }

    public String getPeakAudioPowerCapacity_measure()
    {
        return peakAudioPowerCapacity_measure;
    }

    public void setPeakAudioPowerCapacity_measure(String peakAudioPowerCapacity_measure)
    {
        this.peakAudioPowerCapacity_measure = peakAudioPowerCapacity_measure;
    }

    public String getDataTransferRate_measure()
    {
        return dataTransferRate_measure;
    }

    public void setDataTransferRate_measure(String dataTransferRate_measure)
    {
        this.dataTransferRate_measure = dataTransferRate_measure;
    }

    public String getDataTransferRate_unit()
    {
        return dataTransferRate_unit;
    }

    public void setDataTransferRate_unit(String dataTransferRate_unit)
    {
        this.dataTransferRate_unit = dataTransferRate_unit;
    }

    public String getMicrophoneTechnology()
    {
        return microphoneTechnology;
    }

    public void setMicrophoneTechnology(String microphoneTechnology)
    {
        this.microphoneTechnology = microphoneTechnology;
    }

    public String getNumberOfSpeakers()
    {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(String numberOfSpeakers)
    {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getMountingPattern()
    {
        return mountingPattern;
    }

    public void setMountingPattern(String mountingPattern)
    {
        this.mountingPattern = mountingPattern;
    }

    public String getMovementDetection()
    {
        return movementDetection;
    }

    public void setMovementDetection(String movementDetection)
    {
        this.movementDetection = movementDetection;
    }

    public String getHeadphoneStyle()
    {
        return headphoneStyle;
    }

    public void setHeadphoneStyle(String headphoneStyle)
    {
        this.headphoneStyle = headphoneStyle;
    }

    public List<String> getFeatures()
    {
        return features;
    }

    public void setFeatures(List<String> features)
    {
        this.features = features;
    }

    public String getKeywords()
    {
        return keywords;
    }

    public void setKeywords(String keywords)
    {
        this.keywords = keywords;
    }

    public String getPeakAudioPowerCapacity_unit()
    {
        return peakAudioPowerCapacity_unit;
    }

    public void setPeakAudioPowerCapacity_unit(String peakAudioPowerCapacity_unit)
    {
        this.peakAudioPowerCapacity_unit = peakAudioPowerCapacity_unit;
    }

    public String getAudioPowerOutput_measure()
    {
        return audioPowerOutput_measure;
    }

    public void setAudioPowerOutput_measure(String audioPowerOutput_measure)
    {
        this.audioPowerOutput_measure = audioPowerOutput_measure;
    }

    public String getAudioPowerOutput_unit()
    {
        return audioPowerOutput_unit;
    }

    public void setAudioPowerOutput_unit(String audioPowerOutput_unit)
    {
        this.audioPowerOutput_unit = audioPowerOutput_unit;
    }

    public List<String> getWirelessTechnologies()
    {
        return wirelessTechnologies;
    }

    public void setWirelessTechnologies(List<String> wirelessTechnologies)
    {
        this.wirelessTechnologies = wirelessTechnologies;
    }

}
