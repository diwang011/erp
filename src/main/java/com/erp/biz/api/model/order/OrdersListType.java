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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ordersListType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ordersListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="meta" type="{http://walmart.com/mp/v3/orders}metaType"/&gt;
 *         &lt;element name="elements" type="{http://walmart.com/mp/v3/orders}elementsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ordersListType", propOrder = {
    "meta",
    "elements"
})
@XmlRootElement(name="list")
public class OrdersListType {

    @XmlElement(required = true)
    protected MetaType meta;
    @XmlElement(required = true)
    protected ElementsType elements;

    /**
     * 获取meta属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MetaType }
     *     
     */
    public MetaType getMeta() {
        return meta;
    }

    /**
     * 设置meta属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MetaType }
     *     
     */
    public void setMeta(MetaType value) {
        this.meta = value;
    }

    /**
     * 获取elements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ElementsType }
     *     
     */
    public ElementsType getElements() {
        return elements;
    }

    /**
     * 设置elements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ElementsType }
     *     
     */
    public void setElements(ElementsType value) {
        this.elements = value;
    }

}
