//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.25 时间 02:12:22 PM CST 
//


package com.erp.biz.api.model.response;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.omniselling.channel.walmart.model.v3.api package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.omniselling.channel.walmart.model.v3.api
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ItemFeedResponse }
     * 
     */
    public ItemFeedResponse createItemFeedResponse() {
        return new ItemFeedResponse();
    }

    /**
     * Create an instance of {@link GenericItemIngestionStatus }
     * 
     */
    public GenericItemIngestionStatus createGenericItemIngestionStatus() {
        return new GenericItemIngestionStatus();
    }

    /**
     * Create an instance of {@link ItemFeedResponse.IngestionErrors }
     * 
     */
    public ItemFeedResponse.IngestionErrors createItemFeedResponseIngestionErrors() {
        return new ItemFeedResponse.IngestionErrors();
    }

    /**
     * Create an instance of {@link MPNameValueAttributes }
     * 
     */
    public MPNameValueAttributes createMPNameValueAttributes() {
        return new MPNameValueAttributes();
    }

    /**
     * Create an instance of {@link ItemFeedResponse.ItemDetails }
     * 
     */
    public ItemFeedResponse.ItemDetails createItemFeedResponseItemDetails() {
        return new ItemFeedResponse.ItemDetails();
    }

    /**
     * Create an instance of {@link IngestionError }
     * 
     */
    public IngestionError createIngestionError() {
        return new IngestionError();
    }

    /**
     * Create an instance of {@link MPNameValueAttribute }
     * 
     */
    public MPNameValueAttribute createMPNameValueAttribute() {
        return new MPNameValueAttribute();
    }

    /**
     * Create an instance of {@link MPAttributeValue }
     * 
     */
    public MPAttributeValue createMPAttributeValue() {
        return new MPAttributeValue();
    }

    /**
     * Create an instance of {@link GenericItemIngestionStatus.IngestionErrors }
     * 
     */
    public GenericItemIngestionStatus.IngestionErrors createGenericItemIngestionStatusIngestionErrors() {
        return new GenericItemIngestionStatus.IngestionErrors();
    }

}
