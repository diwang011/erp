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
 * <p>CarriersAndAccessoriesCategory complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CarriersAndAccessoriesCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="CasesAndBags" type="{http://walmart.com/}CasesAndBags"/&gt;
 *         &lt;element name="CarriersAndAccessories" type="{http://walmart.com/}CarriersAndAccessories"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarriersAndAccessoriesCategory", propOrder = {
    "casesAndBags",
    "carriersAndAccessories"
})
public class CarriersAndAccessoriesCategory {

    @XmlElement(name = "CasesAndBags")
    protected CasesAndBags casesAndBags;
    @XmlElement(name = "CarriersAndAccessories")
    protected CarriersAndAccessories carriersAndAccessories;

    /**
     * 获取casesAndBags属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CasesAndBags }
     *     
     */
    public CasesAndBags getCasesAndBags() {
        return casesAndBags;
    }

    /**
     * 设置casesAndBags属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CasesAndBags }
     *     
     */
    public void setCasesAndBags(CasesAndBags value) {
        this.casesAndBags = value;
    }

    /**
     * 获取carriersAndAccessories属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CarriersAndAccessories }
     *     
     */
    public CarriersAndAccessories getCarriersAndAccessories() {
        return carriersAndAccessories;
    }

    /**
     * 设置carriersAndAccessories属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CarriersAndAccessories }
     *     
     */
    public void setCarriersAndAccessories(CarriersAndAccessories value) {
        this.carriersAndAccessories = value;
    }

}
