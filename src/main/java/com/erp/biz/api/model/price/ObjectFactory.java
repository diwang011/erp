//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 04:28:11 PM CST 
//


package com.erp.biz.api.model.price;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.omniselling.channel.walmart.model.prices package. 
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

    private final static QName _PriceHeader_QNAME = new QName("http://walmart.com/", "PriceHeader");
    private final static QName _Price_QNAME = new QName("http://walmart.com/", "Price");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.omniselling.channel.walmart.model.prices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FeedHeaderType }
     * 
     */
    public FeedHeaderType createFeedHeaderType() {
        return new FeedHeaderType();
    }

    /**
     * Create an instance of {@link ItemPriceType }
     * 
     */
    public ItemPriceType createItemPriceType() {
        return new ItemPriceType();
    }

    /**
     * Create an instance of {@link PriceFeed }
     * 
     */
    public PriceFeed createPriceFeed() {
        return new PriceFeed();
    }

    /**
     * Create an instance of {@link PricingListType }
     * 
     */
    public PricingListType createPricingListType() {
        return new PricingListType();
    }

    /**
     * Create an instance of {@link PricingType }
     * 
     */
    public PricingType createPricingType() {
        return new PricingType();
    }

    /**
     * Create an instance of {@link ItemIdentifierType }
     * 
     */
    public ItemIdentifierType createItemIdentifierType() {
        return new ItemIdentifierType();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link MoneyType }
     * 
     */
    public MoneyType createMoneyType() {
        return new MoneyType();
    }

    /**
     * Create an instance of {@link PriceDisplayCodes }
     * 
     */
    public PriceDisplayCodes createPriceDisplayCodes() {
        return new PriceDisplayCodes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeedHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://walmart.com/", name = "PriceHeader")
    public JAXBElement<FeedHeaderType> createPriceHeader(FeedHeaderType value) {
        return new JAXBElement<FeedHeaderType>(_PriceHeader_QNAME, FeedHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemPriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://walmart.com/", name = "Price")
    public JAXBElement<ItemPriceType> createPrice(ItemPriceType value) {
        return new JAXBElement<ItemPriceType>(_Price_QNAME, ItemPriceType.class, null, value);
    }

}
