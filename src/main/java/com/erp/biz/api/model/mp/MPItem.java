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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>MPItem complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MPItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="processMode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="CREATE"/&gt;
 *               &lt;enumeration value="REPLACE_ALL"/&gt;
 *               &lt;enumeration value="PARTIAL_UPDATE"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="feedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="sku"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="productIdentifiers" type="{http://walmart.com/}ProductIdentifiers"/&gt;
 *         &lt;element name="MPProduct" type="{http://walmart.com/}MPProduct" minOccurs="0"/&gt;
 *         &lt;element name="MPOffer" type="{http://walmart.com/}MPOffer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPItem", propOrder = {
    "processMode",
    "feedDate",
    "sku",
    "productIdentifiers",
    "mpProduct",
    "mpOffer"
})
public class MPItem {

    @XmlElement(required = true, defaultValue = "CREATE")
    protected String processMode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar feedDate;
    @XmlElement(required = true)
    protected String sku;
    @XmlElement(required = true)
    protected ProductIdentifiers productIdentifiers;
    @XmlElement(name = "MPProduct")
    protected MPProduct mpProduct;
    @XmlElement(name = "MPOffer")
    protected MPOffer mpOffer;

    /**
     * 获取processMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessMode() {
        return processMode;
    }

    /**
     * 设置processMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessMode(String value) {
        this.processMode = value;
    }

    /**
     * 获取feedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFeedDate() {
        return feedDate;
    }

    /**
     * 设置feedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFeedDate(XMLGregorianCalendar value) {
        this.feedDate = value;
    }

    /**
     * 获取sku属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * 设置sku属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * 获取productIdentifiers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentifiers }
     *     
     */
    public ProductIdentifiers getProductIdentifiers() {
        return productIdentifiers;
    }

    /**
     * 设置productIdentifiers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentifiers }
     *     
     */
    public void setProductIdentifiers(ProductIdentifiers value) {
        this.productIdentifiers = value;
    }

    /**
     * 获取mpProduct属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MPProduct }
     *     
     */
    public MPProduct getMPProduct() {
        return mpProduct;
    }

    /**
     * 设置mpProduct属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MPProduct }
     *     
     */
    public void setMPProduct(MPProduct value) {
        this.mpProduct = value;
    }

    /**
     * 获取mpOffer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MPOffer }
     *     
     */
    public MPOffer getMPOffer() {
        return mpOffer;
    }

    /**
     * 设置mpOffer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MPOffer }
     *     
     */
    public void setMPOffer(MPOffer value) {
        this.mpOffer = value;
    }

}
