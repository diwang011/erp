//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 04:28:11 PM CST 
//


package com.erp.biz.api.model.price;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="PriceHeader" type="{http://walmart.com/}feedHeaderType"/&gt;
 *         &lt;element name="Price" type="{http://walmart.com/}itemPriceType" maxOccurs="5000"/&gt;
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
    "priceHeader",
    "price"
})
@XmlRootElement(name = "PriceFeed")
public class PriceFeed {

    @XmlElement(name = "PriceHeader", required = true)
    protected FeedHeaderType priceHeader;
    @XmlElement(name = "Price", required = true)
    protected List<ItemPriceType> price;

    /**
     * 获取priceHeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FeedHeaderType }
     *     
     */
    public FeedHeaderType getPriceHeader() {
        return priceHeader;
    }

    /**
     * 设置priceHeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FeedHeaderType }
     *     
     */
    public void setPriceHeader(FeedHeaderType value) {
        this.priceHeader = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the price property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPriceType }
     * 
     * 
     */
    public List<ItemPriceType> getPrice() {
        if (price == null) {
            price = new ArrayList<ItemPriceType>();
        }
        return this.price;
    }

}
