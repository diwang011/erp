//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.23 时间 11:49:25 AM CST 
//


package com.erp.biz.api.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>feedRecord complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="feedRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feedId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="feedSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="feedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partnerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemsReceived" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="itemsSucceeded" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="itemsFailed" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="itemsProcessing" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="feedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="feedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="batchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifiedDtm" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="itemDataErrorCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="itemSystemErrorCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="itemTimeoutErrorCount" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feedRecord", propOrder = {
    "feedId",
    "feedSource",
    "feedType",
    "partnerId",
    "partnerName",
    "itemsReceived",
    "itemsSucceeded",
    "itemsFailed",
    "itemsProcessing",
    "feedStatus",
    "feedDate",
    "batchId",
    "modifiedDtm",
    "fileName",
    "itemDataErrorCount",
    "itemSystemErrorCount",
    "itemTimeoutErrorCount"
})
public class FeedRecord {

    protected String feedId;
    protected String feedSource;
    protected String feedType;
    protected String partnerId;
    protected String partnerName;
    protected long itemsReceived;
    protected long itemsSucceeded;
    protected long itemsFailed;
    protected long itemsProcessing;
    protected String feedStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar feedDate;
    protected String batchId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDtm;
    protected String fileName;
    protected long itemDataErrorCount;
    protected long itemSystemErrorCount;
    protected long itemTimeoutErrorCount;

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
     * 获取feedSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedSource() {
        return feedSource;
    }

    /**
     * 设置feedSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedSource(String value) {
        this.feedSource = value;
    }

    /**
     * 获取feedType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedType() {
        return feedType;
    }

    /**
     * 设置feedType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedType(String value) {
        this.feedType = value;
    }

    /**
     * 获取partnerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * 设置partnerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    /**
     * 获取partnerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * 设置partnerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerName(String value) {
        this.partnerName = value;
    }

    /**
     * 获取itemsReceived属性的值。
     * 
     */
    public long getItemsReceived() {
        return itemsReceived;
    }

    /**
     * 设置itemsReceived属性的值。
     * 
     */
    public void setItemsReceived(long value) {
        this.itemsReceived = value;
    }

    /**
     * 获取itemsSucceeded属性的值。
     * 
     */
    public long getItemsSucceeded() {
        return itemsSucceeded;
    }

    /**
     * 设置itemsSucceeded属性的值。
     * 
     */
    public void setItemsSucceeded(long value) {
        this.itemsSucceeded = value;
    }

    /**
     * 获取itemsFailed属性的值。
     * 
     */
    public long getItemsFailed() {
        return itemsFailed;
    }

    /**
     * 设置itemsFailed属性的值。
     * 
     */
    public void setItemsFailed(long value) {
        this.itemsFailed = value;
    }

    /**
     * 获取itemsProcessing属性的值。
     * 
     */
    public long getItemsProcessing() {
        return itemsProcessing;
    }

    /**
     * 设置itemsProcessing属性的值。
     * 
     */
    public void setItemsProcessing(long value) {
        this.itemsProcessing = value;
    }

    /**
     * 获取feedStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeedStatus() {
        return feedStatus;
    }

    /**
     * 设置feedStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeedStatus(String value) {
        this.feedStatus = value;
    }

    /**
     * 获取feedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFeedDate() {
        return feedDate;
    }

    /**
     * 设置feedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFeedDate(XMLGregorianCalendar value) {
        this.feedDate = value;
    }

    /**
     * 获取batchId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * 设置batchId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchId(String value) {
        this.batchId = value;
    }

    /**
     * 获取modifiedDtm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDtm() {
        return modifiedDtm;
    }

    /**
     * 设置modifiedDtm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDtm(XMLGregorianCalendar value) {
        this.modifiedDtm = value;
    }

    /**
     * 获取fileName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置fileName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * 获取itemDataErrorCount属性的值。
     * 
     */
    public long getItemDataErrorCount() {
        return itemDataErrorCount;
    }

    /**
     * 设置itemDataErrorCount属性的值。
     * 
     */
    public void setItemDataErrorCount(long value) {
        this.itemDataErrorCount = value;
    }

    /**
     * 获取itemSystemErrorCount属性的值。
     * 
     */
    public long getItemSystemErrorCount() {
        return itemSystemErrorCount;
    }

    /**
     * 设置itemSystemErrorCount属性的值。
     * 
     */
    public void setItemSystemErrorCount(long value) {
        this.itemSystemErrorCount = value;
    }

    /**
     * 获取itemTimeoutErrorCount属性的值。
     * 
     */
    public long getItemTimeoutErrorCount() {
        return itemTimeoutErrorCount;
    }

    /**
     * 设置itemTimeoutErrorCount属性的值。
     * 
     */
    public void setItemTimeoutErrorCount(long value) {
        this.itemTimeoutErrorCount = value;
    }

}
