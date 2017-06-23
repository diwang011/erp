//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.23 时间 11:49:38 AM CST 
//


package com.erp.biz.api.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * FeedAcknowledgement complex type的 Java 类。
 * 
 * <p>
 * 以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FeedAcknowledgement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://walmart.com/}gatewayBaseEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feedId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalAttributes" type="{http://walmart.com/}NameValueAttributes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeedAcknowledgement", propOrder = { "feedId", "additionalAttributes" })
@XmlRootElement(name = "FeedAcknowledgement")
public class FeedAcknowledgement extends GatewayBaseEntity
{

    protected String feedId;
    protected NameValueAttributes additionalAttributes;

    /**
     * 获取feedId属性的值。
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getFeedId()
    {
        return feedId;
    }

    /**
     * 设置feedId属性的值。
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setFeedId(String value)
    {
        this.feedId = value;
    }

    /**
     * 获取additionalAttributes属性的值。
     * 
     * @return possible object is {@link NameValueAttributes }
     * 
     */
    public NameValueAttributes getAdditionalAttributes()
    {
        return additionalAttributes;
    }

    /**
     * 设置additionalAttributes属性的值。
     * 
     * @param value
     *            allowed object is {@link NameValueAttributes }
     * 
     */
    public void setAdditionalAttributes(NameValueAttributes value)
    {
        this.additionalAttributes = value;
    }

}
