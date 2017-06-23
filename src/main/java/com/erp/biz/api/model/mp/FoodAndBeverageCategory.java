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
 * <p>FoodAndBeverageCategory complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FoodAndBeverageCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="AlcoholicBeverages" type="{http://walmart.com/}AlcoholicBeverages"/&gt;
 *         &lt;element name="FoodAndBeverage" type="{http://walmart.com/}FoodAndBeverage"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodAndBeverageCategory", propOrder = {
    "alcoholicBeverages",
    "foodAndBeverage"
})
public class FoodAndBeverageCategory {

    @XmlElement(name = "AlcoholicBeverages")
    protected AlcoholicBeverages alcoholicBeverages;
    @XmlElement(name = "FoodAndBeverage")
    protected FoodAndBeverage foodAndBeverage;

    /**
     * 获取alcoholicBeverages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AlcoholicBeverages }
     *     
     */
    public AlcoholicBeverages getAlcoholicBeverages() {
        return alcoholicBeverages;
    }

    /**
     * 设置alcoholicBeverages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AlcoholicBeverages }
     *     
     */
    public void setAlcoholicBeverages(AlcoholicBeverages value) {
        this.alcoholicBeverages = value;
    }

    /**
     * 获取foodAndBeverage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FoodAndBeverage }
     *     
     */
    public FoodAndBeverage getFoodAndBeverage() {
        return foodAndBeverage;
    }

    /**
     * 设置foodAndBeverage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FoodAndBeverage }
     *     
     */
    public void setFoodAndBeverage(FoodAndBeverage value) {
        this.foodAndBeverage = value;
    }

}
