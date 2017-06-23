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


/**
 * <p>shippingOverride complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="shippingOverride"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ShippingOverrideIsShippingAllowed"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ShippingOverrideShipMethod"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="VALUE"/&gt;
 *               &lt;enumeration value="STANDARD"/&gt;
 *               &lt;enumeration value="EXPEDITED"/&gt;
 *               &lt;enumeration value="FREIGHT"/&gt;
 *               &lt;enumeration value="ONE_DAY"/&gt;
 *               &lt;enumeration value="FREIGHT_WITH_WHITE_GLOVE"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ShippingOverrideShipRegion"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="STREET_48_STATES"/&gt;
 *               &lt;enumeration value="PO_BOX_48_STATES"/&gt;
 *               &lt;enumeration value="STREET_AK_AND_HI"/&gt;
 *               &lt;enumeration value="PO_BOX_AK_AND_HI"/&gt;
 *               &lt;enumeration value="STREET_US_PROTECTORATES"/&gt;
 *               &lt;enumeration value="PO_BOX_US_PROTECTORATES"/&gt;
 *               &lt;enumeration value="APO_FPO"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ShippingOverrideshipPrice"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shippingOverride", propOrder = {

})
public class ShippingOverride {

    @XmlElement(name = "ShippingOverrideIsShippingAllowed", required = true)
    protected String shippingOverrideIsShippingAllowed;
    @XmlElement(name = "ShippingOverrideShipMethod", required = true)
    protected String shippingOverrideShipMethod;
    @XmlElement(name = "ShippingOverrideShipRegion", required = true)
    protected String shippingOverrideShipRegion;
    @XmlElement(name = "ShippingOverrideshipPrice", required = true)
    protected BigDecimal shippingOverrideshipPrice;

    /**
     * 获取shippingOverrideIsShippingAllowed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingOverrideIsShippingAllowed() {
        return shippingOverrideIsShippingAllowed;
    }

    /**
     * 设置shippingOverrideIsShippingAllowed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingOverrideIsShippingAllowed(String value) {
        this.shippingOverrideIsShippingAllowed = value;
    }

    /**
     * 获取shippingOverrideShipMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingOverrideShipMethod() {
        return shippingOverrideShipMethod;
    }

    /**
     * 设置shippingOverrideShipMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingOverrideShipMethod(String value) {
        this.shippingOverrideShipMethod = value;
    }

    /**
     * 获取shippingOverrideShipRegion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingOverrideShipRegion() {
        return shippingOverrideShipRegion;
    }

    /**
     * 设置shippingOverrideShipRegion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingOverrideShipRegion(String value) {
        this.shippingOverrideShipRegion = value;
    }

    /**
     * 获取shippingOverrideshipPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getShippingOverrideshipPrice() {
        return shippingOverrideshipPrice;
    }

    /**
     * 设置shippingOverrideshipPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setShippingOverrideshipPrice(BigDecimal value) {
        this.shippingOverrideshipPrice = value;
    }

}
