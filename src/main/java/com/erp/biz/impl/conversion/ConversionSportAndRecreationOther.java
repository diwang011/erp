package com.erp.biz.impl.conversion;

import java.util.List;

import com.erp.biz.api.model.mp.AdditionalFeatures;
import com.erp.biz.api.model.mp.AgeRange;
import com.erp.biz.api.model.mp.BallCoreMaterial;
import com.erp.biz.api.model.mp.BrandLicense;
import com.erp.biz.api.model.mp.FabricCareInstructions;
import com.erp.biz.api.model.mp.FabricContent;
import com.erp.biz.api.model.mp.FabricContentValue;
import com.erp.biz.api.model.mp.KeyFeatures;
import com.erp.biz.api.model.mp.LengthUnit;
import com.erp.biz.api.model.mp.ProductSecondaryImageURL;
import com.erp.biz.api.model.mp.RecommendedLocations;
import com.erp.biz.api.model.mp.RecommendedUses;
import com.erp.biz.api.model.mp.SportAndRecreationOther;
import com.erp.biz.api.model.mp.SportAndRecreationOther.*;
import com.erp.biz.api.model.mp.WeightUnit;
import com.erp.biz.api.model.mp.WirelessTechnologies;
import com.erp.biz.model.SportAndRecreationOtherTable;
import com.erp.biz.util.Helper;

public class ConversionSportAndRecreationOther
{

