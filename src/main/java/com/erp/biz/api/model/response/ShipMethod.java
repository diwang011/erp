//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.23 时间 11:48:50 AM CST 
//


package com.erp.biz.api.model.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShipMethod的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ShipMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STANDARD"/&gt;
 *     &lt;enumeration value="EXPEDITED"/&gt;
 *     &lt;enumeration value="FREIGHT"/&gt;
 *     &lt;enumeration value="ONE_DAY"/&gt;
 *     &lt;enumeration value="FREIGHT_WITH_WHITE_GLOVE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipMethod")
@XmlEnum
public enum ShipMethod {

    STANDARD,
    EXPEDITED,
    FREIGHT,
    ONE_DAY,
    FREIGHT_WITH_WHITE_GLOVE;

    public String value() {
        return name();
    }

    public static ShipMethod fromValue(String v) {
        return valueOf(v);
    }

}
