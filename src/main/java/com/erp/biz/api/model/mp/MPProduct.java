//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.23 时间 11:38:50 AM CST 
//


package com.erp.biz.api.model.mp;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.persistence.oxm.annotations.XmlCDATA;


/**
 * <p>MPProduct complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MPProduct"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="SkuUpdate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="msrp" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="productName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionalProductAttributes" type="{http://walmart.com/}AdditionalProductAttributes" minOccurs="0"/&gt;
 *         &lt;element name="ProductIdUpdate" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://walmart.com/}category"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MPProduct", propOrder = {

})
public class MPProduct {

    @XmlElement(name = "SkuUpdate")
    protected String skuUpdate;
    protected BigDecimal msrp;
    @XmlElement(required = true)
    @XmlCDATA
    protected String productName;
    protected AdditionalProductAttributes additionalProductAttributes;
    @XmlElement(name = "ProductIdUpdate")
    protected String productIdUpdate;
    @XmlElement(required = true)
    protected Category category;

    /**
     * 获取skuUpdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkuUpdate() {
        return skuUpdate;
    }

    /**
     * 设置skuUpdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkuUpdate(String value) {
        this.skuUpdate = value;
    }

    /**
     * 获取msrp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMsrp() {
        return msrp;
    }

    /**
     * 设置msrp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMsrp(BigDecimal value) {
        this.msrp = value;
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
     * 获取additionalProductAttributes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductAttributes }
     *     
     */
    public AdditionalProductAttributes getAdditionalProductAttributes() {
        return additionalProductAttributes;
    }

    /**
     * 设置additionalProductAttributes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductAttributes }
     *     
     */
    public void setAdditionalProductAttributes(AdditionalProductAttributes value) {
        this.additionalProductAttributes = value;
    }

    /**
     * 获取productIdUpdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIdUpdate() {
        return productIdUpdate;
    }

    /**
     * 设置productIdUpdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIdUpdate(String value) {
        this.productIdUpdate = value;
    }

    /**
     * 获取category属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCategory() {
        return category;
    }

    /**
     * 设置category属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCategory(Category value) {
        this.category = value;
    }

}
