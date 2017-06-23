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
 * <p>MetaInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MetaInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feedId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="feedStatus" type="{http://walmart.com/}FeedStatus"/&gt;
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
 *         &lt;element name="itemsReceived" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="itemsSucceeded" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="itemsFailed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="itemsProcessing" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nextCursor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaInfo", propOrder = {
    "feedId",
    "feedStatus",
    "ingestionErrors",
    "itemsReceived",
    "itemsSucceeded",
    "itemsFailed",
    "itemsProcessing",
    "limit",
    "totalCount",
    "nextCursor"
})
public class MetaInfo {

    @XmlElement(required = true)
    protected String feedId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FeedStatus feedStatus;
    protected MetaInfo.IngestionErrors ingestionErrors;
    protected Integer itemsReceived;
    protected Integer itemsSucceeded;
    protected Integer itemsFailed;
    protected Integer itemsProcessing;
    protected Integer limit;
    protected Integer totalCount;
    protected String nextCursor;

    /**
     * 获取feedId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedId() {
        return feedId;
    }

    /**
     * 设置feedId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedId(String value) {
        this.feedId = value;
    }

    /**
     * 获取feedStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FeedStatus }
     *     
     */
    public FeedStatus getFeedStatus() {
        return feedStatus;
    }

    /**
     * 设置feedStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FeedStatus }
     *     
     */
    public void setFeedStatus(FeedStatus value) {
        this.feedStatus = value;
    }

    /**
     * 获取ingestionErrors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MetaInfo.IngestionErrors }
     *     
     */
    public MetaInfo.IngestionErrors getIngestionErrors() {
        return ingestionErrors;
    }

    /**
     * 设置ingestionErrors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MetaInfo.IngestionErrors }
     *     
     */
    public void setIngestionErrors(MetaInfo.IngestionErrors value) {
        this.ingestionErrors = value;
    }

    /**
     * 获取itemsReceived属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemsReceived() {
        return itemsReceived;
    }

    /**
     * 设置itemsReceived属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemsReceived(Integer value) {
        this.itemsReceived = value;
    }

    /**
     * 获取itemsSucceeded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemsSucceeded() {
        return itemsSucceeded;
    }

    /**
     * 设置itemsSucceeded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemsSucceeded(Integer value) {
        this.itemsSucceeded = value;
    }

    /**
     * 获取itemsFailed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemsFailed() {
        return itemsFailed;
    }

    /**
     * 设置itemsFailed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemsFailed(Integer value) {
        this.itemsFailed = value;
    }

    /**
     * 获取itemsProcessing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemsProcessing() {
        return itemsProcessing;
    }

    /**
     * 设置itemsProcessing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemsProcessing(Integer value) {
        this.itemsProcessing = value;
    }

    /**
     * 获取limit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * 设置limit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * 获取totalCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * 设置totalCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
    }

    /**
     * 获取nextCursor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextCursor() {
        return nextCursor;
    }

    /**
     * 设置nextCursor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextCursor(String value) {
        this.nextCursor = value;
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
