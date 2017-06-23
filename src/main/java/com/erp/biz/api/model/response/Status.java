//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.27 时间 06:15:25 PM CST 
//


package com.erp.biz.api.model.response;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Status的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="Status"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="CREATED"/&gt;
 *     &lt;enumeration value="ACCEPTED"/&gt;
 *     &lt;enumeration value="NO_CONTENT"/&gt;
 *     &lt;enumeration value="PARTIAL"/&gt;
 *     &lt;enumeration value="MOVED_PERMANENT"/&gt;
 *     &lt;enumeration value="FOUND"/&gt;
 *     &lt;enumeration value="SEE_OTHER"/&gt;
 *     &lt;enumeration value="NOT_MODIFIED"/&gt;
 *     &lt;enumeration value="TEMPORARY_REDIRECT"/&gt;
 *     &lt;enumeration value="BAD_REQUEST"/&gt;
 *     &lt;enumeration value="UNAUTHORIZED"/&gt;
 *     &lt;enumeration value="FORBIDDEN"/&gt;
 *     &lt;enumeration value="NOT_FOUND"/&gt;
 *     &lt;enumeration value="METHOD_NOT_ALLOWED"/&gt;
 *     &lt;enumeration value="NOT_ACCEPTABLE"/&gt;
 *     &lt;enumeration value="REQUEST_TIMEOUT"/&gt;
 *     &lt;enumeration value="CONFLICT"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_MEDIA_TYPE"/&gt;
 *     &lt;enumeration value="UNPROCESSABLE_ENTITY"/&gt;
 *     &lt;enumeration value="FAIL"/&gt;
 *     &lt;enumeration value="BAD_GATEWAY"/&gt;
 *     &lt;enumeration value="SERVICE_UNAVAILABLE"/&gt;
 *     &lt;enumeration value="GATEWAY_TIMEOUT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Status")
@XmlEnum
public enum Status {

    OK,
    CREATED,
    ACCEPTED,
    NO_CONTENT,
    PARTIAL,
    MOVED_PERMANENT,
    FOUND,
    SEE_OTHER,
    NOT_MODIFIED,
    TEMPORARY_REDIRECT,
    BAD_REQUEST,
    UNAUTHORIZED,
    FORBIDDEN,
    NOT_FOUND,
    METHOD_NOT_ALLOWED,
    NOT_ACCEPTABLE,
    REQUEST_TIMEOUT,
    CONFLICT,
    UNSUPPORTED_MEDIA_TYPE,
    UNPROCESSABLE_ENTITY,
    FAIL,
    BAD_GATEWAY,
    SERVICE_UNAVAILABLE,
    GATEWAY_TIMEOUT;

    public String value() {
        return name();
    }

    public static Status fromValue(String v) {
        return valueOf(v);
    }

}
