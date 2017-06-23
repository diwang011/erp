//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 04:29:33 PM CST 
//


package com.erp.biz.api.model.inventory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.omniselling.channel.walmart.model.inventory package. 
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

    private final static QName _Inventory_QNAME = new QName("http://walmart.com/", "inventory");
    private final static QName _InventoryHeader_QNAME = new QName("http://walmart.com/", "InventoryHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.omniselling.channel.walmart.model.inventory
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Inventory }
     * 
     */
    public Inventory createInventory() {
        return new Inventory();
    }

    /**
     * Create an instance of {@link InventoryHeader }
     * 
     */
    public InventoryHeader createInventoryHeader() {
        return new InventoryHeader();
    }

    /**
     * Create an instance of {@link InventoryFeed }
     * 
     */
    public InventoryFeed createInventoryFeed() {
        return new InventoryFeed();
    }

    /**
     * Create an instance of {@link Quantity }
     * 
     */
    public Quantity createQuantity() {
        return new Quantity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Inventory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://walmart.com/", name = "inventory")
    public JAXBElement<Inventory> createInventory(Inventory value) {
        return new JAXBElement<Inventory>(_Inventory_QNAME, Inventory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InventoryHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://walmart.com/", name = "InventoryHeader")
    public JAXBElement<InventoryHeader> createInventoryHeader(InventoryHeader value) {
        return new JAXBElement<InventoryHeader>(_InventoryHeader_QNAME, InventoryHeader.class, null, value);
    }

}
