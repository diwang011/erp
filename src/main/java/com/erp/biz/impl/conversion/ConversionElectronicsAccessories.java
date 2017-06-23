package com.erp.biz.impl.conversion;

import java.util.List;

import com.erp.biz.api.model.mp.AdditionalFeatures;
import com.erp.biz.api.model.mp.AudioFeatures;
import com.erp.biz.api.model.mp.CompatibleBrands;
import com.erp.biz.api.model.mp.Connections;
import com.erp.biz.api.model.mp.DataRateUnit;
import com.erp.biz.api.model.mp.ElectronicsAccessories;
import com.erp.biz.api.model.mp.HeadphoneFeatures;
import com.erp.biz.api.model.mp.KeyFeatures;
import com.erp.biz.api.model.mp.MemoryCardFormat;
import com.erp.biz.api.model.mp.PowerUnit;
import com.erp.biz.api.model.mp.ProductSecondaryImageURL;
import com.erp.biz.api.model.mp.RecordableMediaFormats;
import com.erp.biz.api.model.mp.WirelessTechnologies;
import com.erp.biz.api.model.mp.ElectronicsAccessories.AssembledProductHeight;
import com.erp.biz.api.model.mp.ElectronicsAccessories.AssembledProductLength;
import com.erp.biz.api.model.mp.ElectronicsAccessories.AssembledProductWeight;
import com.erp.biz.api.model.mp.ElectronicsAccessories.AssembledProductWidth;
import com.erp.biz.api.model.mp.ElectronicsAccessories.ColorCategory;
import com.erp.biz.api.model.mp.ElectronicsAccessories.MaximumLoadWeight;
import com.erp.biz.api.model.mp.ElectronicsAccessories.MaximumScreenSize;
import com.erp.biz.api.model.mp.ElectronicsAccessories.MinimumScreenSize;
import com.erp.biz.api.model.mp.ElectronicsAccessories.PeakAudioPowerCapacity;
import com.erp.biz.api.model.mp.ElectronicsAccessories.ScreenSize;
import com.erp.biz.api.model.mp.ElectronicsAccessories.SwatchImages;
import com.erp.biz.api.model.mp.ElectronicsAccessories.VariantAttributeNames;
import com.erp.biz.api.model.mp.ElectronicsAccessories.SwatchImages.SwatchImage;
import com.erp.biz.model.ElectronicsAccessoriesTable;
import com.erp.biz.util.Helper;

