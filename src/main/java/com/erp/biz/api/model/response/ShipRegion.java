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
 * <p>ShipRegion的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ShipRegion"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="STREET_48_STATES"/&gt;
 *     &lt;enumeration value="PO_BOX_48_STATES"/&gt;
 *     &lt;enumeration value="STREET_AK_AND_HI"/&gt;
 *     &lt;enumeration value="PO_BOX_AK_AND_HI"/&gt;
 *     &lt;enumeration value="PO_BOX_US_PROTECTORATES"/&gt;
 *     &lt;enumeration value="STREET_US_PROTECTORATES"/&gt;
 *     &lt;enumeration value="APO_FPO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ShipRegion")
@XmlEnum
public enum ShipRegion {

    STREET_48_STATES,
    PO_BOX_48_STATES,
    STREET_AK_AND_HI,
    PO_BOX_AK_AND_HI,
    PO_BOX_US_PROTECTORATES,
    STREET_US_PROTECTORATES,
    APO_FPO;

    public String value() {
        return name();
    }

    public static ShipRegion fromValue(String v) {
        return valueOf(v);
    }

}
