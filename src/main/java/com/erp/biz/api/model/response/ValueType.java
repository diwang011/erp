//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.25 时间 02:12:22 PM CST 
//


package com.erp.biz.api.model.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ValueType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ValueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOCALIZABLE_TEXT"/&gt;
 *     &lt;enumeration value="STRING"/&gt;
 *     &lt;enumeration value="BOOLEAN"/&gt;
 *     &lt;enumeration value="INTEGER"/&gt;
 *     &lt;enumeration value="DECIMAL"/&gt;
 *     &lt;enumeration value="DATE"/&gt;
 *     &lt;enumeration value="TIMESTAMP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValueType")
@XmlEnum
public enum ValueType {

    LOCALIZABLE_TEXT,
    STRING,
    BOOLEAN,
    INTEGER,
    DECIMAL,
    DATE,
    TIMESTAMP;

    public String value() {
        return name();
    }

    public static ValueType fromValue(String v) {
        return valueOf(v);
    }

}
