//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.23 时间 11:38:50 AM CST 
//


package com.erp.biz.api.model.mp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="HealthAndBeauty" type="{http://walmart.com/}HealthAndBeauty"/&gt;
 *         &lt;element name="Home" type="{http://walmart.com/}Home"/&gt;
 *         &lt;element name="FurnitureCategory" type="{http://walmart.com/}FurnitureCategory"/&gt;
 *         &lt;element name="ArtAndCraftCategory" type="{http://walmart.com/}ArtAndCraftCategory"/&gt;
 *         &lt;element name="FoodAndBeverageCategory" type="{http://walmart.com/}FoodAndBeverageCategory"/&gt;
 *         &lt;element name="ToolsAndHardware" type="{http://walmart.com/}ToolsAndHardware"/&gt;
 *         &lt;element name="SportAndRecreation" type="{http://walmart.com/}SportAndRecreation"/&gt;
 *         &lt;element name="Photography" type="{http://walmart.com/}Photography"/&gt;
 *         &lt;element name="Animal" type="{http://walmart.com/}Animal"/&gt;
 *         &lt;element name="OccasionAndSeasonal" type="{http://walmart.com/}OccasionAndSeasonal"/&gt;
 *         &lt;element name="GardenAndPatioCategory" type="{http://walmart.com/}GardenAndPatioCategory"/&gt;
 *         &lt;element name="FootwearCategory" type="{http://walmart.com/}FootwearCategory"/&gt;
 *         &lt;element name="Baby" type="{http://walmart.com/}Baby"/&gt;
 *         &lt;element name="CarriersAndAccessoriesCategory" type="{http://walmart.com/}CarriersAndAccessoriesCategory"/&gt;
 *         &lt;element name="Media" type="{http://walmart.com/}Media"/&gt;
 *         &lt;element name="MusicalInstrument" type="{http://walmart.com/}MusicalInstrument"/&gt;
 *         &lt;element name="OfficeCategory" type="{http://walmart.com/}OfficeCategory"/&gt;
 *         &lt;element name="OtherCategory" type="{http://walmart.com/}OtherCategory"/&gt;
 *         &lt;element name="ToysCategory" type="{http://walmart.com/}ToysCategory"/&gt;
 *         &lt;element name="WatchesCategory" type="{http://walmart.com/}WatchesCategory"/&gt;
 *         &lt;element name="Vehicle" type="{http://walmart.com/}Vehicle"/&gt;
 *         &lt;element name="ClothingCategory" type="{http://walmart.com/}ClothingCategory"/&gt;
 *         &lt;element name="JewelryCategory" type="{http://walmart.com/}JewelryCategory"/&gt;
 *         &lt;element name="Electronics" type="{http://walmart.com/}Electronics"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "healthAndBeauty",
    "home",
    "furnitureCategory",
    "artAndCraftCategory",
    "foodAndBeverageCategory",
    "toolsAndHardware",
    "sportAndRecreation",
    "photography",
    "animal",
    "occasionAndSeasonal",
    "gardenAndPatioCategory",
    "footwearCategory",
    "baby",
    "carriersAndAccessoriesCategory",
    "media",
    "musicalInstrument",
    "officeCategory",
    "otherCategory",
    "toysCategory",
    "watchesCategory",
    "vehicle",
    "clothingCategory",
    "jewelryCategory",
    "electronics"
})
@XmlRootElement(name = "category")
public class Category {

    @XmlElement(name = "HealthAndBeauty")
    protected HealthAndBeauty healthAndBeauty;
    @XmlElement(name = "Home")
    protected Home home;
    @XmlElement(name = "FurnitureCategory")
    protected FurnitureCategory furnitureCategory;
    @XmlElement(name = "ArtAndCraftCategory")
    protected ArtAndCraftCategory artAndCraftCategory;
    @XmlElement(name = "FoodAndBeverageCategory")
    protected FoodAndBeverageCategory foodAndBeverageCategory;
    @XmlElement(name = "ToolsAndHardware")
    protected ToolsAndHardware toolsAndHardware;
    @XmlElement(name = "SportAndRecreation")
    protected SportAndRecreation sportAndRecreation;
    @XmlElement(name = "Photography")
    protected Photography photography;
    @XmlElement(name = "Animal")
    protected Animal animal;
    @XmlElement(name = "OccasionAndSeasonal")
    protected OccasionAndSeasonal occasionAndSeasonal;
    @XmlElement(name = "GardenAndPatioCategory")
    protected GardenAndPatioCategory gardenAndPatioCategory;
    @XmlElement(name = "FootwearCategory")
    protected FootwearCategory footwearCategory;
    @XmlElement(name = "Baby")
    protected Baby baby;
    @XmlElement(name = "CarriersAndAccessoriesCategory")
    protected CarriersAndAccessoriesCategory carriersAndAccessoriesCategory;
    @XmlElement(name = "Media")
    protected Media media;
    @XmlElement(name = "MusicalInstrument")
    protected MusicalInstrument musicalInstrument;
    @XmlElement(name = "OfficeCategory")
    protected OfficeCategory officeCategory;
    @XmlElement(name = "OtherCategory")
    protected OtherCategory otherCategory;
    @XmlElement(name = "ToysCategory")
    protected ToysCategory toysCategory;
    @XmlElement(name = "WatchesCategory")
    protected WatchesCategory watchesCategory;
    @XmlElement(name = "Vehicle")
    protected Vehicle vehicle;
    @XmlElement(name = "ClothingCategory")
    protected ClothingCategory clothingCategory;
    @XmlElement(name = "JewelryCategory")
    protected JewelryCategory jewelryCategory;
    @XmlElement(name = "Electronics")
    protected Electronics electronics;

