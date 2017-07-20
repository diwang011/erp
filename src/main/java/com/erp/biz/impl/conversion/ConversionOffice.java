package com.erp.biz.impl.conversion;

import java.util.List;

import com.erp.biz.api.model.mp.BrandLicense;
import com.erp.biz.api.model.mp.HPPrinterCartridgeNumber;
import com.erp.biz.api.model.mp.InkColor;
import com.erp.biz.api.model.mp.KeyFeatures;
import com.erp.biz.api.model.mp.Office;
import com.erp.biz.api.model.mp.Office.AgeGroup;
import com.erp.biz.api.model.mp.Office.AssembledProductLength;
import com.erp.biz.api.model.mp.Office.AssembledProductWeight;
import com.erp.biz.api.model.mp.Office.AssembledProductWidth;
import com.erp.biz.api.model.mp.Office.Brightness;
import com.erp.biz.api.model.mp.Office.CalendarTerm;
import com.erp.biz.api.model.mp.Office.ColorCategory;
import com.erp.biz.api.model.mp.Office.HoleSize;
import com.erp.biz.api.model.mp.Office.OverallExpansion;
import com.erp.biz.api.model.mp.Office.PenPointSize;
import com.erp.biz.api.model.mp.Office.PencilLeadDiameter;
import com.erp.biz.api.model.mp.Office.SmallPartsWarnings;
import com.erp.biz.api.model.mp.Office.SwatchImages;
import com.erp.biz.api.model.mp.Office.VariantAttributeNames;
import com.erp.biz.api.model.mp.Office.AssembledProductHeight;
import com.erp.biz.api.model.mp.ProductSecondaryImageURL;
import com.erp.biz.api.model.mp.RecommendedUses;
import com.erp.biz.api.model.mp.RecycledMaterialContent;
import com.erp.biz.api.model.mp.RecycledMaterialContentValue;
import com.erp.biz.model.OfficeTable;
import com.erp.biz.util.Helper;

public class ConversionOffice
{

