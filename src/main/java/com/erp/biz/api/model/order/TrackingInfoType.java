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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>trackingInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="trackingInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shipDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="carrierName" type="{http://walmart.com/mp/v3/orders}carrierNameType"/&gt;
 *         &lt;element name="methodCode" type="{http://walmart.com/mp/v3/orders}shippingMethodCodeType"/&gt;
 *         &lt;element name="trackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="trackingURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trackingInfoType", propOrder = {
    "shipDateTime",
    "carrierName",
    "methodCode",
    "trackingNumber",
    "trackingURL"
})
public class TrackingInfoType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipDateTime;
    @XmlElement(required = true)
    protected CarrierNameType carrierName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ShippingMethodCodeType methodCode;
    @XmlElement(required = true)
    protected String trackingNumber;
    protected String trackingURL;

    /**
     * 获取shipDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDateTime() {
        return shipDateTime;
    }

    /**
     * 设置shipDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDateTime(XMLGregorianCalendar value) {
        this.shipDateTime = value;
    }

    /**
     * 获取carrierName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CarrierNameType }
     *     
     */
    public CarrierNameType getCarrierName() {
        return carrierName;
    }

    /**
     * 设置carrierName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierNameType }
     *     
     */
    public void setCarrierName(CarrierNameType value) {
        this.carrierName = value;
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
     * 获取trackingNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * 设置trackingNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * 获取trackingURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingURL() {
        return trackingURL;
    }

    /**
     * 设置trackingURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingURL(String value) {
        this.trackingURL = value;
    }

}
