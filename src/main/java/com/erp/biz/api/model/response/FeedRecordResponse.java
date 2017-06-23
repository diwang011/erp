//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.23 时间 11:49:25 AM CST 
//


package com.erp.biz.api.model.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>feedRecordResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="feedRecordResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalResults" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="results" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="feed" type="{http://walmart.com/}feedRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "feedRecordResponse", propOrder = {
    "totalResults",
    "offset",
    "limit",
    "results"
})
@XmlRootElement(name="list")
public class FeedRecordResponse {

    protected long totalResults;
    protected long offset;
    protected int limit;
    protected FeedRecordResponse.Results results;

    /**
     * 获取totalResults属性的值。
     * 
     */
    public long getTotalResults() {
        return totalResults;
    }

    /**
     * 设置totalResults属性的值。
     * 
     */
    public void setTotalResults(long value) {
        this.totalResults = value;
    }

    /**
     * 获取offset属性的值。
     * 
     */
    public long getOffset() {
        return offset;
    }

    /**
     * 设置offset属性的值。
     * 
     */
    public void setOffset(long value) {
        this.offset = value;
    }

    /**
     * 获取limit属性的值。
     * 
     */
    public int getLimit() {
        return limit;
    }

    /**
     * 设置limit属性的值。
     * 
     */
    public void setLimit(int value) {
        this.limit = value;
    }

    /**
     * 获取results属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FeedRecordResponse.Results }
     *     
     */
    public FeedRecordResponse.Results getResults() {
        return results;
    }

    /**
     * 设置results属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FeedRecordResponse.Results }
     *     
     */
    public void setResults(FeedRecordResponse.Results value) {
        this.results = value;
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
     *         &lt;element name="feed" type="{http://walmart.com/}feedRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "feed"
    })
    public static class Results {

        protected List<FeedRecord> feed;

        /**
         * Gets the value of the feed property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feed property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeed().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeedRecord }
         * 
         * 
         */
        public List<FeedRecord> getFeed() {
            if (feed == null) {
                feed = new ArrayList<FeedRecord>();
            }
            return this.feed;
        }

    }

}
