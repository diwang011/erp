//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 04:50:42 PM CST 
//


package com.erp.biz.api.model.order;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>orderLineStatusValueType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="orderLineStatusValueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Created"/&gt;
 *     &lt;enumeration value="Acknowledged"/&gt;
 *     &lt;enumeration value="Shipped"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="Refund"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "orderLineStatusValueType")
@XmlEnum
public enum OrderLineStatusValueType {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Acknowledged")
    ACKNOWLEDGED("Acknowledged"),
    @XmlEnumValue("Shipped")
    SHIPPED("Shipped"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Refund")
    REFUND("Refund");
    private final String value;

    OrderLineStatusValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderLineStatusValueType fromValue(String v) {
        for (OrderLineStatusValueType c: OrderLineStatusValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
