//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 04:50:42 PM CST 
//


package com.erp.biz.api.model.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>carrierNameType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="carrierNameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="otherCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="carrier" type="{http://walmart.com/mp/v3/orders}carrierType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carrierNameType", propOrder = {
    "otherCarrier",
    "carrier"
})
public class CarrierNameType {

    protected String otherCarrier;
    @XmlSchemaType(name = "string")
    protected CarrierType carrier;

    /**
     * 获取otherCarrier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCarrier() {
        return otherCarrier;
    }

    /**
     * 设置otherCarrier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCarrier(String value) {
        this.otherCarrier = value;
    }

    /**
     * 获取carrier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getCarrier() {
        return carrier;
    }

    /**
     * 设置carrier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setCarrier(CarrierType value) {
        this.carrier = value;
    }

}
