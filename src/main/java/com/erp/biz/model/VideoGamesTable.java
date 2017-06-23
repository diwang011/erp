package com.erp.biz.model;

import java.util.List;

public class VideoGamesTable extends CommonTable 
{
	private String esrbRating;
	public String getEsrbRating() {
		return esrbRating;
	}

	public void setEsrbRating(String esrbRating) {
		this.esrbRating = esrbRating;
	}

	private String sportsLeague;
	public String getSportsLeague() {
		return sportsLeague;
	}

	public void setSportsLeague(String sportsLeague) {
		this.sportsLeague = sportsLeague;
	}

	private String keywords;
	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	private String ProductTaxCode;
	@Override
    public String getProductTaxCode() {
		return ProductTaxCode;
	}

	@Override
    public void setProductTaxCode(String ProductTaxCode) {
		this.ProductTaxCode = ProductTaxCode;
	}

	private String productName;
	@Override
    public String getProductName() {
		return productName;
	}

	@Override
    public void setProductName(String productName) {
		this.productName = productName;
	}

	private String StartDate;
	@Override
    public String getStartDate() {
		return StartDate;
	}

	@Override
    public void setStartDate(String StartDate) {
		this.StartDate = StartDate;
	}

	private List<String> features;
	public List<String> getFeatures() {
		return features;
	}

	public void setFeatures(List<String> features) {
		this.features = features;
	}

	private String multipackQuantity;
	public String getMultipackQuantity() {
		return multipackQuantity;
	}

	public void setMultipackQuantity(String multipackQuantity) {
		this.multipackQuantity = multipackQuantity;
	}

	private List<String> variantAttributeNames;
	public List<String> getVariantAttributeNames() {
		return variantAttributeNames;
	}

	public void setVariantAttributeNames(List<String> variantAttributeNames) {
		this.variantAttributeNames = variantAttributeNames;
	}

	private String shipsInOriginalPackaging;
	@Override
    public String getShipsInOriginalPackaging() {
		return shipsInOriginalPackaging;
	}

	@Override
    public void setShipsInOriginalPackaging(String shipsInOriginalPackaging) {
		this.shipsInOriginalPackaging = shipsInOriginalPackaging;
	}

	private List<String> globalBrandLicense;
	public List<String> getGlobalBrandLicense() {
		return globalBrandLicense;
	}

	public void setGlobalBrandLicense(List<String> globalBrandLicense) {
		this.globalBrandLicense = globalBrandLicense;
	}

	private String price;
	@Override
    public String getPrice() {
		return price;
	}

	@Override
    public void setPrice(String price) {
		this.price = price;
	}

	private String sku;
	@Override
    public String getSku() {
		return sku;
	}

	@Override
    public void setSku(String sku) {
		this.sku = sku;
	}

	private String mainImageUrl;
	@Override
    public String getMainImageUrl() {
		return mainImageUrl;
	}

	@Override
    public void setMainImageUrl(String mainImageUrl) {
		this.mainImageUrl = mainImageUrl;
	}

	private String MinimumAdvertisedPrice;
	@Override
    public String getMinimumAdvertisedPrice() {
		return MinimumAdvertisedPrice;
	}

	@Override
    public void setMinimumAdvertisedPrice(String MinimumAdvertisedPrice) {
		this.MinimumAdvertisedPrice = MinimumAdvertisedPrice;
	}

	private String ShippingWeight_measure;
	@Override
    public String getShippingWeight_measure() {
		return ShippingWeight_measure;
	}

	@Override
    public void setShippingWeight_measure(String ShippingWeight_measure) {
		this.ShippingWeight_measure = ShippingWeight_measure;
	}

	private List<String> productId;
	@Override
    public List<String> getProductId() {
		return productId;
	}

	@Override
    public void setProductId(List<String> productId) {
		this.productId = productId;
	}

	private String athlete;
	public String getAthlete() {
		return athlete;
	}

	public void setAthlete(String athlete) {
		this.athlete = athlete;
	}

	private String count;
	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	private List<String> swatchVariantAttribute;
	public List<String> getSwatchVariantAttribute() {
		return swatchVariantAttribute;
	}

