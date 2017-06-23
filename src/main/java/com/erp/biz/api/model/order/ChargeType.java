//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 04:50:42 PM CST 
//


package com.erp.biz.api.model.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			
 * 
 * <p>chargeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="chargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chargeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="chargeName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="chargeAmount" type="{http://walmart.com/mp/v3/orders}moneyType"/&gt;
 *         &lt;element name="tax" type="{http://walmart.com/mp/v3/orders}taxType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chargeType", propOrder = {
    "chargeType",
    "chargeName",
    "chargeAmount",
    "tax"
})
public class ChargeType {

    @XmlElement(required = true)
    protected String chargeType;
    @XmlElement(required = true)
    protected String chargeName;
    @XmlElement(required = true)
    protected MoneyType chargeAmount;
    protected TaxType tax;

    /**
     * 获取chargeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * 设置chargeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeType(String value) {
        this.chargeType = value;
    }

    /**
     * 获取chargeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeName() {
        return chargeName;
    }

    /**
     * 设置chargeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeName(String value) {
        this.chargeName = value;
    }

    /**
     * 获取chargeAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MoneyType }
     *     
     */
    public MoneyType getChargeAmount() {
        return chargeAmount;
    }

    /**
     * 设置chargeAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyType }
     *     
     */
    public void setChargeAmount(MoneyType value) {
        this.chargeAmount = value;
    }

    /**
     * 获取tax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxType }
     *     
     */
    public TaxType getTax() {
        return tax;
    }

    /**
     * 设置tax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType }
     *     
     */
    public void setTax(TaxType value) {
        this.tax = value;
    }

}
