//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.27 时间 06:15:25 PM CST 
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
 * <p>ServiceResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServiceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{}Status"/&gt;
 *         &lt;element name="errors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="error" type="{}error" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="header" type="{}ServiceHeader" minOccurs="0"/&gt;
 *         &lt;element name="payload" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceResponse", propOrder = {
    "status",
    "errors",
    "header",
    "payload"
})
public class ServiceResponse {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Status status;
    protected ServiceResponse.Errors errors;
    protected ServiceHeader header;
    protected Object payload;

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * 获取errors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServiceResponse.Errors }
     *     
     */
    public ServiceResponse.Errors getErrors() {
        return errors;
    }

    /**
     * 设置errors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResponse.Errors }
     *     
     */
    public void setErrors(ServiceResponse.Errors value) {
        this.errors = value;
    }

    /**
     * 获取header属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServiceHeader }
     *     
     */
    public ServiceHeader getHeader() {
        return header;
    }

    /**
     * 设置header属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceHeader }
     *     
     */
    public void setHeader(ServiceHeader value) {
        this.header = value;
    }

    /**
     * 获取payload属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPayload() {
        return payload;
    }

    /**
     * 设置payload属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPayload(Object value) {
        this.payload = value;
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
     *         &lt;element name="error" type="{}error" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "error"
    })
    public static class Errors {

        protected List<Error> error;

        /**
         * Gets the value of the error property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the error property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getError().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Error }
         * 
         * 
         */
        public List<Error> getError() {
            if (error == null) {
                error = new ArrayList<Error>();
            }
            return this.error;
        }

    }

}
