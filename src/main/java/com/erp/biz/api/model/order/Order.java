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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Order complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="purchaseOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerEmailId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="shippingInfo" type="{http://walmart.com/mp/v3/orders}shippingInfoType"/&gt;
 *         &lt;element name="orderLines" type="{http://walmart.com/mp/v3/orders}orderLinesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {
    "purchaseOrderId",
    "customerOrderId",
    "customerEmailId",
    "orderDate",
    "shippingInfo",
    "orderLines"
})
@XmlRootElement(name="order")
public class Order {

    @XmlElement(required = true)
    protected String purchaseOrderId;
    @XmlElement(required = true)
    protected String customerOrderId;
    @XmlElement(required = true)
    protected String customerEmailId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderDate;
    @XmlElement(required = true)
    protected ShippingInfoType shippingInfo;
    @XmlElement(required = true)
    protected OrderLinesType orderLines;

    /**
     * 获取purchaseOrderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderId() {
        return purchaseOrderId;
    }

    /**
     * 设置purchaseOrderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderId(String value) {
        this.purchaseOrderId = value;
    }

    /**
     * 获取customerOrderId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerOrderId() {
        return customerOrderId;
    }

    /**
     * 设置customerOrderId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerOrderId(String value) {
        this.customerOrderId = value;
    }

    /**
     * 获取customerEmailId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmailId() {
        return customerEmailId;
    }

    /**
     * 设置customerEmailId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmailId(String value) {
        this.customerEmailId = value;
    }

    /**
     * 获取orderDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderDate() {
        return orderDate;
    }

    /**
     * 设置orderDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderDate(XMLGregorianCalendar value) {
        this.orderDate = value;
    }

    /**
     * 获取shippingInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingInfoType }
     *     
     */
    public ShippingInfoType getShippingInfo() {
        return shippingInfo;
    }

    /**
     * 设置shippingInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingInfoType }
     *     
     */
    public void setShippingInfo(ShippingInfoType value) {
        this.shippingInfo = value;
    }

    /**
     * 获取orderLines属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrderLinesType }
     *     
     */
    public OrderLinesType getOrderLines() {
        return orderLines;
    }

    /**
     * 设置orderLines属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLinesType }
     *     
     */
    public void setOrderLines(OrderLinesType value) {
        this.orderLines = value;
    }

}
