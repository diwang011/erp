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
 * <p>nutrient complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="nutrient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="nutrientName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nutrientAmount"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nutrientPercentageDailyValue"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nutrientFootnote" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nutrient", propOrder = {

})
public class Nutrient {

    @XmlElement(required = true)
    protected String nutrientName;
    @XmlElement(required = true)
    protected String nutrientAmount;
    @XmlElement(required = true)
    protected String nutrientPercentageDailyValue;
    protected String nutrientFootnote;

    /**
     * 获取nutrientName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutrientName() {
        return nutrientName;
    }

    /**
     * 设置nutrientName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutrientName(String value) {
        this.nutrientName = value;
    }

    /**
     * 获取nutrientAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutrientAmount() {
        return nutrientAmount;
    }

    /**
     * 设置nutrientAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutrientAmount(String value) {
        this.nutrientAmount = value;
    }

    /**
     * 获取nutrientPercentageDailyValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutrientPercentageDailyValue() {
        return nutrientPercentageDailyValue;
    }

    /**
     * 设置nutrientPercentageDailyValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutrientPercentageDailyValue(String value) {
        this.nutrientPercentageDailyValue = value;
    }

    /**
     * 获取nutrientFootnote属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNutrientFootnote() {
        return nutrientFootnote;
    }

    /**
     * 设置nutrientFootnote属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNutrientFootnote(String value) {
        this.nutrientFootnote = value;
    }

}
