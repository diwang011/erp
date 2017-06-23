//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.23 时间 11:38:50 AM CST 
//


package com.erp.biz.api.model.mp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AnimalEverythingElse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AnimalEverythingElse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="shortDescription"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="keyFeatures" type="{http://walmart.com/}KeyFeatures" minOccurs="0"/&gt;
 *         &lt;element name="brand"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="manufacturer" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="manufacturerPartNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="modelNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="multipackQuantity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;totalDigits value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="countPerPack" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;totalDigits value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="count" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="7"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pieceCount" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;totalDigits value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mainImageUrl"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="productSecondaryImageURL" type="{http://walmart.com/}ProductSecondaryImageURL" minOccurs="0"/&gt;
 *         &lt;element name="animalType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="animalBreed" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="animalLifestage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="minimumWeight" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="measure"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                         &lt;totalDigits value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="unit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="lb"/&gt;
 *                         &lt;enumeration value="kg"/&gt;
 *                         &lt;enumeration value="oz"/&gt;
 *                         &lt;enumeration value="g"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maximumWeight" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="measure"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                         &lt;totalDigits value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="unit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="lb"/&gt;
 *                         &lt;enumeration value="kg"/&gt;
 *                         &lt;enumeration value="oz"/&gt;
 *                         &lt;enumeration value="g"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="petSize" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="material" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="size" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="color" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="colorCategory" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="colorCategoryValue" maxOccurs="unbounded"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Beige"/&gt;
 *                         &lt;enumeration value="Black"/&gt;
 *                         &lt;enumeration value="Blue"/&gt;
 *                         &lt;enumeration value="Bronze"/&gt;
 *                         &lt;enumeration value="Brown"/&gt;
 *                         &lt;enumeration value="Clear"/&gt;
 *                         &lt;enumeration value="Gold"/&gt;
 *                         &lt;enumeration value="Gray"/&gt;
 *                         &lt;enumeration value="Green"/&gt;
 *                         &lt;enumeration value="Multi-color"/&gt;
 *                         &lt;enumeration value="Off-White"/&gt;
 *                         &lt;enumeration value="Orange"/&gt;
 *                         &lt;enumeration value="Pink"/&gt;
 *                         &lt;enumeration value="Purple"/&gt;
 *                         &lt;enumeration value="Red"/&gt;
 *                         &lt;enumeration value="Silver"/&gt;
 *                         &lt;enumeration value="White"/&gt;
 *                         &lt;enumeration value="Yellow"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pattern" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isFoldable" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="assembledProductHeight" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="measure"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                         &lt;totalDigits value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="unit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="in"/&gt;
 *                         &lt;enumeration value="ft"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="assembledProductLength" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="measure"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                         &lt;totalDigits value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="unit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="in"/&gt;
 *                         &lt;enumeration value="ft"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="assembledProductWeight" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="measure"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                         &lt;totalDigits value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="unit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="oz"/&gt;
 *                         &lt;enumeration value="lb"/&gt;
 *                         &lt;enumeration value="g"/&gt;
 *                         &lt;enumeration value="kg"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="assembledProductWidth" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="measure"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                         &lt;totalDigits value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="unit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="in"/&gt;
 *                         &lt;enumeration value="ft"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="variantGroupId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="300"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="variantAttributeNames" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="variantAttributeName" maxOccurs="unbounded"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="color"/&gt;
 *                         &lt;enumeration value="size"/&gt;
 *                         &lt;enumeration value="countPerPack"/&gt;
 *                         &lt;enumeration value="count"/&gt;
 *                         &lt;enumeration value="flavor"/&gt;
 *                         &lt;enumeration value="assembledProductLength"/&gt;
 *                         &lt;enumeration value="assembledProductWidth"/&gt;
 *                         &lt;enumeration value="assembledProductHeight"/&gt;
 *                         &lt;enumeration value="scent"/&gt;
 *                         &lt;enumeration value="capacity"/&gt;
 *                         &lt;enumeration value="shape"/&gt;
 *                         &lt;enumeration value="sportsTeam"/&gt;
 *                         &lt;enumeration value="character"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isPrimaryVariant" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isAerosol" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hasExpiration" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="batteryTechnologyType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Does Not Contain a Battery"/&gt;
 *               &lt;enumeration value="Alkaline"/&gt;
 *               &lt;enumeration value="Carbon Zinc"/&gt;
 *               &lt;enumeration value="Lead Acid"/&gt;
 *               &lt;enumeration value="Lead Acid (Nonspillable)"/&gt;
 *               &lt;enumeration value="Lithium Primary (Lithium Metal)"/&gt;
 *               &lt;enumeration value="Lithium Ion"/&gt;
 *               &lt;enumeration value="Magnesium"/&gt;
 *               &lt;enumeration value="Mercury"/&gt;
 *               &lt;enumeration value="Nickel Cadmium"/&gt;
 *               &lt;enumeration value="Nickel Metal Hydride"/&gt;
 *               &lt;enumeration value="Silver"/&gt;
 *               &lt;enumeration value="Thermal"/&gt;
 *               &lt;enumeration value="Other"/&gt;
 *               &lt;enumeration value="Multiple Types"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hasBatteries" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hasWarranty" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="warrantyText" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="warrantyURL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isChemical" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hasPricePerUnit" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pricePerUnitQuantity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pricePerUnitUom" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Ounce"/&gt;
 *               &lt;enumeration value="Fluid Ounce"/&gt;
 *               &lt;enumeration value="Yard"/&gt;
 *               &lt;enumeration value="Square Foot"/&gt;
 *               &lt;enumeration value="Cubic Foot"/&gt;
 *               &lt;enumeration value="Foot"/&gt;
 *               &lt;enumeration value="Inch"/&gt;
 *               &lt;enumeration value="Pound"/&gt;
 *               &lt;enumeration value="Each"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isProp65WarningRequired" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="prop65WarningText" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="requiresTextileActLabeling" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="countryOfOriginTextiles" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="USA"/&gt;
 *               &lt;enumeration value="Imported"/&gt;
 *               &lt;enumeration value="USA and Imported"/&gt;
 *               &lt;enumeration value="USA or Imported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="shelfLife" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="measure"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="400"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="unit"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="days"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hasFuelContainer" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fabricCareInstructions" type="{http://walmart.com/}FabricCareInstructions" minOccurs="0"/&gt;
 *         &lt;element name="fabricContent" type="{http://walmart.com/}FabricContent" minOccurs="0"/&gt;
 *         &lt;element name="batteriesRequired" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="instructions" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sportsLeague" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sportsTeam" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isPortable" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="globalBrandLicense" type="{http://walmart.com/}BrandLicense" minOccurs="0"/&gt;
 *         &lt;element name="autographedBy" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="athlete" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="swatchImages" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="swatchImage" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="swatchVariantAttribute"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="color"/&gt;
 *                                   &lt;enumeration value="size"/&gt;
 *                                   &lt;enumeration value="countPerPack"/&gt;
 *                                   &lt;enumeration value="count"/&gt;
 *                                   &lt;enumeration value="flavor"/&gt;
 *                                   &lt;enumeration value="assembledProductLength"/&gt;
 *                                   &lt;enumeration value="assembledProductWidth"/&gt;
 *                                   &lt;enumeration value="assembledProductHeight"/&gt;
 *                                   &lt;enumeration value="scent"/&gt;
 *                                   &lt;enumeration value="capacity"/&gt;
 *                                   &lt;enumeration value="shape"/&gt;
 *                                   &lt;enumeration value="sportsTeam"/&gt;
 *                                   &lt;enumeration value="character"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="swatchImageUrl"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnimalEverythingElse", propOrder = {

})
public class AnimalEverythingElse {

    @XmlElement(required = true)
    protected String shortDescription;
    protected KeyFeatures keyFeatures;
    @XmlElement(required = true)
    protected String brand;
    protected String manufacturer;
    protected String manufacturerPartNumber;
    protected String modelNumber;
    protected BigInteger multipackQuantity;
    protected BigInteger countPerPack;
    protected String count;
    protected BigInteger pieceCount;
    @XmlElement(required = true)
    protected String mainImageUrl;
    protected ProductSecondaryImageURL productSecondaryImageURL;
    protected String animalType;
    protected String animalBreed;
    protected String animalLifestage;
    protected AnimalEverythingElse.MinimumWeight minimumWeight;
    protected AnimalEverythingElse.MaximumWeight maximumWeight;
    protected String petSize;
    protected String material;
    protected String size;
    protected String color;
    protected AnimalEverythingElse.ColorCategory colorCategory;
    protected String pattern;
    protected String isFoldable;
    protected AnimalEverythingElse.AssembledProductHeight assembledProductHeight;
    protected AnimalEverythingElse.AssembledProductLength assembledProductLength;
    protected AnimalEverythingElse.AssembledProductWeight assembledProductWeight;
    protected AnimalEverythingElse.AssembledProductWidth assembledProductWidth;
    protected String variantGroupId;
    protected AnimalEverythingElse.VariantAttributeNames variantAttributeNames;
    protected String isPrimaryVariant;
    protected String isAerosol;
    protected String hasExpiration;
    protected String batteryTechnologyType;
    protected String hasBatteries;
    protected String hasWarranty;
    protected String warrantyText;
    protected String warrantyURL;
    protected String isChemical;
    protected String hasPricePerUnit;
    protected BigDecimal pricePerUnitQuantity;
    protected String pricePerUnitUom;
    protected String isProp65WarningRequired;
    protected String prop65WarningText;
    protected String requiresTextileActLabeling;
    protected String countryOfOriginTextiles;
    protected AnimalEverythingElse.ShelfLife shelfLife;
    protected String hasFuelContainer;
    protected FabricCareInstructions fabricCareInstructions;
    protected FabricContent fabricContent;
    protected String batteriesRequired;
    protected String instructions;
    protected String sportsLeague;
    protected String sportsTeam;
    protected String isPortable;
    protected BrandLicense globalBrandLicense;
    protected String autographedBy;
    protected String athlete;
    protected AnimalEverythingElse.SwatchImages swatchImages;

    /**
     * 获取shortDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * 设置shortDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * 获取keyFeatures属性的值。
     * 
     * @return
     *     possible object is
     *     {@link KeyFeatures }
     *     
     */
    public KeyFeatures getKeyFeatures() {
        return keyFeatures;
    }

    /**
     * 设置keyFeatures属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link KeyFeatures }
     *     
     */
    public void setKeyFeatures(KeyFeatures value) {
        this.keyFeatures = value;
    }

    /**
     * 获取brand属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置brand属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * 获取manufacturer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * 设置manufacturer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * 获取manufacturerPartNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerPartNumber() {
        return manufacturerPartNumber;
    }

    /**
     * 设置manufacturerPartNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerPartNumber(String value) {
        this.manufacturerPartNumber = value;
    }

    /**
     * 获取modelNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * 设置modelNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
    }

    /**
     * 获取multipackQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMultipackQuantity() {
        return multipackQuantity;
    }

    /**
     * 设置multipackQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMultipackQuantity(BigInteger value) {
        this.multipackQuantity = value;
    }

    /**
     * 获取countPerPack属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountPerPack() {
        return countPerPack;
    }

    /**
     * 设置countPerPack属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountPerPack(BigInteger value) {
        this.countPerPack = value;
    }

    /**
     * 获取count属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCount() {
        return count;
    }

    /**
     * 设置count属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(String value) {
        this.count = value;
    }

    /**
     * 获取pieceCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPieceCount() {
        return pieceCount;
    }

    /**
     * 设置pieceCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPieceCount(BigInteger value) {
        this.pieceCount = value;
    }

    /**
     * 获取mainImageUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainImageUrl() {
        return mainImageUrl;
    }

    /**
     * 设置mainImageUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainImageUrl(String value) {
        this.mainImageUrl = value;
    }

    /**
     * 获取productSecondaryImageURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductSecondaryImageURL }
     *     
     */
    public ProductSecondaryImageURL getProductSecondaryImageURL() {
        return productSecondaryImageURL;
    }

    /**
     * 设置productSecondaryImageURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSecondaryImageURL }
     *     
     */
    public void setProductSecondaryImageURL(ProductSecondaryImageURL value) {
        this.productSecondaryImageURL = value;
    }

    /**
     * 获取animalType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimalType() {
        return animalType;
    }

    /**
     * 设置animalType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimalType(String value) {
        this.animalType = value;
    }

    /**
     * 获取animalBreed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimalBreed() {
        return animalBreed;
    }

    /**
     * 设置animalBreed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimalBreed(String value) {
        this.animalBreed = value;
    }

    /**
     * 获取animalLifestage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimalLifestage() {
        return animalLifestage;
    }

    /**
     * 设置animalLifestage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimalLifestage(String value) {
        this.animalLifestage = value;
    }

    /**
     * 获取minimumWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnimalEverythingElse.MinimumWeight }
     *     
     */
    public AnimalEverythingElse.MinimumWeight getMinimumWeight() {
        return minimumWeight;
    }

    /**
     * 设置minimumWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalEverythingElse.MinimumWeight }
     *     
     */
    public void setMinimumWeight(AnimalEverythingElse.MinimumWeight value) {
        this.minimumWeight = value;
    }

    /**
     * 获取maximumWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnimalEverythingElse.MaximumWeight }
     *     
     */
    public AnimalEverythingElse.MaximumWeight getMaximumWeight() {
        return maximumWeight;
    }

    /**
     * 设置maximumWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalEverythingElse.MaximumWeight }
     *     
     */
    public void setMaximumWeight(AnimalEverythingElse.MaximumWeight value) {
        this.maximumWeight = value;
    }

    /**
     * 获取petSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPetSize() {
        return petSize;
    }

    /**
     * 设置petSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPetSize(String value) {
        this.petSize = value;
    }

    /**
     * 获取material属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * 设置material属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * 获取size属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * 获取color属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置color属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * 获取colorCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnimalEverythingElse.ColorCategory }
     *     
     */
    public AnimalEverythingElse.ColorCategory getColorCategory() {
        return colorCategory;
    }

    /**
     * 设置colorCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalEverythingElse.ColorCategory }
     *     
     */
    public void setColorCategory(AnimalEverythingElse.ColorCategory value) {
        this.colorCategory = value;
    }

    /**
     * 获取pattern属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * 设置pattern属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * 获取isFoldable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsFoldable() {
        return isFoldable;
    }

    /**
     * 设置isFoldable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsFoldable(String value) {
        this.isFoldable = value;
    }

    /**
     * 获取assembledProductHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnimalEverythingElse.AssembledProductHeight }
     *     
     */
    public AnimalEverythingElse.AssembledProductHeight getAssembledProductHeight() {
        return assembledProductHeight;
    }

    /**
     * 设置assembledProductHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalEverythingElse.AssembledProductHeight }
     *     
     */
    public void setAssembledProductHeight(AnimalEverythingElse.AssembledProductHeight value) {
        this.assembledProductHeight = value;
    }

    /**
     * 获取assembledProductLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnimalEverythingElse.AssembledProductLength }
     *     
     */
    public AnimalEverythingElse.AssembledProductLength getAssembledProductLength() {
        return assembledProductLength;
    }

    /**
     * 设置assembledProductLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalEverythingElse.AssembledProductLength }
     *     
     */
    public void setAssembledProductLength(AnimalEverythingElse.AssembledProductLength value) {
        this.assembledProductLength = value;
    }

    /**
     * 获取assembledProductWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnimalEverythingElse.AssembledProductWeight }
     *     
     */
    public AnimalEverythingElse.AssembledProductWeight getAssembledProductWeight() {
        return assembledProductWeight;
    }

    /**
     * 设置assembledProductWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalEverythingElse.AssembledProductWeight }
     *     
     */
    public void setAssembledProductWeight(AnimalEverythingElse.AssembledProductWeight value) {
        this.assembledProductWeight = value;
    }

    /**
     * 获取assembledProductWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnimalEverythingElse.AssembledProductWidth }
     *     
     */
    public AnimalEverythingElse.AssembledProductWidth getAssembledProductWidth() {
        return assembledProductWidth;
    }

    /**
     * 设置assembledProductWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalEverythingElse.AssembledProductWidth }
     *     
     */
    public void setAssembledProductWidth(AnimalEverythingElse.AssembledProductWidth value) {
        this.assembledProductWidth = value;
    }

    /**
     * 获取variantGroupId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariantGroupId() {
        return variantGroupId;
    }

    /**
     * 设置variantGroupId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariantGroupId(String value) {
        this.variantGroupId = value;
    }

    /**
     * 获取variantAttributeNames属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnimalEverythingElse.VariantAttributeNames }
     *     
     */
    public AnimalEverythingElse.VariantAttributeNames getVariantAttributeNames() {
        return variantAttributeNames;
    }

    /**
     * 设置variantAttributeNames属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalEverythingElse.VariantAttributeNames }
     *     
     */
    public void setVariantAttributeNames(AnimalEverythingElse.VariantAttributeNames value) {
        this.variantAttributeNames = value;
    }

    /**
     * 获取isPrimaryVariant属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPrimaryVariant() {
        return isPrimaryVariant;
    }

    /**
     * 设置isPrimaryVariant属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPrimaryVariant(String value) {
        this.isPrimaryVariant = value;
    }

    /**
     * 获取isAerosol属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAerosol() {
        return isAerosol;
    }

    /**
     * 设置isAerosol属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAerosol(String value) {
        this.isAerosol = value;
    }

    /**
     * 获取hasExpiration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasExpiration() {
        return hasExpiration;
    }

    /**
     * 设置hasExpiration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasExpiration(String value) {
        this.hasExpiration = value;
    }

    /**
     * 获取batteryTechnologyType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatteryTechnologyType() {
        return batteryTechnologyType;
    }

    /**
     * 设置batteryTechnologyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatteryTechnologyType(String value) {
        this.batteryTechnologyType = value;
    }

    /**
     * 获取hasBatteries属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasBatteries() {
        return hasBatteries;
    }

    /**
     * 设置hasBatteries属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasBatteries(String value) {
        this.hasBatteries = value;
    }

    /**
     * 获取hasWarranty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasWarranty() {
        return hasWarranty;
    }

    /**
     * 设置hasWarranty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasWarranty(String value) {
        this.hasWarranty = value;
    }

    /**
     * 获取warrantyText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyText() {
        return warrantyText;
    }

    /**
     * 设置warrantyText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyText(String value) {
        this.warrantyText = value;
    }

    /**
     * 获取warrantyURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyURL() {
        return warrantyURL;
    }

    /**
     * 设置warrantyURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyURL(String value) {
        this.warrantyURL = value;
    }

    /**
     * 获取isChemical属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsChemical() {
        return isChemical;
    }

    /**
     * 设置isChemical属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsChemical(String value) {
        this.isChemical = value;
    }

    /**
     * 获取hasPricePerUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasPricePerUnit() {
        return hasPricePerUnit;
    }

    /**
     * 设置hasPricePerUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasPricePerUnit(String value) {
        this.hasPricePerUnit = value;
    }

    /**
     * 获取pricePerUnitQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricePerUnitQuantity() {
        return pricePerUnitQuantity;
    }

    /**
     * 设置pricePerUnitQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricePerUnitQuantity(BigDecimal value) {
        this.pricePerUnitQuantity = value;
    }

    /**
     * 获取pricePerUnitUom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePerUnitUom() {
        return pricePerUnitUom;
    }

    /**
     * 设置pricePerUnitUom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePerUnitUom(String value) {
        this.pricePerUnitUom = value;
    }

    /**
     * 获取isProp65WarningRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsProp65WarningRequired() {
        return isProp65WarningRequired;
    }

    /**
     * 设置isProp65WarningRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsProp65WarningRequired(String value) {
        this.isProp65WarningRequired = value;
    }

    /**
     * 获取prop65WarningText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProp65WarningText() {
        return prop65WarningText;
    }

    /**
     * 设置prop65WarningText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProp65WarningText(String value) {
        this.prop65WarningText = value;
    }

    /**
     * 获取requiresTextileActLabeling属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiresTextileActLabeling() {
        return requiresTextileActLabeling;
    }

    /**
     * 设置requiresTextileActLabeling属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiresTextileActLabeling(String value) {
        this.requiresTextileActLabeling = value;
    }

    /**
     * 获取countryOfOriginTextiles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfOriginTextiles() {
        return countryOfOriginTextiles;
    }

    /**
     * 设置countryOfOriginTextiles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfOriginTextiles(String value) {
        this.countryOfOriginTextiles = value;
    }

    /**
     * 获取shelfLife属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnimalEverythingElse.ShelfLife }
     *     
     */
    public AnimalEverythingElse.ShelfLife getShelfLife() {
        return shelfLife;
    }

    /**
     * 设置shelfLife属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalEverythingElse.ShelfLife }
     *     
     */
    public void setShelfLife(AnimalEverythingElse.ShelfLife value) {
        this.shelfLife = value;
    }

    /**
     * 获取hasFuelContainer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasFuelContainer() {
        return hasFuelContainer;
    }

    /**
     * 设置hasFuelContainer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasFuelContainer(String value) {
        this.hasFuelContainer = value;
    }

    /**
     * 获取fabricCareInstructions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FabricCareInstructions }
     *     
     */
    public FabricCareInstructions getFabricCareInstructions() {
        return fabricCareInstructions;
    }

    /**
     * 设置fabricCareInstructions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FabricCareInstructions }
     *     
     */
    public void setFabricCareInstructions(FabricCareInstructions value) {
        this.fabricCareInstructions = value;
    }

    /**
     * 获取fabricContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FabricContent }
     *     
     */
    public FabricContent getFabricContent() {
        return fabricContent;
    }

    /**
     * 设置fabricContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FabricContent }
     *     
     */
    public void setFabricContent(FabricContent value) {
        this.fabricContent = value;
    }

    /**
     * 获取batteriesRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatteriesRequired() {
        return batteriesRequired;
    }

    /**
     * 设置batteriesRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatteriesRequired(String value) {
        this.batteriesRequired = value;
    }

    /**
     * 获取instructions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * 设置instructions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructions(String value) {
        this.instructions = value;
    }

    /**
     * 获取sportsLeague属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSportsLeague() {
        return sportsLeague;
    }

    /**
     * 设置sportsLeague属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSportsLeague(String value) {
        this.sportsLeague = value;
    }

    /**
     * 获取sportsTeam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSportsTeam() {
        return sportsTeam;
    }

    /**
     * 设置sportsTeam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSportsTeam(String value) {
        this.sportsTeam = value;
    }

    /**
     * 获取isPortable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPortable() {
        return isPortable;
    }

    /**
     * 设置isPortable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPortable(String value) {
        this.isPortable = value;
    }

    /**
     * 获取globalBrandLicense属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BrandLicense }
     *     
     */
    public BrandLicense getGlobalBrandLicense() {
        return globalBrandLicense;
    }

    /**
     * 设置globalBrandLicense属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BrandLicense }
     *     
     */
    public void setGlobalBrandLicense(BrandLicense value) {
        this.globalBrandLicense = value;
    }

    /**
     * 获取autographedBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutographedBy() {
        return autographedBy;
    }

    /**
     * 设置autographedBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutographedBy(String value) {
        this.autographedBy = value;
    }

    /**
     * 获取athlete属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAthlete() {
        return athlete;
    }

    /**
     * 设置athlete属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAthlete(String value) {
        this.athlete = value;
    }

    /**
     * 获取swatchImages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AnimalEverythingElse.SwatchImages }
     *     
     */
    public AnimalEverythingElse.SwatchImages getSwatchImages() {
        return swatchImages;
    }

    /**
     * 设置swatchImages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalEverythingElse.SwatchImages }
     *     
     */
    public void setSwatchImages(AnimalEverythingElse.SwatchImages value) {
        this.swatchImages = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="measure"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *               &lt;totalDigits value="16"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="unit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="in"/&gt;
     *               &lt;enumeration value="ft"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class AssembledProductHeight {

        @XmlElement(required = true)
        protected BigDecimal measure;
        @XmlElement(required = true)
        protected String unit;

        /**
         * 获取measure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMeasure() {
            return measure;
        }

        /**
         * 设置measure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMeasure(BigDecimal value) {
            this.measure = value;
        }

        /**
         * 获取unit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * 设置unit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit(String value) {
            this.unit = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="measure"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *               &lt;totalDigits value="16"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="unit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="in"/&gt;
     *               &lt;enumeration value="ft"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class AssembledProductLength {

        @XmlElement(required = true)
        protected BigDecimal measure;
        @XmlElement(required = true)
        protected String unit;

        /**
         * 获取measure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMeasure() {
            return measure;
        }

        /**
         * 设置measure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMeasure(BigDecimal value) {
            this.measure = value;
        }

        /**
         * 获取unit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * 设置unit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit(String value) {
            this.unit = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="measure"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *               &lt;totalDigits value="16"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="unit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="oz"/&gt;
     *               &lt;enumeration value="lb"/&gt;
     *               &lt;enumeration value="g"/&gt;
     *               &lt;enumeration value="kg"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class AssembledProductWeight {

        @XmlElement(required = true)
        protected BigDecimal measure;
        @XmlElement(required = true)
        protected String unit;

        /**
         * 获取measure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMeasure() {
            return measure;
        }

        /**
         * 设置measure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMeasure(BigDecimal value) {
            this.measure = value;
        }

        /**
         * 获取unit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * 设置unit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit(String value) {
            this.unit = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="measure"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *               &lt;totalDigits value="16"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="unit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="in"/&gt;
     *               &lt;enumeration value="ft"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class AssembledProductWidth {

        @XmlElement(required = true)
        protected BigDecimal measure;
        @XmlElement(required = true)
        protected String unit;

        /**
         * 获取measure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMeasure() {
            return measure;
        }

        /**
         * 设置measure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMeasure(BigDecimal value) {
            this.measure = value;
        }

        /**
         * 获取unit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * 设置unit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit(String value) {
            this.unit = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="colorCategoryValue" maxOccurs="unbounded"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Beige"/&gt;
     *               &lt;enumeration value="Black"/&gt;
     *               &lt;enumeration value="Blue"/&gt;
     *               &lt;enumeration value="Bronze"/&gt;
     *               &lt;enumeration value="Brown"/&gt;
     *               &lt;enumeration value="Clear"/&gt;
     *               &lt;enumeration value="Gold"/&gt;
     *               &lt;enumeration value="Gray"/&gt;
     *               &lt;enumeration value="Green"/&gt;
     *               &lt;enumeration value="Multi-color"/&gt;
     *               &lt;enumeration value="Off-White"/&gt;
     *               &lt;enumeration value="Orange"/&gt;
     *               &lt;enumeration value="Pink"/&gt;
     *               &lt;enumeration value="Purple"/&gt;
     *               &lt;enumeration value="Red"/&gt;
     *               &lt;enumeration value="Silver"/&gt;
     *               &lt;enumeration value="White"/&gt;
     *               &lt;enumeration value="Yellow"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "colorCategoryValue"
    })
    public static class ColorCategory {

        @XmlElement(required = true)
        protected List<String> colorCategoryValue;

        /**
         * Gets the value of the colorCategoryValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the colorCategoryValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getColorCategoryValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getColorCategoryValue() {
            if (colorCategoryValue == null) {
                colorCategoryValue = new ArrayList<String>();
            }
            return this.colorCategoryValue;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="measure"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *               &lt;totalDigits value="16"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="unit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="lb"/&gt;
     *               &lt;enumeration value="kg"/&gt;
     *               &lt;enumeration value="oz"/&gt;
     *               &lt;enumeration value="g"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class MaximumWeight {

        @XmlElement(required = true)
        protected BigDecimal measure;
        @XmlElement(required = true)
        protected String unit;

        /**
         * 获取measure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMeasure() {
            return measure;
        }

        /**
         * 设置measure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMeasure(BigDecimal value) {
            this.measure = value;
        }

        /**
         * 获取unit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * 设置unit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit(String value) {
            this.unit = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="measure"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *               &lt;totalDigits value="16"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="unit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="lb"/&gt;
     *               &lt;enumeration value="kg"/&gt;
     *               &lt;enumeration value="oz"/&gt;
     *               &lt;enumeration value="g"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class MinimumWeight {

        @XmlElement(required = true)
        protected BigDecimal measure;
        @XmlElement(required = true)
        protected String unit;

        /**
         * 获取measure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMeasure() {
            return measure;
        }

        /**
         * 设置measure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMeasure(BigDecimal value) {
            this.measure = value;
        }

        /**
         * 获取unit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * 设置unit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit(String value) {
            this.unit = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="measure"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="400"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="unit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="days"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class ShelfLife {

        @XmlElement(required = true)
        protected BigInteger measure;
        @XmlElement(required = true)
        protected String unit;

        /**
         * 获取measure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMeasure() {
            return measure;
        }

        /**
         * 设置measure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMeasure(BigInteger value) {
            this.measure = value;
        }

        /**
         * 获取unit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnit() {
            return unit;
        }

        /**
         * 设置unit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnit(String value) {
            this.unit = value;
        }

    }


    /**
     * Enter the swatch image location in "Swatch Image URL" and its corresponding variant attribute name in "Swatch Variant Attribute". Required for products with visual variations, like color or pattern. List the swatches in the order you recommend they appear on the site.
     * 
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="swatchImage" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="swatchVariantAttribute"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="color"/&gt;
     *                         &lt;enumeration value="size"/&gt;
     *                         &lt;enumeration value="countPerPack"/&gt;
     *                         &lt;enumeration value="count"/&gt;
     *                         &lt;enumeration value="flavor"/&gt;
     *                         &lt;enumeration value="assembledProductLength"/&gt;
     *                         &lt;enumeration value="assembledProductWidth"/&gt;
     *                         &lt;enumeration value="assembledProductHeight"/&gt;
     *                         &lt;enumeration value="scent"/&gt;
     *                         &lt;enumeration value="capacity"/&gt;
     *                         &lt;enumeration value="shape"/&gt;
     *                         &lt;enumeration value="sportsTeam"/&gt;
     *                         &lt;enumeration value="character"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="swatchImageUrl"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "swatchImage"
    })
    public static class SwatchImages {

        @XmlElement(required = true)
        protected List<AnimalEverythingElse.SwatchImages.SwatchImage> swatchImage;

        /**
         * Gets the value of the swatchImage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the swatchImage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSwatchImage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AnimalEverythingElse.SwatchImages.SwatchImage }
         * 
         * 
         */
        public List<AnimalEverythingElse.SwatchImages.SwatchImage> getSwatchImage() {
            if (swatchImage == null) {
                swatchImage = new ArrayList<AnimalEverythingElse.SwatchImages.SwatchImage>();
            }
            return this.swatchImage;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="swatchVariantAttribute"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="color"/&gt;
         *               &lt;enumeration value="size"/&gt;
         *               &lt;enumeration value="countPerPack"/&gt;
         *               &lt;enumeration value="count"/&gt;
         *               &lt;enumeration value="flavor"/&gt;
         *               &lt;enumeration value="assembledProductLength"/&gt;
         *               &lt;enumeration value="assembledProductWidth"/&gt;
         *               &lt;enumeration value="assembledProductHeight"/&gt;
         *               &lt;enumeration value="scent"/&gt;
         *               &lt;enumeration value="capacity"/&gt;
         *               &lt;enumeration value="shape"/&gt;
         *               &lt;enumeration value="sportsTeam"/&gt;
         *               &lt;enumeration value="character"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="swatchImageUrl"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class SwatchImage {

            @XmlElement(required = true)
            protected String swatchVariantAttribute;
            @XmlElement(required = true)
            protected String swatchImageUrl;

            /**
             * 获取swatchVariantAttribute属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSwatchVariantAttribute() {
                return swatchVariantAttribute;
            }

            /**
             * 设置swatchVariantAttribute属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSwatchVariantAttribute(String value) {
                this.swatchVariantAttribute = value;
            }

            /**
             * 获取swatchImageUrl属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSwatchImageUrl() {
                return swatchImageUrl;
            }

            /**
             * 设置swatchImageUrl属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSwatchImageUrl(String value) {
                this.swatchImageUrl = value;
            }

        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="variantAttributeName" maxOccurs="unbounded"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="color"/&gt;
     *               &lt;enumeration value="size"/&gt;
     *               &lt;enumeration value="countPerPack"/&gt;
     *               &lt;enumeration value="count"/&gt;
     *               &lt;enumeration value="flavor"/&gt;
     *               &lt;enumeration value="assembledProductLength"/&gt;
     *               &lt;enumeration value="assembledProductWidth"/&gt;
     *               &lt;enumeration value="assembledProductHeight"/&gt;
     *               &lt;enumeration value="scent"/&gt;
     *               &lt;enumeration value="capacity"/&gt;
     *               &lt;enumeration value="shape"/&gt;
     *               &lt;enumeration value="sportsTeam"/&gt;
     *               &lt;enumeration value="character"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "variantAttributeName"
    })
    public static class VariantAttributeNames {

        @XmlElement(required = true)
        protected List<String> variantAttributeName;

        /**
         * Gets the value of the variantAttributeName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the variantAttributeName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVariantAttributeName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVariantAttributeName() {
            if (variantAttributeName == null) {
                variantAttributeName = new ArrayList<String>();
            }
            return this.variantAttributeName;
        }

    }

}
