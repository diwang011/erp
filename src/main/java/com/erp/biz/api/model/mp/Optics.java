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
 * <p>Optics complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Optics"&gt;
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
 *         &lt;element name="gender" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Male"/&gt;
 *               &lt;enumeration value="Female"/&gt;
 *               &lt;enumeration value="Unisex"/&gt;
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
 *         &lt;element name="ageGroup" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ageGroupValue" maxOccurs="unbounded"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Infant"/&gt;
 *                         &lt;enumeration value="Toddler"/&gt;
 *                         &lt;enumeration value="Child"/&gt;
 *                         &lt;enumeration value="Teen"/&gt;
 *                         &lt;enumeration value="Adult"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ageRange" type="{http://walmart.com/}AgeRange" minOccurs="0"/&gt;
 *         &lt;element name="digitalZoom" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="opticalZoom" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lensDiameter" minOccurs="0"&gt;
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
 *                         &lt;enumeration value="mm"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lensCoating" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sensorResolution" type="{http://walmart.com/}ResolutionUnit" minOccurs="0"/&gt;
 *         &lt;element name="magnification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="focusType" type="{http://walmart.com/}FocusType" minOccurs="0"/&gt;
 *         &lt;element name="fieldOfView" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isParfocal" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="focalRatio" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="displayTechnology" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="displayResolution" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hasNightVision" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
 *                         &lt;enumeration value="assembledProductWeight"/&gt;
 *                         &lt;enumeration value="material"/&gt;
 *                         &lt;enumeration value="shoeSize"/&gt;
 *                         &lt;enumeration value="clothingSize"/&gt;
 *                         &lt;enumeration value="sportsTeam"/&gt;
 *                         &lt;enumeration value="sportsLeague"/&gt;
 *                         &lt;enumeration value="compatibleDevices"/&gt;
 *                         &lt;enumeration value="dexterity"/&gt;
 *                         &lt;enumeration value="capacity"/&gt;
 *                         &lt;enumeration value="shape"/&gt;
 *                         &lt;enumeration value="countPerPack"/&gt;
 *                         &lt;enumeration value="count"/&gt;
 *                         &lt;enumeration value="caliber"/&gt;
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
 *         &lt;element name="isChemical" minOccurs="0"&gt;
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
 *         &lt;element name="warrantyURL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
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
 *         &lt;element name="isAssemblyRequired" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="assemblyInstructions" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
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
 *         &lt;element name="dexterity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="globalBrandLicense" type="{http://walmart.com/}BrandLicense" minOccurs="0"/&gt;
 *         &lt;element name="screenSize" minOccurs="0"&gt;
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
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hasLcdScreen" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="powerType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isMulticoated" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isLockable" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="lockType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hasMemoryCardSlot" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isFogResistant" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="operatingTemperature" minOccurs="0"&gt;
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
 *                         &lt;enumeration value="\u00baF"/&gt;
 *                         &lt;enumeration value="\u00baC"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hasDovetailBarSystem" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="attachmentStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="features" type="{http://walmart.com/}AdditionalFeatures" minOccurs="0"/&gt;
 *         &lt;element name="keywords" minOccurs="0"&gt;
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
 *         &lt;element name="sport" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pattern" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="wirelessTechnologies" type="{http://walmart.com/}WirelessTechnologies" minOccurs="0"/&gt;
 *         &lt;element name="isPortable" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
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
 *         &lt;element name="isWeatherResistant" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isWaterproof" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isPowered" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cleaningCareAndMaintenance" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="recommendedUses" type="{http://walmart.com/}RecommendedUses" minOccurs="0"/&gt;
 *         &lt;element name="recommendedLocations" type="{http://walmart.com/}RecommendedLocations" minOccurs="0"/&gt;
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
 *                                   &lt;enumeration value="assembledProductWeight"/&gt;
 *                                   &lt;enumeration value="material"/&gt;
 *                                   &lt;enumeration value="shoeSize"/&gt;
 *                                   &lt;enumeration value="clothingSize"/&gt;
 *                                   &lt;enumeration value="sportsTeam"/&gt;
 *                                   &lt;enumeration value="sportsLeague"/&gt;
 *                                   &lt;enumeration value="compatibleDevices"/&gt;
 *                                   &lt;enumeration value="dexterity"/&gt;
 *                                   &lt;enumeration value="capacity"/&gt;
 *                                   &lt;enumeration value="shape"/&gt;
 *                                   &lt;enumeration value="countPerPack"/&gt;
 *                                   &lt;enumeration value="count"/&gt;
 *                                   &lt;enumeration value="caliber"/&gt;
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
@XmlType(name = "Optics", propOrder = {

})
public class Optics {

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
    protected String gender;
    protected String size;
    protected Optics.AgeGroup ageGroup;
    protected AgeRange ageRange;
    protected String digitalZoom;
    protected String opticalZoom;
    protected Optics.LensDiameter lensDiameter;
    protected String lensCoating;
    protected ResolutionUnit sensorResolution;
    protected String magnification;
    protected FocusType focusType;
    protected String fieldOfView;
    protected String isParfocal;
    protected String focalRatio;
    protected String displayTechnology;
    protected String displayResolution;
    protected String hasNightVision;
    protected Optics.AssembledProductLength assembledProductLength;
    protected Optics.AssembledProductWidth assembledProductWidth;
    protected Optics.AssembledProductHeight assembledProductHeight;
    protected Optics.AssembledProductWeight assembledProductWeight;
    protected String variantGroupId;
    protected Optics.VariantAttributeNames variantAttributeNames;
    protected String isPrimaryVariant;
    protected String isProp65WarningRequired;
    protected String prop65WarningText;
    protected String batteryTechnologyType;
    protected String isChemical;
    protected String hasWarranty;
    protected String warrantyURL;
    protected String warrantyText;
    protected String isAssemblyRequired;
    protected String assemblyInstructions;
    protected String material;
    protected String dexterity;
    protected BrandLicense globalBrandLicense;
    protected Optics.ScreenSize screenSize;
    protected String hasLcdScreen;
    protected String powerType;
    protected String isMulticoated;
    protected String isLockable;
    protected String lockType;
    protected String hasMemoryCardSlot;
    protected String isFogResistant;
    protected Optics.OperatingTemperature operatingTemperature;
    protected String hasDovetailBarSystem;
    protected String attachmentStyle;
    protected AdditionalFeatures features;
    protected String keywords;
    protected String color;
    protected Optics.ColorCategory colorCategory;
    protected String sport;
    protected String pattern;
    protected WirelessTechnologies wirelessTechnologies;
    protected String isPortable;
    protected String isFoldable;
    protected String isWeatherResistant;
    protected String isWaterproof;
    protected String isPowered;
    protected String cleaningCareAndMaintenance;
    protected RecommendedUses recommendedUses;
    protected RecommendedLocations recommendedLocations;
    protected Optics.SwatchImages swatchImages;

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
     * 获取gender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置gender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
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
     * 获取ageGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Optics.AgeGroup }
     *     
     */
    public Optics.AgeGroup getAgeGroup() {
        return ageGroup;
    }

    /**
     * 设置ageGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Optics.AgeGroup }
     *     
     */
    public void setAgeGroup(Optics.AgeGroup value) {
        this.ageGroup = value;
    }

    /**
     * 获取ageRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AgeRange }
     *     
     */
    public AgeRange getAgeRange() {
        return ageRange;
    }

    /**
     * 设置ageRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AgeRange }
     *     
     */
    public void setAgeRange(AgeRange value) {
        this.ageRange = value;
    }

    /**
     * 获取digitalZoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalZoom() {
        return digitalZoom;
    }

    /**
     * 设置digitalZoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalZoom(String value) {
        this.digitalZoom = value;
    }

    /**
     * 获取opticalZoom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpticalZoom() {
        return opticalZoom;
    }

    /**
     * 设置opticalZoom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpticalZoom(String value) {
        this.opticalZoom = value;
    }

    /**
     * 获取lensDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Optics.LensDiameter }
     *     
     */
    public Optics.LensDiameter getLensDiameter() {
        return lensDiameter;
    }

    /**
     * 设置lensDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Optics.LensDiameter }
     *     
     */
    public void setLensDiameter(Optics.LensDiameter value) {
        this.lensDiameter = value;
    }

    /**
     * 获取lensCoating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLensCoating() {
        return lensCoating;
    }

    /**
     * 设置lensCoating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLensCoating(String value) {
        this.lensCoating = value;
    }

    /**
     * 获取sensorResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResolutionUnit }
     *     
     */
    public ResolutionUnit getSensorResolution() {
        return sensorResolution;
    }

    /**
     * 设置sensorResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResolutionUnit }
     *     
     */
    public void setSensorResolution(ResolutionUnit value) {
        this.sensorResolution = value;
    }

    /**
     * 获取magnification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMagnification() {
        return magnification;
    }

    /**
     * 设置magnification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMagnification(String value) {
        this.magnification = value;
    }

    /**
     * 获取focusType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FocusType }
     *     
     */
    public FocusType getFocusType() {
        return focusType;
    }

    /**
     * 设置focusType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FocusType }
     *     
     */
    public void setFocusType(FocusType value) {
        this.focusType = value;
    }

    /**
     * 获取fieldOfView属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldOfView() {
        return fieldOfView;
    }

    /**
     * 设置fieldOfView属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldOfView(String value) {
        this.fieldOfView = value;
    }

    /**
     * 获取isParfocal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsParfocal() {
        return isParfocal;
    }

    /**
     * 设置isParfocal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsParfocal(String value) {
        this.isParfocal = value;
    }

    /**
     * 获取focalRatio属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFocalRatio() {
        return focalRatio;
    }

    /**
     * 设置focalRatio属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFocalRatio(String value) {
        this.focalRatio = value;
    }

    /**
     * 获取displayTechnology属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayTechnology() {
        return displayTechnology;
    }

    /**
     * 设置displayTechnology属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayTechnology(String value) {
        this.displayTechnology = value;
    }

    /**
     * 获取displayResolution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayResolution() {
        return displayResolution;
    }

    /**
     * 设置displayResolution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayResolution(String value) {
        this.displayResolution = value;
    }

    /**
     * 获取hasNightVision属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasNightVision() {
        return hasNightVision;
    }

    /**
     * 设置hasNightVision属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasNightVision(String value) {
        this.hasNightVision = value;
    }

    /**
     * 获取assembledProductLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Optics.AssembledProductLength }
     *     
     */
    public Optics.AssembledProductLength getAssembledProductLength() {
        return assembledProductLength;
    }

    /**
     * 设置assembledProductLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Optics.AssembledProductLength }
     *     
     */
    public void setAssembledProductLength(Optics.AssembledProductLength value) {
        this.assembledProductLength = value;
    }

    /**
     * 获取assembledProductWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Optics.AssembledProductWidth }
     *     
     */
    public Optics.AssembledProductWidth getAssembledProductWidth() {
        return assembledProductWidth;
    }

    /**
     * 设置assembledProductWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Optics.AssembledProductWidth }
     *     
     */
    public void setAssembledProductWidth(Optics.AssembledProductWidth value) {
        this.assembledProductWidth = value;
    }

    /**
     * 获取assembledProductHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Optics.AssembledProductHeight }
     *     
     */
    public Optics.AssembledProductHeight getAssembledProductHeight() {
        return assembledProductHeight;
    }

    /**
     * 设置assembledProductHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Optics.AssembledProductHeight }
     *     
     */
    public void setAssembledProductHeight(Optics.AssembledProductHeight value) {
        this.assembledProductHeight = value;
    }

    /**
     * 获取assembledProductWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Optics.AssembledProductWeight }
     *     
     */
    public Optics.AssembledProductWeight getAssembledProductWeight() {
        return assembledProductWeight;
    }

    /**
     * 设置assembledProductWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Optics.AssembledProductWeight }
     *     
     */
    public void setAssembledProductWeight(Optics.AssembledProductWeight value) {
        this.assembledProductWeight = value;
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
     *     {@link Optics.VariantAttributeNames }
     *     
     */
    public Optics.VariantAttributeNames getVariantAttributeNames() {
        return variantAttributeNames;
    }

    /**
     * 设置variantAttributeNames属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Optics.VariantAttributeNames }
     *     
     */
    public void setVariantAttributeNames(Optics.VariantAttributeNames value) {
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
     * 获取isAssemblyRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAssemblyRequired() {
        return isAssemblyRequired;
    }

    /**
     * 设置isAssemblyRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAssemblyRequired(String value) {
        this.isAssemblyRequired = value;
    }

    /**
     * 获取assemblyInstructions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssemblyInstructions() {
        return assemblyInstructions;
    }

    /**
     * 设置assemblyInstructions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssemblyInstructions(String value) {
        this.assemblyInstructions = value;
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
     * 获取dexterity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDexterity() {
        return dexterity;
    }

    /**
     * 设置dexterity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDexterity(String value) {
        this.dexterity = value;
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
     * 获取screenSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Optics.ScreenSize }
     *     
     */
    public Optics.ScreenSize getScreenSize() {
        return screenSize;
    }

    /**
     * 设置screenSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Optics.ScreenSize }
     *     
     */
    public void setScreenSize(Optics.ScreenSize value) {
        this.screenSize = value;
    }

    /**
     * 获取hasLcdScreen属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasLcdScreen() {
        return hasLcdScreen;
    }

    /**
     * 设置hasLcdScreen属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasLcdScreen(String value) {
        this.hasLcdScreen = value;
    }

    /**
     * 获取powerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPowerType() {
        return powerType;
    }

    /**
     * 设置powerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPowerType(String value) {
        this.powerType = value;
    }

    /**
     * 获取isMulticoated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMulticoated() {
        return isMulticoated;
    }

    /**
     * 设置isMulticoated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMulticoated(String value) {
        this.isMulticoated = value;
    }

    /**
     * 获取isLockable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsLockable() {
        return isLockable;
    }

    /**
     * 设置isLockable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsLockable(String value) {
        this.isLockable = value;
    }

    /**
     * 获取lockType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockType() {
        return lockType;
    }

    /**
     * 设置lockType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockType(String value) {
        this.lockType = value;
    }

    /**
     * 获取hasMemoryCardSlot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasMemoryCardSlot() {
        return hasMemoryCardSlot;
    }

    /**
     * 设置hasMemoryCardSlot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasMemoryCardSlot(String value) {
        this.hasMemoryCardSlot = value;
    }

    /**
     * 获取isFogResistant属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsFogResistant() {
        return isFogResistant;
    }

    /**
     * 设置isFogResistant属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsFogResistant(String value) {
        this.isFogResistant = value;
    }

    /**
     * 获取operatingTemperature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Optics.OperatingTemperature }
     *     
     */
    public Optics.OperatingTemperature getOperatingTemperature() {
        return operatingTemperature;
    }

    /**
     * 设置operatingTemperature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Optics.OperatingTemperature }
     *     
     */
    public void setOperatingTemperature(Optics.OperatingTemperature value) {
        this.operatingTemperature = value;
    }

    /**
     * 获取hasDovetailBarSystem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasDovetailBarSystem() {
        return hasDovetailBarSystem;
    }

    /**
     * 设置hasDovetailBarSystem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasDovetailBarSystem(String value) {
        this.hasDovetailBarSystem = value;
    }

    /**
     * 获取attachmentStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentStyle() {
        return attachmentStyle;
    }

    /**
     * 设置attachmentStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentStyle(String value) {
        this.attachmentStyle = value;
    }

    /**
     * 获取features属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AdditionalFeatures }
     *     
     */
    public AdditionalFeatures getFeatures() {
        return features;
    }

    /**
     * 设置features属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalFeatures }
     *     
     */
    public void setFeatures(AdditionalFeatures value) {
        this.features = value;
    }

    /**
     * 获取keywords属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * 设置keywords属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
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
     *     {@link Optics.ColorCategory }
     *     
     */
    public Optics.ColorCategory getColorCategory() {
        return colorCategory;
    }

    /**
     * 设置colorCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Optics.ColorCategory }
     *     
     */
    public void setColorCategory(Optics.ColorCategory value) {
        this.colorCategory = value;
    }

    /**
     * 获取sport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSport() {
        return sport;
    }

    /**
     * 设置sport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSport(String value) {
        this.sport = value;
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
     * 获取wirelessTechnologies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WirelessTechnologies }
     *     
     */
    public WirelessTechnologies getWirelessTechnologies() {
        return wirelessTechnologies;
    }

    /**
     * 设置wirelessTechnologies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WirelessTechnologies }
     *     
     */
    public void setWirelessTechnologies(WirelessTechnologies value) {
        this.wirelessTechnologies = value;
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
     * 获取isWeatherResistant属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsWeatherResistant() {
        return isWeatherResistant;
    }

    /**
     * 设置isWeatherResistant属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsWeatherResistant(String value) {
        this.isWeatherResistant = value;
    }

    /**
     * 获取isWaterproof属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsWaterproof() {
        return isWaterproof;
    }

    /**
     * 设置isWaterproof属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsWaterproof(String value) {
        this.isWaterproof = value;
    }

    /**
     * 获取isPowered属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPowered() {
        return isPowered;
    }

    /**
     * 设置isPowered属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPowered(String value) {
        this.isPowered = value;
    }

    /**
     * 获取cleaningCareAndMaintenance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCleaningCareAndMaintenance() {
        return cleaningCareAndMaintenance;
    }

    /**
     * 设置cleaningCareAndMaintenance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCleaningCareAndMaintenance(String value) {
        this.cleaningCareAndMaintenance = value;
    }

    /**
     * 获取recommendedUses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecommendedUses }
     *     
     */
    public RecommendedUses getRecommendedUses() {
        return recommendedUses;
    }

    /**
     * 设置recommendedUses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendedUses }
     *     
     */
    public void setRecommendedUses(RecommendedUses value) {
        this.recommendedUses = value;
    }

    /**
     * 获取recommendedLocations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecommendedLocations }
     *     
     */
    public RecommendedLocations getRecommendedLocations() {
        return recommendedLocations;
    }

    /**
     * 设置recommendedLocations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendedLocations }
     *     
     */
    public void setRecommendedLocations(RecommendedLocations value) {
        this.recommendedLocations = value;
    }

    /**
     * 获取swatchImages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Optics.SwatchImages }
     *     
     */
    public Optics.SwatchImages getSwatchImages() {
        return swatchImages;
    }

    /**
     * 设置swatchImages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Optics.SwatchImages }
     *     
     */
    public void setSwatchImages(Optics.SwatchImages value) {
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
     *       &lt;sequence&gt;
     *         &lt;element name="ageGroupValue" maxOccurs="unbounded"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Infant"/&gt;
     *               &lt;enumeration value="Toddler"/&gt;
     *               &lt;enumeration value="Child"/&gt;
     *               &lt;enumeration value="Teen"/&gt;
     *               &lt;enumeration value="Adult"/&gt;
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
        "ageGroupValue"
    })
    public static class AgeGroup {

        @XmlElement(required = true)
        protected List<String> ageGroupValue;

        /**
         * Gets the value of the ageGroupValue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ageGroupValue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAgeGroupValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAgeGroupValue() {
            if (ageGroupValue == null) {
                ageGroupValue = new ArrayList<String>();
            }
            return this.ageGroupValue;
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
     *               &lt;enumeration value="mm"/&gt;
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
    public static class LensDiameter {

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
     *               &lt;enumeration value="\u00baF"/&gt;
     *               &lt;enumeration value="\u00baC"/&gt;
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
    public static class OperatingTemperature {

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
    public static class ScreenSize {

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
     *                         &lt;enumeration value="assembledProductWeight"/&gt;
     *                         &lt;enumeration value="material"/&gt;
     *                         &lt;enumeration value="shoeSize"/&gt;
     *                         &lt;enumeration value="clothingSize"/&gt;
     *                         &lt;enumeration value="sportsTeam"/&gt;
     *                         &lt;enumeration value="sportsLeague"/&gt;
     *                         &lt;enumeration value="compatibleDevices"/&gt;
     *                         &lt;enumeration value="dexterity"/&gt;
     *                         &lt;enumeration value="capacity"/&gt;
     *                         &lt;enumeration value="shape"/&gt;
     *                         &lt;enumeration value="countPerPack"/&gt;
     *                         &lt;enumeration value="count"/&gt;
     *                         &lt;enumeration value="caliber"/&gt;
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
        protected List<Optics.SwatchImages.SwatchImage> swatchImage;

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
         * {@link Optics.SwatchImages.SwatchImage }
         * 
         * 
         */
        public List<Optics.SwatchImages.SwatchImage> getSwatchImage() {
            if (swatchImage == null) {
                swatchImage = new ArrayList<Optics.SwatchImages.SwatchImage>();
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
         *               &lt;enumeration value="assembledProductWeight"/&gt;
         *               &lt;enumeration value="material"/&gt;
         *               &lt;enumeration value="shoeSize"/&gt;
         *               &lt;enumeration value="clothingSize"/&gt;
         *               &lt;enumeration value="sportsTeam"/&gt;
         *               &lt;enumeration value="sportsLeague"/&gt;
         *               &lt;enumeration value="compatibleDevices"/&gt;
         *               &lt;enumeration value="dexterity"/&gt;
         *               &lt;enumeration value="capacity"/&gt;
         *               &lt;enumeration value="shape"/&gt;
         *               &lt;enumeration value="countPerPack"/&gt;
         *               &lt;enumeration value="count"/&gt;
         *               &lt;enumeration value="caliber"/&gt;
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
     *               &lt;enumeration value="assembledProductWeight"/&gt;
     *               &lt;enumeration value="material"/&gt;
     *               &lt;enumeration value="shoeSize"/&gt;
     *               &lt;enumeration value="clothingSize"/&gt;
     *               &lt;enumeration value="sportsTeam"/&gt;
     *               &lt;enumeration value="sportsLeague"/&gt;
     *               &lt;enumeration value="compatibleDevices"/&gt;
     *               &lt;enumeration value="dexterity"/&gt;
     *               &lt;enumeration value="capacity"/&gt;
     *               &lt;enumeration value="shape"/&gt;
     *               &lt;enumeration value="countPerPack"/&gt;
     *               &lt;enumeration value="count"/&gt;
     *               &lt;enumeration value="caliber"/&gt;
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
