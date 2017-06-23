//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 04:41:42 PM CST 
//


package com.erp.biz.api.model.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="purchaseOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderLines" type="{http://walmart.com/mp/v3/orders}refundLinesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "purchaseOrderId",
    "orderLines"
})
@XmlRootElement(name = "orderRefund")
public class OrderRefund {

    @XmlElement(required = true)
    protected String purchaseOrderId;
    @XmlElement(required = true)
    protected RefundLinesType orderLines;

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
     * 获取orderLines属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RefundLinesType }
     *     
     */
    public RefundLinesType getOrderLines() {
        return orderLines;
    }

    /**
     * 设置orderLines属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RefundLinesType }
     *     
     */
    public void setOrderLines(RefundLinesType value) {
        this.orderLines = value;
    }

}
