//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.25 时间 02:11:16 PM CST 
//


package com.erp.biz.api.model.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>errorCategory的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="errorCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPLICATION"/&gt;
 *     &lt;enumeration value="SYSTEM"/&gt;
 *     &lt;enumeration value="REQUEST"/&gt;
 *     &lt;enumeration value="DATA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "errorCategory")
@XmlEnum
public enum ErrorCategory {

    APPLICATION,
    SYSTEM,
    REQUEST,
    DATA;

    public String value() {
        return name();
    }

    public static ErrorCategory fromValue(String v) {
        return valueOf(v);
    }

}
