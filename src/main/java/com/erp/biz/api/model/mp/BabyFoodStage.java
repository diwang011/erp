//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.23 时间 11:38:50 AM CST 
//


package com.erp.biz.api.model.mp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Attribute designed to capture the generalized age grouping (commonly referred to as "stage") of a given baby food, as specified by manufacturer. Specific description of each stage varies with baby food producer. Example descriptions: Stage 1 -  Foods have a single ingredient and are pureed and generally contain about 2.5 oz  of fruits, veggies or meats. Stage 2 – Foods are strained instead of pureed and have a combination of fruits or veggies instead of single ingredients, contain larger portions. Stage 3 – Foods are mashed and have more texture than the pureed foods and may have bits and chunks of meats or veggies.
 * 
 * <p>BabyFoodStage complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BabyFoodStage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="babyFoodStageValue" maxOccurs="unbounded"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BabyFoodStage", propOrder = {
    "babyFoodStageValue"
})
public class BabyFoodStage {

    @XmlElement(required = true)
    protected List<String> babyFoodStageValue;

    /**
     * Gets the value of the babyFoodStageValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the babyFoodStageValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBabyFoodStageValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBabyFoodStageValue() {
        if (babyFoodStageValue == null) {
            babyFoodStageValue = new ArrayList<String>();
        }
        return this.babyFoodStageValue;
    }

}
