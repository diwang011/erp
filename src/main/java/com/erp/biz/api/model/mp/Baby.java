//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.23 时间 11:38:50 AM CST 
//


package com.erp.biz.api.model.mp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Baby complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Baby"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="BabyFood" type="{http://walmart.com/}BabyFood"/&gt;
 *         &lt;element name="BabyOther" type="{http://walmart.com/}BabyOther"/&gt;
 *         &lt;element name="ChildCarSeats" type="{http://walmart.com/}ChildCarSeats"/&gt;
 *         &lt;element name="BabyFurniture" type="{http://walmart.com/}BabyFurniture"/&gt;
 *         &lt;element name="BabyToys" type="{http://walmart.com/}BabyToys"/&gt;
 *         &lt;element name="BabyClothing" type="{http://walmart.com/}BabyClothing"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Baby", propOrder = {
    "babyFood",
    "babyOther",
    "childCarSeats",
    "babyFurniture",
    "babyToys",
    "babyClothing"
})
public class Baby {

    @XmlElement(name = "BabyFood")
    protected BabyFood babyFood;
    @XmlElement(name = "BabyOther")
    protected BabyOther babyOther;
    @XmlElement(name = "ChildCarSeats")
    protected ChildCarSeats childCarSeats;
    @XmlElement(name = "BabyFurniture")
    protected BabyFurniture babyFurniture;
    @XmlElement(name = "BabyToys")
    protected BabyToys babyToys;
    @XmlElement(name = "BabyClothing")
    protected BabyClothing babyClothing;

    /**
     * 获取babyFood属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BabyFood }
     *     
     */
    public BabyFood getBabyFood() {
        return babyFood;
    }

    /**
     * 设置babyFood属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BabyFood }
     *     
     */
    public void setBabyFood(BabyFood value) {
        this.babyFood = value;
    }

    /**
     * 获取babyOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BabyOther }
     *     
     */
    public BabyOther getBabyOther() {
        return babyOther;
    }

    /**
     * 设置babyOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BabyOther }
     *     
     */
    public void setBabyOther(BabyOther value) {
        this.babyOther = value;
    }

    /**
     * 获取childCarSeats属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChildCarSeats }
     *     
     */
    public ChildCarSeats getChildCarSeats() {
        return childCarSeats;
    }

    /**
     * 设置childCarSeats属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChildCarSeats }
     *     
     */
    public void setChildCarSeats(ChildCarSeats value) {
        this.childCarSeats = value;
    }

    /**
     * 获取babyFurniture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BabyFurniture }
     *     
     */
    public BabyFurniture getBabyFurniture() {
        return babyFurniture;
    }

    /**
     * 设置babyFurniture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BabyFurniture }
     *     
     */
    public void setBabyFurniture(BabyFurniture value) {
        this.babyFurniture = value;
    }

    /**
     * 获取babyToys属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BabyToys }
     *     
     */
    public BabyToys getBabyToys() {
        return babyToys;
    }

    /**
     * 设置babyToys属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BabyToys }
     *     
     */
    public void setBabyToys(BabyToys value) {
        this.babyToys = value;
    }

    /**
     * 获取babyClothing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BabyClothing }
     *     
     */
    public BabyClothing getBabyClothing() {
        return babyClothing;
    }

    /**
     * 设置babyClothing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BabyClothing }
     *     
     */
    public void setBabyClothing(BabyClothing value) {
        this.babyClothing = value;
    }

}
