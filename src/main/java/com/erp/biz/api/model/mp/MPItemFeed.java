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
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element name="MPItemFeedHeader" type="{http://walmart.com/}MPItemFeedHeader"/&gt;
 *         &lt;element name="MPItem" type="{http://walmart.com/}MPItem" maxOccurs="10000"/&gt;
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
    "mpItemFeedHeader",
    "mpItem"
})
@XmlRootElement(name = "MPItemFeed")
public class MPItemFeed {

    @XmlElement(name = "MPItemFeedHeader", required = true)
    protected MPItemFeedHeader mpItemFeedHeader;
    @XmlElement(name = "MPItem", required = true)
    protected List<MPItem> mpItem;

    /**
     * 获取mpItemFeedHeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MPItemFeedHeader }
     *     
     */
    public MPItemFeedHeader getMPItemFeedHeader() {
        return mpItemFeedHeader;
    }

    /**
     * 设置mpItemFeedHeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MPItemFeedHeader }
     *     
     */
    public void setMPItemFeedHeader(MPItemFeedHeader value) {
        this.mpItemFeedHeader = value;
    }

    /**
     * Gets the value of the mpItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mpItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMPItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MPItem }
     * 
     * 
     */
    public List<MPItem> getMPItem() {
        if (mpItem == null) {
            mpItem = new ArrayList<MPItem>();
        }
        return this.mpItem;
    }

}