    /**
     * 获取healthAndBeauty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HealthAndBeauty }
     *     
     */
    public HealthAndBeauty getHealthAndBeauty() {
        return healthAndBeauty;
    }

    /**
     * 设置healthAndBeauty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HealthAndBeauty }
     *     
     */
    public void setHealthAndBeauty(HealthAndBeauty value) {
        this.healthAndBeauty = value;
    }

    /**
     * 获取home属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Home }
     *     
     */
    public Home getHome() {
        return home;
    }

    /**
     * 设置home属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Home }
     *     
     */
    public void setHome(Home value) {
        this.home = value;
    }

    /**
     * 获取furnitureCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FurnitureCategory }
     *     
     */
    public FurnitureCategory getFurnitureCategory() {
        return furnitureCategory;
    }

    /**
     * 设置furnitureCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FurnitureCategory }
     *     
     */
    public void setFurnitureCategory(FurnitureCategory value) {
        this.furnitureCategory = value;
    }

    /**
     * 获取artAndCraftCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArtAndCraftCategory }
     *     
     */
    public ArtAndCraftCategory getArtAndCraftCategory() {
        return artAndCraftCategory;
    }

    /**
     * 设置artAndCraftCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArtAndCraftCategory }
     *     
     */
    public void setArtAndCraftCategory(ArtAndCraftCategory value) {
        this.artAndCraftCategory = value;
    }

    /**
     * 获取foodAndBeverageCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FoodAndBeverageCategory }
     *     
     */
    public FoodAndBeverageCategory getFoodAndBeverageCategory() {
        return foodAndBeverageCategory;
    }

    /**
     * 设置foodAndBeverageCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FoodAndBeverageCategory }
     *     
     */
    public void setFoodAndBeverageCategory(FoodAndBeverageCategory value) {
        this.foodAndBeverageCategory = value;
    }

    /**
     * 获取toolsAndHardware属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ToolsAndHardware }
     *     
     */
    public ToolsAndHardware getToolsAndHardware() {
        return toolsAndHardware;
    }

    /**
     * 设置toolsAndHardware属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ToolsAndHardware }
     *     
     */
    public void setToolsAndHardware(ToolsAndHardware value) {
        this.toolsAndHardware = value;
    }

    /**
     * 获取sportAndRecreation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SportAndRecreation }
     *     
     */
    public SportAndRecreation getSportAndRecreation() {
        return sportAndRecreation;
    }

    /**
     * 设置sportAndRecreation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SportAndRecreation }
     *     
     */
    public void setSportAndRecreation(SportAndRecreation value) {
        this.sportAndRecreation = value;
    }

    /**
     * 获取photography属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Photography }
     *     
     */
    public Photography getPhotography() {
        return photography;
    }

    /**
     * 设置photography属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Photography }
     *     
     */
    public void setPhotography(Photography value) {
        this.photography = value;
    }

    /**
     * 获取animal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Animal }
     *     
     */
    public Animal getAnimal() {
        return animal;
    }

    /**
     * 设置animal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Animal }
     *     
     */
    public void setAnimal(Animal value) {
        this.animal = value;
    }

    /**
     * 获取occasionAndSeasonal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OccasionAndSeasonal }
     *     
     */
    public OccasionAndSeasonal getOccasionAndSeasonal() {
        return occasionAndSeasonal;
    }

