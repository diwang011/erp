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
 * <p>ClothingCategory complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ClothingCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="Clothing" type="{http://walmart.com/}Clothing"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClothingCategory", propOrder = {
    "clothing"
})
public class ClothingCategory {

    @XmlElement(name = "Clothing")
    protected Clothing clothing;

    /**
     * 获取clothing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Clothing }
     *     
     */
    public Clothing getClothing() {
        return clothing;
    }

    /**
     * 设置clothing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Clothing }
     *     
     */
    public void setClothing(Clothing value) {
        this.clothing = value;
    }

}
