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
 * <p>GardenAndPatioCategory complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GardenAndPatioCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="GrillsAndOutdoorCooking" type="{http://walmart.com/}GrillsAndOutdoorCooking"/&gt;
 *         &lt;element name="GardenAndPatio" type="{http://walmart.com/}GardenAndPatio"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GardenAndPatioCategory", propOrder = {
    "grillsAndOutdoorCooking",
    "gardenAndPatio"
})
public class GardenAndPatioCategory {

    @XmlElement(name = "GrillsAndOutdoorCooking")
    protected GrillsAndOutdoorCooking grillsAndOutdoorCooking;
    @XmlElement(name = "GardenAndPatio")
    protected GardenAndPatio gardenAndPatio;

    /**
     * 获取grillsAndOutdoorCooking属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GrillsAndOutdoorCooking }
     *     
     */
    public GrillsAndOutdoorCooking getGrillsAndOutdoorCooking() {
        return grillsAndOutdoorCooking;
    }

    /**
     * 设置grillsAndOutdoorCooking属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GrillsAndOutdoorCooking }
     *     
     */
    public void setGrillsAndOutdoorCooking(GrillsAndOutdoorCooking value) {
        this.grillsAndOutdoorCooking = value;
    }

    /**
     * 获取gardenAndPatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GardenAndPatio }
     *     
     */
    public GardenAndPatio getGardenAndPatio() {
        return gardenAndPatio;
    }

    /**
     * 设置gardenAndPatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GardenAndPatio }
     *     
     */
    public void setGardenAndPatio(GardenAndPatio value) {
        this.gardenAndPatio = value;
    }

}
