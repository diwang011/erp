//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 04:50:42 PM CST 
//


package com.erp.biz.api.model.order;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>cancellationReasonType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="cancellationReasonType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CANCEL_BY_SELLER"/&gt;
 *     &lt;enumeration value="CUSTOMER_REQUESTED_SELLER_TO_CANCEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "cancellationReasonType")
@XmlEnum
public enum CancellationReasonType {

    CANCEL_BY_SELLER,
    CUSTOMER_REQUESTED_SELLER_TO_CANCEL;

    public String value() {
        return name();
    }

    public static CancellationReasonType fromValue(String v) {
        return valueOf(v);
    }

}