	public void setSwatchVariantAttribute(List<String> swatchVariantAttribute) {
		this.swatchVariantAttribute = swatchVariantAttribute;
	}

	private String shortDescription;
	@Override
    public String getShortDescription() {
		return shortDescription;
	}

	@Override
    public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	private List<String> ageGroup;
	public List<String> getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(List<String> ageGroup) {
		this.ageGroup = ageGroup;
	}

	private String manufacturerPartNumber;
	public String getManufacturerPartNumber() {
		return manufacturerPartNumber;
	}

	public void setManufacturerPartNumber(String manufacturerPartNumber) {
		this.manufacturerPartNumber = manufacturerPartNumber;
	}

	private String ProductIdUpdate;
	@Override
    public String getProductIdUpdate() {
		return ProductIdUpdate;
	}

	@Override
    public void setProductIdUpdate(String ProductIdUpdate) {
		this.ProductIdUpdate = ProductIdUpdate;
	}

	private String autographedBy;
	public String getAutographedBy() {
		return autographedBy;
	}

	public void setAutographedBy(String autographedBy) {
		this.autographedBy = autographedBy;
	}

	private String isOnlineMultiplayerAvailable;
	public String getIsOnlineMultiplayerAvailable() {
		return isOnlineMultiplayerAvailable;
	}

	public void setIsOnlineMultiplayerAvailable(String isOnlineMultiplayerAvailable) {
		this.isOnlineMultiplayerAvailable = isOnlineMultiplayerAvailable;
	}

	private String isPrimaryVariant;
	public String getIsPrimaryVariant() {
		return isPrimaryVariant;
	}

	public void setIsPrimaryVariant(String isPrimaryVariant) {
		this.isPrimaryVariant = isPrimaryVariant;
	}

	private String isDownloadableContentAvailable;
	public String getIsDownloadableContentAvailable() {
		return isDownloadableContentAvailable;
	}

	public void setIsDownloadableContentAvailable(String isDownloadableContentAvailable) {
		this.isDownloadableContentAvailable = isDownloadableContentAvailable;
	}

	private List<String> swatchImageUrl;
	public List<String> getSwatchImageUrl() {
		return swatchImageUrl;
	}

	public void setSwatchImageUrl(List<String> swatchImageUrl) {
		this.swatchImageUrl = swatchImageUrl;
	}

	private String ShippingWeight_unit;
	@Override
    public String getShippingWeight_unit() {
		return ShippingWeight_unit;
	}

	@Override
    public void setShippingWeight_unit(String ShippingWeight_unit) {
		this.ShippingWeight_unit = ShippingWeight_unit;
	}

	private List<String> videoGameGenre;
	public List<String> getVideoGameGenre() {
		return videoGameGenre;
	}

	public void setVideoGameGenre(List<String> videoGameGenre) {
		this.videoGameGenre = videoGameGenre;
	}

	private List<String> ShippingOverrideShipMethod;
	@Override
    public List<String> getShippingOverrideShipMethod() {
		return ShippingOverrideShipMethod;
	}

	@Override
    public void setShippingOverrideShipMethod(List<String> ShippingOverrideShipMethod) {
		this.ShippingOverrideShipMethod = ShippingOverrideShipMethod;
	}

	private String edition;
	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	private List<String> keyFeatures;
	public List<String> getKeyFeatures() {
		return keyFeatures;
	}

	public void setKeyFeatures(List<String> keyFeatures) {
		this.keyFeatures = keyFeatures;
	}

	private String SkuUpdate;
	@Override
    public String getSkuUpdate() {
		return SkuUpdate;
	}

	@Override
    public void setSkuUpdate(String SkuUpdate) {
		this.SkuUpdate = SkuUpdate;
	}

	private String MustShipAlone;
	@Override
    public String getMustShipAlone() {
		return MustShipAlone;
	}

	@Override
    public void setMustShipAlone(String MustShipAlone) {
		this.MustShipAlone = MustShipAlone;
	}

