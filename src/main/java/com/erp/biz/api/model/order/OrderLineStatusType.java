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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>orderLineStatusType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="orderLineStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://walmart.com/mp/v3/orders}orderLineStatusValueType"/&gt;
 *         &lt;element name="statusQuantity" type="{http://walmart.com/mp/v3/orders}quantityType"/&gt;
 *         &lt;element name="cancellationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trackingInfo" type="{http://walmart.com/mp/v3/orders}trackingInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderLineStatusType", propOrder = {
    "status",
    "statusQuantity",
    "cancellationReason",
    "trackingInfo"
})
public class OrderLineStatusType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OrderLineStatusValueType status;
    @XmlElement(required = true)
    protected QuantityType statusQuantity;
    protected String cancellationReason;
    protected TrackingInfoType trackingInfo;

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

    /**
     * 获取cancellationReason属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationReason() {
        return cancellationReason;
    }

    /**
     * 设置cancellationReason属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationReason(String value) {
        this.cancellationReason = value;
    }

    /**
     * 获取trackingInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TrackingInfoType }
     *     
     */
    public TrackingInfoType getTrackingInfo() {
        return trackingInfo;
    }

    /**
     * 设置trackingInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingInfoType }
     *     
     */
    public void setTrackingInfo(TrackingInfoType value) {
        this.trackingInfo = value;
    }

}
