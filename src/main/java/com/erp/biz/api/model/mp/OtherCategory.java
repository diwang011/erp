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
 * <p>OtherCategory complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OtherCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="Storage" type="{http://walmart.com/}Storage"/&gt;
 *         &lt;element name="giftCards" type="{http://walmart.com/}giftCards"/&gt;
 *         &lt;element name="CleaningAndChemical" type="{http://walmart.com/}CleaningAndChemical"/&gt;
 *         &lt;element name="safetyAndEmergency" type="{http://walmart.com/}safetyAndEmergency"/&gt;
 *         &lt;element name="fuelsAndLubricants" type="{http://walmart.com/}fuelsAndLubricants"/&gt;
 *         &lt;element name="Other" type="{http://walmart.com/}Other"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherCategory", propOrder = {
    "storage",
    "giftCards",
    "cleaningAndChemical",
    "safetyAndEmergency",
    "fuelsAndLubricants",
    "other"
})
public class OtherCategory {

    @XmlElement(name = "Storage")
    protected Storage storage;
    protected GiftCards giftCards;
    @XmlElement(name = "CleaningAndChemical")
    protected CleaningAndChemical cleaningAndChemical;
    protected SafetyAndEmergency safetyAndEmergency;
    protected FuelsAndLubricants fuelsAndLubricants;
    @XmlElement(name = "Other")
    protected Other other;

    /**
     * 获取storage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Storage }
     *     
     */
    public Storage getStorage() {
        return storage;
    }

    /**
     * 设置storage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Storage }
     *     
     */
    public void setStorage(Storage value) {
        this.storage = value;
    }

    /**
     * 获取giftCards属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GiftCards }
     *     
     */
    public GiftCards getGiftCards() {
        return giftCards;
    }

    /**
     * 设置giftCards属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GiftCards }
     *     
     */
    public void setGiftCards(GiftCards value) {
        this.giftCards = value;
    }

    /**
     * 获取cleaningAndChemical属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CleaningAndChemical }
     *     
     */
    public CleaningAndChemical getCleaningAndChemical() {
        return cleaningAndChemical;
    }

    /**
     * 设置cleaningAndChemical属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CleaningAndChemical }
     *     
     */
    public void setCleaningAndChemical(CleaningAndChemical value) {
        this.cleaningAndChemical = value;
    }

    /**
     * 获取safetyAndEmergency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SafetyAndEmergency }
     *     
     */
    public SafetyAndEmergency getSafetyAndEmergency() {
        return safetyAndEmergency;
    }

    /**
     * 设置safetyAndEmergency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SafetyAndEmergency }
     *     
     */
    public void setSafetyAndEmergency(SafetyAndEmergency value) {
        this.safetyAndEmergency = value;
    }

    /**
     * 获取fuelsAndLubricants属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FuelsAndLubricants }
     *     
     */
    public FuelsAndLubricants getFuelsAndLubricants() {
        return fuelsAndLubricants;
    }

    /**
     * 设置fuelsAndLubricants属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FuelsAndLubricants }
     *     
     */
    public void setFuelsAndLubricants(FuelsAndLubricants value) {
        this.fuelsAndLubricants = value;
    }

    /**
     * 获取other属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Other }
     *     
     */
    public Other getOther() {
        return other;
    }

    /**
     * 设置other属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Other }
     *     
     */
    public void setOther(Other value) {
        this.other = value;
    }

}
