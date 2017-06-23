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
 * <p>ItemPublishStatus的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ItemPublishStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IN_PROGRESS"/&gt;
 *     &lt;enumeration value="READY_TO_PUBLISH"/&gt;
 *     &lt;enumeration value="PUBLISHED"/&gt;
 *     &lt;enumeration value="UNPUBLISHED"/&gt;
 *     &lt;enumeration value="STAGE"/&gt;
 *     &lt;enumeration value="SYSTEM_PROBLEM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ItemPublishStatus")
@XmlEnum
public enum ItemPublishStatus {

    IN_PROGRESS,
    READY_TO_PUBLISH,
    PUBLISHED,
    UNPUBLISHED,
    STAGE,
    SYSTEM_PROBLEM;

    public String value() {
        return name();
    }

    public static ItemPublishStatus fromValue(String v) {
        return valueOf(v);
    }

}
