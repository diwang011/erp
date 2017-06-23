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
 * <p>reasonCodesType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="reasonCodesType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BillingError"/&gt;
 *     &lt;enumeration value="TaxExemptCustomer"/&gt;
 *     &lt;enumeration value="ItemNotAsAdvertised"/&gt;
 *     &lt;enumeration value="IncorrectItemReceived"/&gt;
 *     &lt;enumeration value="CancelledYetShipped"/&gt;
 *     &lt;enumeration value="ItemNotReceivedByCustomer"/&gt;
 *     &lt;enumeration value="IncorrectShippingPrice"/&gt;
 *     &lt;enumeration value="DamagedItem"/&gt;
 *     &lt;enumeration value="DefectiveItem"/&gt;
 *     &lt;enumeration value="CustomerChangedMind"/&gt;
 *     &lt;enumeration value="CustomerReceivedItemLate"/&gt;
 *     &lt;enumeration value="Finance -&gt; Goodwill"/&gt;
 *     &lt;enumeration value="Finance -&gt; Rollback"/&gt;
 *     &lt;enumeration value="Missing Parts / Instructions"/&gt;
 *     &lt;enumeration value="Buyer canceled"/&gt;
 *     &lt;enumeration value="Customer returned item"/&gt;
 *     &lt;enumeration value="General adjustment"/&gt;
 *     &lt;enumeration value="Merchandise not received"/&gt;
 *     &lt;enumeration value="Quality -&gt; Missing Parts / Instructions"/&gt;
 *     &lt;enumeration value="Shipping &amp; Delivery -&gt; Damaged"/&gt;
 *     &lt;enumeration value="Shipping &amp; Delivery -&gt; Shipping Price Discrepancy"/&gt;
 *     &lt;enumeration value="Others"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "reasonCodesType")
@XmlEnum
public enum ReasonCodesType {

    @XmlEnumValue("BillingError")
    BILLING_ERROR("BillingError"),
    @XmlEnumValue("TaxExemptCustomer")
    TAX_EXEMPT_CUSTOMER("TaxExemptCustomer"),
    @XmlEnumValue("ItemNotAsAdvertised")
    ITEM_NOT_AS_ADVERTISED("ItemNotAsAdvertised"),
    @XmlEnumValue("IncorrectItemReceived")
    INCORRECT_ITEM_RECEIVED("IncorrectItemReceived"),
    @XmlEnumValue("CancelledYetShipped")
    CANCELLED_YET_SHIPPED("CancelledYetShipped"),
    @XmlEnumValue("ItemNotReceivedByCustomer")
    ITEM_NOT_RECEIVED_BY_CUSTOMER("ItemNotReceivedByCustomer"),
    @XmlEnumValue("IncorrectShippingPrice")
    INCORRECT_SHIPPING_PRICE("IncorrectShippingPrice"),
    @XmlEnumValue("DamagedItem")
    DAMAGED_ITEM("DamagedItem"),
    @XmlEnumValue("DefectiveItem")
    DEFECTIVE_ITEM("DefectiveItem"),
    @XmlEnumValue("CustomerChangedMind")
    CUSTOMER_CHANGED_MIND("CustomerChangedMind"),
    @XmlEnumValue("CustomerReceivedItemLate")
    CUSTOMER_RECEIVED_ITEM_LATE("CustomerReceivedItemLate"),
    @XmlEnumValue("Finance -> Goodwill")
    FINANCE_GOODWILL("Finance -> Goodwill"),
    @XmlEnumValue("Finance -> Rollback")
    FINANCE_ROLLBACK("Finance -> Rollback"),
    @XmlEnumValue("Missing Parts / Instructions")
    MISSING_PARTS_INSTRUCTIONS("Missing Parts / Instructions"),
    @XmlEnumValue("Buyer canceled")
    BUYER_CANCELED("Buyer canceled"),
    @XmlEnumValue("Customer returned item")
    CUSTOMER_RETURNED_ITEM("Customer returned item"),
    @XmlEnumValue("General adjustment")
    GENERAL_ADJUSTMENT("General adjustment"),
    @XmlEnumValue("Merchandise not received")
    MERCHANDISE_NOT_RECEIVED("Merchandise not received"),
    @XmlEnumValue("Quality -> Missing Parts / Instructions")
    QUALITY_MISSING_PARTS_INSTRUCTIONS("Quality -> Missing Parts / Instructions"),
    @XmlEnumValue("Shipping & Delivery -> Damaged")
    SHIPPING_DELIVERY_DAMAGED("Shipping & Delivery -> Damaged"),
    @XmlEnumValue("Shipping & Delivery -> Shipping Price Discrepancy")
    SHIPPING_DELIVERY_SHIPPING_PRICE_DISCREPANCY("Shipping & Delivery -> Shipping Price Discrepancy"),
    @XmlEnumValue("Others")
    OTHERS("Others");
    private final String value;

    ReasonCodesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReasonCodesType fromValue(String v) {
        for (ReasonCodesType c: ReasonCodesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
