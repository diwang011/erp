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
 * <p>Animal complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Animal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="AnimalHealthAndGrooming" type="{http://walmart.com/}AnimalHealthAndGrooming"/&gt;
 *         &lt;element name="AnimalAccessories" type="{http://walmart.com/}AnimalAccessories"/&gt;
 *         &lt;element name="AnimalFood" type="{http://walmart.com/}AnimalFood"/&gt;
 *         &lt;element name="AnimalEverythingElse" type="{http://walmart.com/}AnimalEverythingElse"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Animal", propOrder = {
    "animalHealthAndGrooming",
    "animalAccessories",
    "animalFood",
    "animalEverythingElse"
})
public class Animal {

    @XmlElement(name = "AnimalHealthAndGrooming")
    protected AnimalHealthAndGrooming animalHealthAndGrooming;
    @XmlElement(name = "AnimalAccessories")
    protected AnimalAccessories animalAccessories;
    @XmlElement(name = "AnimalFood")
    protected AnimalFood animalFood;
    @XmlElement(name = "AnimalEverythingElse")
    protected AnimalEverythingElse animalEverythingElse;

    /**
     * 获取animalHealthAndGrooming属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnimalHealthAndGrooming }
     *     
     */
    public AnimalHealthAndGrooming getAnimalHealthAndGrooming() {
        return animalHealthAndGrooming;
    }

    /**
     * 设置animalHealthAndGrooming属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalHealthAndGrooming }
     *     
     */
    public void setAnimalHealthAndGrooming(AnimalHealthAndGrooming value) {
        this.animalHealthAndGrooming = value;
    }

    /**
     * 获取animalAccessories属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnimalAccessories }
     *     
     */
    public AnimalAccessories getAnimalAccessories() {
        return animalAccessories;
    }

    /**
     * 设置animalAccessories属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalAccessories }
     *     
     */
    public void setAnimalAccessories(AnimalAccessories value) {
        this.animalAccessories = value;
    }

    /**
     * 获取animalFood属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnimalFood }
     *     
     */
    public AnimalFood getAnimalFood() {
        return animalFood;
    }

    /**
     * 设置animalFood属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalFood }
     *     
     */
    public void setAnimalFood(AnimalFood value) {
        this.animalFood = value;
    }

    /**
     * 获取animalEverythingElse属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnimalEverythingElse }
     *     
     */
    public AnimalEverythingElse getAnimalEverythingElse() {
        return animalEverythingElse;
    }

    /**
     * 设置animalEverythingElse属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalEverythingElse }
     *     
     */
    public void setAnimalEverythingElse(AnimalEverythingElse value) {
        this.animalEverythingElse = value;
    }

}
