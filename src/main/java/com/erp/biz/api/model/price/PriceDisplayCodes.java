//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 04:28:11 PM CST 
//


package com.erp.biz.api.model.price;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>priceDisplayCodes complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="priceDisplayCodes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="submapType" type="{http://walmart.com/}submapType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priceDisplayCodes")
public class PriceDisplayCodes {

    @XmlAttribute(name = "submapType")
    protected SubmapType submapType;

    /**
     * 获取submapType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SubmapType }
     *     
     */
    public SubmapType getSubmapType() {
        return submapType;
    }

    /**
     * 设置submapType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SubmapType }
     *     
     */
    public void setSubmapType(SubmapType value) {
        this.submapType = value;
    }

}
