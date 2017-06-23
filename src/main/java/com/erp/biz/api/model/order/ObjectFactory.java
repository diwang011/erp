//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 04:50:42 PM CST 
//


package com.erp.biz.api.model.order;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.omniselling.channel.walmart.model.orders package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.omniselling.channel.walmart.model.orders
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderShipment }
     * 
     */
    public OrderShipment createOrderShipment() {
        return new OrderShipment();
    }

    /**
     * Create an instance of {@link ShippingLinesType }
     * 
     */
    public ShippingLinesType createShippingLinesType() {
        return new ShippingLinesType();
    }

    /**
     * Create an instance of {@link QuantityType }
     * 
     */
    public QuantityType createQuantityType() {
        return new QuantityType();
    }

    /**
     * Create an instance of {@link TrackingInfoType }
     * 
     */
    public TrackingInfoType createTrackingInfoType() {
        return new TrackingInfoType();
    }

    /**
     * Create an instance of {@link CarrierNameType }
     * 
     */
    public CarrierNameType createCarrierNameType() {
        return new CarrierNameType();
    }

    /**
     * Create an instance of {@link RefundType }
     * 
     */
    public RefundType createRefundType() {
        return new RefundType();
    }

    /**
     * Create an instance of {@link ChargesType }
     * 
     */
    public ChargesType createChargesType() {
        return new ChargesType();
    }

    /**
     * Create an instance of {@link RefundChargesType }
     * 
     */
    public RefundChargesType createRefundChargesType() {
        return new RefundChargesType();
    }

    /**
     * Create an instance of {@link RefundChargeType }
     * 
     */
    public RefundChargeType createRefundChargeType() {
        return new RefundChargeType();
    }

    /**
     * Create an instance of {@link ChargeType }
     * 
     */
    public ChargeType createChargeType() {
        return new ChargeType();
    }

    /**
     * Create an instance of {@link TaxType }
     * 
     */
    public TaxType createTaxType() {
        return new TaxType();
    }

    /**
     * Create an instance of {@link MoneyType }
     * 
     */
    public MoneyType createMoneyType() {
        return new MoneyType();
    }

    /**
     * Create an instance of {@link ShippingLineType }
     * 
     */
    public ShippingLineType createShippingLineType() {
        return new ShippingLineType();
    }

    /**
     * Create an instance of {@link ShipLineStatusesType }
     * 
     */
    public ShipLineStatusesType createShipLineStatusesType() {
        return new ShipLineStatusesType();
    }

    /**
     * Create an instance of {@link ShipLineStatusType }
     * 
     */
    public ShipLineStatusType createShipLineStatusType() {
        return new ShipLineStatusType();
    }

}
