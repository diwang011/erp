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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  Start of Orderline info and
 * 				statuses Line status
 * 				will have Price, status and refund sections
 * 				Refund section will be
 * 				populated only if we have refund history
 * 			
 * 
 * <p>orderLineType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="orderLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="item" type="{http://walmart.com/mp/v3/orders}itemType"/&gt;
 *         &lt;element name="charges" type="{http://walmart.com/mp/v3/orders}chargesType"/&gt;
 *         &lt;element name="orderLineQuantity" type="{http://walmart.com/mp/v3/orders}quantityType"/&gt;
 *         &lt;element name="statusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="orderLineStatuses" type="{http://walmart.com/mp/v3/orders}orderLineStatusesType"/&gt;
 *         &lt;element name="refund" type="{http://walmart.com/mp/v3/orders}refundType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderLineType", propOrder = {
    "lineNumber",
    "item",
    "charges",
    "orderLineQuantity",
    "statusDate",
    "orderLineStatuses",
    "refund"
})
public class OrderLineType {

    @XmlElement(required = true)
    protected String lineNumber;
    @XmlElement(required = true)
    protected ItemType item;
    @XmlElement(required = true)
    protected ChargesType charges;
    @XmlElement(required = true)
    protected QuantityType orderLineQuantity;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusDate;
    @XmlElement(required = true)
    protected OrderLineStatusesType orderLineStatuses;
    protected RefundType refund;

    /**
     * 获取lineNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * 设置lineNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * 获取item属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * 设置item属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
    }

    /**
     * 获取charges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChargesType }
     *     
     */
    public ChargesType getCharges() {
        return charges;
    }

    /**
     * 设置charges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *     
     */
    public void setCharges(ChargesType value) {
        this.charges = value;
    }

    /**
     * 获取orderLineQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getOrderLineQuantity() {
        return orderLineQuantity;
    }

    /**
     * 设置orderLineQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setOrderLineQuantity(QuantityType value) {
        this.orderLineQuantity = value;
    }

    /**
     * 获取statusDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDate() {
        return statusDate;
    }

    /**
     * 设置statusDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDate(XMLGregorianCalendar value) {
        this.statusDate = value;
    }

    /**
     * 获取orderLineStatuses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OrderLineStatusesType }
     *     
     */
    public OrderLineStatusesType getOrderLineStatuses() {
        return orderLineStatuses;
    }

    /**
     * 设置orderLineStatuses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLineStatusesType }
     *     
     */
    public void setOrderLineStatuses(OrderLineStatusesType value) {
        this.orderLineStatuses = value;
    }

    /**
     * 获取refund属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RefundType }
     *     
     */
    public RefundType getRefund() {
        return refund;
    }

    /**
     * 设置refund属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RefundType }
     *     
     */
    public void setRefund(RefundType value) {
        this.refund = value;
    }

}
