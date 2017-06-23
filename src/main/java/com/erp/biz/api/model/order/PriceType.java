//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 04:42:24 PM CST 
//


package com.erp.biz.api.model.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>priceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="priceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="retail" type="{http://walmart.com/mp/v3/orders}priceAndTaxType"/&gt;
 *         &lt;element name="shipping" type="{http://walmart.com/mp/v3/orders}priceAndTaxType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceType", propOrder = {
    "total",
    "retail",
    "shipping"
})
public class PriceType {

    protected float total;
    @XmlElement(required = true)
    protected PriceAndTaxType retail;
    @XmlElement(required = true)
    protected PriceAndTaxType shipping;

    /**
     * 获取total属性的值。
     * 
     */
    public float getTotal() {
        return total;
    }

    /**
     * 设置total属性的值。
     * 
     */
    public void setTotal(float value) {
        this.total = value;
    }

    /**
     * 获取retail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PriceAndTaxType }
     *     
     */
    public PriceAndTaxType getRetail() {
        return retail;
    }

    /**
     * 设置retail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndTaxType }
     *     
     */
    public void setRetail(PriceAndTaxType value) {
        this.retail = value;
    }

    /**
     * 获取shipping属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PriceAndTaxType }
     *     
     */
    public PriceAndTaxType getShipping() {
        return shipping;
    }

    /**
     * 设置shipping属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PriceAndTaxType }
     *     
     */
    public void setShipping(PriceAndTaxType value) {
        this.shipping = value;
    }

}
