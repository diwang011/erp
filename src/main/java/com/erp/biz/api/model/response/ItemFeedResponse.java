//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.25 时间 02:12:22 PM CST 
//


package com.erp.biz.api.model.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="requestId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="64"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="requestBatchId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="64"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionalAttributes" type="{http://walmart.com/}MPNameValueAttributes" minOccurs="0"/&gt;
 *         &lt;element name="ItemDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemIngestionStatus" type="{http://walmart.com/}GenericItemIngestionStatus" maxOccurs="1000" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "feedId",
    "feedStatus",
    "ingestionErrors",
    "itemsReceived",
    "itemsSucceeded",
    "itemsFailed",
    "itemsProcessing",
    "offset",
    "limit",
    "requestId",
    "requestBatchId",
    "additionalAttributes",
    "itemDetails"
})
@XmlRootElement(name = "ItemFeedResponse")
public class ItemFeedResponse {

    @XmlElement(required = true)
    protected String feedId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected FeedStatus feedStatus;
    protected ItemFeedResponse.IngestionErrors ingestionErrors;
    protected Integer itemsReceived;
    protected Integer itemsSucceeded;
    protected Integer itemsFailed;
    protected Integer itemsProcessing;
    protected Integer offset;
    protected Integer limit;
    protected String requestId;
    protected String requestBatchId;
    protected MPNameValueAttributes additionalAttributes;
    @XmlElement(name = "ItemDetails")
    protected ItemFeedResponse.ItemDetails itemDetails;

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
     *     {@link ItemFeedResponse.IngestionErrors }
     *     
     */
    public ItemFeedResponse.IngestionErrors getIngestionErrors() {
        return ingestionErrors;
    }

    /**
     * 设置ingestionErrors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFeedResponse.IngestionErrors }
     *     
     */
    public void setIngestionErrors(ItemFeedResponse.IngestionErrors value) {
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
     * 获取offset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * 设置offset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOffset(Integer value) {
        this.offset = value;
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
     * 获取requestId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * 设置requestId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * 获取requestBatchId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestBatchId() {
        return requestBatchId;
    }

    /**
     * 设置requestBatchId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestBatchId(String value) {
        this.requestBatchId = value;
    }

    /**
     * 获取additionalAttributes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MPNameValueAttributes }
     *     
     */
    public MPNameValueAttributes getAdditionalAttributes() {
        return additionalAttributes;
    }

    /**
     * 设置additionalAttributes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MPNameValueAttributes }
     *     
     */
    public void setAdditionalAttributes(MPNameValueAttributes value) {
        this.additionalAttributes = value;
    }

    /**
     * 获取itemDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItemFeedResponse.ItemDetails }
     *     
     */
    public ItemFeedResponse.ItemDetails getItemDetails() {
        return itemDetails;
    }

    /**
     * 设置itemDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFeedResponse.ItemDetails }
     *     
     */
    public void setItemDetails(ItemFeedResponse.ItemDetails value) {
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
     *         &lt;element name="ItemIngestionStatus" type="{http://walmart.com/}GenericItemIngestionStatus" maxOccurs="1000" minOccurs="0"/&gt;
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

        @XmlElement(name = "ItemIngestionStatus")
        protected List<GenericItemIngestionStatus> itemIngestionStatus;

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
         * {@link GenericItemIngestionStatus }
         * 
         * 
         */
        public List<GenericItemIngestionStatus> getItemIngestionStatus() {
            if (itemIngestionStatus == null) {
                itemIngestionStatus = new ArrayList<GenericItemIngestionStatus>();
            }
            return this.itemIngestionStatus;
        }

    }

}
