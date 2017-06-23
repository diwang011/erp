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
 * <p>Home complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Home"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="Bedding" type="{http://walmart.com/}Bedding"/&gt;
 *         &lt;element name="LargeAppliances" type="{http://walmart.com/}LargeAppliances"/&gt;
 *         &lt;element name="HomeOther" type="{http://walmart.com/}HomeOther"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Home", propOrder = {
    "bedding",
    "largeAppliances",
    "homeOther"
})
public class Home {

    @XmlElement(name = "Bedding")
    protected Bedding bedding;
    @XmlElement(name = "LargeAppliances")
    protected LargeAppliances largeAppliances;
    @XmlElement(name = "HomeOther")
    protected HomeOther homeOther;

    /**
     * 获取bedding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Bedding }
     *     
     */
    public Bedding getBedding() {
        return bedding;
    }

    /**
     * 设置bedding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Bedding }
     *     
     */
    public void setBedding(Bedding value) {
        this.bedding = value;
    }

    /**
     * 获取largeAppliances属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LargeAppliances }
     *     
     */
    public LargeAppliances getLargeAppliances() {
        return largeAppliances;
    }

    /**
     * 设置largeAppliances属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LargeAppliances }
     *     
     */
    public void setLargeAppliances(LargeAppliances value) {
        this.largeAppliances = value;
    }

    /**
     * 获取homeOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HomeOther }
     *     
     */
    public HomeOther getHomeOther() {
        return homeOther;
    }

    /**
     * 设置homeOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HomeOther }
     *     
     */
    public void setHomeOther(HomeOther value) {
        this.homeOther = value;
    }

}
