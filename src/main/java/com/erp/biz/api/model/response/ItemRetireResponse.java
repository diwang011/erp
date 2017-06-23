//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.23 时间 11:49:10 AM CST 
//


package com.erp.biz.api.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemRetireResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemRetireResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://walmart.com/}gatewayBaseEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalAttributes" type="{http://walmart.com/}NameValueAttributes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemRetireResponse", propOrder = {
    "sku",
    "message",
    "additionalAttributes"
})
@XmlRootElement(name="ItemRetireResponse")
public class ItemRetireResponse
    extends GatewayBaseEntity
{

    @XmlElement(required = true)
    protected String sku;
    protected String message;
    protected NameValueAttributes additionalAttributes;

    /**
     * 获取sku属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * 设置sku属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * 获取message属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置message属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * 获取additionalAttributes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameValueAttributes }
     *     
     */
    public NameValueAttributes getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * 设置additionalAttributes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueAttributes }
     *     
     */
    public void setAdditionalAttributes(NameValueAttributes value) {
        this.additionalAttributes = value;
    }

}
