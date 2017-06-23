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
 * <p>Jewelry complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Jewelry"&gt;
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
 *         &lt;element name="mainImageUrl"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyURI"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="productSecondaryImageURL" type="{http://walmart.com/}ProductSecondaryImageURL" minOccurs="0"/&gt;
 *         &lt;element name="material" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="jewelryStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Fine"/&gt;
 *               &lt;enumeration value="Fashion"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="metal" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="metalStamp" type="{http://walmart.com/}MetalStamp" minOccurs="0"/&gt;
 *         &lt;element name="karats" minOccurs="0"&gt;
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
 *                         &lt;enumeration value="K"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="plating" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gender" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Male"/&gt;
 *               &lt;enumeration value="Female"/&gt;
 *               &lt;enumeration value="Unisex"/&gt;
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
 *                         &lt;enumeration value="Tween"/&gt;
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
 *         &lt;element name="occasion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="style" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="personalRelationship" type="{http://walmart.com/}PersonalRelationship" minOccurs="0"/&gt;
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
 *                         &lt;enumeration value="metal"/&gt;
 *                         &lt;enumeration value="size"/&gt;
 *                         &lt;enumeration value="ringSize"/&gt;
 *                         &lt;enumeration value="color"/&gt;
 *                         &lt;enumeration value="karats"/&gt;
 *                         &lt;enumeration value="carats"/&gt;
 *                         &lt;enumeration value="gemstone"/&gt;
 *                         &lt;enumeration value="birthstone"/&gt;
 *                         &lt;enumeration value="chainLength"/&gt;
 *                         &lt;enumeration value="shape"/&gt;
 *                         &lt;enumeration value="diameter"/&gt;
 *                         &lt;enumeration value="sportsTeam"/&gt;
 *                         &lt;enumeration value="countPerPack"/&gt;
 *                         &lt;enumeration value="count"/&gt;
 *                         &lt;enumeration value="style"/&gt;
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
 *         &lt;element name="smallPartsWarnings" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="smallPartsWarning" maxOccurs="unbounded"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;totalDigits value="1"/&gt;
 *                         &lt;enumeration value="0"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                         &lt;enumeration value="2"/&gt;
 *                         &lt;enumeration value="3"/&gt;
 *                         &lt;enumeration value="4"/&gt;
 *                         &lt;enumeration value="5"/&gt;
 *                         &lt;enumeration value="6"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
 *         &lt;element name="certificateNumber" type="{http://walmart.com/}CertificateNumber" minOccurs="0"/&gt;
 *         &lt;element name="birthstone" minOccurs="0"&gt;
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
 *         &lt;element name="claspType" type="{http://walmart.com/}ClaspType" minOccurs="0"/&gt;
 *         &lt;element name="backFinding" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="jewelrySetting" type="{http://walmart.com/}JewelrySetting" minOccurs="0"/&gt;
 *         &lt;element name="earringStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="earringFeature" type="{http://walmart.com/}EarringFeature" minOccurs="0"/&gt;
 *         &lt;element name="braceletStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="necklaceStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="chainLength" minOccurs="0"&gt;
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
 *         &lt;element name="chainPattern" type="{http://walmart.com/}ChainPattern" minOccurs="0"/&gt;
 *         &lt;element name="globalBrandLicense" type="{http://walmart.com/}BrandLicense" minOccurs="0"/&gt;
 *         &lt;element name="diamondClarity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="diamondCut" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="carats" minOccurs="0"&gt;
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
 *                         &lt;enumeration value="ct"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="totalDiamondWeight" minOccurs="0"&gt;
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
 *                         &lt;enumeration value="ct"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="totalGemWeight" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gemstoneCut" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gemstone" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gemstoneColor" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gemstoneClarity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stoneCreationMethod" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stoneTreatment" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stoneHeight" minOccurs="0"&gt;
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
 *         &lt;element name="stoneLength" minOccurs="0"&gt;
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
 *         &lt;element name="stoneWidth" minOccurs="0"&gt;
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
 *         &lt;element name="stoneDepthPercentage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stoneTablePercentage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stoneSymmetry" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stonePolish" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stoneGirdle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stoneCulet" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="stoneFluoresence" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pearlType" type="{http://walmart.com/}PearlType" minOccurs="0"/&gt;
 *         &lt;element name="pearlBodyColor" type="{http://walmart.com/}PearlBodyColor" minOccurs="0"/&gt;
 *         &lt;element name="pearlLustre" type="{http://walmart.com/}PearlLustre" minOccurs="0"/&gt;
 *         &lt;element name="pearlShape" type="{http://walmart.com/}PearlShape" minOccurs="0"/&gt;
 *         &lt;element name="pearlUniformity" type="{http://walmart.com/}PearlUniformity" minOccurs="0"/&gt;
 *         &lt;element name="pearlSurfaceBlemishes" type="{http://walmart.com/}PearlSurfaceBlemishes" minOccurs="0"/&gt;
 *         &lt;element name="pearlNacreThickness" minOccurs="0"&gt;
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
 *         &lt;element name="pearlStringingMethod" type="{http://walmart.com/}PearlStringingMethod" minOccurs="0"/&gt;
 *         &lt;element name="sizePerPearl" minOccurs="0"&gt;
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
 *         &lt;element name="numberOfPearls" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;totalDigits value="7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="inscription" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isResizable" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ringSizingLowerRange" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ringSizingUpperRange" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ringStyle" type="{http://walmart.com/}RingStyle" minOccurs="0"/&gt;
 *         &lt;element name="ringSize" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="circumference" minOccurs="0"&gt;
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
 *                         &lt;enumeration value="mm"/&gt;
 *                         &lt;enumeration value="ft"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="diameter" minOccurs="0"&gt;
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
 *                         &lt;enumeration value="ft"/&gt;
 *                         &lt;enumeration value="in"/&gt;
 *                         &lt;enumeration value="mm"/&gt;
 *                         &lt;enumeration value="cm"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ringSizeStandard" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="U.S., Canada, Mexico"/&gt;
 *               &lt;enumeration value="U.K., Ireland, Australia"/&gt;
 *               &lt;enumeration value="China, Japan, South America"/&gt;
 *               &lt;enumeration value="India"/&gt;
 *               &lt;enumeration value="Italy, Spain, Netherlands, Switzerland"/&gt;
 *               &lt;enumeration value="ISO 8653: 1986"/&gt;
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
 *         &lt;element name="theme" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="americanWireGuage" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;totalDigits value="4"/&gt;
 *               &lt;enumeration value="0000"/&gt;
 *               &lt;enumeration value="000"/&gt;
 *               &lt;enumeration value="00"/&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *               &lt;enumeration value="4"/&gt;
 *               &lt;enumeration value="5"/&gt;
 *               &lt;enumeration value="6"/&gt;
 *               &lt;enumeration value="7"/&gt;
 *               &lt;enumeration value="8"/&gt;
 *               &lt;enumeration value="9"/&gt;
 *               &lt;enumeration value="10"/&gt;
 *               &lt;enumeration value="11"/&gt;
 *               &lt;enumeration value="12"/&gt;
 *               &lt;enumeration value="13"/&gt;
 *               &lt;enumeration value="14"/&gt;
 *               &lt;enumeration value="15"/&gt;
 *               &lt;enumeration value="16"/&gt;
 *               &lt;enumeration value="17"/&gt;
 *               &lt;enumeration value="18"/&gt;
 *               &lt;enumeration value="19"/&gt;
 *               &lt;enumeration value="20"/&gt;
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
 *         &lt;element name="features" type="{http://walmart.com/}AdditionalFeatures" minOccurs="0"/&gt;
 *         &lt;element name="keywords" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isMadeFromRecycledMaterial" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="recycledMaterialContent" type="{http://walmart.com/}RecycledMaterialContent" minOccurs="0"/&gt;
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
 *         &lt;element name="character" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="bodyParts" type="{http://walmart.com/}BodyParts" minOccurs="0"/&gt;
 *         &lt;element name="designer" minOccurs="0"&gt;
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
 *                                   &lt;enumeration value="metal"/&gt;
 *                                   &lt;enumeration value="size"/&gt;
 *                                   &lt;enumeration value="ringSize"/&gt;
 *                                   &lt;enumeration value="color"/&gt;
 *                                   &lt;enumeration value="karats"/&gt;
 *                                   &lt;enumeration value="carats"/&gt;
 *                                   &lt;enumeration value="gemstone"/&gt;
 *                                   &lt;enumeration value="birthstone"/&gt;
 *                                   &lt;enumeration value="chainLength"/&gt;
 *                                   &lt;enumeration value="shape"/&gt;
 *                                   &lt;enumeration value="diameter"/&gt;
 *                                   &lt;enumeration value="sportsTeam"/&gt;
 *                                   &lt;enumeration value="countPerPack"/&gt;
 *                                   &lt;enumeration value="count"/&gt;
 *                                   &lt;enumeration value="style"/&gt;
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
@XmlType(name = "Jewelry", propOrder = {

})
public class Jewelry {

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
    @XmlElement(required = true)
    protected String mainImageUrl;
    protected ProductSecondaryImageURL productSecondaryImageURL;
    protected String material;
    protected String jewelryStyle;
    protected String metal;
    protected MetalStamp metalStamp;
    protected Jewelry.Karats karats;
    protected String plating;
    protected String gender;
    protected Jewelry.AgeGroup ageGroup;
    protected String size;
    protected String color;
    protected String occasion;
    protected String style;
    protected PersonalRelationship personalRelationship;
    protected String variantGroupId;
    protected Jewelry.VariantAttributeNames variantAttributeNames;
    protected String isPrimaryVariant;
    protected String isProp65WarningRequired;
    protected String prop65WarningText;
    protected Jewelry.SmallPartsWarnings smallPartsWarnings;
    protected String batteryTechnologyType;
    protected String hasWarranty;
    protected String warrantyURL;
    protected String warrantyText;
    protected CertificateNumber certificateNumber;
    protected String birthstone;
    protected String pattern;
    protected ClaspType claspType;
    protected String backFinding;
    protected JewelrySetting jewelrySetting;
    protected String earringStyle;
    protected EarringFeature earringFeature;
    protected String braceletStyle;
    protected String necklaceStyle;
    protected Jewelry.ChainLength chainLength;
    protected ChainPattern chainPattern;
    protected BrandLicense globalBrandLicense;
    protected String diamondClarity;
    protected String diamondCut;
    protected Jewelry.Carats carats;
    protected Jewelry.TotalDiamondWeight totalDiamondWeight;
    protected BigDecimal totalGemWeight;
    protected String gemstoneCut;
    protected String gemstone;
    protected String gemstoneColor;
    protected String gemstoneClarity;
    protected String stoneCreationMethod;
    protected String stoneTreatment;
    protected Jewelry.StoneHeight stoneHeight;
    protected Jewelry.StoneLength stoneLength;
    protected Jewelry.StoneWidth stoneWidth;
    protected BigDecimal stoneDepthPercentage;
    protected BigDecimal stoneTablePercentage;
    protected String stoneSymmetry;
    protected String stonePolish;
    protected String stoneGirdle;
    protected String stoneCulet;
    protected String stoneFluoresence;
    protected PearlType pearlType;
    protected PearlBodyColor pearlBodyColor;
    protected PearlLustre pearlLustre;
    protected PearlShape pearlShape;
    protected PearlUniformity pearlUniformity;
    protected PearlSurfaceBlemishes pearlSurfaceBlemishes;
    protected Jewelry.PearlNacreThickness pearlNacreThickness;
    protected PearlStringingMethod pearlStringingMethod;
    protected Jewelry.SizePerPearl sizePerPearl;
    protected BigInteger numberOfPearls;
    protected String inscription;
    protected String isResizable;
    protected BigDecimal ringSizingLowerRange;
    protected BigDecimal ringSizingUpperRange;
    protected RingStyle ringStyle;
    protected BigDecimal ringSize;
    protected Jewelry.Circumference circumference;
    protected Jewelry.Diameter diameter;
    protected String ringSizeStandard;
    protected String sportsLeague;
    protected String sportsTeam;
    protected String theme;
    protected BigInteger americanWireGuage;
    protected String athlete;
    protected AdditionalFeatures features;
    protected String keywords;
    protected String isMadeFromRecycledMaterial;
    protected RecycledMaterialContent recycledMaterialContent;
    protected Jewelry.ColorCategory colorCategory;
    protected String character;
    protected BodyParts bodyParts;
    protected String designer;
    protected Jewelry.SwatchImages swatchImages;

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
     * 获取jewelryStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJewelryStyle() {
        return jewelryStyle;
    }

    /**
     * 设置jewelryStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJewelryStyle(String value) {
        this.jewelryStyle = value;
    }

    /**
     * 获取metal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetal() {
        return metal;
    }

    /**
     * 设置metal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetal(String value) {
        this.metal = value;
    }

    /**
     * 获取metalStamp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MetalStamp }
     *     
     */
    public MetalStamp getMetalStamp() {
        return metalStamp;
    }

    /**
     * 设置metalStamp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MetalStamp }
     *     
     */
    public void setMetalStamp(MetalStamp value) {
        this.metalStamp = value;
    }

    /**
     * 获取karats属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Jewelry.Karats }
     *     
     */
    public Jewelry.Karats getKarats() {
        return karats;
    }

    /**
     * 设置karats属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.Karats }
     *     
     */
    public void setKarats(Jewelry.Karats value) {
        this.karats = value;
    }

    /**
     * 获取plating属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlating() {
        return plating;
    }

    /**
     * 设置plating属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlating(String value) {
        this.plating = value;
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
     * 获取ageGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Jewelry.AgeGroup }
     *     
     */
    public Jewelry.AgeGroup getAgeGroup() {
        return ageGroup;
    }

    /**
     * 设置ageGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.AgeGroup }
     *     
     */
    public void setAgeGroup(Jewelry.AgeGroup value) {
        this.ageGroup = value;
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
     * 获取occasion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccasion() {
        return occasion;
    }

    /**
     * 设置occasion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccasion(String value) {
        this.occasion = value;
    }

    /**
     * 获取style属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * 设置style属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

    /**
     * 获取personalRelationship属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonalRelationship }
     *     
     */
    public PersonalRelationship getPersonalRelationship() {
        return personalRelationship;
    }

    /**
     * 设置personalRelationship属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalRelationship }
     *     
     */
    public void setPersonalRelationship(PersonalRelationship value) {
        this.personalRelationship = value;
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
     *     {@link Jewelry.VariantAttributeNames }
     *     
     */
    public Jewelry.VariantAttributeNames getVariantAttributeNames() {
        return variantAttributeNames;
    }

    /**
     * 设置variantAttributeNames属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.VariantAttributeNames }
     *     
     */
    public void setVariantAttributeNames(Jewelry.VariantAttributeNames value) {
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
     * 获取smallPartsWarnings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Jewelry.SmallPartsWarnings }
     *     
     */
    public Jewelry.SmallPartsWarnings getSmallPartsWarnings() {
        return smallPartsWarnings;
    }

    /**
     * 设置smallPartsWarnings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.SmallPartsWarnings }
     *     
     */
    public void setSmallPartsWarnings(Jewelry.SmallPartsWarnings value) {
        this.smallPartsWarnings = value;
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
     * 获取certificateNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CertificateNumber }
     *     
     */
    public CertificateNumber getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * 设置certificateNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateNumber }
     *     
     */
    public void setCertificateNumber(CertificateNumber value) {
        this.certificateNumber = value;
    }

    /**
     * 获取birthstone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthstone() {
        return birthstone;
    }

    /**
     * 设置birthstone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthstone(String value) {
        this.birthstone = value;
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
     * 获取claspType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClaspType }
     *     
     */
    public ClaspType getClaspType() {
        return claspType;
    }

    /**
     * 设置claspType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClaspType }
     *     
     */
    public void setClaspType(ClaspType value) {
        this.claspType = value;
    }

    /**
     * 获取backFinding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackFinding() {
        return backFinding;
    }

    /**
     * 设置backFinding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackFinding(String value) {
        this.backFinding = value;
    }

    /**
     * 获取jewelrySetting属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JewelrySetting }
     *     
     */
    public JewelrySetting getJewelrySetting() {
        return jewelrySetting;
    }

    /**
     * 设置jewelrySetting属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JewelrySetting }
     *     
     */
    public void setJewelrySetting(JewelrySetting value) {
        this.jewelrySetting = value;
    }

    /**
     * 获取earringStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarringStyle() {
        return earringStyle;
    }

    /**
     * 设置earringStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarringStyle(String value) {
        this.earringStyle = value;
    }

    /**
     * 获取earringFeature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EarringFeature }
     *     
     */
    public EarringFeature getEarringFeature() {
        return earringFeature;
    }

    /**
     * 设置earringFeature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EarringFeature }
     *     
     */
    public void setEarringFeature(EarringFeature value) {
        this.earringFeature = value;
    }

    /**
     * 获取braceletStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBraceletStyle() {
        return braceletStyle;
    }

    /**
     * 设置braceletStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBraceletStyle(String value) {
        this.braceletStyle = value;
    }

    /**
     * 获取necklaceStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNecklaceStyle() {
        return necklaceStyle;
    }

    /**
     * 设置necklaceStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNecklaceStyle(String value) {
        this.necklaceStyle = value;
    }

    /**
     * 获取chainLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Jewelry.ChainLength }
     *     
     */
    public Jewelry.ChainLength getChainLength() {
        return chainLength;
    }

    /**
     * 设置chainLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.ChainLength }
     *     
     */
    public void setChainLength(Jewelry.ChainLength value) {
        this.chainLength = value;
    }

    /**
     * 获取chainPattern属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChainPattern }
     *     
     */
    public ChainPattern getChainPattern() {
        return chainPattern;
    }

    /**
     * 设置chainPattern属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChainPattern }
     *     
     */
    public void setChainPattern(ChainPattern value) {
        this.chainPattern = value;
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
     * 获取diamondClarity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiamondClarity() {
        return diamondClarity;
    }

    /**
     * 设置diamondClarity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiamondClarity(String value) {
        this.diamondClarity = value;
    }

    /**
     * 获取diamondCut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiamondCut() {
        return diamondCut;
    }

    /**
     * 设置diamondCut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiamondCut(String value) {
        this.diamondCut = value;
    }

    /**
     * 获取carats属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Jewelry.Carats }
     *     
     */
    public Jewelry.Carats getCarats() {
        return carats;
    }

    /**
     * 设置carats属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.Carats }
     *     
     */
    public void setCarats(Jewelry.Carats value) {
        this.carats = value;
    }

    /**
     * 获取totalDiamondWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Jewelry.TotalDiamondWeight }
     *     
     */
    public Jewelry.TotalDiamondWeight getTotalDiamondWeight() {
        return totalDiamondWeight;
    }

    /**
     * 设置totalDiamondWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.TotalDiamondWeight }
     *     
     */
    public void setTotalDiamondWeight(Jewelry.TotalDiamondWeight value) {
        this.totalDiamondWeight = value;
    }

    /**
     * 获取totalGemWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGemWeight() {
        return totalGemWeight;
    }

    /**
     * 设置totalGemWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalGemWeight(BigDecimal value) {
        this.totalGemWeight = value;
    }

    /**
     * 获取gemstoneCut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemstoneCut() {
        return gemstoneCut;
    }

    /**
     * 设置gemstoneCut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemstoneCut(String value) {
        this.gemstoneCut = value;
    }

    /**
     * 获取gemstone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemstone() {
        return gemstone;
    }

    /**
     * 设置gemstone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemstone(String value) {
        this.gemstone = value;
    }

    /**
     * 获取gemstoneColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemstoneColor() {
        return gemstoneColor;
    }

    /**
     * 设置gemstoneColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemstoneColor(String value) {
        this.gemstoneColor = value;
    }

    /**
     * 获取gemstoneClarity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGemstoneClarity() {
        return gemstoneClarity;
    }

    /**
     * 设置gemstoneClarity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGemstoneClarity(String value) {
        this.gemstoneClarity = value;
    }

    /**
     * 获取stoneCreationMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoneCreationMethod() {
        return stoneCreationMethod;
    }

    /**
     * 设置stoneCreationMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoneCreationMethod(String value) {
        this.stoneCreationMethod = value;
    }

    /**
     * 获取stoneTreatment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoneTreatment() {
        return stoneTreatment;
    }

    /**
     * 设置stoneTreatment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoneTreatment(String value) {
        this.stoneTreatment = value;
    }

    /**
     * 获取stoneHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Jewelry.StoneHeight }
     *     
     */
    public Jewelry.StoneHeight getStoneHeight() {
        return stoneHeight;
    }

    /**
     * 设置stoneHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.StoneHeight }
     *     
     */
    public void setStoneHeight(Jewelry.StoneHeight value) {
        this.stoneHeight = value;
    }

    /**
     * 获取stoneLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Jewelry.StoneLength }
     *     
     */
    public Jewelry.StoneLength getStoneLength() {
        return stoneLength;
    }

    /**
     * 设置stoneLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.StoneLength }
     *     
     */
    public void setStoneLength(Jewelry.StoneLength value) {
        this.stoneLength = value;
    }

    /**
     * 获取stoneWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Jewelry.StoneWidth }
     *     
     */
    public Jewelry.StoneWidth getStoneWidth() {
        return stoneWidth;
    }

    /**
     * 设置stoneWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.StoneWidth }
     *     
     */
    public void setStoneWidth(Jewelry.StoneWidth value) {
        this.stoneWidth = value;
    }

    /**
     * 获取stoneDepthPercentage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStoneDepthPercentage() {
        return stoneDepthPercentage;
    }

    /**
     * 设置stoneDepthPercentage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStoneDepthPercentage(BigDecimal value) {
        this.stoneDepthPercentage = value;
    }

    /**
     * 获取stoneTablePercentage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStoneTablePercentage() {
        return stoneTablePercentage;
    }

    /**
     * 设置stoneTablePercentage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStoneTablePercentage(BigDecimal value) {
        this.stoneTablePercentage = value;
    }

    /**
     * 获取stoneSymmetry属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoneSymmetry() {
        return stoneSymmetry;
    }

    /**
     * 设置stoneSymmetry属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoneSymmetry(String value) {
        this.stoneSymmetry = value;
    }

    /**
     * 获取stonePolish属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStonePolish() {
        return stonePolish;
    }

    /**
     * 设置stonePolish属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStonePolish(String value) {
        this.stonePolish = value;
    }

    /**
     * 获取stoneGirdle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoneGirdle() {
        return stoneGirdle;
    }

    /**
     * 设置stoneGirdle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoneGirdle(String value) {
        this.stoneGirdle = value;
    }

    /**
     * 获取stoneCulet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoneCulet() {
        return stoneCulet;
    }

    /**
     * 设置stoneCulet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoneCulet(String value) {
        this.stoneCulet = value;
    }

    /**
     * 获取stoneFluoresence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoneFluoresence() {
        return stoneFluoresence;
    }

    /**
     * 设置stoneFluoresence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoneFluoresence(String value) {
        this.stoneFluoresence = value;
    }

    /**
     * 获取pearlType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PearlType }
     *     
     */
    public PearlType getPearlType() {
        return pearlType;
    }

    /**
     * 设置pearlType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PearlType }
     *     
     */
    public void setPearlType(PearlType value) {
        this.pearlType = value;
    }

    /**
     * 获取pearlBodyColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PearlBodyColor }
     *     
     */
    public PearlBodyColor getPearlBodyColor() {
        return pearlBodyColor;
    }

    /**
     * 设置pearlBodyColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PearlBodyColor }
     *     
     */
    public void setPearlBodyColor(PearlBodyColor value) {
        this.pearlBodyColor = value;
    }

    /**
     * 获取pearlLustre属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PearlLustre }
     *     
     */
    public PearlLustre getPearlLustre() {
        return pearlLustre;
    }

    /**
     * 设置pearlLustre属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PearlLustre }
     *     
     */
    public void setPearlLustre(PearlLustre value) {
        this.pearlLustre = value;
    }

    /**
     * 获取pearlShape属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PearlShape }
     *     
     */
    public PearlShape getPearlShape() {
        return pearlShape;
    }

    /**
     * 设置pearlShape属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PearlShape }
     *     
     */
    public void setPearlShape(PearlShape value) {
        this.pearlShape = value;
    }

    /**
     * 获取pearlUniformity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PearlUniformity }
     *     
     */
    public PearlUniformity getPearlUniformity() {
        return pearlUniformity;
    }

    /**
     * 设置pearlUniformity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PearlUniformity }
     *     
     */
    public void setPearlUniformity(PearlUniformity value) {
        this.pearlUniformity = value;
    }

    /**
     * 获取pearlSurfaceBlemishes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PearlSurfaceBlemishes }
     *     
     */
    public PearlSurfaceBlemishes getPearlSurfaceBlemishes() {
        return pearlSurfaceBlemishes;
    }

    /**
     * 设置pearlSurfaceBlemishes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PearlSurfaceBlemishes }
     *     
     */
    public void setPearlSurfaceBlemishes(PearlSurfaceBlemishes value) {
        this.pearlSurfaceBlemishes = value;
    }

    /**
     * 获取pearlNacreThickness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Jewelry.PearlNacreThickness }
     *     
     */
    public Jewelry.PearlNacreThickness getPearlNacreThickness() {
        return pearlNacreThickness;
    }

    /**
     * 设置pearlNacreThickness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.PearlNacreThickness }
     *     
     */
    public void setPearlNacreThickness(Jewelry.PearlNacreThickness value) {
        this.pearlNacreThickness = value;
    }

    /**
     * 获取pearlStringingMethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PearlStringingMethod }
     *     
     */
    public PearlStringingMethod getPearlStringingMethod() {
        return pearlStringingMethod;
    }

    /**
     * 设置pearlStringingMethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PearlStringingMethod }
     *     
     */
    public void setPearlStringingMethod(PearlStringingMethod value) {
        this.pearlStringingMethod = value;
    }

    /**
     * 获取sizePerPearl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Jewelry.SizePerPearl }
     *     
     */
    public Jewelry.SizePerPearl getSizePerPearl() {
        return sizePerPearl;
    }

    /**
     * 设置sizePerPearl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.SizePerPearl }
     *     
     */
    public void setSizePerPearl(Jewelry.SizePerPearl value) {
        this.sizePerPearl = value;
    }

    /**
     * 获取numberOfPearls属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfPearls() {
        return numberOfPearls;
    }

    /**
     * 设置numberOfPearls属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfPearls(BigInteger value) {
        this.numberOfPearls = value;
    }

    /**
     * 获取inscription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscription() {
        return inscription;
    }

    /**
     * 设置inscription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscription(String value) {
        this.inscription = value;
    }

    /**
     * 获取isResizable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsResizable() {
        return isResizable;
    }

    /**
     * 设置isResizable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsResizable(String value) {
        this.isResizable = value;
    }

    /**
     * 获取ringSizingLowerRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRingSizingLowerRange() {
        return ringSizingLowerRange;
    }

    /**
     * 设置ringSizingLowerRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRingSizingLowerRange(BigDecimal value) {
        this.ringSizingLowerRange = value;
    }

    /**
     * 获取ringSizingUpperRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRingSizingUpperRange() {
        return ringSizingUpperRange;
    }

    /**
     * 设置ringSizingUpperRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRingSizingUpperRange(BigDecimal value) {
        this.ringSizingUpperRange = value;
    }

    /**
     * 获取ringStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RingStyle }
     *     
     */
    public RingStyle getRingStyle() {
        return ringStyle;
    }

    /**
     * 设置ringStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RingStyle }
     *     
     */
    public void setRingStyle(RingStyle value) {
        this.ringStyle = value;
    }

    /**
     * 获取ringSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRingSize() {
        return ringSize;
    }

    /**
     * 设置ringSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRingSize(BigDecimal value) {
        this.ringSize = value;
    }

    /**
     * 获取circumference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Jewelry.Circumference }
     *     
     */
    public Jewelry.Circumference getCircumference() {
        return circumference;
    }

    /**
     * 设置circumference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.Circumference }
     *     
     */
    public void setCircumference(Jewelry.Circumference value) {
        this.circumference = value;
    }

    /**
     * 获取diameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Jewelry.Diameter }
     *     
     */
    public Jewelry.Diameter getDiameter() {
        return diameter;
    }

    /**
     * 设置diameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.Diameter }
     *     
     */
    public void setDiameter(Jewelry.Diameter value) {
        this.diameter = value;
    }

    /**
     * 获取ringSizeStandard属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingSizeStandard() {
        return ringSizeStandard;
    }

    /**
     * 设置ringSizeStandard属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingSizeStandard(String value) {
        this.ringSizeStandard = value;
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
     * 获取theme属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheme() {
        return theme;
    }

    /**
     * 设置theme属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheme(String value) {
        this.theme = value;
    }

    /**
     * 获取americanWireGuage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmericanWireGuage() {
        return americanWireGuage;
    }

    /**
     * 设置americanWireGuage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmericanWireGuage(BigInteger value) {
        this.americanWireGuage = value;
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
     * 获取isMadeFromRecycledMaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMadeFromRecycledMaterial() {
        return isMadeFromRecycledMaterial;
    }

    /**
     * 设置isMadeFromRecycledMaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMadeFromRecycledMaterial(String value) {
        this.isMadeFromRecycledMaterial = value;
    }

    /**
     * 获取recycledMaterialContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecycledMaterialContent }
     *     
     */
    public RecycledMaterialContent getRecycledMaterialContent() {
        return recycledMaterialContent;
    }

    /**
     * 设置recycledMaterialContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecycledMaterialContent }
     *     
     */
    public void setRecycledMaterialContent(RecycledMaterialContent value) {
        this.recycledMaterialContent = value;
    }

    /**
     * 获取colorCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Jewelry.ColorCategory }
     *     
     */
    public Jewelry.ColorCategory getColorCategory() {
        return colorCategory;
    }

    /**
     * 设置colorCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.ColorCategory }
     *     
     */
    public void setColorCategory(Jewelry.ColorCategory value) {
        this.colorCategory = value;
    }

    /**
     * 获取character属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacter() {
        return character;
    }

    /**
     * 设置character属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacter(String value) {
        this.character = value;
    }

    /**
     * 获取bodyParts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BodyParts }
     *     
     */
    public BodyParts getBodyParts() {
        return bodyParts;
    }

    /**
     * 设置bodyParts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BodyParts }
     *     
     */
    public void setBodyParts(BodyParts value) {
        this.bodyParts = value;
    }

    /**
     * 获取designer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesigner() {
        return designer;
    }

    /**
     * 设置designer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesigner(String value) {
        this.designer = value;
    }

    /**
     * 获取swatchImages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Jewelry.SwatchImages }
     *     
     */
    public Jewelry.SwatchImages getSwatchImages() {
        return swatchImages;
    }

    /**
     * 设置swatchImages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Jewelry.SwatchImages }
     *     
     */
    public void setSwatchImages(Jewelry.SwatchImages value) {
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
     *               &lt;enumeration value="Tween"/&gt;
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
     *               &lt;enumeration value="ct"/&gt;
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
    public static class Carats {

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
    public static class ChainLength {

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
     *               &lt;enumeration value="mm"/&gt;
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
    public static class Circumference {

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
     *               &lt;enumeration value="ft"/&gt;
     *               &lt;enumeration value="in"/&gt;
     *               &lt;enumeration value="mm"/&gt;
     *               &lt;enumeration value="cm"/&gt;
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
    public static class Diameter {

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
     *               &lt;enumeration value="K"/&gt;
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
    public static class Karats {

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
    public static class PearlNacreThickness {

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
    public static class SizePerPearl {

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
     *         &lt;element name="smallPartsWarning" maxOccurs="unbounded"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;totalDigits value="1"/&gt;
     *               &lt;enumeration value="0"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *               &lt;enumeration value="2"/&gt;
     *               &lt;enumeration value="3"/&gt;
     *               &lt;enumeration value="4"/&gt;
     *               &lt;enumeration value="5"/&gt;
     *               &lt;enumeration value="6"/&gt;
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
        "smallPartsWarning"
    })
    public static class SmallPartsWarnings {

        @XmlElement(required = true)
        protected List<BigInteger> smallPartsWarning;

        /**
         * Gets the value of the smallPartsWarning property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the smallPartsWarning property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSmallPartsWarning().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getSmallPartsWarning() {
            if (smallPartsWarning == null) {
                smallPartsWarning = new ArrayList<BigInteger>();
            }
            return this.smallPartsWarning;
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
    public static class StoneHeight {

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
    public static class StoneLength {

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
    public static class StoneWidth {

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
     *                         &lt;enumeration value="metal"/&gt;
     *                         &lt;enumeration value="size"/&gt;
     *                         &lt;enumeration value="ringSize"/&gt;
     *                         &lt;enumeration value="color"/&gt;
     *                         &lt;enumeration value="karats"/&gt;
     *                         &lt;enumeration value="carats"/&gt;
     *                         &lt;enumeration value="gemstone"/&gt;
     *                         &lt;enumeration value="birthstone"/&gt;
     *                         &lt;enumeration value="chainLength"/&gt;
     *                         &lt;enumeration value="shape"/&gt;
     *                         &lt;enumeration value="diameter"/&gt;
     *                         &lt;enumeration value="sportsTeam"/&gt;
     *                         &lt;enumeration value="countPerPack"/&gt;
     *                         &lt;enumeration value="count"/&gt;
     *                         &lt;enumeration value="style"/&gt;
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
        protected List<Jewelry.SwatchImages.SwatchImage> swatchImage;

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
         * {@link Jewelry.SwatchImages.SwatchImage }
         * 
         * 
         */
        public List<Jewelry.SwatchImages.SwatchImage> getSwatchImage() {
            if (swatchImage == null) {
                swatchImage = new ArrayList<Jewelry.SwatchImages.SwatchImage>();
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
         *               &lt;enumeration value="metal"/&gt;
         *               &lt;enumeration value="size"/&gt;
         *               &lt;enumeration value="ringSize"/&gt;
         *               &lt;enumeration value="color"/&gt;
         *               &lt;enumeration value="karats"/&gt;
         *               &lt;enumeration value="carats"/&gt;
         *               &lt;enumeration value="gemstone"/&gt;
         *               &lt;enumeration value="birthstone"/&gt;
         *               &lt;enumeration value="chainLength"/&gt;
         *               &lt;enumeration value="shape"/&gt;
         *               &lt;enumeration value="diameter"/&gt;
         *               &lt;enumeration value="sportsTeam"/&gt;
         *               &lt;enumeration value="countPerPack"/&gt;
         *               &lt;enumeration value="count"/&gt;
         *               &lt;enumeration value="style"/&gt;
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
     *               &lt;enumeration value="ct"/&gt;
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
    public static class TotalDiamondWeight {

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
     *         &lt;element name="variantAttributeName" maxOccurs="unbounded"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="metal"/&gt;
     *               &lt;enumeration value="size"/&gt;
     *               &lt;enumeration value="ringSize"/&gt;
     *               &lt;enumeration value="color"/&gt;
     *               &lt;enumeration value="karats"/&gt;
     *               &lt;enumeration value="carats"/&gt;
     *               &lt;enumeration value="gemstone"/&gt;
     *               &lt;enumeration value="birthstone"/&gt;
     *               &lt;enumeration value="chainLength"/&gt;
     *               &lt;enumeration value="shape"/&gt;
     *               &lt;enumeration value="diameter"/&gt;
     *               &lt;enumeration value="sportsTeam"/&gt;
     *               &lt;enumeration value="countPerPack"/&gt;
     *               &lt;enumeration value="count"/&gt;
     *               &lt;enumeration value="style"/&gt;
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
