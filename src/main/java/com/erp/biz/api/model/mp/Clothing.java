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
 * <p>Clothing complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Clothing"&gt;
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
 *         &lt;element name="modelNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
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
 *         &lt;element name="material" minOccurs="0"&gt;
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
 *         &lt;element name="clothingSizeGroup" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Big &amp; Tall"/&gt;
 *               &lt;enumeration value="Boys"/&gt;
 *               &lt;enumeration value="Girls"/&gt;
 *               &lt;enumeration value="Girls' Plus"/&gt;
 *               &lt;enumeration value="Husky"/&gt;
 *               &lt;enumeration value="Junior Plus"/&gt;
 *               &lt;enumeration value="Juniors"/&gt;
 *               &lt;enumeration value="Maternity"/&gt;
 *               &lt;enumeration value="Maternity Plus"/&gt;
 *               &lt;enumeration value="Men"/&gt;
 *               &lt;enumeration value="Petite"/&gt;
 *               &lt;enumeration value="Petite Plus"/&gt;
 *               &lt;enumeration value="Women's Plus"/&gt;
 *               &lt;enumeration value="Women"/&gt;
 *               &lt;enumeration value="Young Men’s"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="clothingSize" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isSet" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
 *                         &lt;enumeration value="clothingSize"/&gt;
 *                         &lt;enumeration value="clothingFit"/&gt;
 *                         &lt;enumeration value="pattern"/&gt;
 *                         &lt;enumeration value="material"/&gt;
 *                         &lt;enumeration value="inseam"/&gt;
 *                         &lt;enumeration value="waistSize"/&gt;
 *                         &lt;enumeration value="neckSize"/&gt;
 *                         &lt;enumeration value="hatSize"/&gt;
 *                         &lt;enumeration value="pantySize"/&gt;
 *                         &lt;enumeration value="sockSize"/&gt;
 *                         &lt;enumeration value="countPerPack"/&gt;
 *                         &lt;enumeration value="count"/&gt;
 *                         &lt;enumeration value="braSize"/&gt;
 *                         &lt;enumeration value="braBandSize"/&gt;
 *                         &lt;enumeration value="braCupSize"/&gt;
 *                         &lt;enumeration value="academicInstitution"/&gt;
 *                         &lt;enumeration value="accentColor"/&gt;
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
 *         &lt;element name="clothingTopStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dressShirtSize" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sleeveStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sleeveLengthStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Short Sleeve"/&gt;
 *               &lt;enumeration value="Long Sleeve"/&gt;
 *               &lt;enumeration value="Sleeveless"/&gt;
 *               &lt;enumeration value="1/4 Sleeve"/&gt;
 *               &lt;enumeration value="3/4 Sleeve"/&gt;
 *               &lt;enumeration value="Elbow-Length"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="shirtNeckStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="collarType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="jacketStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="suitBreastingStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="double-breasted"/&gt;
 *               &lt;enumeration value="single-breasted"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sweaterStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="scarfStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="upperBodyStrapConfiguration" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hatSize" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="6 1/4"/&gt;
 *               &lt;enumeration value="6 3/8"/&gt;
 *               &lt;enumeration value="6 1/2"/&gt;
 *               &lt;enumeration value="6 5/8"/&gt;
 *               &lt;enumeration value="6 3/4"/&gt;
 *               &lt;enumeration value="6 7/8"/&gt;
 *               &lt;enumeration value="7"/&gt;
 *               &lt;enumeration value="7 1/8"/&gt;
 *               &lt;enumeration value="7 1/4"/&gt;
 *               &lt;enumeration value="7 3/8"/&gt;
 *               &lt;enumeration value="7 1/2"/&gt;
 *               &lt;enumeration value="7 5/8"/&gt;
 *               &lt;enumeration value="7 3/4"/&gt;
 *               &lt;enumeration value="7 7/8"/&gt;
 *               &lt;enumeration value="8"/&gt;
 *               &lt;enumeration value="8 1/8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hatStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="braStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="braSize" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="chestSize" minOccurs="0"&gt;
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
 *                         &lt;enumeration value="cm"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pantRise" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="waistStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="waistSize" minOccurs="0"&gt;
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
 *         &lt;element name="pantySize" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
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
 *               &lt;enumeration value="21"/&gt;
 *               &lt;enumeration value="22"/&gt;
 *               &lt;enumeration value="23"/&gt;
 *               &lt;enumeration value="24"/&gt;
 *               &lt;enumeration value="25"/&gt;
 *               &lt;enumeration value="26"/&gt;
 *               &lt;enumeration value="27"/&gt;
 *               &lt;enumeration value="28"/&gt;
 *               &lt;enumeration value="29"/&gt;
 *               &lt;enumeration value="30"/&gt;
 *               &lt;enumeration value="31"/&gt;
 *               &lt;enumeration value="32"/&gt;
 *               &lt;enumeration value="33"/&gt;
 *               &lt;enumeration value="34"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="skirtLength" minOccurs="0"&gt;
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
 *                         &lt;enumeration value="cm"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="legOpeningCut" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="high-cut"/&gt;
 *               &lt;enumeration value="regular"/&gt;
 *               &lt;enumeration value="below hip"/&gt;
 *               &lt;enumeration value="at hip"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pantLegCut" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="jeanStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="jeanWash" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="jeanFinish" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pantSize" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pantFit" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pantStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="beltStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="beltBuckleStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pantyStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="shortsStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="skirtAndDressCut" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="skirtLengthStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hosieryStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tightsSheerness" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="opaque"/&gt;
 *               &lt;enumeration value="semi-opaque"/&gt;
 *               &lt;enumeration value="sheer"/&gt;
 *               &lt;enumeration value="thick opaque"/&gt;
 *               &lt;enumeration value="ultra-sheer"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="underwearStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sockSize" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sockStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sockRise" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="thigh-high"/&gt;
 *               &lt;enumeration value="knee-high"/&gt;
 *               &lt;enumeration value="crew"/&gt;
 *               &lt;enumeration value="quarter"/&gt;
 *               &lt;enumeration value="low-cut"/&gt;
 *               &lt;enumeration value="no-show"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fabricContent" type="{http://walmart.com/}FabricContent" minOccurs="0"/&gt;
 *         &lt;element name="fabricCareInstructions" type="{http://walmart.com/}FabricCareInstructions" minOccurs="0"/&gt;
 *         &lt;element name="accentColor" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="clothingWeight" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="lightweight"/&gt;
 *               &lt;enumeration value="mid-weight"/&gt;
 *               &lt;enumeration value="heavyweight"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="clothingStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="clothingFit" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="clothingCut" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="clothingLengthStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fastenerType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="swimsuitStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dressStyle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gotsCertification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
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
 *         &lt;element name="character" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="globalBrandLicense" type="{http://walmart.com/}BrandLicense" minOccurs="0"/&gt;
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
 *         &lt;element name="occasion" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="activity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sport" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="season" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="weather" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="400"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isMaternity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="academicInstitution" minOccurs="0"&gt;
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
 *         &lt;element name="autographedBy" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="braBandSize" minOccurs="0"&gt;
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
 *         &lt;element name="braCupSize" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="neckSize" minOccurs="0"&gt;
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
 *         &lt;element name="sleeveLength" minOccurs="0"&gt;
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
 *         &lt;element name="inseam" minOccurs="0"&gt;
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
 *         &lt;element name="isMadeFromRecycledMaterial" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="recycledMaterialContent" type="{http://walmart.com/}RecycledMaterialContent" minOccurs="0"/&gt;
 *         &lt;element name="features" type="{http://walmart.com/}AdditionalFeatures" minOccurs="0"/&gt;
 *         &lt;element name="keywords" minOccurs="0"&gt;
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
 *                                   &lt;enumeration value="clothingSize"/&gt;
 *                                   &lt;enumeration value="clothingFit"/&gt;
 *                                   &lt;enumeration value="pattern"/&gt;
 *                                   &lt;enumeration value="material"/&gt;
 *                                   &lt;enumeration value="inseam"/&gt;
 *                                   &lt;enumeration value="waistSize"/&gt;
 *                                   &lt;enumeration value="neckSize"/&gt;
 *                                   &lt;enumeration value="hatSize"/&gt;
 *                                   &lt;enumeration value="pantySize"/&gt;
 *                                   &lt;enumeration value="sockSize"/&gt;
 *                                   &lt;enumeration value="countPerPack"/&gt;
 *                                   &lt;enumeration value="count"/&gt;
 *                                   &lt;enumeration value="braSize"/&gt;
 *                                   &lt;enumeration value="braBandSize"/&gt;
 *                                   &lt;enumeration value="braCupSize"/&gt;
 *                                   &lt;enumeration value="academicInstitution"/&gt;
 *                                   &lt;enumeration value="accentColor"/&gt;
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
@XmlType(name = "Clothing", propOrder = {

})
public class Clothing {

    @XmlElement(required = true)
    protected String shortDescription;
    protected KeyFeatures keyFeatures;
    @XmlElement(required = true)
    protected String brand;
    protected String manufacturer;
    protected String manufacturerPartNumber;
    protected BigInteger multipackQuantity;
    protected BigInteger countPerPack;
    protected String count;
    protected BigInteger pieceCount;
    protected String modelNumber;
    @XmlElement(required = true)
    protected String mainImageUrl;
    protected ProductSecondaryImageURL productSecondaryImageURL;
    protected String color;
    protected Clothing.ColorCategory colorCategory;
    protected String pattern;
    protected String material;
    protected String gender;
    protected Clothing.AgeGroup ageGroup;
    protected String clothingSizeGroup;
    protected String clothingSize;
    protected String isSet;
    protected String variantGroupId;
    protected Clothing.VariantAttributeNames variantAttributeNames;
    protected String isPrimaryVariant;
    protected String isProp65WarningRequired;
    protected String prop65WarningText;
    protected Clothing.SmallPartsWarnings smallPartsWarnings;
    protected String requiresTextileActLabeling;
    protected String countryOfOriginTextiles;
    protected String batteryTechnologyType;
    protected String hasWarranty;
    protected String warrantyURL;
    protected String warrantyText;
    protected String clothingTopStyle;
    protected String dressShirtSize;
    protected String sleeveStyle;
    protected String sleeveLengthStyle;
    protected String shirtNeckStyle;
    protected String collarType;
    protected String jacketStyle;
    protected String suitBreastingStyle;
    protected String sweaterStyle;
    protected String scarfStyle;
    protected String upperBodyStrapConfiguration;
    protected String hatSize;
    protected String hatStyle;
    protected String braStyle;
    protected String braSize;
    protected Clothing.ChestSize chestSize;
    protected String pantRise;
    protected String waistStyle;
    protected Clothing.WaistSize waistSize;
    protected String pantySize;
    protected Clothing.SkirtLength skirtLength;
    protected String legOpeningCut;
    protected String pantLegCut;
    protected String jeanStyle;
    protected String jeanWash;
    protected String jeanFinish;
    protected String pantSize;
    protected String pantFit;
    protected String pantStyle;
    protected String beltStyle;
    protected String beltBuckleStyle;
    protected String pantyStyle;
    protected String shortsStyle;
    protected String skirtAndDressCut;
    protected String skirtLengthStyle;
    protected String hosieryStyle;
    protected String tightsSheerness;
    protected String underwearStyle;
    protected String sockSize;
    protected String sockStyle;
    protected String sockRise;
    protected FabricContent fabricContent;
    protected FabricCareInstructions fabricCareInstructions;
    protected String accentColor;
    protected String clothingWeight;
    protected String clothingStyle;
    protected String clothingFit;
    protected String clothingCut;
    protected String clothingLengthStyle;
    protected String fastenerType;
    protected String swimsuitStyle;
    protected String dressStyle;
    protected String gotsCertification;
    protected String theme;
    protected String character;
    protected BrandLicense globalBrandLicense;
    protected String sportsLeague;
    protected String sportsTeam;
    protected String occasion;
    protected String activity;
    protected String sport;
    protected String season;
    protected String weather;
    protected String isMaternity;
    protected String academicInstitution;
    protected String athlete;
    protected String autographedBy;
    protected Clothing.BraBandSize braBandSize;
    protected String braCupSize;
    protected Clothing.NeckSize neckSize;
    protected Clothing.SleeveLength sleeveLength;
    protected Clothing.Inseam inseam;
    protected String isMadeFromRecycledMaterial;
    protected RecycledMaterialContent recycledMaterialContent;
    protected AdditionalFeatures features;
    protected String keywords;
    protected Clothing.SwatchImages swatchImages;

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
     *     {@link Clothing.ColorCategory }
     *     
     */
    public Clothing.ColorCategory getColorCategory() {
        return colorCategory;
    }

    /**
     * 设置colorCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Clothing.ColorCategory }
     *     
     */
    public void setColorCategory(Clothing.ColorCategory value) {
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
     *     {@link Clothing.AgeGroup }
     *     
     */
    public Clothing.AgeGroup getAgeGroup() {
        return ageGroup;
    }

    /**
     * 设置ageGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Clothing.AgeGroup }
     *     
     */
    public void setAgeGroup(Clothing.AgeGroup value) {
        this.ageGroup = value;
    }

    /**
     * 获取clothingSizeGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClothingSizeGroup() {
        return clothingSizeGroup;
    }

    /**
     * 设置clothingSizeGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClothingSizeGroup(String value) {
        this.clothingSizeGroup = value;
    }

    /**
     * 获取clothingSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClothingSize() {
        return clothingSize;
    }

    /**
     * 设置clothingSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClothingSize(String value) {
        this.clothingSize = value;
    }

    /**
     * 获取isSet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSet() {
        return isSet;
    }

    /**
     * 设置isSet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSet(String value) {
        this.isSet = value;
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
     *     {@link Clothing.VariantAttributeNames }
     *     
     */
    public Clothing.VariantAttributeNames getVariantAttributeNames() {
        return variantAttributeNames;
    }

    /**
     * 设置variantAttributeNames属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Clothing.VariantAttributeNames }
     *     
     */
    public void setVariantAttributeNames(Clothing.VariantAttributeNames value) {
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
     *     {@link Clothing.SmallPartsWarnings }
     *     
     */
    public Clothing.SmallPartsWarnings getSmallPartsWarnings() {
        return smallPartsWarnings;
    }

    /**
     * 设置smallPartsWarnings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Clothing.SmallPartsWarnings }
     *     
     */
    public void setSmallPartsWarnings(Clothing.SmallPartsWarnings value) {
        this.smallPartsWarnings = value;
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
     * 获取clothingTopStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClothingTopStyle() {
        return clothingTopStyle;
    }

    /**
     * 设置clothingTopStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClothingTopStyle(String value) {
        this.clothingTopStyle = value;
    }

    /**
     * 获取dressShirtSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDressShirtSize() {
        return dressShirtSize;
    }

    /**
     * 设置dressShirtSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDressShirtSize(String value) {
        this.dressShirtSize = value;
    }

    /**
     * 获取sleeveStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSleeveStyle() {
        return sleeveStyle;
    }

    /**
     * 设置sleeveStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSleeveStyle(String value) {
        this.sleeveStyle = value;
    }

    /**
     * 获取sleeveLengthStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSleeveLengthStyle() {
        return sleeveLengthStyle;
    }

    /**
     * 设置sleeveLengthStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSleeveLengthStyle(String value) {
        this.sleeveLengthStyle = value;
    }

    /**
     * 获取shirtNeckStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShirtNeckStyle() {
        return shirtNeckStyle;
    }

    /**
     * 设置shirtNeckStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShirtNeckStyle(String value) {
        this.shirtNeckStyle = value;
    }

    /**
     * 获取collarType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollarType() {
        return collarType;
    }

    /**
     * 设置collarType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollarType(String value) {
        this.collarType = value;
    }

    /**
     * 获取jacketStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJacketStyle() {
        return jacketStyle;
    }

    /**
     * 设置jacketStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJacketStyle(String value) {
        this.jacketStyle = value;
    }

    /**
     * 获取suitBreastingStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuitBreastingStyle() {
        return suitBreastingStyle;
    }

    /**
     * 设置suitBreastingStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuitBreastingStyle(String value) {
        this.suitBreastingStyle = value;
    }

    /**
     * 获取sweaterStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSweaterStyle() {
        return sweaterStyle;
    }

    /**
     * 设置sweaterStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSweaterStyle(String value) {
        this.sweaterStyle = value;
    }

    /**
     * 获取scarfStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScarfStyle() {
        return scarfStyle;
    }

    /**
     * 设置scarfStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScarfStyle(String value) {
        this.scarfStyle = value;
    }

    /**
     * 获取upperBodyStrapConfiguration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperBodyStrapConfiguration() {
        return upperBodyStrapConfiguration;
    }

    /**
     * 设置upperBodyStrapConfiguration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperBodyStrapConfiguration(String value) {
        this.upperBodyStrapConfiguration = value;
    }

    /**
     * 获取hatSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHatSize() {
        return hatSize;
    }

    /**
     * 设置hatSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHatSize(String value) {
        this.hatSize = value;
    }

    /**
     * 获取hatStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHatStyle() {
        return hatStyle;
    }

    /**
     * 设置hatStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHatStyle(String value) {
        this.hatStyle = value;
    }

    /**
     * 获取braStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBraStyle() {
        return braStyle;
    }

    /**
     * 设置braStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBraStyle(String value) {
        this.braStyle = value;
    }

    /**
     * 获取braSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBraSize() {
        return braSize;
    }

    /**
     * 设置braSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBraSize(String value) {
        this.braSize = value;
    }

    /**
     * 获取chestSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Clothing.ChestSize }
     *     
     */
    public Clothing.ChestSize getChestSize() {
        return chestSize;
    }

    /**
     * 设置chestSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Clothing.ChestSize }
     *     
     */
    public void setChestSize(Clothing.ChestSize value) {
        this.chestSize = value;
    }

    /**
     * 获取pantRise属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPantRise() {
        return pantRise;
    }

    /**
     * 设置pantRise属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPantRise(String value) {
        this.pantRise = value;
    }

    /**
     * 获取waistStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaistStyle() {
        return waistStyle;
    }

    /**
     * 设置waistStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaistStyle(String value) {
        this.waistStyle = value;
    }

    /**
     * 获取waistSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Clothing.WaistSize }
     *     
     */
    public Clothing.WaistSize getWaistSize() {
        return waistSize;
    }

    /**
     * 设置waistSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Clothing.WaistSize }
     *     
     */
    public void setWaistSize(Clothing.WaistSize value) {
        this.waistSize = value;
    }

    /**
     * 获取pantySize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPantySize() {
        return pantySize;
    }

    /**
     * 设置pantySize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPantySize(String value) {
        this.pantySize = value;
    }

    /**
     * 获取skirtLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Clothing.SkirtLength }
     *     
     */
    public Clothing.SkirtLength getSkirtLength() {
        return skirtLength;
    }

    /**
     * 设置skirtLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Clothing.SkirtLength }
     *     
     */
    public void setSkirtLength(Clothing.SkirtLength value) {
        this.skirtLength = value;
    }

    /**
     * 获取legOpeningCut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegOpeningCut() {
        return legOpeningCut;
    }

    /**
     * 设置legOpeningCut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegOpeningCut(String value) {
        this.legOpeningCut = value;
    }

    /**
     * 获取pantLegCut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPantLegCut() {
        return pantLegCut;
    }

    /**
     * 设置pantLegCut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPantLegCut(String value) {
        this.pantLegCut = value;
    }

    /**
     * 获取jeanStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJeanStyle() {
        return jeanStyle;
    }

    /**
     * 设置jeanStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJeanStyle(String value) {
        this.jeanStyle = value;
    }

    /**
     * 获取jeanWash属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJeanWash() {
        return jeanWash;
    }

    /**
     * 设置jeanWash属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJeanWash(String value) {
        this.jeanWash = value;
    }

    /**
     * 获取jeanFinish属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJeanFinish() {
        return jeanFinish;
    }

    /**
     * 设置jeanFinish属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJeanFinish(String value) {
        this.jeanFinish = value;
    }

    /**
     * 获取pantSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPantSize() {
        return pantSize;
    }

    /**
     * 设置pantSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPantSize(String value) {
        this.pantSize = value;
    }

    /**
     * 获取pantFit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPantFit() {
        return pantFit;
    }

    /**
     * 设置pantFit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPantFit(String value) {
        this.pantFit = value;
    }

    /**
     * 获取pantStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPantStyle() {
        return pantStyle;
    }

    /**
     * 设置pantStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPantStyle(String value) {
        this.pantStyle = value;
    }

    /**
     * 获取beltStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeltStyle() {
        return beltStyle;
    }

    /**
     * 设置beltStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeltStyle(String value) {
        this.beltStyle = value;
    }

    /**
     * 获取beltBuckleStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeltBuckleStyle() {
        return beltBuckleStyle;
    }

    /**
     * 设置beltBuckleStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeltBuckleStyle(String value) {
        this.beltBuckleStyle = value;
    }

    /**
     * 获取pantyStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPantyStyle() {
        return pantyStyle;
    }

    /**
     * 设置pantyStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPantyStyle(String value) {
        this.pantyStyle = value;
    }

    /**
     * 获取shortsStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortsStyle() {
        return shortsStyle;
    }

    /**
     * 设置shortsStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortsStyle(String value) {
        this.shortsStyle = value;
    }

    /**
     * 获取skirtAndDressCut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkirtAndDressCut() {
        return skirtAndDressCut;
    }

    /**
     * 设置skirtAndDressCut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkirtAndDressCut(String value) {
        this.skirtAndDressCut = value;
    }

    /**
     * 获取skirtLengthStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkirtLengthStyle() {
        return skirtLengthStyle;
    }

    /**
     * 设置skirtLengthStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkirtLengthStyle(String value) {
        this.skirtLengthStyle = value;
    }

    /**
     * 获取hosieryStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHosieryStyle() {
        return hosieryStyle;
    }

    /**
     * 设置hosieryStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHosieryStyle(String value) {
        this.hosieryStyle = value;
    }

    /**
     * 获取tightsSheerness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTightsSheerness() {
        return tightsSheerness;
    }

    /**
     * 设置tightsSheerness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTightsSheerness(String value) {
        this.tightsSheerness = value;
    }

    /**
     * 获取underwearStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderwearStyle() {
        return underwearStyle;
    }

    /**
     * 设置underwearStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderwearStyle(String value) {
        this.underwearStyle = value;
    }

    /**
     * 获取sockSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSockSize() {
        return sockSize;
    }

    /**
     * 设置sockSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSockSize(String value) {
        this.sockSize = value;
    }

    /**
     * 获取sockStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSockStyle() {
        return sockStyle;
    }

    /**
     * 设置sockStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSockStyle(String value) {
        this.sockStyle = value;
    }

    /**
     * 获取sockRise属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSockRise() {
        return sockRise;
    }

    /**
     * 设置sockRise属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSockRise(String value) {
        this.sockRise = value;
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
     * 获取accentColor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccentColor() {
        return accentColor;
    }

    /**
     * 设置accentColor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccentColor(String value) {
        this.accentColor = value;
    }

    /**
     * 获取clothingWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClothingWeight() {
        return clothingWeight;
    }

    /**
     * 设置clothingWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClothingWeight(String value) {
        this.clothingWeight = value;
    }

    /**
     * 获取clothingStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClothingStyle() {
        return clothingStyle;
    }

    /**
     * 设置clothingStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClothingStyle(String value) {
        this.clothingStyle = value;
    }

    /**
     * 获取clothingFit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClothingFit() {
        return clothingFit;
    }

    /**
     * 设置clothingFit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClothingFit(String value) {
        this.clothingFit = value;
    }

    /**
     * 获取clothingCut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClothingCut() {
        return clothingCut;
    }

    /**
     * 设置clothingCut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClothingCut(String value) {
        this.clothingCut = value;
    }

    /**
     * 获取clothingLengthStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClothingLengthStyle() {
        return clothingLengthStyle;
    }

    /**
     * 设置clothingLengthStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClothingLengthStyle(String value) {
        this.clothingLengthStyle = value;
    }

    /**
     * 获取fastenerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFastenerType() {
        return fastenerType;
    }

    /**
     * 设置fastenerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFastenerType(String value) {
        this.fastenerType = value;
    }

    /**
     * 获取swimsuitStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwimsuitStyle() {
        return swimsuitStyle;
    }

    /**
     * 设置swimsuitStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwimsuitStyle(String value) {
        this.swimsuitStyle = value;
    }

    /**
     * 获取dressStyle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDressStyle() {
        return dressStyle;
    }

    /**
     * 设置dressStyle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDressStyle(String value) {
        this.dressStyle = value;
    }

    /**
     * 获取gotsCertification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGotsCertification() {
        return gotsCertification;
    }

    /**
     * 设置gotsCertification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGotsCertification(String value) {
        this.gotsCertification = value;
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
     * 获取activity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivity() {
        return activity;
    }

    /**
     * 设置activity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivity(String value) {
        this.activity = value;
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
     * 获取season属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeason() {
        return season;
    }

    /**
     * 设置season属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeason(String value) {
        this.season = value;
    }

    /**
     * 获取weather属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeather() {
        return weather;
    }

    /**
     * 设置weather属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeather(String value) {
        this.weather = value;
    }

    /**
     * 获取isMaternity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsMaternity() {
        return isMaternity;
    }

    /**
     * 设置isMaternity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsMaternity(String value) {
        this.isMaternity = value;
    }

    /**
     * 获取academicInstitution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicInstitution() {
        return academicInstitution;
    }

    /**
     * 设置academicInstitution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicInstitution(String value) {
        this.academicInstitution = value;
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
     * 获取braBandSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Clothing.BraBandSize }
     *     
     */
    public Clothing.BraBandSize getBraBandSize() {
        return braBandSize;
    }

    /**
     * 设置braBandSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Clothing.BraBandSize }
     *     
     */
    public void setBraBandSize(Clothing.BraBandSize value) {
        this.braBandSize = value;
    }

    /**
     * 获取braCupSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBraCupSize() {
        return braCupSize;
    }

    /**
     * 设置braCupSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBraCupSize(String value) {
        this.braCupSize = value;
    }

    /**
     * 获取neckSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Clothing.NeckSize }
     *     
     */
    public Clothing.NeckSize getNeckSize() {
        return neckSize;
    }

    /**
     * 设置neckSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Clothing.NeckSize }
     *     
     */
    public void setNeckSize(Clothing.NeckSize value) {
        this.neckSize = value;
    }

    /**
     * 获取sleeveLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Clothing.SleeveLength }
     *     
     */
    public Clothing.SleeveLength getSleeveLength() {
        return sleeveLength;
    }

    /**
     * 设置sleeveLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Clothing.SleeveLength }
     *     
     */
    public void setSleeveLength(Clothing.SleeveLength value) {
        this.sleeveLength = value;
    }

    /**
     * 获取inseam属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Clothing.Inseam }
     *     
     */
    public Clothing.Inseam getInseam() {
        return inseam;
    }

    /**
     * 设置inseam属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Clothing.Inseam }
     *     
     */
    public void setInseam(Clothing.Inseam value) {
        this.inseam = value;
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
     * 获取swatchImages属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Clothing.SwatchImages }
     *     
     */
    public Clothing.SwatchImages getSwatchImages() {
        return swatchImages;
    }

    /**
     * 设置swatchImages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Clothing.SwatchImages }
     *     
     */
    public void setSwatchImages(Clothing.SwatchImages value) {
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
    public static class BraBandSize {

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
    public static class ChestSize {

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
    public static class Inseam {

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
    public static class NeckSize {

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
    public static class SkirtLength {

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
    public static class SleeveLength {

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
     *                         &lt;enumeration value="clothingSize"/&gt;
     *                         &lt;enumeration value="clothingFit"/&gt;
     *                         &lt;enumeration value="pattern"/&gt;
     *                         &lt;enumeration value="material"/&gt;
     *                         &lt;enumeration value="inseam"/&gt;
     *                         &lt;enumeration value="waistSize"/&gt;
     *                         &lt;enumeration value="neckSize"/&gt;
     *                         &lt;enumeration value="hatSize"/&gt;
     *                         &lt;enumeration value="pantySize"/&gt;
     *                         &lt;enumeration value="sockSize"/&gt;
     *                         &lt;enumeration value="countPerPack"/&gt;
     *                         &lt;enumeration value="count"/&gt;
     *                         &lt;enumeration value="braSize"/&gt;
     *                         &lt;enumeration value="braBandSize"/&gt;
     *                         &lt;enumeration value="braCupSize"/&gt;
     *                         &lt;enumeration value="academicInstitution"/&gt;
     *                         &lt;enumeration value="accentColor"/&gt;
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
        protected List<Clothing.SwatchImages.SwatchImage> swatchImage;

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
         * {@link Clothing.SwatchImages.SwatchImage }
         * 
         * 
         */
        public List<Clothing.SwatchImages.SwatchImage> getSwatchImage() {
            if (swatchImage == null) {
                swatchImage = new ArrayList<Clothing.SwatchImages.SwatchImage>();
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
         *               &lt;enumeration value="clothingSize"/&gt;
         *               &lt;enumeration value="clothingFit"/&gt;
         *               &lt;enumeration value="pattern"/&gt;
         *               &lt;enumeration value="material"/&gt;
         *               &lt;enumeration value="inseam"/&gt;
         *               &lt;enumeration value="waistSize"/&gt;
         *               &lt;enumeration value="neckSize"/&gt;
         *               &lt;enumeration value="hatSize"/&gt;
         *               &lt;enumeration value="pantySize"/&gt;
         *               &lt;enumeration value="sockSize"/&gt;
         *               &lt;enumeration value="countPerPack"/&gt;
         *               &lt;enumeration value="count"/&gt;
         *               &lt;enumeration value="braSize"/&gt;
         *               &lt;enumeration value="braBandSize"/&gt;
         *               &lt;enumeration value="braCupSize"/&gt;
         *               &lt;enumeration value="academicInstitution"/&gt;
         *               &lt;enumeration value="accentColor"/&gt;
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
     *               &lt;enumeration value="clothingSize"/&gt;
     *               &lt;enumeration value="clothingFit"/&gt;
     *               &lt;enumeration value="pattern"/&gt;
     *               &lt;enumeration value="material"/&gt;
     *               &lt;enumeration value="inseam"/&gt;
     *               &lt;enumeration value="waistSize"/&gt;
     *               &lt;enumeration value="neckSize"/&gt;
     *               &lt;enumeration value="hatSize"/&gt;
     *               &lt;enumeration value="pantySize"/&gt;
     *               &lt;enumeration value="sockSize"/&gt;
     *               &lt;enumeration value="countPerPack"/&gt;
     *               &lt;enumeration value="count"/&gt;
     *               &lt;enumeration value="braSize"/&gt;
     *               &lt;enumeration value="braBandSize"/&gt;
     *               &lt;enumeration value="braCupSize"/&gt;
     *               &lt;enumeration value="academicInstitution"/&gt;
     *               &lt;enumeration value="accentColor"/&gt;
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
    public static class WaistSize {

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

}