    public static SportAndRecreationOther buldSportAndRecreationOther(SportAndRecreationOtherTable row)
    {
        SportAndRecreationOther sportAndRecreationOther = new SportAndRecreationOther();

        String size = row.getSize();
        String maximumWeight_measure = row.getMaximumWeight_measure();
        String character = row.getCharacter();
        String isWaterproof = row.getIsWaterproof();
        String isFoldable = row.getIsFoldable();
        String rangeMinimum = row.getRangeMinimum();
        String season = row.getSeason();
        String brand = row.getBrand();
        String isWheeled = row.getIsWheeled();
        String warrantyText = row.getWarrantyText();
        String shape = row.getShape();
        String shoeSize = row.getShoeSize();
        String gender = row.getGender();
        String pattern = row.getPattern();
        String rangeMaximum = row.getRangeMaximum();
        String manufacturer = row.getManufacturer();
        String capacity = row.getCapacity();
        String countPerPack = row.getCountPerPack();
        String ageRange_unit = row.getAgeRange_unit();
        String driveSystem = row.getDriveSystem();
        String animalType = row.getAnimalType();
        String velocity_unit = row.getVelocity_unit();
        String modelNumber = row.getModelNumber();
        String sportsLeague = row.getSportsLeague();
        String isPortable = row.getIsPortable();
        String keywords = row.getKeywords();
        String maximumIncline = row.getMaximumIncline();
        String assembledProductWeight_unit = row.getAssembledProductWeight_unit();
        String multipackQuantity = row.getMultipackQuantity();
        String isProp65WarningRequired = row.getIsProp65WarningRequired();
        String assembledProductHeight_unit = row.getAssembledProductHeight_unit();
        String tireDiameter_unit = row.getTireDiameter_unit();
        String fishingLocation = row.getFishingLocation();
        String compatibleDevices = row.getCompatibleDevices();
        String velocity_measure = row.getVelocity_measure();
        String shelfLife_unit = row.getShelfLife_unit();
        String batteryTechnologyType = row.getBatteryTechnologyType();
        String minimumTemperature_measure = row.getMinimumTemperature_measure();
        String minimumTemperature_unit = row.getMinimumTemperature_unit();
        String assembledProductHeight_measure = row.getAssembledProductHeight_measure();
        String assembledProductLength_measure = row.getAssembledProductLength_measure();
        String assembledProductWeight_measure = row.getAssembledProductWeight_measure();
        String compositeWoodCertificationCode = row.getCompositeWoodCertificationCode();
        String shelfLife_measure = row.getShelfLife_measure();
        String assemblyInstructions = row.getAssemblyInstructions();
        String tireDiameter_measure = row.getTireDiameter_measure();
        String assembledProductWidth_measure = row.getAssembledProductWidth_measure();
        String fishingLinePoundTest_measure = row.getFishingLinePoundTest_measure();
        String assembledProductWidth_unit = row.getAssembledProductWidth_unit();
        String variantGroupId = row.getVariantGroupId();
        String seatingCapacity = row.getSeatingCapacity();
        String isTearResistant = row.getIsTearResistant();
        String cleaningCareAndMaintenance = row.getCleaningCareAndMaintenance();
        String soccerBallSize = row.getSoccerBallSize();
        String isCollectible = row.getIsCollectible();
        String batDrop = row.getBatDrop();
        String isPowered = row.getIsPowered();
        String hasWarranty = row.getHasWarranty();
        String fitnessGoal = row.getFitnessGoal();
        String pieceCount = row.getPieceCount();
        String finish = row.getFinish();
        String mainImageUrl = row.getMainImageUrl();
        String athlete = row.getAthlete();
        String count = row.getCount();
        String footballSize = row.getFootballSize();
        String autographedBy = row.getAutographedBy();
        String bladeType = row.getBladeType();
        String isMemorabilia = row.getIsMemorabilia();
        String warrantyURL = row.getWarrantyURL();
        String powerType = row.getPowerType();
        String color = row.getColor();
        String hasExpiration = row.getHasExpiration();
        String tentType = row.getTentType();
        String isSpaceSaving = row.getIsSpaceSaving();
        String clothingSize = row.getClothingSize();
        String dexterity = row.getDexterity();
        String material = row.getMaterial();
        String hasAutomaticShutoff = row.getHasAutomaticShutoff();
        String basketballSize = row.getBasketballSize();
        String shortDescription = row.getShortDescription();
        String manufacturerPartNumber = row.getManufacturerPartNumber();
        String countryOfOriginTextiles = row.getCountryOfOriginTextiles();
        String isPrimaryVariant = row.getIsPrimaryVariant();
        String strideLength_measure = row.getStrideLength_measure();
        String prop65WarningText = row.getProp65WarningText();
        String maximumWeight_unit = row.getMaximumWeight_unit();
        String requiresTextileActLabeling = row.getRequiresTextileActLabeling();
        String isWeatherResistant = row.getIsWeatherResistant();
        String hasFuelContainer = row.getHasFuelContainer();
        String fishingLinePoundTest_unit = row.getFishingLinePoundTest_unit();
        String strideLength_unit = row.getStrideLength_unit();
        String horsepower_unit = row.getHorsepower_unit();
        String horsepower_measure = row.getHorsepower_measure();
        String isAssemblyRequired = row.getIsAssemblyRequired();
        String sportsTeam = row.getSportsTeam();
        String sport = row.getSport();
        String assembledProductLength_unit = row.getAssembledProductLength_unit();

        List<String> globalBrandLicenseList = row.getGlobalBrandLicense();
        List<String> swatchVariantAttributeList = row.getSwatchVariantAttribute();
        List<String> swatchImageUrlList = row.getSwatchImageUrl();
        List<String> recommendedLocationsList = row.getRecommendedLocations();
        List<String> fabricCareInstructionsList = row.getFabricCareInstructions();
        List<String> ballCoreMaterialList = row.getBallCoreMaterial();
        List<String> productSecondaryImageURLList = row.getProductSecondaryImageURL();
        List<String> materialPercentageList = row.getMaterialPercentage();
        List<String> smallPartsWarningsList = row.getSmallPartsWarnings();
        List<String> recommendedUsesList = row.getRecommendedUses();
        List<String> variantAttributeNamesList = row.getVariantAttributeNames();
        List<String> featuresList = row.getFeatures();
        List<String> ageGroupList = row.getAgeGroup();
        List<String> materialNameList = row.getMaterialName();
        List<String> keyFeaturesList = row.getKeyFeatures();
        List<String> colorCategoryList = row.getColorCategory();
        List<String> wirelessTechnologiesList = row.getWirelessTechnologies();

        BrandLicense globalBrandLicense = null;
        if (globalBrandLicenseList != null)
        {
            globalBrandLicense = new BrandLicense();
            globalBrandLicense.getGlobalBrandLicenseValue().addAll(globalBrandLicenseList);
        }
        MaximumWeight maximumWeight = null;
        if (maximumWeight_measure != null && maximumWeight_unit != null)
        {
            maximumWeight = new MaximumWeight();
            maximumWeight.setMeasure(Helper.String2BigDecimal(maximumWeight_measure));
            maximumWeight.setUnit(maximumWeight_unit);
        }
        Horsepower horsepower = null;
        if (horsepower_measure != null && horsepower_unit != null)
        {
            horsepower = new Horsepower();
            horsepower.setMeasure(Helper.String2BigDecimal(horsepower_measure));
            horsepower.setUnit(horsepower_unit);
        }
        Velocity velocity = null;
        if (velocity_measure != null && velocity_unit != null)
        {
            velocity = new Velocity();
            velocity.setMeasure(Helper.String2BigDecimal(velocity_measure));
            velocity.setUnit(velocity_unit);
        }
        TireDiameter tireDiameter = null;
        if (tireDiameter_measure != null && tireDiameter_unit != null)
        {
            tireDiameter = new TireDiameter();
            tireDiameter.setMeasure(Helper.String2BigDecimal(tireDiameter_measure));
            tireDiameter.setUnit(tireDiameter_unit);
        }
        RecommendedLocations recommendedLocations = null;
        if (recommendedLocationsList != null)
        {
            recommendedLocations = new RecommendedLocations();
            recommendedLocations.getRecommendedLocation().addAll(recommendedLocationsList);
        }
        AssembledProductHeight assembledProductHeight = null;
        if (assembledProductHeight_measure != null && assembledProductHeight_unit != null)
        {
            assembledProductHeight = new AssembledProductHeight();
            assembledProductHeight.setMeasure(Helper.String2BigDecimal(assembledProductHeight_measure));
            assembledProductHeight.setUnit(assembledProductHeight_unit);
        }
        ColorCategory colorCategory = null;
        if (colorCategoryList != null)
        {
            colorCategory = new ColorCategory();
            colorCategory.getColorCategoryValue().addAll(colorCategoryList);
        }
        AdditionalFeatures features = null;
        if (featuresList != null)
        {
            features = new AdditionalFeatures();
            features.getFeature().addAll(featuresList);
        }
        KeyFeatures keyFeatures = null;
        if (keyFeaturesList != null)
        {
            keyFeatures = new KeyFeatures();
            keyFeatures.getKeyFeaturesValue().addAll(keyFeaturesList);
        }
        SwatchImages swatchImages = null;
        if (swatchImageUrlList != null && swatchVariantAttributeList != null)
        {
            swatchImages = new SwatchImages();
            for (int i = 0; i < swatchImageUrlList.size(); i++)
            {
                SportAndRecreationOther.SwatchImages.SwatchImage swatchImage = new SportAndRecreationOther.SwatchImages.SwatchImage();
                swatchImage.setSwatchImageUrl(swatchImageUrlList.get(i));
                swatchImage.setSwatchVariantAttribute(swatchVariantAttributeList.get(i));
                swatchImages.getSwatchImage().add(swatchImage);
            }
        }
        AssembledProductLength assembledProductLength = null;
        if (assembledProductLength_measure != null && assembledProductLength_unit != null)
        {
            assembledProductLength = new AssembledProductLength();
            assembledProductLength.setMeasure(Helper.String2BigDecimal(assembledProductLength_measure));
            assembledProductLength.setUnit(assembledProductLength_unit);
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
        ProductSecondaryImageURL productSecondaryImageURL = null;
        if (productSecondaryImageURLList != null)
        {
            productSecondaryImageURL = new ProductSecondaryImageURL();
            productSecondaryImageURL.getProductSecondaryImageURLValue().addAll(productSecondaryImageURLList);
        }
        VariantAttributeNames variantAttributeNames = null;
        if (variantAttributeNamesList != null)
        {
            variantAttributeNames = new VariantAttributeNames();
            variantAttributeNames.getVariantAttributeName().addAll(variantAttributeNamesList);
        }
        WirelessTechnologies wirelessTechnologies = null;
        if (wirelessTechnologiesList != null)
        {
            wirelessTechnologies = new WirelessTechnologies();
            wirelessTechnologies.getWirelessTechnology().addAll(wirelessTechnologiesList);
        }
        SmallPartsWarnings smallPartsWarnings = null;
        if (smallPartsWarningsList != null)
        {
            smallPartsWarnings = new SmallPartsWarnings();
            for (String string : wirelessTechnologiesList)
            {
                smallPartsWarnings.getSmallPartsWarning().add(Helper.String2BigInteger(string));
            }
        }
        AgeGroup ageGroup = null;
        if (ageGroupList != null)
        {
            ageGroup = new AgeGroup();
            ageGroup.getAgeGroupValue().addAll(ageGroupList);
        }
        AgeRange ageRange = null;
        if (ageRange_unit != null)
        {
            ageRange = new AgeRange();
            ageRange.setRangeMaximum(Helper.String2BigInteger(rangeMaximum));
            ageRange.setRangeMinimum(Helper.String2BigInteger(rangeMinimum));
            ageRange.setUnit(ageRange_unit);
        }
        ShelfLife shelfLife = null;
        if (shelfLife_measure != null && shelfLife_unit != null)
        {
            shelfLife = new ShelfLife();
            shelfLife.setMeasure(Helper.String2BigInteger(shelfLife_measure));
            shelfLife.setUnit(shelfLife_unit);
        }
        FabricContent fabricContent = null;
        if (materialNameList != null && materialPercentageList != null)
        {
            fabricContent = new FabricContent();
            for (int i = 0; i < materialNameList.size(); i++)
            {
                FabricContentValue fabricContentValue = new FabricContentValue();
                fabricContentValue.setMaterialName(materialNameList.get(i));
                fabricContentValue.setMaterialPercentage(Helper.String2BigDecimal(materialPercentageList.get(i)));
                fabricContent.getFabricContentValue().add(fabricContentValue);
            }
        }
        LengthUnit strideLength = null;
        if (strideLength_measure != null && strideLength_unit != null)
        {
            strideLength = new LengthUnit();
            strideLength.setMeasure(Helper.String2BigDecimal(strideLength_measure));
            strideLength.setUnit(strideLength_unit);
        }
        FabricCareInstructions fabricCareInstructions = null;
        if (fabricCareInstructionsList != null)
        {
            fabricCareInstructions = new FabricCareInstructions();
            fabricCareInstructions.getFabricCareInstruction().addAll(fabricCareInstructionsList);
        }
        BallCoreMaterial ballCoreMaterial = null;
        if (ballCoreMaterialList != null)
        {
            ballCoreMaterial = new BallCoreMaterial();
            ballCoreMaterial.getBallCoreMaterialValue().addAll(ballCoreMaterialList);
        }
        WeightUnit fishingLinePoundTest = null;
        if (fishingLinePoundTest_measure != null && fishingLinePoundTest_unit != null)
        {
            fishingLinePoundTest = new WeightUnit();
            fishingLinePoundTest.setMeasure(Helper.String2BigDecimal(fishingLinePoundTest_measure));
            fishingLinePoundTest.setUnit(fishingLinePoundTest_unit);
        }
        MinimumTemperature minimumTemperature = null;
        if (minimumTemperature_measure != null && minimumTemperature_unit != null)
        {
            minimumTemperature = new MinimumTemperature();
            minimumTemperature.setMeasure(Helper.String2BigDecimal(minimumTemperature_measure));
            minimumTemperature.setUnit(minimumTemperature_unit);
        }
        RecommendedUses recommendedUses = null;
        if (recommendedUsesList != null)
        {
            recommendedUses = new RecommendedUses();
            recommendedUses.getRecommendedUse().addAll(recommendedUsesList);
        }

        sportAndRecreationOther.setSize(size);
        sportAndRecreationOther.setColor(color);
        sportAndRecreationOther.setAthlete(athlete);
        sportAndRecreationOther.setAutographedBy(autographedBy);
        sportAndRecreationOther.setPattern(pattern);
        sportAndRecreationOther.setFinish(finish);
        sportAndRecreationOther.setShape(shape);
        sportAndRecreationOther.setSeason(season);
        sportAndRecreationOther.setCharacter(character);
        sportAndRecreationOther.setCapacity(capacity);
        sportAndRecreationOther.setMaximumWeight(maximumWeight);
        sportAndRecreationOther.setBatDrop(batDrop);
        sportAndRecreationOther.setFitnessGoal(fitnessGoal);
        sportAndRecreationOther.setFootballSize(footballSize);
        sportAndRecreationOther.setBladeType(bladeType);
        sportAndRecreationOther.setAnimalType(animalType);
        sportAndRecreationOther.setTentType(tentType);
        sportAndRecreationOther.setIsMemorabilia(isMemorabilia);
        sportAndRecreationOther.setIsCollectible(isCollectible);
        sportAndRecreationOther.setIsPortable(isPortable);
        sportAndRecreationOther.setIsFoldable(isFoldable);
        sportAndRecreationOther.setIsSpaceSaving(isSpaceSaving);
        sportAndRecreationOther.setIsWheeled(isWheeled);
        sportAndRecreationOther.setIsWaterproof(isWaterproof);
        sportAndRecreationOther.setIsPowered(isPowered);
        sportAndRecreationOther.setPowerType(powerType);
        sportAndRecreationOther.setHorsepower(horsepower);
        sportAndRecreationOther.setVelocity(velocity);
        sportAndRecreationOther.setTireDiameter(tireDiameter);
        sportAndRecreationOther.setRecommendedUses(recommendedUses);
        sportAndRecreationOther.setRecommendedLocations(recommendedLocations);
        sportAndRecreationOther.setCompatibleDevices(compatibleDevices);
        sportAndRecreationOther.setShortDescription(shortDescription);
        sportAndRecreationOther.setBrand(brand);
        sportAndRecreationOther.setColorCategory(colorCategory);
        sportAndRecreationOther.setCount(count);
        sportAndRecreationOther.setCountPerPack(Helper.String2BigInteger(countPerPack));
        sportAndRecreationOther.setFeatures(features);
        sportAndRecreationOther.setKeyFeatures(keyFeatures);
        sportAndRecreationOther.setKeywords(keywords);
        sportAndRecreationOther.setMainImageUrl(mainImageUrl);
        sportAndRecreationOther.setManufacturer(manufacturer);
        sportAndRecreationOther.setModelNumber(modelNumber);
        sportAndRecreationOther.setPieceCount(Helper.String2BigInteger(pieceCount));
        sportAndRecreationOther.setSwatchImages(swatchImages);
        sportAndRecreationOther.setAssembledProductHeight(assembledProductHeight);
        sportAndRecreationOther.setAssembledProductLength(assembledProductLength);
        sportAndRecreationOther.setAssembledProductWeight(assembledProductWeight);
        sportAndRecreationOther.setAssembledProductWidth(assembledProductWidth);
        sportAndRecreationOther.setBatteryTechnologyType(batteryTechnologyType);
        sportAndRecreationOther.setIsPrimaryVariant(isPrimaryVariant);
        sportAndRecreationOther.setIsProp65WarningRequired(isProp65WarningRequired);
        sportAndRecreationOther.setManufacturerPartNumber(manufacturerPartNumber);
        sportAndRecreationOther.setMultipackQuantity(Helper.String2BigInteger(multipackQuantity));
        sportAndRecreationOther.setProductSecondaryImageURL(productSecondaryImageURL);
        sportAndRecreationOther.setProp65WarningText(prop65WarningText);
        sportAndRecreationOther.setVariantAttributeNames(variantAttributeNames);
        sportAndRecreationOther.setVariantGroupId(variantGroupId);
        sportAndRecreationOther.setWirelessTechnologies(wirelessTechnologies);
        sportAndRecreationOther
                .setCompositeWoodCertificationCode(Helper.String2BigInteger(compositeWoodCertificationCode));
        sportAndRecreationOther.setSport(sport);
        sportAndRecreationOther.setGender(gender);
        sportAndRecreationOther.setAgeGroup(ageGroup);
        sportAndRecreationOther.setAgeRange(ageRange);
        sportAndRecreationOther.setClothingSize(clothingSize);
        sportAndRecreationOther.setHasExpiration(hasExpiration);
        sportAndRecreationOther.setShelfLife(shelfLife);
        sportAndRecreationOther.setHasWarranty(hasWarranty);
        sportAndRecreationOther.setWarrantyURL(warrantyURL);
        sportAndRecreationOther.setWarrantyText(warrantyText);
        sportAndRecreationOther.setFabricContent(fabricContent);
        sportAndRecreationOther.setShoeSize(shoeSize);
        sportAndRecreationOther.setSportsLeague(sportsLeague);
        sportAndRecreationOther.setSportsTeam(sportsTeam);
        sportAndRecreationOther.setDriveSystem(driveSystem);
        sportAndRecreationOther.setStrideLength(strideLength);
        sportAndRecreationOther.setMaterial(material);
        sportAndRecreationOther.setDexterity(dexterity);
        sportAndRecreationOther.setSmallPartsWarnings(smallPartsWarnings);
        sportAndRecreationOther.setRequiresTextileActLabeling(requiresTextileActLabeling);
        sportAndRecreationOther.setCountryOfOriginTextiles(countryOfOriginTextiles);
        sportAndRecreationOther.setHasFuelContainer(hasFuelContainer);
        sportAndRecreationOther.setFabricCareInstructions(fabricCareInstructions);
        sportAndRecreationOther.setIsAssemblyRequired(isAssemblyRequired);
        sportAndRecreationOther.setAssemblyInstructions(assemblyInstructions);
        sportAndRecreationOther.setGlobalBrandLicense(globalBrandLicense);
        sportAndRecreationOther.setSeatingCapacity(Helper.String2BigInteger(seatingCapacity));
        sportAndRecreationOther.setMaximumIncline(Helper.String2BigInteger(maximumIncline));
        sportAndRecreationOther.setBasketballSize(basketballSize);
        sportAndRecreationOther.setSoccerBallSize(soccerBallSize);
        sportAndRecreationOther.setBallCoreMaterial(ballCoreMaterial);
        sportAndRecreationOther.setFishingLocation(fishingLocation);
        sportAndRecreationOther.setFishingLinePoundTest(fishingLinePoundTest);
        sportAndRecreationOther.setHasAutomaticShutoff(hasAutomaticShutoff);
        sportAndRecreationOther.setMinimumTemperature(minimumTemperature);
        sportAndRecreationOther.setIsTearResistant(isTearResistant);
        sportAndRecreationOther.setIsWeatherResistant(isWeatherResistant);
        sportAndRecreationOther.setCleaningCareAndMaintenance(cleaningCareAndMaintenance);

        return sportAndRecreationOther;
    }

}
