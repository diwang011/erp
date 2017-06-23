//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 04:28:11 PM CST 
//


package com.erp.biz.api.model.price;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>pricingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="pricingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentPrice" type="{http://walmart.com/}price"/&gt;
 *         &lt;element name="currentPriceType" type="{http://walmart.com/}priceType" minOccurs="0"/&gt;
 *         &lt;element name="comparisonPrice" type="{http://walmart.com/}price" minOccurs="0"/&gt;
 *         &lt;element name="priceDisplayCodes" type="{http://walmart.com/}priceDisplayCodes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="effectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="promoId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="processMode" type="{http://walmart.com/}processModeType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pricingType", propOrder = {
    "currentPrice",
    "currentPriceType",
    "comparisonPrice",
    "priceDisplayCodes"
})
public class PricingType {

    @XmlElement(required = true)
    protected Price currentPrice;
    @XmlSchemaType(name = "token")
    protected PriceType currentPriceType;
    protected Price comparisonPrice;
    protected PriceDisplayCodes priceDisplayCodes;
    @XmlAttribute(name = "effectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlAttribute(name = "expirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlAttribute(name = "promoId")
    protected String promoId;
    @XmlAttribute(name = "processMode")
    protected ProcessModeType processMode;

    /**
     * 获取currentPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getCurrentPrice() {
        return currentPrice;
    }

    /**
     * 设置currentPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setCurrentPrice(Price value) {
        this.currentPrice = value;
    }

    /**
     * 获取currentPriceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getCurrentPriceType() {
        return currentPriceType;
    }

    /**
     * 设置currentPriceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setCurrentPriceType(PriceType value) {
        this.currentPriceType = value;
    }

    /**
     * 获取comparisonPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getComparisonPrice() {
        return comparisonPrice;
    }

    /**
     * 设置comparisonPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setComparisonPrice(Price value) {
        this.comparisonPrice = value;
    }

    /**
     * 获取priceDisplayCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PriceDisplayCodes }
     *     
     */
    public PriceDisplayCodes getPriceDisplayCodes() {
        return priceDisplayCodes;
    }

    /**
     * 设置priceDisplayCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PriceDisplayCodes }
     *     
     */
    public void setPriceDisplayCodes(PriceDisplayCodes value) {
        this.priceDisplayCodes = value;
    }

    /**
     * 获取effectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置effectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * 获取expirationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * 设置expirationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * 获取promoId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoId() {
        return promoId;
    }

    /**
     * 设置promoId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoId(String value) {
        this.promoId = value;
    }

    /**
     * 获取processMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProcessModeType }
     *     
     */
    public ProcessModeType getProcessMode() {
        return processMode;
    }

    /**
     * 设置processMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessModeType }
     *     
     */
    public void setProcessMode(ProcessModeType value) {
        this.processMode = value;
    }

}