    public static Office buldOffice(OfficeTable row)
    {
        Office office = new Office();
        String size = row.getSize();
        String assembledProductWeight_unit = row.getAssembledProductWeight_unit();
        String isLightingFactsLabelRequired = row.getIsLightingFactsLabelRequired();
        String brand = row.getBrand();
        String warrantyText = row.getWarrantyText();
        String shape = row.getShape();
        String envelopeSize = row.getEnvelopeSize();
        String pattern = row.getPattern();
        String manufacturer = row.getManufacturer();
        String capacity = row.getCapacity();
        String countPerPack = row.getCountPerPack();
        String theme = row.getTheme();
        String isAntiglare = row.getIsAntiglare();
        String paperSize = row.getPaperSize();
        String modelNumber = row.getModelNumber();
        String isPowered = row.getIsPowered();
        String hasWarranty = row.getHasWarranty();
        String pieceCount = row.getPieceCount();
        String finish = row.getFinish();
        String isRetractable = row.getIsRetractable();
        String isMagnetic = row.getIsMagnetic();
        String mainImageUrl = row.getMainImageUrl();
        String count = row.getCount();
        String paperClipSize = row.getPaperClipSize();
        String tabColor = row.getTabColor();
        String isIndustrial = row.getIsIndustrial();
        String warrantyURL = row.getWarrantyURL();
        String year = row.getYear();
        String systemOfMeasurement = row.getSystemOfMeasurement();
        String pencilLeadDiameter_unit = row.getPencilLeadDiameter_unit();
        String multipackQuantity = row.getMultipackQuantity();
        String isProp65WarningRequired = row.getIsProp65WarningRequired();
        String assembledProductHeight_unit = row.getAssembledProductHeight_unit();
        String penPointSize_measure = row.getPenPointSize_measure();
        String brightness_unit = row.getBrightness_unit();
        String compatibleDevices = row.getCompatibleDevices();
        String batteryTechnologyType = row.getBatteryTechnologyType();
        String assembledProductWidth_measure = row.getAssembledProductWidth_measure();
        String penPointSize_unit = row.getPenPointSize_unit();
        String assembledProductHeight_measure = row.getAssembledProductHeight_measure();
        String assembledProductLength_measure = row.getAssembledProductLength_measure();
        String assembledProductWeight_measure = row.getAssembledProductWeight_measure();
        String assembledProductWidth_unit = row.getAssembledProductWidth_unit();
        String variantGroupId = row.getVariantGroupId();
        String overallExpansion_unit = row.getOverallExpansion_unit();
        String lightingFactsLabel = row.getLightingFactsLabel();
        String calendarTerm_unit = row.getCalendarTerm_unit();
        String numberOfSheets = row.getNumberOfSheets();
        String isTearResistant = row.getIsTearResistant();
        String holeSize_measure = row.getHoleSize_measure();
        String calendarFormat = row.getCalendarFormat();
        String brightness_measure = row.getBrightness_measure();
        String shortDescription = row.getShortDescription().replace("\n", " ");
        String pencilLeadDiameter_measure = row.getPencilLeadDiameter_measure();
        String isMadeFromRecycledMaterial = row.getIsMadeFromRecycledMaterial();
        String manufacturerPartNumber = row.getManufacturerPartNumber();
        String isPrimaryVariant = row.getIsPrimaryVariant();
        String calendarTerm_measure = row.getCalendarTerm_measure();
        String prop65WarningText = row.getProp65WarningText();
        String overallExpansion_measure = row.getOverallExpansion_measure();
        String assembledProductLength_unit = row.getAssembledProductLength_unit();
        String powerType = row.getPowerType();
        String occasion = row.getOccasion();
        String color = row.getColor();
        String hasExpiration = row.getHasExpiration();
        String holeSize_unit = row.getHoleSize_unit();
        String isRefillable = row.getIsRefillable();
        String isLined = row.getIsLined();
        String dexterity = row.getDexterity();
        String material = row.getMaterial();
        List<String> ageGroupList = row.getAgeGroup();
        List<String> globalBrandLicenseList = row.getGlobalBrandLicense();
        List<String> swatchVariantAttributeList = row.getSwatchVariantAttribute();
        List<String> swatchImageUrlList = row.getSwatchImageUrl();
        List<String> hpprintercartridgeNumberList = row.getHpprintercartridgeNumber();
        List<String> percentageOfRecycledMaterialList = row.getPercentageOfRecycledMaterial();
        List<String> productSecondaryImageURLList = row.getProductSecondaryImageURL();
        List<String> smallPartsWarningsList = row.getSmallPartsWarnings();
        List<String> recommendedUsesList = row.getRecommendedUses();
        List<String> variantAttributeNamesList = row.getVariantAttributeNames();
        List<String> recycledMaterialList = row.getRecycledMaterial();
        List<String> keyFeaturesList = row.getKeyFeatures();
        List<String> colorCategoryList = row.getColorCategory();
        List<String> inkColorList = row.getInkColor();

        AgeGroup ageGroup = null;
        if (ageGroupList != null)
        {
            ageGroup = new AgeGroup();
            ageGroup.getAgeGroupValue().addAll(ageGroupList);
        }
        BrandLicense globalBrandLicense = null;
        if (globalBrandLicenseList != null)
        {
            globalBrandLicense = new BrandLicense();
            globalBrandLicense.getGlobalBrandLicenseValue().addAll(globalBrandLicenseList);
        }
        HPPrinterCartridgeNumber hpprintercartridgeNumber = null;
        if (hpprintercartridgeNumberList != null)
        {
            hpprintercartridgeNumber = new HPPrinterCartridgeNumber();
            hpprintercartridgeNumber.getHpprintercartridgeNumberValue().addAll(hpprintercartridgeNumberList);
        }
        ProductSecondaryImageURL productSecondaryImageURL = null;
        if (productSecondaryImageURLList != null)
        {
            productSecondaryImageURL = new ProductSecondaryImageURL();
            productSecondaryImageURL.getProductSecondaryImageURLValue().addAll(productSecondaryImageURLList);

        }
        SmallPartsWarnings smallPartsWarnings = null;
        if (smallPartsWarningsList != null)
        {
            smallPartsWarnings = new SmallPartsWarnings();
            for (String string : smallPartsWarningsList)
            {
                smallPartsWarnings.getSmallPartsWarning().add(Helper.String2BigInteger(string));
            }
        }
        RecommendedUses recommendedUses = null;
        if (recommendedUsesList != null)
        {
            recommendedUses = new RecommendedUses();
            recommendedUses.getRecommendedUse().addAll(recommendedUsesList);
        }
        VariantAttributeNames variantAttributeNames = null;
        if (variantAttributeNamesList != null)
        {
            variantAttributeNames = new VariantAttributeNames();
            variantAttributeNames.getVariantAttributeName().addAll(variantAttributeNamesList);
        }
        KeyFeatures keyFeatures = null;
        if (keyFeaturesList != null)
        {
            keyFeatures = new KeyFeatures();
            keyFeatures.getKeyFeaturesValue().addAll(keyFeaturesList);
        }
        ColorCategory colorCategory = null;
        if (colorCategoryList != null)
        {
            colorCategory = new ColorCategory();
            colorCategory.getColorCategoryValue().addAll(colorCategoryList);
        }
        InkColor inkColor = null;
        if (inkColorList != null)
        {
            inkColor = new InkColor();
            inkColor.getInkColorValue().addAll(inkColorList);
        }
        AssembledProductLength assembledProductLength = null;
        if (assembledProductLength_measure != null && assembledProductLength_unit != null)
        {
            assembledProductLength = new AssembledProductLength();
            assembledProductLength.setMeasure(Helper.String2BigDecimal(assembledProductLength_measure));
            assembledProductLength.setUnit(assembledProductLength_unit);
        }
        AssembledProductHeight assembledProductHeight = null;
        if (assembledProductHeight_measure != null && assembledProductHeight_unit != null)
        {
            assembledProductHeight = new AssembledProductHeight();
            assembledProductHeight.setMeasure(Helper.String2BigDecimal(assembledProductHeight_measure));
            assembledProductHeight.setUnit(assembledProductHeight_unit);
        }
        AssembledProductWeight assembledProductWeight = null;
        if (assembledProductWeight_measure != null && assembledProductWeight_unit != null)
        {
            assembledProductWeight = new AssembledProductWeight();
            assembledProductWeight.setMeasure(Helper.String2BigDecimal(assembledProductWeight_measure));
            assembledProductWeight.setUnit(assembledProductWeight_unit);
        }
        AssembledProductWidth assembledProductWidth = null;
        if (assembledProductWidth_measure != null && assembledProductWidth_unit != null)
        {
            assembledProductWidth = new AssembledProductWidth();
            assembledProductWidth.setMeasure(Helper.String2BigDecimal(assembledProductWidth_measure));
            assembledProductWidth.setUnit(assembledProductWidth_unit);
        }
        PencilLeadDiameter pencilLeadDiameter = null;
        if (pencilLeadDiameter_measure != null && pencilLeadDiameter_unit != null)
        {
            pencilLeadDiameter = new PencilLeadDiameter();
            pencilLeadDiameter.setMeasure(assembledProductWidth_measure);
            pencilLeadDiameter.setUnit(assembledProductWidth_unit);
        }
        RecycledMaterialContent recycledMaterialContent = null;
        if (recycledMaterialList != null && percentageOfRecycledMaterialList != null)
        {
            recycledMaterialContent = new RecycledMaterialContent();
            for (int i = 0; i < recycledMaterialList.size(); i++)
            {
                RecycledMaterialContentValue contentValue = new RecycledMaterialContentValue();
                contentValue.setRecycledMaterial(recycledMaterialList.get(i));
                contentValue.setPercentageOfRecycledMaterial(
                        Helper.String2BigDecimal(percentageOfRecycledMaterialList.get(i)));
                recycledMaterialContent.getRecycledMaterialContentValue().add(contentValue);
            }
        }
        OverallExpansion overallExpansion = null;
        if (overallExpansion_measure != null && overallExpansion_unit != null)
        {
            overallExpansion = new OverallExpansion();
            overallExpansion.setMeasure(Helper.String2BigDecimal(assembledProductWidth_measure));
            overallExpansion.setUnit(assembledProductWidth_unit);
        }
        Brightness brightness = null;
        if (brightness_measure != null && brightness_unit != null)
        {
            brightness = new Brightness();
            brightness.setMeasure(Helper.String2BigDecimal(brightness_measure));
            brightness.setUnit(brightness_unit);
        }
        HoleSize holeSize = null;
        if (holeSize_measure != null && holeSize_unit != null)
        {
            holeSize = new HoleSize();
            holeSize.setMeasure(Helper.String2BigDecimal(holeSize_measure));
            holeSize.setUnit(holeSize_unit);
        }
        CalendarTerm calendarTerm = null;
        if (calendarTerm_measure != null && calendarTerm_unit != null)
        {
            calendarTerm = new CalendarTerm();
            calendarTerm.setMeasure(Helper.String2BigInteger(calendarTerm_measure));
            calendarTerm.setUnit(calendarTerm_unit);
        }
        PenPointSize penPointSize = null;
        if (penPointSize_measure != null && penPointSize_unit != null)
        {
            penPointSize = new PenPointSize();
            penPointSize.setMeasure(Helper.String2BigDecimal(penPointSize_measure));
            penPointSize.setUnit(penPointSize_unit);
        }
        SwatchImages swatchImages = null;
        if (swatchImageUrlList != null && swatchVariantAttributeList != null)
        {
            swatchImages = new SwatchImages();
            for (int i = 0; i < swatchImageUrlList.size(); i++)
            {
                Office.SwatchImages.SwatchImage swatchImage = new Office.SwatchImages.SwatchImage();
                swatchImage.setSwatchImageUrl(swatchImageUrlList.get(i));
                swatchImage.setSwatchVariantAttribute(swatchVariantAttributeList.get(i));
                swatchImages.getSwatchImage().add(swatchImage);
            }
        }
        
        office.setSize(size);
        office.setColor(color);
        office.setIsLightingFactsLabelRequired(isLightingFactsLabelRequired);
        office.setBrand(brand);
        office.setWarrantyText(warrantyText);
        office.setShape(shape);
        office.setEnvelopeSize(Helper.String2BigDecimal(envelopeSize));
        office.setPattern(pattern);
        office.setManufacturer(manufacturer);
        office.setCapacity(capacity);
        office.setCountPerPack(Helper.String2BigInteger(countPerPack));
        office.setTheme(theme);
        office.setIsAntiglare(isAntiglare);
        office.setPaperSize(paperSize);
        office.setModelNumber(modelNumber);
        office.setIsPowered(isPowered);
        office.setHasWarranty(hasWarranty);
        office.setPieceCount(Helper.String2BigInteger(pieceCount));
        office.setFinish(finish);
        office.setIsRetractable(isRetractable);
        office.setIsMagnetic(isMagnetic);
        office.setMainImageUrl(mainImageUrl);
        office.setCount(count);
        office.setAgeGroup(ageGroup);
        office.setPaperClipSize(paperClipSize);
        office.setTabColor(tabColor);
        office.setIsIndustrial(isIndustrial);
        office.setYear(Helper.String2BigInteger(year));
        office.setSystemOfMeasurement(systemOfMeasurement);
        office.setMultipackQuantity(Helper.String2BigInteger(multipackQuantity));
        office.setIsProp65WarningRequired(isProp65WarningRequired);
        office.setGlobalBrandLicense(globalBrandLicense);
        office.setCompatibleDevices(compatibleDevices);
        office.setBatteryTechnologyType(batteryTechnologyType);
        office.setHpprintercartridgeNumber(hpprintercartridgeNumber);
        office.setProductSecondaryImageURL(productSecondaryImageURL);
        office.setVariantGroupId(variantGroupId);
        office.setSmallPartsWarnings(smallPartsWarnings);
        office.setLightingFactsLabel(lightingFactsLabel);
        office.setNumberOfSheets(Helper.String2BigInteger(numberOfSheets));
        office.setIsTearResistant(isTearResistant);
        office.setRecommendedUses(recommendedUses);
        office.setVariantAttributeNames(variantAttributeNames);
        office.setCalendarFormat(calendarFormat);
        office.setShortDescription(shortDescription);
        office.setIsMadeFromRecycledMaterial(isMadeFromRecycledMaterial);
        office.setManufacturerPartNumber(manufacturerPartNumber);
        office.setIsPrimaryVariant(isPrimaryVariant);
        office.setProp65WarningText(prop65WarningText);
        office.setWarrantyURL(warrantyURL);
        office.setPowerType(powerType);
        office.setOccasion(occasion);
        office.setHasExpiration(hasExpiration);
        office.setKeyFeatures(keyFeatures);
        office.setColorCategory(colorCategory);
        office.setInkColor(inkColor);
        office.setIsRefillable(isRefillable);
        office.setIsLined(isLined);
        office.setDexterity(dexterity);
        office.setMaterial(material);
        office.setAssembledProductLength(assembledProductLength);
        office.setAssembledProductWidth(assembledProductWidth);
        office.setAssembledProductHeight(assembledProductHeight);
        office.setAssembledProductWeight(assembledProductWeight);
        office.setPencilLeadDiameter(pencilLeadDiameter);
        office.setRecycledMaterialContent(recycledMaterialContent);
        office.setOverallExpansion(overallExpansion);
        office.setBrightness(brightness);
        office.setHoleSize(holeSize);
        office.setCalendarTerm(calendarTerm);
        office.setPenPointSize(penPointSize);
        office.setSwatchImages(swatchImages);
        return office;
    }

}
