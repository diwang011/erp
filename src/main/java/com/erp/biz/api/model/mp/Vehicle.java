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
 * <p>Vehicle complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Vehicle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="Tires" type="{http://walmart.com/}Tires"/&gt;
 *         &lt;element name="LandVehicles" type="{http://walmart.com/}LandVehicles"/&gt;
 *         &lt;element name="VehiclePartsAndAccessories" type="{http://walmart.com/}VehiclePartsAndAccessories"/&gt;
 *         &lt;element name="WheelsAndWheelComponents" type="{http://walmart.com/}WheelsAndWheelComponents"/&gt;
 *         &lt;element name="VehicleOther" type="{http://walmart.com/}VehicleOther"/&gt;
 *         &lt;element name="Watercraft" type="{http://walmart.com/}Watercraft"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle", propOrder = {
    "tires",
    "landVehicles",
    "vehiclePartsAndAccessories",
    "wheelsAndWheelComponents",
    "vehicleOther",
    "watercraft"
})
public class Vehicle {

    @XmlElement(name = "Tires")
    protected Tires tires;
    @XmlElement(name = "LandVehicles")
    protected LandVehicles landVehicles;
    @XmlElement(name = "VehiclePartsAndAccessories")
    protected VehiclePartsAndAccessories vehiclePartsAndAccessories;
    @XmlElement(name = "WheelsAndWheelComponents")
    protected WheelsAndWheelComponents wheelsAndWheelComponents;
    @XmlElement(name = "VehicleOther")
    protected VehicleOther vehicleOther;
    @XmlElement(name = "Watercraft")
    protected Watercraft watercraft;

    /**
     * 获取tires属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Tires }
     *     
     */
    public Tires getTires() {
        return tires;
    }

    /**
     * 设置tires属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Tires }
     *     
     */
    public void setTires(Tires value) {
        this.tires = value;
    }

    /**
     * 获取landVehicles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LandVehicles }
     *     
     */
    public LandVehicles getLandVehicles() {
        return landVehicles;
    }

    /**
     * 设置landVehicles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LandVehicles }
     *     
     */
    public void setLandVehicles(LandVehicles value) {
        this.landVehicles = value;
    }

    /**
     * 获取vehiclePartsAndAccessories属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehiclePartsAndAccessories }
     *     
     */
    public VehiclePartsAndAccessories getVehiclePartsAndAccessories() {
        return vehiclePartsAndAccessories;
    }

    /**
     * 设置vehiclePartsAndAccessories属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePartsAndAccessories }
     *     
     */
    public void setVehiclePartsAndAccessories(VehiclePartsAndAccessories value) {
        this.vehiclePartsAndAccessories = value;
    }

    /**
     * 获取wheelsAndWheelComponents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WheelsAndWheelComponents }
     *     
     */
    public WheelsAndWheelComponents getWheelsAndWheelComponents() {
        return wheelsAndWheelComponents;
    }

    /**
     * 设置wheelsAndWheelComponents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WheelsAndWheelComponents }
     *     
     */
    public void setWheelsAndWheelComponents(WheelsAndWheelComponents value) {
        this.wheelsAndWheelComponents = value;
    }

    /**
     * 获取vehicleOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleOther }
     *     
     */
    public VehicleOther getVehicleOther() {
        return vehicleOther;
    }

    /**
     * 设置vehicleOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleOther }
     *     
     */
    public void setVehicleOther(VehicleOther value) {
        this.vehicleOther = value;
    }

    /**
     * 获取watercraft属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Watercraft }
     *     
     */
    public Watercraft getWatercraft() {
        return watercraft;
    }

    /**
     * 设置watercraft属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Watercraft }
     *     
     */
    public void setWatercraft(Watercraft value) {
        this.watercraft = value;
    }

}