public class ConversionElectronicsAccessories
{
    public static ElectronicsAccessories buldElectronicsAccessories(ElectronicsAccessoriesTable row)
    {
        ElectronicsAccessories electronicsAccessories = new ElectronicsAccessories();

        String shortDescription = row.getShortDescription().replace("\n", " ");
        String brand = row.getBrand();
        String mainImageUrl = row.getMainImageUrl();
        String assembledProductHeight_measure = row.getAssembledProductHeight_measure();
        String assembledProductHeight_unit = row.getAssembledProductHeight_unit();
        String assembledProductLength_measure = row.getAssembledProductLength_measure();
        String assembledProductLength_unit = row.getAssembledProductLength_unit();
        String assembledProductWeight_measure = row.getAssembledProductWeight_measure();
        String assembledProductWeight_unit = row.getAssembledProductWeight_unit();
        String assembledProductWidth_measure = row.getAssembledProductWidth_measure();
        String assembledProductWidth_unit = row.getAssembledProductWidth_unit();
        List<String> audioFeature = row.getAudioFeatures();
        String audioPowerOutput_measure = row.getAudioPowerOutput_measure();
        String audioPowerOutput_unit = row.getAudioPowerOutput_unit();
        String batteryTechnologyType = row.getBatteryTechnologyType();
        String color = row.getColor();
        List<String> colorCategorys = row.getColorCategory();
        List<String> compatibleBrand = row.getCompatibleBrands();
        List<String> connection = row.getConnections();
        String count = row.getCount();
        String countPerPack = row.getCountPerPack();
        String dataTransferRate_measur = row.getDataTransferRate_measure();
        String dataTransferRate_unit = row.getDataTransferRate_unit();
        List<String> feature = row.getFeatures();
        List<String> headphoneFeature = row.getHeadphoneFeatures();
        String headphoneStyle = row.getHeadphoneStyle();
        String isChemical = row.getIsChemical();
        String isPrimaryVariant = row.getIsPrimaryVariant();
        String isProp65WarningRequired = row.getIsProp65WarningRequired();
        List<String> keyFeature = row.getKeyFeatures();
        String keywords = row.getKeywords();
        String manufacturer = row.getManufacturer();
        String manufacturerPartNumber = row.getManufacturerPartNumber();
        String maximumLoadWeight_measure = row.getMaximumLoadWeight_measure();
        String maximumLoadWeight_unit = row.getMaximumLoadWeight_unit();
        String maximumScreenSize_measure = row.getMaximumScreenSize_measure();
        String maximumScreenSize_unit = row.getMaximumScreenSize_unit();
        List<String> memoryCardTypes = row.getMemoryCardType();
        String microphoneTechnology = row.getMicrophoneTechnology();
        String MinimumScreenSize_measure = row.getMinimumScreenSize_measure();
        String MinimumScreenSize_uni = row.getMinimumScreenSize_unit();
        String modelNumber = row.getModelNumber();
        String mountingPattern = row.getMountingPattern();
        String movementDetection = row.getMovementDetection();
        String multipackQuantity = row.getMultipackQuantity();
        String opticalDrive = row.getOpticalDrive();
        String peakAudioPowerCapacity_measure = row.getPeakAudioPowerCapacity_measure();
        String peakAudioPowerCapacity_util = row.getPeakAudioPowerCapacity_unit();
        String pieceCount = row.getPieceCount();
        List<String> productSecondaryImageURLs = row.getProductSecondaryImageURL();
        String prop65WarningText = row.getProp65WarningText();
        List<String> recordableMediaFormat = row.getRecordableMediaFormats();
        String screenSize_measure = row.getScreenSize_measure();
        String screenSize_unit = row.getScreenSize_unit();
        String size = row.getSize();
        List<String> swatchImageUrl = row.getSwatchImageUrl();
        List<String> swatchVariantAttribute = row.getSwatchVariantAttribute();
        String tvAndMonitorMountType = row.getTvAndMonitorMountType();
        List<String> variantAttributeName = row.getVariantAttributeNames();
        String variantGroupId = row.getVariantGroupId();
        List<String> wirelessTechnologie = row.getWirelessTechnologies();

        electronicsAccessories.setBrand(brand);
        electronicsAccessories.setShortDescription(shortDescription);

        AssembledProductHeight assembledProductHeight = bildAssembledProductHeight(assembledProductHeight_measure,
                assembledProductHeight_unit);
        electronicsAccessories.setAssembledProductHeight(assembledProductHeight);

        AssembledProductWeight assembledProductWeight = bildAssembledProductWeight(assembledProductWeight_measure,
                assembledProductWeight_unit);
        AssembledProductLength assembledProductLength = bildAssembledProductLength(assembledProductLength_measure,
                assembledProductLength_unit);
        electronicsAccessories.setAssembledProductLength(assembledProductLength);

        electronicsAccessories.setAssembledProductWeight(assembledProductWeight);
        AssembledProductWidth assembledProductWidth = bildAssembledProductWidth(assembledProductWidth_measure,
                assembledProductWidth_unit);
        electronicsAccessories.setAssembledProductWidth(assembledProductWidth);

        electronicsAccessories.setAudioFeatures(bildAudioFeatures(audioFeature));

        PowerUnit audioPowerOutput = bildPowerUnit(audioPowerOutput_measure, audioPowerOutput_unit);
        electronicsAccessories.setAudioPowerOutput(audioPowerOutput);
        electronicsAccessories.setBatteryTechnologyType(batteryTechnologyType);
        electronicsAccessories.setColor(color);

        electronicsAccessories.setColorCategory(bildColorCategory(colorCategorys));

        CompatibleBrands compatibleBrands = bildCompatibleBrands(compatibleBrand);

        electronicsAccessories.setCompatibleBrands(compatibleBrands);
        Connections connections = bildConnections(connection);
        electronicsAccessories.setConnections(connections);
        electronicsAccessories.setCount(count);
        electronicsAccessories.setCountPerPack(Helper.String2BigInteger(countPerPack));

        DataRateUnit dataTransferRate = bildDataRateUnit(dataTransferRate_measur, dataTransferRate_unit);
        electronicsAccessories.setDataTransferRate(dataTransferRate);
        AdditionalFeatures features = bildAdditionalFeatures(feature);
        electronicsAccessories.setFeatures(features);
        HeadphoneFeatures headphoneFeatures = bildHeadphoneFeatures(headphoneFeature);
        electronicsAccessories.setHeadphoneFeatures(headphoneFeatures);
        electronicsAccessories.setHeadphoneStyle(headphoneStyle);
        electronicsAccessories.setIsChemical(isChemical);
        electronicsAccessories.setIsPrimaryVariant(isPrimaryVariant);
        electronicsAccessories.setIsProp65WarningRequired(isProp65WarningRequired);

        KeyFeatures keyFeatures = bildKeyFeatures(keyFeature);
        electronicsAccessories.setKeyFeatures(keyFeatures);
        electronicsAccessories.setKeywords(keywords);
        electronicsAccessories.setMainImageUrl(mainImageUrl);
        electronicsAccessories.setManufacturer(manufacturer);
        electronicsAccessories.setManufacturerPartNumber(manufacturerPartNumber);

        MaximumLoadWeight maximumLoadWeight = bildMaximumLoadWeight(maximumLoadWeight_measure, maximumLoadWeight_unit);

        electronicsAccessories.setMaximumLoadWeight(maximumLoadWeight);

        MaximumScreenSize maximumScreenSize = bildMaximumScreenSize(maximumScreenSize_measure, maximumScreenSize_unit);

        electronicsAccessories.setMaximumScreenSize(maximumScreenSize);
        MemoryCardFormat memoryCardType = bildMemoryCardFormat(memoryCardTypes);

        electronicsAccessories.setMemoryCardType(memoryCardType);
        electronicsAccessories.setMicrophoneTechnology(microphoneTechnology);
        MinimumScreenSize minimumScreenSize = bildMinimumScreenSize(MinimumScreenSize_measure, MinimumScreenSize_uni);

        electronicsAccessories.setMinimumScreenSize(minimumScreenSize);
        electronicsAccessories.setModelNumber(modelNumber);
        electronicsAccessories.setMountingPattern(mountingPattern);
        electronicsAccessories.setMovementDetection(movementDetection);
        electronicsAccessories.setMultipackQuantity(Helper.String2BigInteger(multipackQuantity));
        electronicsAccessories.setOpticalDrive(opticalDrive);
        PeakAudioPowerCapacity peakAudioPowerCapacity = bildPeakAudioPowerCapacity(peakAudioPowerCapacity_measure,
                peakAudioPowerCapacity_util);
        electronicsAccessories.setPeakAudioPowerCapacity(peakAudioPowerCapacity);
        electronicsAccessories.setPieceCount(Helper.String2BigInteger(pieceCount));

        ProductSecondaryImageURL productSecondaryImageURL = bildProductSecondaryImageURL(productSecondaryImageURLs);

        electronicsAccessories.setProductSecondaryImageURL(productSecondaryImageURL);
        electronicsAccessories.setProp65WarningText(prop65WarningText);

        RecordableMediaFormats recordableMediaFormats = bildRecordableMediaFormats(recordableMediaFormat);

        electronicsAccessories.setRecordableMediaFormats(recordableMediaFormats);
        ScreenSize screenSize = bildScreenSize(screenSize_measure, screenSize_unit);
        electronicsAccessories.setScreenSize(screenSize);
        electronicsAccessories.setShortDescription(shortDescription);
        electronicsAccessories.setSize(size);
        SwatchImages swatchImages = bildSwatchImages(swatchImageUrl, swatchVariantAttribute);
        electronicsAccessories.setSwatchImages(swatchImages);
        electronicsAccessories.setTvAndMonitorMountType(tvAndMonitorMountType);
        VariantAttributeNames variantAttributeNames = bildVariantAttributeNames(variantAttributeName);
        electronicsAccessories.setVariantAttributeNames(variantAttributeNames);
        electronicsAccessories.setVariantGroupId(variantGroupId);
        WirelessTechnologies wirelessTechnologies = bildWirelessTechnologies(wirelessTechnologie);
        electronicsAccessories.setWirelessTechnologies(wirelessTechnologies);
        return electronicsAccessories;
    }

