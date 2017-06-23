//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.23 时间 11:48:50 AM CST 
//


package com.erp.biz.api.model.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ItemResponses complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemResponses"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemResponse" type="{http://walmart.com/}ItemResponse" maxOccurs="5000"/&gt;
 *         &lt;element name="additionalAttributes" type="{http://walmart.com/}NameValueAttributes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemResponses", propOrder = {
    "itemResponse",
    "additionalAttributes"
})
@XmlRootElement(name="ItemResponses")
public class ItemResponses {

    @XmlElement(name = "ItemResponse", required = true)
    protected List<ItemResponse> itemResponse;
    protected NameValueAttributes additionalAttributes;

    /**
     * Gets the value of the itemResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemResponse }
     * 
     * 
     */
    public List<ItemResponse> getItemResponse() {
        if (itemResponse == null) {
            itemResponse = new ArrayList<ItemResponse>();
        }
        return this.itemResponse;
    }

    /**
     * 获取additionalAttributes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link NameValueAttributes }
     *     
     */
    public NameValueAttributes getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * 设置additionalAttributes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueAttributes }
     *     
     */
    public void setAdditionalAttributes(NameValueAttributes value) {
        this.additionalAttributes = value;
    }

}
