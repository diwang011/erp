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
 * <p>ToolsAndHardware complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ToolsAndHardware"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="BuildingSupply" type="{http://walmart.com/}BuildingSupply"/&gt;
 *         &lt;element name="Electrical" type="{http://walmart.com/}Electrical"/&gt;
 *         &lt;element name="Hardware" type="{http://walmart.com/}Hardware"/&gt;
 *         &lt;element name="PlumbingAndHVAC" type="{http://walmart.com/}PlumbingAndHVAC"/&gt;
 *         &lt;element name="Tools" type="{http://walmart.com/}Tools"/&gt;
 *         &lt;element name="ToolsAndHardwareOther" type="{http://walmart.com/}ToolsAndHardwareOther"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToolsAndHardware", propOrder = {
    "buildingSupply",
    "electrical",
    "hardware",
    "plumbingAndHVAC",
    "tools",
    "toolsAndHardwareOther"
})
public class ToolsAndHardware {

    @XmlElement(name = "BuildingSupply")
    protected BuildingSupply buildingSupply;
    @XmlElement(name = "Electrical")
    protected Electrical electrical;
    @XmlElement(name = "Hardware")
    protected Hardware hardware;
    @XmlElement(name = "PlumbingAndHVAC")
    protected PlumbingAndHVAC plumbingAndHVAC;
    @XmlElement(name = "Tools")
    protected Tools tools;
    @XmlElement(name = "ToolsAndHardwareOther")
    protected ToolsAndHardwareOther toolsAndHardwareOther;

    /**
     * 获取buildingSupply属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BuildingSupply }
     *     
     */
    public BuildingSupply getBuildingSupply() {
        return buildingSupply;
    }

    /**
     * 设置buildingSupply属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BuildingSupply }
     *     
     */
    public void setBuildingSupply(BuildingSupply value) {
        this.buildingSupply = value;
    }

    /**
     * 获取electrical属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Electrical }
     *     
     */
    public Electrical getElectrical() {
        return electrical;
    }

    /**
     * 设置electrical属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Electrical }
     *     
     */
    public void setElectrical(Electrical value) {
        this.electrical = value;
    }

    /**
     * 获取hardware属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Hardware }
     *     
     */
    public Hardware getHardware() {
        return hardware;
    }

    /**
     * 设置hardware属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Hardware }
     *     
     */
    public void setHardware(Hardware value) {
        this.hardware = value;
    }

    /**
     * 获取plumbingAndHVAC属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PlumbingAndHVAC }
     *     
     */
    public PlumbingAndHVAC getPlumbingAndHVAC() {
        return plumbingAndHVAC;
    }

    /**
     * 设置plumbingAndHVAC属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PlumbingAndHVAC }
     *     
     */
    public void setPlumbingAndHVAC(PlumbingAndHVAC value) {
        this.plumbingAndHVAC = value;
    }

    /**
     * 获取tools属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Tools }
     *     
     */
    public Tools getTools() {
        return tools;
    }

    /**
     * 设置tools属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Tools }
     *     
     */
    public void setTools(Tools value) {
        this.tools = value;
    }

    /**
     * 获取toolsAndHardwareOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ToolsAndHardwareOther }
     *     
     */
    public ToolsAndHardwareOther getToolsAndHardwareOther() {
        return toolsAndHardwareOther;
    }

    /**
     * 设置toolsAndHardwareOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ToolsAndHardwareOther }
     *     
     */
    public void setToolsAndHardwareOther(ToolsAndHardwareOther value) {
        this.toolsAndHardwareOther = value;
    }

}
