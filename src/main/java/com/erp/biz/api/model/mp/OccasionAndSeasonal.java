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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>OccasionAndSeasonal complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OccasionAndSeasonal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="Funeral" type="{http://walmart.com/}Funeral"/&gt;
 *         &lt;element name="DecorationsAndFavors" type="{http://walmart.com/}DecorationsAndFavors"/&gt;
 *         &lt;element name="CeremonialClothingAndAccessories" type="{http://walmart.com/}CeremonialClothingAndAccessories"/&gt;
 *         &lt;element name="Costumes" type="{http://walmart.com/}Costumes"/&gt;
 *         &lt;element name="GiftSupplyAndAwards" type="{http://walmart.com/}GiftSupplyAndAwards"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OccasionAndSeasonal", propOrder = {
    "funeral",
    "decorationsAndFavors",
    "ceremonialClothingAndAccessories",
    "costumes",
    "giftSupplyAndAwards"
})
public class OccasionAndSeasonal {

    @XmlElement(name = "Funeral")
    protected Funeral funeral;
    @XmlElement(name = "DecorationsAndFavors")
    protected DecorationsAndFavors decorationsAndFavors;
    @XmlElement(name = "CeremonialClothingAndAccessories")
    protected CeremonialClothingAndAccessories ceremonialClothingAndAccessories;
    @XmlElement(name = "Costumes")
    protected Costumes costumes;
    @XmlElement(name = "GiftSupplyAndAwards")
    protected GiftSupplyAndAwards giftSupplyAndAwards;

    /**
     * 获取funeral属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Funeral }
     *     
     */
    public Funeral getFuneral() {
        return funeral;
    }

    /**
     * 设置funeral属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Funeral }
     *     
     */
    public void setFuneral(Funeral value) {
        this.funeral = value;
    }

    /**
     * 获取decorationsAndFavors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DecorationsAndFavors }
     *     
     */
    public DecorationsAndFavors getDecorationsAndFavors() {
        return decorationsAndFavors;
    }

    /**
     * 设置decorationsAndFavors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DecorationsAndFavors }
     *     
     */
    public void setDecorationsAndFavors(DecorationsAndFavors value) {
        this.decorationsAndFavors = value;
    }

    /**
     * 获取ceremonialClothingAndAccessories属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CeremonialClothingAndAccessories }
     *     
     */
    public CeremonialClothingAndAccessories getCeremonialClothingAndAccessories() {
        return ceremonialClothingAndAccessories;
    }

    /**
     * 设置ceremonialClothingAndAccessories属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CeremonialClothingAndAccessories }
     *     
     */
    public void setCeremonialClothingAndAccessories(CeremonialClothingAndAccessories value) {
        this.ceremonialClothingAndAccessories = value;
    }

    /**
     * 获取costumes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Costumes }
     *     
     */
    public Costumes getCostumes() {
        return costumes;
    }

    /**
     * 设置costumes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Costumes }
     *     
     */
    public void setCostumes(Costumes value) {
        this.costumes = value;
    }

    /**
     * 获取giftSupplyAndAwards属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GiftSupplyAndAwards }
     *     
     */
    public GiftSupplyAndAwards getGiftSupplyAndAwards() {
        return giftSupplyAndAwards;
    }

    /**
     * 设置giftSupplyAndAwards属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GiftSupplyAndAwards }
     *     
     */
    public void setGiftSupplyAndAwards(GiftSupplyAndAwards value) {
        this.giftSupplyAndAwards = value;
    }

}
