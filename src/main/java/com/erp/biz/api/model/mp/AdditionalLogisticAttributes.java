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
 * If there is other information that is not in the Spec, you can create one using a name-value pair. 
 * 
 * <p>AdditionalLogisticAttributes complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AdditionalLogisticAttributes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalLogisticsAttribute" type="{http://walmart.com/}additionalLogisticsAttribute" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalLogisticAttributes", propOrder = {
    "additionalLogisticsAttribute"
})
public class AdditionalLogisticAttributes {

    @XmlElement(required = true)
    protected List<AdditionalLogisticsAttribute> additionalLogisticsAttribute;

    /**
     * Gets the value of the additionalLogisticsAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalLogisticsAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalLogisticsAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalLogisticsAttribute }
     * 
     * 
     */
    public List<AdditionalLogisticsAttribute> getAdditionalLogisticsAttribute() {
        if (additionalLogisticsAttribute == null) {
            additionalLogisticsAttribute = new ArrayList<AdditionalLogisticsAttribute>();
        }
        return this.additionalLogisticsAttribute;
    }

}
