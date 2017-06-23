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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			
 * 
 * <p>refundChargeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="refundChargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refundReason" type="{http://walmart.com/mp/v3/orders}reasonCodesType"/&gt;
 *         &lt;element name="charge" type="{http://walmart.com/mp/v3/orders}chargeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundChargeType", propOrder = {
    "refundReason",
    "charge"
})
public class RefundChargeType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ReasonCodesType refundReason;
    @XmlElement(required = true)
    protected ChargeType charge;

    /**
     * 获取refundReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ReasonCodesType }
     *     
     */
    public ReasonCodesType getRefundReason() {
        return refundReason;
    }

    /**
     * 设置refundReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonCodesType }
     *     
     */
    public void setRefundReason(ReasonCodesType value) {
        this.refundReason = value;
    }

    /**
     * 获取charge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChargeType }
     *     
     */
    public ChargeType getCharge() {
        return charge;
    }

    /**
     * 设置charge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType }
     *     
     */
    public void setCharge(ChargeType value) {
        this.charge = value;
    }

}
