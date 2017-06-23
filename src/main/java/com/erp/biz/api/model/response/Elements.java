//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.25 时间 02:10:59 PM CST 
//


package com.erp.biz.api.model.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Elements complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Elements"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="itemIngestionStatus" type="{http://walmart.com/}PartnerItemIngestionStatus" maxOccurs="1000" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "Elements", propOrder = {
    "itemDetails"
})
public class Elements {

    protected Elements.ItemDetails itemDetails;

    /**
     * 获取itemDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Elements.ItemDetails }
     *     
     */
    public Elements.ItemDetails getItemDetails() {
        return itemDetails;
    }

    /**
     * 设置itemDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Elements.ItemDetails }
     *     
     */
    public void setItemDetails(Elements.ItemDetails value) {
        this.itemDetails = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="itemIngestionStatus" type="{http://walmart.com/}PartnerItemIngestionStatus" maxOccurs="1000" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itemIngestionStatus"
    })
    public static class ItemDetails {

        protected List<PartnerItemIngestionStatus> itemIngestionStatus;

        /**
         * Gets the value of the itemIngestionStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemIngestionStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemIngestionStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PartnerItemIngestionStatus }
         * 
         * 
         */
        public List<PartnerItemIngestionStatus> getItemIngestionStatus() {
            if (itemIngestionStatus == null) {
                itemIngestionStatus = new ArrayList<PartnerItemIngestionStatus>();
            }
            return this.itemIngestionStatus;
        }

    }

}
