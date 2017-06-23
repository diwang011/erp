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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PartnerItemIngestionStatus complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PartnerItemIngestionStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="martId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="sku" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="wpid" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ingestionStatus" type="{http://walmart.com/}ItemStatus"/&gt;
 *         &lt;element name="ingestionErrors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ingestionError" type="{http://walmart.com/}IngestionError" maxOccurs="1000" minOccurs="0"/&gt;
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
@XmlType(name = "PartnerItemIngestionStatus", propOrder = {
    "martId",
    "sku",
    "wpid",
    "index",
    "ingestionStatus",
    "ingestionErrors"
})
public class PartnerItemIngestionStatus {

    protected Integer martId;
    protected String sku;
    protected String wpid;
    protected Integer index;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ItemStatus ingestionStatus;
    protected PartnerItemIngestionStatus.IngestionErrors ingestionErrors;

    /**
     * 获取martId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMartId() {
        return martId;
    }

    /**
     * 设置martId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMartId(Integer value) {
        this.martId = value;
    }

    /**
     * 获取sku属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * 设置sku属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSku(String value) {
        this.sku = value;
    }

    /**
     * 获取wpid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWpid() {
        return wpid;
    }

    /**
     * 设置wpid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWpid(String value) {
        this.wpid = value;
    }

    /**
     * 获取index属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * 设置index属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIndex(Integer value) {
        this.index = value;
    }

    /**
     * 获取ingestionStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemStatus }
     *     
     */
    public ItemStatus getIngestionStatus() {
        return ingestionStatus;
    }

    /**
     * 设置ingestionStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemStatus }
     *     
     */
    public void setIngestionStatus(ItemStatus value) {
        this.ingestionStatus = value;
    }

    /**
     * 获取ingestionErrors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartnerItemIngestionStatus.IngestionErrors }
     *     
     */
    public PartnerItemIngestionStatus.IngestionErrors getIngestionErrors() {
        return ingestionErrors;
    }

    /**
     * 设置ingestionErrors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerItemIngestionStatus.IngestionErrors }
     *     
     */
    public void setIngestionErrors(PartnerItemIngestionStatus.IngestionErrors value) {
        this.ingestionErrors = value;
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
     *         &lt;element name="ingestionError" type="{http://walmart.com/}IngestionError" maxOccurs="1000" minOccurs="0"/&gt;
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
        "ingestionError"
    })
    public static class IngestionErrors {

        protected List<IngestionError> ingestionError;

        /**
         * Gets the value of the ingestionError property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ingestionError property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIngestionError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IngestionError }
         * 
         * 
         */
        public List<IngestionError> getIngestionError() {
            if (ingestionError == null) {
                ingestionError = new ArrayList<IngestionError>();
            }
            return this.ingestionError;
        }

    }

}