    private static DataRateUnit bildDataRateUnit(String measure, String unit)
    {
        if (measure == null || unit == null)
        {
            return null;
        }
        DataRateUnit dataTransferRate = new DataRateUnit();
        dataTransferRate.setMeasure(Helper.String2BigDecimal(measure));
        dataTransferRate.setUnit(unit);
        return dataTransferRate;
    }

    private static AssembledProductWidth bildAssembledProductWidth(String measure, String unit)
    {
        if (measure == null || unit == null)
        {
            return null;
        }
        AssembledProductWidth assembledProductWidth = new AssembledProductWidth();
        assembledProductWidth.setMeasure(Helper.String2BigDecimal(measure));
        assembledProductWidth.setUnit(unit);
        return assembledProductWidth;
    }

    private static AssembledProductWeight bildAssembledProductWeight(String measure, String unit)
    {
        if (measure == null || unit == null)
        {
            return null;
        }
        AssembledProductWeight assembledProductWeight = new AssembledProductWeight();
        assembledProductWeight.setMeasure(Helper.String2BigDecimal(measure));
        assembledProductWeight.setUnit(unit);
        return assembledProductWeight;
    }

    private static AssembledProductLength bildAssembledProductLength(String measure, String unit)
    {
        if (measure == null || unit == null)
        {
            return null;
        }
        AssembledProductLength assembledProductLength = new AssembledProductLength();
        assembledProductLength.setMeasure(Helper.String2BigDecimal(measure));
        assembledProductLength.setUnit(unit);
        return assembledProductLength;
    }

