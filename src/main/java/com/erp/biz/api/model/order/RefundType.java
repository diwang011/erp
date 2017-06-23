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
 * <p>refundType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="refundType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="refundId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refundComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refundCharges" type="{http://walmart.com/mp/v3/orders}refundChargesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundType", propOrder = {
    "refundId",
    "refundComments",
    "refundCharges"
})
public class RefundType {

    protected String refundId;
    protected String refundComments;
    @XmlElement(required = true)
    protected RefundChargesType refundCharges;

    /**
     * 获取refundId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundId() {
        return refundId;
    }

    /**
     * 设置refundId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundId(String value) {
        this.refundId = value;
    }

    /**
     * 获取refundComments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundComments() {
        return refundComments;
    }

    /**
     * 设置refundComments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundComments(String value) {
        this.refundComments = value;
    }

    /**
     * 获取refundCharges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RefundChargesType }
     *     
     */
    public RefundChargesType getRefundCharges() {
        return refundCharges;
    }

    /**
     * 设置refundCharges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RefundChargesType }
     *     
     */
    public void setRefundCharges(RefundChargesType value) {
        this.refundCharges = value;
    }

}
