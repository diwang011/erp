//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.25 时间 02:10:59 PM CST 
//


package com.erp.biz.api.model.response;

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
 *         &lt;element name="meta" type="{http://walmart.com/}MetaInfo"/&gt;
 *         &lt;element name="elements" type="{http://walmart.com/}Elements" minOccurs="0"/&gt;
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
    "meta",
    "elements"
})
@XmlRootElement(name = "ItemStatusDetail")
public class ItemStatusDetail {

    @XmlElement(required = true)
    protected MetaInfo meta;
    protected Elements elements;

    /**
     * 获取meta属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MetaInfo }
     *     
     */
    public MetaInfo getMeta() {
        return meta;
    }

    /**
     * 设置meta属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MetaInfo }
     *     
     */
    public void setMeta(MetaInfo value) {
        this.meta = value;
    }

    /**
     * 获取elements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Elements }
     *     
     */
    public Elements getElements() {
        return elements;
    }

    /**
     * 设置elements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Elements }
     *     
     */
    public void setElements(Elements value) {
        this.elements = value;
    }

}
