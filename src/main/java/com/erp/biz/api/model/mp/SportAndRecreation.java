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
 * <p>SportAndRecreation complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SportAndRecreation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="Cycling" type="{http://walmart.com/}Cycling"/&gt;
 *         &lt;element name="Weapons" type="{http://walmart.com/}Weapons"/&gt;
 *         &lt;element name="Optics" type="{http://walmart.com/}Optics"/&gt;
 *         &lt;element name="SportAndRecreationOther" type="{http://walmart.com/}SportAndRecreationOther"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SportAndRecreation", propOrder = {
    "cycling",
    "weapons",
    "optics",
    "sportAndRecreationOther"
})
public class SportAndRecreation {

    @XmlElement(name = "Cycling")
    protected Cycling cycling;
    @XmlElement(name = "Weapons")
    protected Weapons weapons;
    @XmlElement(name = "Optics")
    protected Optics optics;
    @XmlElement(name = "SportAndRecreationOther")
    protected SportAndRecreationOther sportAndRecreationOther;

    /**
     * 获取cycling属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Cycling }
     *     
     */
    public Cycling getCycling() {
        return cycling;
    }

    /**
     * 设置cycling属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Cycling }
     *     
     */
    public void setCycling(Cycling value) {
        this.cycling = value;
    }

    /**
     * 获取weapons属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Weapons }
     *     
     */
    public Weapons getWeapons() {
        return weapons;
    }

    /**
     * 设置weapons属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Weapons }
     *     
     */
    public void setWeapons(Weapons value) {
        this.weapons = value;
    }

    /**
     * 获取optics属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Optics }
     *     
     */
    public Optics getOptics() {
        return optics;
    }

    /**
     * 设置optics属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Optics }
     *     
     */
    public void setOptics(Optics value) {
        this.optics = value;
    }

    /**
     * 获取sportAndRecreationOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SportAndRecreationOther }
     *     
     */
    public SportAndRecreationOther getSportAndRecreationOther() {
        return sportAndRecreationOther;
    }

    /**
     * 设置sportAndRecreationOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SportAndRecreationOther }
     *     
     */
    public void setSportAndRecreationOther(SportAndRecreationOther value) {
        this.sportAndRecreationOther = value;
    }

}
