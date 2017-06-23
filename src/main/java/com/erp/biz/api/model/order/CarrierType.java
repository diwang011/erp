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
 * <p>carrierType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="carrierType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UPS"/&gt;
 *     &lt;enumeration value="USPS"/&gt;
 *     &lt;enumeration value="FedEx"/&gt;
 *     &lt;enumeration value="Airborne"/&gt;
 *     &lt;enumeration value="OnTrac"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "carrierType")
@XmlEnum
public enum CarrierType {

    UPS("UPS"),
    USPS("USPS"),
    @XmlEnumValue("FedEx")
    FED_EX("FedEx"),
    @XmlEnumValue("Airborne")
    AIRBORNE("Airborne"),
    @XmlEnumValue("OnTrac")
    ON_TRAC("OnTrac");
    private final String value;

    CarrierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CarrierType fromValue(String v) {
        for (CarrierType c: CarrierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
