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
import javax.xml.bind.annotation.XmlType;


/**
 *  Start of Orderline info and
 * 				statuses Line status
 * 				will have Price, status and refund sections
 * 				Refund section will be
 * 				populated only if we have refund history
 * 			
 * 
 * <p>refundLineType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="refundLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="refunds" type="{http://walmart.com/mp/v3/orders}refundsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "refundLineType", propOrder = {
    "lineNumber",
    "refunds"
})
public class RefundLineType {

    @XmlElement(required = true)
    protected String lineNumber;
    @XmlElement(required = true)
    protected RefundsType refunds;

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
     * 获取refunds属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RefundsType }
     *     
     */
    public RefundsType getRefunds() {
        return refunds;
    }

    /**
     * 设置refunds属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RefundsType }
     *     
     */
    public void setRefunds(RefundsType value) {
        this.refunds = value;
    }

}
