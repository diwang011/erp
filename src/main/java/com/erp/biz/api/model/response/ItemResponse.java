//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.23 时间 11:48:50 AM CST 
//


package com.erp.biz.api.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mart" type="{http://walmart.com/}Mart" minOccurs="0"/&gt;
 *         &lt;element name="sku"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="wpid" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="upc" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gtin" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="productName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="shelf" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="productType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="price" type="{http://walmart.com/}Money" minOccurs="0"/&gt;
 *         &lt;element name="publishedStatus" type="{http://walmart.com/}ItemPublishStatus" minOccurs="0"/&gt;
 *         &lt;element name="additionalAttributes" type="{http://walmart.com/}NameValueAttributes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemResponse", propOrder = {
    "mart",
    "sku",
    "wpid",
    "upc",
    "gtin",
    "productName",
    "shelf",
    "productType",
    "price",
    "publishedStatus",
    "additionalAttributes"
})
public class ItemResponse {

    @XmlSchemaType(name = "string")
    protected Mart mart;
    @XmlElement(required = true)
    protected String sku;
    protected String wpid;
    protected String upc;
    protected String gtin;
    protected String productName;
    protected String shelf;
    protected String productType;
    protected Money price;
    @XmlSchemaType(name = "string")
    protected ItemPublishStatus publishedStatus;
    protected NameValueAttributes additionalAttributes;

    /**
     * 获取mart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Mart }
     *     
     */
    public Mart getMart() {
        return mart;
    }

    /**
     * 设置mart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Mart }
     *     
     */
    public void setMart(Mart value) {
        this.mart = value;
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
     * 获取wpid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWpid() {
        return wpid;
    }

    /**
     * 设置wpid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWpid(String value) {
        this.wpid = value;
    }

    /**
     * 获取upc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpc() {
        return upc;
    }

    /**
     * 设置upc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpc(String value) {
        this.upc = value;
    }

    /**
     * 获取gtin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGtin() {
        return gtin;
    }

    /**
     * 设置gtin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGtin(String value) {
        this.gtin = value;
    }

    /**
     * 获取productName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置productName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * 获取shelf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShelf() {
        return shelf;
    }

    /**
     * 设置shelf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShelf(String value) {
        this.shelf = value;
    }

    /**
     * 获取productType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * 设置productType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * 获取price属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPrice() {
        return price;
    }

    /**
     * 设置price属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPrice(Money value) {
        this.price = value;
    }

    /**
     * 获取publishedStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemPublishStatus }
     *     
     */
    public ItemPublishStatus getPublishedStatus() {
        return publishedStatus;
    }

    /**
     * 设置publishedStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPublishStatus }
     *     
     */
    public void setPublishedStatus(ItemPublishStatus value) {
        this.publishedStatus = value;
    }

    /**
     * 获取additionalAttributes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameValueAttributes }
     *     
     */
    public NameValueAttributes getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * 设置additionalAttributes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueAttributes }
     *     
     */
    public void setAdditionalAttributes(NameValueAttributes value) {
        this.additionalAttributes = value;
    }

}
