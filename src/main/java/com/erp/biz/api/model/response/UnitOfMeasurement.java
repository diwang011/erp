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
 * <p>UnitOfMeasurement的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="UnitOfMeasurement"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EA"/&gt;
 *     &lt;enumeration value="FT"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="INCH"/&gt;
 *     &lt;enumeration value="YD"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="CM"/&gt;
 *     &lt;enumeration value="MM"/&gt;
 *     &lt;enumeration value="KG"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="MG"/&gt;
 *     &lt;enumeration value="POUND"/&gt;
 *     &lt;enumeration value="LB"/&gt;
 *     &lt;enumeration value="OZ"/&gt;
 *     &lt;enumeration value="FOZ"/&gt;
 *     &lt;enumeration value="GAL"/&gt;
 *     &lt;enumeration value="QT"/&gt;
 *     &lt;enumeration value="PT"/&gt;
 *     &lt;enumeration value="IMPGAL"/&gt;
 *     &lt;enumeration value="IMPQT"/&gt;
 *     &lt;enumeration value="IMPPT"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="ML"/&gt;
 *     &lt;enumeration value="CC"/&gt;
 *     &lt;enumeration value="CBM"/&gt;
 *     &lt;enumeration value="CFT"/&gt;
 *     &lt;enumeration value="CYD"/&gt;
 *     &lt;enumeration value="CIN"/&gt;
 *     &lt;enumeration value="SM"/&gt;
 *     &lt;enumeration value="SFT"/&gt;
 *     &lt;enumeration value="SYD"/&gt;
 *     &lt;enumeration value="SIN"/&gt;
 *     &lt;enumeration value="SCM"/&gt;
 *     &lt;enumeration value="SMM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UnitOfMeasurement")
@XmlEnum
public enum UnitOfMeasurement {

    EA,
    FT,
    IN,
    INCH,
    YD,
    M,
    CM,
    MM,
    KG,
    G,
    MG,
    POUND,
    LB,
    OZ,
    FOZ,
    GAL,
    QT,
    PT,
    IMPGAL,
    IMPQT,
    IMPPT,
    L,
    ML,
    CC,
    CBM,
    CFT,
    CYD,
    CIN,
    SM,
    SFT,
    SYD,
    SIN,
    SCM,
    SMM;

    public String value() {
        return name();
    }

    public static UnitOfMeasurement fromValue(String v) {
        return valueOf(v);
    }

}