    private static SwatchImages bildSwatchImages(List<String> swatchImageUrl, List<String> swatchVariantAttribute)
    {
        if (swatchImageUrl == null || swatchVariantAttribute == null)
        {
            return null;
        }
        SwatchImages swatchImages = new SwatchImages();
        for (int i = 0; i < swatchImageUrl.size(); i++)
        {
            SwatchImage swatchImage = new SwatchImage();
            swatchImage.setSwatchVariantAttribute(swatchVariantAttribute.get(i));
            swatchImage.setSwatchImageUrl(swatchImageUrl.get(i));
            swatchImages.getSwatchImage().add(swatchImage);

        }
        return swatchImages;
    }

    private static ScreenSize bildScreenSize(String measure, String unit)
    {
        if (measure == null || unit == null)
        {
            return null;
        }
        ScreenSize screenSize = new ScreenSize();
        screenSize.setMeasure(Helper.String2BigDecimal(measure));
        screenSize.setUnit(unit);
        return screenSize;
    }

    private static PeakAudioPowerCapacity bildPeakAudioPowerCapacity(String measure, String unit)
    {
        if (measure == null || unit == null)
        {
            return null;
        }
        PeakAudioPowerCapacity peakAudioPowerCapacity = new PeakAudioPowerCapacity();
        peakAudioPowerCapacity.setMeasure(Helper.String2BigDecimal(measure));
        peakAudioPowerCapacity.setUnit(unit);
        return peakAudioPowerCapacity;
    }

    private static MinimumScreenSize bildMinimumScreenSize(String measure, String unit)
    {
        if (measure == null || unit == null)
        {
            return null;
        }
        MinimumScreenSize minimumScreenSize = new MinimumScreenSize();
        minimumScreenSize.setMeasure(Helper.String2BigDecimal(measure));
        minimumScreenSize.setUnit(unit);
        return minimumScreenSize;
    }

    private static MaximumScreenSize bildMaximumScreenSize(String measure, String unit)
    {
        if (measure == null || unit == null)
        {
            return null;
        }
        MaximumScreenSize maximumScreenSize = new MaximumScreenSize();
        maximumScreenSize.setMeasure(Helper.String2BigDecimal(measure));
        maximumScreenSize.setUnit(unit);
        return maximumScreenSize;
    }

    private static MaximumLoadWeight bildMaximumLoadWeight(String measure, String unit)
    {
        if (measure == null || unit == null)
        {
            return null;
        }
        MaximumLoadWeight maximumLoadWeight = new MaximumLoadWeight();
        maximumLoadWeight.setMeasure(Helper.String2BigDecimal(measure));
        maximumLoadWeight.setUnit(unit);
        return maximumLoadWeight;
    }

    private static AssembledProductHeight bildAssembledProductHeight(String measure, String unit)
    {
        if (measure == null || unit == null)
        {
            return null;
        }
        AssembledProductHeight assembledProductHeight = new AssembledProductHeight();
        assembledProductHeight.setMeasure(Helper.String2BigDecimal(measure));
        assembledProductHeight.setUnit(unit);
        return assembledProductHeight;
    }