    /**
     * 设置occasionAndSeasonal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OccasionAndSeasonal }
     *     
     */
    public void setOccasionAndSeasonal(OccasionAndSeasonal value) {
        this.occasionAndSeasonal = value;
    }

    /**
     * 获取gardenAndPatioCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GardenAndPatioCategory }
     *     
     */
    public GardenAndPatioCategory getGardenAndPatioCategory() {
        return gardenAndPatioCategory;
    }

    /**
     * 设置gardenAndPatioCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GardenAndPatioCategory }
     *     
     */
    public void setGardenAndPatioCategory(GardenAndPatioCategory value) {
        this.gardenAndPatioCategory = value;
    }

    /**
     * 获取footwearCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FootwearCategory }
     *     
     */
    public FootwearCategory getFootwearCategory() {
        return footwearCategory;
    }

    /**
     * 设置footwearCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FootwearCategory }
     *     
     */
    public void setFootwearCategory(FootwearCategory value) {
        this.footwearCategory = value;
    }

    /**
     * 获取baby属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Baby }
     *     
     */
    public Baby getBaby() {
        return baby;
    }

    /**
     * 设置baby属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Baby }
     *     
     */
    public void setBaby(Baby value) {
        this.baby = value;
    }

    /**
     * 获取carriersAndAccessoriesCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CarriersAndAccessoriesCategory }
     *     
     */
    public CarriersAndAccessoriesCategory getCarriersAndAccessoriesCategory() {
        return carriersAndAccessoriesCategory;
    }

    /**
     * 设置carriersAndAccessoriesCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CarriersAndAccessoriesCategory }
     *     
     */
    public void setCarriersAndAccessoriesCategory(CarriersAndAccessoriesCategory value) {
        this.carriersAndAccessoriesCategory = value;
    }

    /**
     * 获取media属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Media }
     *     
     */
    public Media getMedia() {
        return media;
    }

    /**
     * 设置media属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Media }
     *     
     */
    public void setMedia(Media value) {
        this.media = value;
    }

    /**
     * 获取musicalInstrument属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MusicalInstrument }
     *     
     */
    public MusicalInstrument getMusicalInstrument() {
        return musicalInstrument;
    }

    /**
     * 设置musicalInstrument属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MusicalInstrument }
     *     
     */
    public void setMusicalInstrument(MusicalInstrument value) {
        this.musicalInstrument = value;
    }

    /**
     * 获取officeCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OfficeCategory }
     *     
     */
    public OfficeCategory getOfficeCategory() {
        return officeCategory;
    }

    /**
     * 设置officeCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OfficeCategory }
     *     
     */
    public void setOfficeCategory(OfficeCategory value) {
        this.officeCategory = value;
    }

    /**
     * 获取otherCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OtherCategory }
     *     
     */
    public OtherCategory getOtherCategory() {
        return otherCategory;
    }

    /**
     * 设置otherCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCategory }
     *     
     */
    public void setOtherCategory(OtherCategory value) {
        this.otherCategory = value;
    }

    /**
     * 获取toysCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ToysCategory }
     *     
     */
    public ToysCategory getToysCategory() {
        return toysCategory;
    }

    /**
     * 设置toysCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ToysCategory }
     *     
     */
    public void setToysCategory(ToysCategory value) {
        this.toysCategory = value;
    }

    /**
     * 获取watchesCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WatchesCategory }
     *     
     */
    public WatchesCategory getWatchesCategory() {
        return watchesCategory;
    }

    /**
     * 设置watchesCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WatchesCategory }
     *     
     */
    public void setWatchesCategory(WatchesCategory value) {
        this.watchesCategory = value;
    }

    /**
     * 获取vehicle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * 设置vehicle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

    /**
     * 获取clothingCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClothingCategory }
     *     
     */
    public ClothingCategory getClothingCategory() {
        return clothingCategory;
    }

    /**
     * 设置clothingCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClothingCategory }
     *     
     */
    public void setClothingCategory(ClothingCategory value) {
        this.clothingCategory = value;
    }

    /**
     * 获取jewelryCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JewelryCategory }
     *     
     */
    public JewelryCategory getJewelryCategory() {
        return jewelryCategory;
    }

    /**
     * 设置jewelryCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JewelryCategory }
     *     
     */
    public void setJewelryCategory(JewelryCategory value) {
        this.jewelryCategory = value;
    }

    /**
     * 获取electronics属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Electronics }
     *     
     */
    public Electronics getElectronics() {
        return electronics;
    }

    /**
     * 设置electronics属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Electronics }
     *     
     */
    public void setElectronics(Electronics value) {
        this.electronics = value;
    }

}
