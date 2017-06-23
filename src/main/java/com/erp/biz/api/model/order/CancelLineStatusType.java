//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 04:39:16 PM CST 
//


package com.erp.biz.api.model.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>cancelLineStatusType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="cancelLineStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://walmart.com/mp/v3/orders}orderLineStatusValueType"/&gt;
 *         &lt;element name="cancellationReason" type="{http://walmart.com/mp/v3/orders}cancellationReasonType"/&gt;
 *         &lt;element name="statusQuantity" type="{http://walmart.com/mp/v3/orders}quantityType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelLineStatusType", propOrder = {
    "status",
    "cancellationReason",
    "statusQuantity"
})
public class CancelLineStatusType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OrderLineStatusValueType status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CancellationReasonType cancellationReason;
    @XmlElement(required = true)
    protected QuantityType statusQuantity;

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrderLineStatusValueType }
     *     
     */
    public OrderLineStatusValueType getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLineStatusValueType }
     *     
     */
    public void setStatus(OrderLineStatusValueType value) {
        this.status = value;
    }

    /**
     * 获取cancellationReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancellationReasonType }
     *     
     */
    public CancellationReasonType getCancellationReason() {
        return cancellationReason;
    }

    /**
     * 设置cancellationReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReasonType }
     *     
     */
    public void setCancellationReason(CancellationReasonType value) {
        this.cancellationReason = value;
    }

    /**
     * 获取statusQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getStatusQuantity() {
        return statusQuantity;
    }

    /**
     * 设置statusQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setStatusQuantity(QuantityType value) {
        this.statusQuantity = value;
    }

}