    private static PowerUnit bildPowerUnit(String measure, String unit)
    {
        if (measure == null || unit == null)
        {
            return null;
        }
        PowerUnit audioPowerOutput = new PowerUnit();
        audioPowerOutput.setMeasure(Helper.String2BigDecimal(measure));
        audioPowerOutput.setUnit(unit);
        return audioPowerOutput;
    }

    private static WirelessTechnologies bildWirelessTechnologies(List<String> wirelessTechnologie)
    {
        if (wirelessTechnologie == null)
        {
            return null;
        }
        WirelessTechnologies wirelessTechnologies = new WirelessTechnologies();
        wirelessTechnologies.getWirelessTechnology().addAll(wirelessTechnologie);
        return wirelessTechnologies;
    }

    private static VariantAttributeNames bildVariantAttributeNames(List<String> variantAttributeName)
    {
        if (variantAttributeName == null)
        {
            return null;
        }
        VariantAttributeNames variantAttributeNames = new VariantAttributeNames();
        variantAttributeNames.getVariantAttributeName().addAll(variantAttributeName);
        return variantAttributeNames;
    }

    private static RecordableMediaFormats bildRecordableMediaFormats(List<String> recordableMediaFormat)
    {
        if (recordableMediaFormat == null)
        {
            return null;
        }
        RecordableMediaFormats recordableMediaFormats = new RecordableMediaFormats();
        recordableMediaFormats.getRecordableMediaFormat().addAll(recordableMediaFormat);
        return recordableMediaFormats;
    }

    private static ProductSecondaryImageURL bildProductSecondaryImageURL(List<String> productSecondaryImageURLs)
    {
        if (productSecondaryImageURLs == null)
        {
            return null;
        }
        ProductSecondaryImageURL productSecondaryImageURL = new ProductSecondaryImageURL();
        productSecondaryImageURL.getProductSecondaryImageURLValue().addAll(productSecondaryImageURLs);
        return productSecondaryImageURL;
    }

    private static MemoryCardFormat bildMemoryCardFormat(List<String> memoryCardTypes)
    {
        if (memoryCardTypes == null)
        {
            return null;
        }
        MemoryCardFormat memoryCardType = new MemoryCardFormat();
        memoryCardType.getMemoryCardTypeValue().addAll(memoryCardTypes);
        return memoryCardType;
    }

    private static KeyFeatures bildKeyFeatures(List<String> keyFeature)
    {
        if (keyFeature == null)
        {
            return null;
        }
        KeyFeatures keyFeatures = new KeyFeatures();
        for (String keyFeatureVal : keyFeature)
        {
            keyFeatures.getKeyFeaturesValue().add(keyFeatureVal.replace("\n", " "));
        }
        return keyFeatures;
    }

    private static HeadphoneFeatures bildHeadphoneFeatures(List<String> headphoneFeature)
    {
        if (headphoneFeature == null)
        {
            return null;
        }
        HeadphoneFeatures headphoneFeatures = new HeadphoneFeatures();
        headphoneFeatures.getHeadphoneFeature().addAll(headphoneFeature);
        return headphoneFeatures;
    }

    private static AdditionalFeatures bildAdditionalFeatures(List<String> feature)
    {
        if (feature == null)
        {
            return null;
        }
        AdditionalFeatures features = new AdditionalFeatures();
        features.getFeature().addAll(feature);
        return features;
    }

    private static Connections bildConnections(List<String> connection)
    {
        if (connection == null)
        {
            return null;
        }
        Connections connections = new Connections();
        connections.getConnection().addAll(connection);
        return connections;
    }

    private static CompatibleBrands bildCompatibleBrands(List<String> compatibleBrand)
    {
        if (compatibleBrand == null)
        {
            return null;
        }
        CompatibleBrands compatibleBrands = new CompatibleBrands();
        compatibleBrands.getCompatibleBrand().addAll(compatibleBrand);
        return compatibleBrands;
    }

    private static ColorCategory bildColorCategory(List<String> colorCategorys)
    {
        if (colorCategorys == null)
        {
            return null;
        }
        ColorCategory colorCategory = new ColorCategory();
        colorCategory.getColorCategoryValue().addAll(colorCategorys);
        return colorCategory;
    }

    private static AudioFeatures bildAudioFeatures(List<String> audioFeature)
    {
        if (audioFeature == null)
        {
            return null;
        }
        AudioFeatures audioFeatures = new AudioFeatures();
        audioFeatures.getAudioFeature().addAll(audioFeature);
        return audioFeatures;
    }
}
