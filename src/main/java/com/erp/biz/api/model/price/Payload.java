//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 04:28:11 PM CST 
//


package com.erp.biz.api.model.price;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>itemPriceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="itemPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemIdentifier" type="{http://walmart.com/}itemIdentifierType"/&gt;
 *         &lt;element name="pricingList" type="{http://walmart.com/}pricingListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payload", propOrder = {
    "itemIdentifier",
    "pricingList"
})
@XmlRootElement(name="payload")
public class Payload {
    
    @XmlElement(required = true)
    protected ItemIdentifierType itemIdentifier;
    @XmlElement(required = true)
    protected PricingListType pricingList;

    /**
     * 获取itemIdentifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemIdentifierType }
     *     
     */
    public ItemIdentifierType getItemIdentifier() {
        return itemIdentifier;
    }

    /**
     * 设置itemIdentifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIdentifierType }
     *     
     */
    public void setItemIdentifier(ItemIdentifierType value) {
        this.itemIdentifier = value;
    }

    /**
     * 获取pricingList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PricingListType }
     *     
     */
    public PricingListType getPricingList() {
        return pricingList;
    }

    /**
     * 设置pricingList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PricingListType }
     *     
     */
    public void setPricingList(PricingListType value) {
        this.pricingList = value;
    }

}