	private String platform;
	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	private String manufacturer;
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	private List<String> ShippingOverrideshipPrice;
	@Override
    public List<String> getShippingOverrideshipPrice() {
		return ShippingOverrideshipPrice;
	}

	@Override
    public void setShippingOverrideshipPrice(List<String> ShippingOverrideshipPrice) {
		this.ShippingOverrideshipPrice = ShippingOverrideshipPrice;
	}

	private String countPerPack;
	public String getCountPerPack() {
		return countPerPack;
	}

	public void setCountPerPack(String countPerPack) {
		this.countPerPack = countPerPack;
	}

	private String numberOfChannels;
	public String getNumberOfChannels() {
		return numberOfChannels;
	}

	public void setNumberOfChannels(String numberOfChannels) {
		this.numberOfChannels = numberOfChannels;
	}

	private String msrp;
	@Override
    public String getMsrp() {
		return msrp;
	}

	@Override
    public void setMsrp(String msrp) {
		this.msrp = msrp;
	}

	private List<String> productSecondaryImageURL;
	public List<String> getProductSecondaryImageURL() {
		return productSecondaryImageURL;
	}

	public void setProductSecondaryImageURL(List<String> productSecondaryImageURL) {
		this.productSecondaryImageURL = productSecondaryImageURL;
	}

	private String releaseDate;
	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	private List<String> ShippingOverrideIsShippingAllowed;
	@Override
    public List<String> getShippingOverrideIsShippingAllowed() {
		return ShippingOverrideIsShippingAllowed;
	}

	@Override
    public void setShippingOverrideIsShippingAllowed(List<String> ShippingOverrideIsShippingAllowed) {
		this.ShippingOverrideIsShippingAllowed = ShippingOverrideIsShippingAllowed;
	}

	private String ratingReason;
	public String getRatingReason() {
		return ratingReason;
	}

	public void setRatingReason(String ratingReason) {
		this.ratingReason = ratingReason;
	}

	private String EndDate;
	@Override
    public String getEndDate() {
		return EndDate;
	}

	@Override
    public void setEndDate(String EndDate) {
		this.EndDate = EndDate;
	}

	private String requiredPeripherals;
	public String getRequiredPeripherals() {
		return requiredPeripherals;
	}

	public void setRequiredPeripherals(String requiredPeripherals) {
		this.requiredPeripherals = requiredPeripherals;
	}

	private String physicalMediaFormat;
	public String getPhysicalMediaFormat() {
		return physicalMediaFormat;
	}

	public void setPhysicalMediaFormat(String physicalMediaFormat) {
		this.physicalMediaFormat = physicalMediaFormat;
	}

	private List<String> targetAudience;
	public List<String> getTargetAudience() {
		return targetAudience;
	}

	public void setTargetAudience(List<String> targetAudience) {
		this.targetAudience = targetAudience;
	}

	private List<String> productIdType;
	@Override
    public List<String> getProductIdType() {
		return productIdType;
	}

	@Override
    public void setProductIdType(List<String> productIdType) {
		this.productIdType = productIdType;
	}

	private String variantGroupId;
	public String getVariantGroupId() {
		return variantGroupId;
	}

	public void setVariantGroupId(String variantGroupId) {
		this.variantGroupId = variantGroupId;
	}

	private String sportsTeam;
	public String getSportsTeam() {
		return sportsTeam;
	}

	public void setSportsTeam(String sportsTeam) {
		this.sportsTeam = sportsTeam;
	}

	private String modelNumber;
	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	private String sport;
	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	private String videoGameCollection;
	public String getVideoGameCollection() {
		return videoGameCollection;
	}

	public void setVideoGameCollection(String videoGameCollection) {
		this.videoGameCollection = videoGameCollection;
	}

	private List<String> ShippingOverrideShipRegion;
	@Override
    public List<String> getShippingOverrideShipRegion() {
		return ShippingOverrideShipRegion;
	}

	@Override
    public void setShippingOverrideShipRegion(List<String> ShippingOverrideShipRegion) {
		this.ShippingOverrideShipRegion = ShippingOverrideShipRegion;
	}

}