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
 * start of shipping
 * 
 * <p>shippingInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="shippingInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estimatedDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="estimatedShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="methodCode" type="{http://walmart.com/mp/v3/orders}shippingMethodCodeType"/&gt;
 *         &lt;element name="postalAddress" type="{http://walmart.com/mp/v3/orders}postalAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shippingInfoType", propOrder = {
    "phone",
    "estimatedDeliveryDate",
    "estimatedShipDate",
    "methodCode",
    "postalAddress"
})
public class ShippingInfoType {

    @XmlElement(required = true)
    protected String phone;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedDeliveryDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimatedShipDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ShippingMethodCodeType methodCode;
    @XmlElement(required = true)
    protected PostalAddressType postalAddress;

    /**
     * 获取phone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置phone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * 获取estimatedDeliveryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    /**
     * 设置estimatedDeliveryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedDeliveryDate(XMLGregorianCalendar value) {
        this.estimatedDeliveryDate = value;
    }

    /**
     * 获取estimatedShipDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedShipDate() {
        return estimatedShipDate;
    }

    /**
     * 设置estimatedShipDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedShipDate(XMLGregorianCalendar value) {
        this.estimatedShipDate = value;
    }

    /**
     * 获取methodCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShippingMethodCodeType }
     *     
     */
    public ShippingMethodCodeType getMethodCode() {
        return methodCode;
    }

    /**
     * 设置methodCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingMethodCodeType }
     *     
     */
    public void setMethodCode(ShippingMethodCodeType value) {
        this.methodCode = value;
    }

    /**
     * 获取postalAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressType }
     *     
     */
    public PostalAddressType getPostalAddress() {
        return postalAddress;
    }

    /**
     * 设置postalAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressType }
     *     
     */
    public void setPostalAddress(PostalAddressType value) {
        this.postalAddress = value;
    }

}
