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
 * <p>CamerasAndLenses complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CamerasAndLenses"&gt;
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
 *         &lt;element name="numberOfMegapixels" minOccurs="0"&gt;
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
 *                         &lt;enumeration value="MP"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
 *         &lt;element name="magnification" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sensorResolution" type="{http://walmart.com/}ResolutionUnit" minOccurs="0"/&gt;
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
 *         &lt;element name="lensFilterType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="cameraLensType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hasFlash" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="flashType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="minimumShutterSpeed" minOccurs="0"&gt;
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
 *                         &lt;enumeration value="s"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maximumShutterSpeed" minOccurs="0"&gt;
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
 *                         &lt;enumeration value="s"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="focusType" type="{http://walmart.com/}FocusType" minOccurs="0"/&gt;
 *         &lt;element name="focalLength" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="measure"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="4000"/&gt;
 *                         &lt;minLength value="1"/&gt;
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
 *         &lt;element name="focalRatio" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="minimumAperture" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maximumAperture" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="exposureModes" type="{http://walmart.com/}ExposureModes" minOccurs="0"/&gt;
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
 *                         &lt;enumeration value="in"/&gt;
 *                         &lt;enumeration value="cm"/&gt;
 *                         &lt;enumeration value="mm"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
 *                         &lt;enumeration value="material"/&gt;
 *                         &lt;enumeration value="finish"/&gt;
 *                         &lt;enumeration value="focalLength"/&gt;
 *                         &lt;enumeration value="displayResolution"/&gt;
 *                         &lt;enumeration value="capacity"/&gt;
 *                         &lt;enumeration value="shape"/&gt;
 *                         &lt;enumeration value="diameter"/&gt;
 *                         &lt;enumeration value="sportsTeam"/&gt;
 *                         &lt;enumeration value="count"/&gt;
 *                         &lt;enumeration value="size"/&gt;
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
 *         &lt;element name="accessoriesIncluded" type="{http://walmart.com/}AccessoriesIncluded" minOccurs="0"/&gt;
 *         &lt;element name="hasTouchscreen" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
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
 *         &lt;element name="memoryCardType" type="{http://walmart.com/}MemoryCardFormat" minOccurs="0"/&gt;
 *         &lt;element name="recordableMediaFormats" type="{http://walmart.com/}RecordableMediaFormats" minOccurs="0"/&gt;
 *         &lt;element name="wirelessTechnologies" type="{http://walmart.com/}WirelessTechnologies" minOccurs="0"/&gt;
 *         &lt;element name="connections" type="{http://walmart.com/}Connections" minOccurs="0"/&gt;
 *         &lt;element name="isPortable" minOccurs="0"&gt;
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
 *         &lt;element name="hasSelfTimer" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="selfTimerDelay" type="{http://walmart.com/}SelfTimerDelay" minOccurs="0"/&gt;
 *         &lt;element name="standbyTime" minOccurs="0"&gt;
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
 *                         &lt;enumeration value="h"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
 *         &lt;element name="shootingMode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="microphoneIncluded" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="hasHandle" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
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
 *         &lt;element name="hasRedEyeReduction" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
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
 *         &lt;element name="isFogResistant" minOccurs="0"&gt;
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
 *         &lt;element name="hasShoulderStrap" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Yes"/&gt;
 *               &lt;enumeration value="No"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="compatibleBrands" type="{http://walmart.com/}CompatibleBrands" minOccurs="0"/&gt;
 *         &lt;element name="compatibleDevices" minOccurs="0"&gt;
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
 *         &lt;element name="cleaningCareAndMaintenance" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4000"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="globalBrandLicense" type="{http://walmart.com/}BrandLicense" minOccurs="0"/&gt;
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
 *                                   &lt;enumeration value="material"/&gt;
 *                                   &lt;enumeration value="finish"/&gt;
 *                                   &lt;enumeration value="focalLength"/&gt;
 *                                   &lt;enumeration value="displayResolution"/&gt;
 *                                   &lt;enumeration value="capacity"/&gt;
 *                                   &lt;enumeration value="shape"/&gt;
 *                                   &lt;enumeration value="diameter"/&gt;
 *                                   &lt;enumeration value="sportsTeam"/&gt;
 *                                   &lt;enumeration value="count"/&gt;
 *                                   &lt;enumeration value="size"/&gt;
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
@XmlType(name = "CamerasAndLenses", propOrder = {

})
public class CamerasAndLenses {

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
    protected CamerasAndLenses.NumberOfMegapixels numberOfMegapixels;
    protected String digitalZoom;
    protected String opticalZoom;
    protected String magnification;
    protected ResolutionUnit sensorResolution;
    protected CamerasAndLenses.LensDiameter lensDiameter;
    protected String lensCoating;
    protected String lensFilterType;
    protected String cameraLensType;
    protected String hasFlash;
    protected String flashType;
    protected CamerasAndLenses.MinimumShutterSpeed minimumShutterSpeed;
    protected CamerasAndLenses.MaximumShutterSpeed maximumShutterSpeed;
    protected FocusType focusType;
    protected CamerasAndLenses.FocalLength focalLength;
    protected String focalRatio;
    protected String minimumAperture;
    protected String maximumAperture;
    protected ExposureModes exposureModes;
    protected String displayTechnology;
    protected String displayResolution;
    protected CamerasAndLenses.ScreenSize screenSize;
    protected CamerasAndLenses.Diameter diameter;
    protected String color;
    protected CamerasAndLenses.ColorCategory colorCategory;
    protected CamerasAndLenses.AssembledProductLength assembledProductLength;
    protected CamerasAndLenses.AssembledProductWidth assembledProductWidth;
    protected CamerasAndLenses.AssembledProductHeight assembledProductHeight;
    protected CamerasAndLenses.AssembledProductWeight assembledProductWeight;
    protected String variantGroupId;
    protected CamerasAndLenses.VariantAttributeNames variantAttributeNames;
    protected String isPrimaryVariant;
    protected String isProp65WarningRequired;
    protected String prop65WarningText;
    protected String batteryTechnologyType;
    protected String isAssemblyRequired;
    protected String assemblyInstructions;
    protected String hasWarranty;
    protected String warrantyURL;
    protected String warrantyText;
    protected AccessoriesIncluded accessoriesIncluded;
    protected String hasTouchscreen;
    protected String hasMemoryCardSlot;
    protected MemoryCardFormat memoryCardType;
    protected RecordableMediaFormats recordableMediaFormats;
    protected WirelessTechnologies wirelessTechnologies;
    protected Connections connections;
    protected String isPortable;
    protected String isWaterproof;
    protected String hasSelfTimer;
    protected SelfTimerDelay selfTimerDelay;
    protected CamerasAndLenses.StandbyTime standbyTime;
    protected String fieldOfView;
    protected String isParfocal;
    protected String shootingMode;
    protected String microphoneIncluded;
    protected String hasHandle;
    protected String isMulticoated;
    protected String hasRedEyeReduction;
    protected String hasNightVision;
    protected String isFogResistant;
    protected String attachmentStyle;
    protected String hasShoulderStrap;
    protected CompatibleBrands compatibleBrands;
    protected String compatibleDevices;
    protected String material;
    protected String cleaningCareAndMaintenance;
    protected BrandLicense globalBrandLicense;
    protected AdditionalFeatures features;
    protected String keywords;
    protected CamerasAndLenses.SwatchImages swatchImages;

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
     * 获取numberOfMegapixels属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CamerasAndLenses.NumberOfMegapixels }
     *     
     */
    public CamerasAndLenses.NumberOfMegapixels getNumberOfMegapixels() {
        return numberOfMegapixels;
    }

    /**
     * 设置numberOfMegapixels属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CamerasAndLenses.NumberOfMegapixels }
     *     
     */
    public void setNumberOfMegapixels(CamerasAndLenses.NumberOfMegapixels value) {
        this.numberOfMegapixels = value;
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
     * 获取lensDiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CamerasAndLenses.LensDiameter }
     *     
     */
    public CamerasAndLenses.LensDiameter getLensDiameter() {
        return lensDiameter;
    }

    /**
     * 设置lensDiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CamerasAndLenses.LensDiameter }
     *     
     */
    public void setLensDiameter(CamerasAndLenses.LensDiameter value) {
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
     * 获取lensFilterType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLensFilterType() {
        return lensFilterType;
    }

    /**
     * 设置lensFilterType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLensFilterType(String value) {
        this.lensFilterType = value;
    }

    /**
     * 获取cameraLensType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraLensType() {
        return cameraLensType;
    }

    /**
     * 设置cameraLensType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraLensType(String value) {
        this.cameraLensType = value;
    }

    /**
     * 获取hasFlash属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasFlash() {
        return hasFlash;
    }

    /**
     * 设置hasFlash属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasFlash(String value) {
        this.hasFlash = value;
    }

    /**
     * 获取flashType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlashType() {
        return flashType;
    }

    /**
     * 设置flashType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlashType(String value) {
        this.flashType = value;
    }

    /**
     * 获取minimumShutterSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CamerasAndLenses.MinimumShutterSpeed }
     *     
     */
    public CamerasAndLenses.MinimumShutterSpeed getMinimumShutterSpeed() {
        return minimumShutterSpeed;
    }

    /**
     * 设置minimumShutterSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CamerasAndLenses.MinimumShutterSpeed }
     *     
     */
    public void setMinimumShutterSpeed(CamerasAndLenses.MinimumShutterSpeed value) {
        this.minimumShutterSpeed = value;
    }

    /**
     * 获取maximumShutterSpeed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CamerasAndLenses.MaximumShutterSpeed }
     *     
     */
    public CamerasAndLenses.MaximumShutterSpeed getMaximumShutterSpeed() {
        return maximumShutterSpeed;
    }

    /**
     * 设置maximumShutterSpeed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CamerasAndLenses.MaximumShutterSpeed }
     *     
     */
    public void setMaximumShutterSpeed(CamerasAndLenses.MaximumShutterSpeed value) {
        this.maximumShutterSpeed = value;
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
     * 获取focalLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CamerasAndLenses.FocalLength }
     *     
     */
    public CamerasAndLenses.FocalLength getFocalLength() {
        return focalLength;
    }

    /**
     * 设置focalLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CamerasAndLenses.FocalLength }
     *     
     */
    public void setFocalLength(CamerasAndLenses.FocalLength value) {
        this.focalLength = value;
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
     * 获取minimumAperture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumAperture() {
        return minimumAperture;
    }

    /**
     * 设置minimumAperture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumAperture(String value) {
        this.minimumAperture = value;
    }

    /**
     * 获取maximumAperture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAperture() {
        return maximumAperture;
    }

    /**
     * 设置maximumAperture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAperture(String value) {
        this.maximumAperture = value;
    }

    /**
     * 获取exposureModes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExposureModes }
     *     
     */
    public ExposureModes getExposureModes() {
        return exposureModes;
    }

    /**
     * 设置exposureModes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureModes }
     *     
     */
    public void setExposureModes(ExposureModes value) {
        this.exposureModes = value;
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
     * 获取screenSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CamerasAndLenses.ScreenSize }
     *     
     */
    public CamerasAndLenses.ScreenSize getScreenSize() {
        return screenSize;
    }

    /**
     * 设置screenSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CamerasAndLenses.ScreenSize }
     *     
     */
    public void setScreenSize(CamerasAndLenses.ScreenSize value) {
        this.screenSize = value;
    }

    /**
     * 获取diameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CamerasAndLenses.Diameter }
     *     
     */
    public CamerasAndLenses.Diameter getDiameter() {
        return diameter;
    }

    /**
     * 设置diameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CamerasAndLenses.Diameter }
     *     
     */
    public void setDiameter(CamerasAndLenses.Diameter value) {
        this.diameter = value;
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
     *     {@link CamerasAndLenses.ColorCategory }
     *     
     */
    public CamerasAndLenses.ColorCategory getColorCategory() {
        return colorCategory;
    }

    /**
     * 设置colorCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CamerasAndLenses.ColorCategory }
     *     
     */
    public void setColorCategory(CamerasAndLenses.ColorCategory value) {
        this.colorCategory = value;
    }

    /**
     * 获取assembledProductLength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CamerasAndLenses.AssembledProductLength }
     *     
     */
    public CamerasAndLenses.AssembledProductLength getAssembledProductLength() {
        return assembledProductLength;
    }

    /**
     * 设置assembledProductLength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CamerasAndLenses.AssembledProductLength }
     *     
     */
    public void setAssembledProductLength(CamerasAndLenses.AssembledProductLength value) {
        this.assembledProductLength = value;
    }

    /**
     * 获取assembledProductWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CamerasAndLenses.AssembledProductWidth }
     *     
     */
    public CamerasAndLenses.AssembledProductWidth getAssembledProductWidth() {
        return assembledProductWidth;
    }

    /**
     * 设置assembledProductWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CamerasAndLenses.AssembledProductWidth }
     *     
     */
    public void setAssembledProductWidth(CamerasAndLenses.AssembledProductWidth value) {
        this.assembledProductWidth = value;
    }

    /**
     * 获取assembledProductHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CamerasAndLenses.AssembledProductHeight }
     *     
     */
    public CamerasAndLenses.AssembledProductHeight getAssembledProductHeight() {
        return assembledProductHeight;
    }

    /**
     * 设置assembledProductHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CamerasAndLenses.AssembledProductHeight }
     *     
     */
    public void setAssembledProductHeight(CamerasAndLenses.AssembledProductHeight value) {
        this.assembledProductHeight = value;
    }

    /**
     * 获取assembledProductWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CamerasAndLenses.AssembledProductWeight }
     *     
     */
    public CamerasAndLenses.AssembledProductWeight getAssembledProductWeight() {
        return assembledProductWeight;
    }

    /**
     * 设置assembledProductWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CamerasAndLenses.AssembledProductWeight }
     *     
     */
    public void setAssembledProductWeight(CamerasAndLenses.AssembledProductWeight value) {
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
     *     {@link CamerasAndLenses.VariantAttributeNames }
     *     
     */
    public CamerasAndLenses.VariantAttributeNames getVariantAttributeNames() {
        return variantAttributeNames;
    }

    /**
     * 设置variantAttributeNames属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CamerasAndLenses.VariantAttributeNames }
     *     
     */
    public void setVariantAttributeNames(CamerasAndLenses.VariantAttributeNames value) {
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
     * 获取accessoriesIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccessoriesIncluded }
     *     
     */
    public AccessoriesIncluded getAccessoriesIncluded() {
        return accessoriesIncluded;
    }

    /**
     * 设置accessoriesIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccessoriesIncluded }
     *     
     */
    public void setAccessoriesIncluded(AccessoriesIncluded value) {
        this.accessoriesIncluded = value;
    }

    /**
     * 获取hasTouchscreen属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasTouchscreen() {
        return hasTouchscreen;
    }

    /**
     * 设置hasTouchscreen属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasTouchscreen(String value) {
        this.hasTouchscreen = value;
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
     * 获取memoryCardType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemoryCardFormat }
     *     
     */
    public MemoryCardFormat getMemoryCardType() {
        return memoryCardType;
    }

    /**
     * 设置memoryCardType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemoryCardFormat }
     *     
     */
    public void setMemoryCardType(MemoryCardFormat value) {
        this.memoryCardType = value;
    }

    /**
     * 获取recordableMediaFormats属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RecordableMediaFormats }
     *     
     */
    public RecordableMediaFormats getRecordableMediaFormats() {
        return recordableMediaFormats;
    }

    /**
     * 设置recordableMediaFormats属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RecordableMediaFormats }
     *     
     */
    public void setRecordableMediaFormats(RecordableMediaFormats value) {
        this.recordableMediaFormats = value;
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
     * 获取connections属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Connections }
     *     
     */
    public Connections getConnections() {
        return connections;
    }

    /**
     * 设置connections属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Connections }
     *     
     */
    public void setConnections(Connections value) {
        this.connections = value;
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
     * 获取hasSelfTimer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasSelfTimer() {
        return hasSelfTimer;
    }

    /**
     * 设置hasSelfTimer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasSelfTimer(String value) {
        this.hasSelfTimer = value;
    }

    /**
     * 获取selfTimerDelay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SelfTimerDelay }
     *     
     */
    public SelfTimerDelay getSelfTimerDelay() {
        return selfTimerDelay;
    }

    /**
     * 设置selfTimerDelay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SelfTimerDelay }
     *     
     */
    public void setSelfTimerDelay(SelfTimerDelay value) {
        this.selfTimerDelay = value;
    }

    /**
     * 获取standbyTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CamerasAndLenses.StandbyTime }
     *     
     */
    public CamerasAndLenses.StandbyTime getStandbyTime() {
        return standbyTime;
    }

    /**
     * 设置standbyTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CamerasAndLenses.StandbyTime }
     *     
     */
    public void setStandbyTime(CamerasAndLenses.StandbyTime value) {
        this.standbyTime = value;
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
     * 获取shootingMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShootingMode() {
        return shootingMode;
    }

    /**
     * 设置shootingMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShootingMode(String value) {
        this.shootingMode = value;
    }

    /**
     * 获取microphoneIncluded属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMicrophoneIncluded() {
        return microphoneIncluded;
    }

    /**
     * 设置microphoneIncluded属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMicrophoneIncluded(String value) {
        this.microphoneIncluded = value;
    }

    /**
     * 获取hasHandle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasHandle() {
        return hasHandle;
    }

    /**
     * 设置hasHandle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasHandle(String value) {
        this.hasHandle = value;
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
     * 获取hasRedEyeReduction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasRedEyeReduction() {
        return hasRedEyeReduction;
    }

    /**
     * 设置hasRedEyeReduction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasRedEyeReduction(String value) {
        this.hasRedEyeReduction = value;
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
     * 获取hasShoulderStrap属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasShoulderStrap() {
        return hasShoulderStrap;
    }

    /**
     * 设置hasShoulderStrap属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasShoulderStrap(String value) {
        this.hasShoulderStrap = value;
    }

    /**
     * 获取compatibleBrands属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompatibleBrands }
     *     
     */
    public CompatibleBrands getCompatibleBrands() {
        return compatibleBrands;
    }

    /**
     * 设置compatibleBrands属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompatibleBrands }
     *     
     */
    public void setCompatibleBrands(CompatibleBrands value) {
        this.compatibleBrands = value;
    }

    /**
     * 获取compatibleDevices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibleDevices() {
        return compatibleDevices;
    }

    /**
     * 设置compatibleDevices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibleDevices(String value) {
        this.compatibleDevices = value;
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
     *     {@link CamerasAndLenses.SwatchImages }
     *     
     */
    public CamerasAndLenses.SwatchImages getSwatchImages() {
        return swatchImages;
    }

    /**
     * 设置swatchImages属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CamerasAndLenses.SwatchImages }
     *     
     */
    public void setSwatchImages(CamerasAndLenses.SwatchImages value) {
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
     *               &lt;enumeration value="in"/&gt;
     *               &lt;enumeration value="cm"/&gt;
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
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="4000"/&gt;
     *               &lt;minLength value="1"/&gt;
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
    public static class FocalLength {

        @XmlElement(required = true)
        protected String measure;
        @XmlElement(required = true)
        protected String unit;

        /**
         * 获取measure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeasure() {
            return measure;
        }

        /**
         * 设置measure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeasure(String value) {
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
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *               &lt;totalDigits value="16"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="unit"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="s"/&gt;
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
    public static class MaximumShutterSpeed {

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
     *               &lt;enumeration value="s"/&gt;
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
    public static class MinimumShutterSpeed {

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
     *               &lt;enumeration value="MP"/&gt;
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
    public static class NumberOfMegapixels {

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
     *               &lt;enumeration value="h"/&gt;
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
    public static class StandbyTime {

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
     *                         &lt;enumeration value="material"/&gt;
     *                         &lt;enumeration value="finish"/&gt;
     *                         &lt;enumeration value="focalLength"/&gt;
     *                         &lt;enumeration value="displayResolution"/&gt;
     *                         &lt;enumeration value="capacity"/&gt;
     *                         &lt;enumeration value="shape"/&gt;
     *                         &lt;enumeration value="diameter"/&gt;
     *                         &lt;enumeration value="sportsTeam"/&gt;
     *                         &lt;enumeration value="count"/&gt;
     *                         &lt;enumeration value="size"/&gt;
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
        protected List<CamerasAndLenses.SwatchImages.SwatchImage> swatchImage;

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
         * {@link CamerasAndLenses.SwatchImages.SwatchImage }
         * 
         * 
         */
        public List<CamerasAndLenses.SwatchImages.SwatchImage> getSwatchImage() {
            if (swatchImage == null) {
                swatchImage = new ArrayList<CamerasAndLenses.SwatchImages.SwatchImage>();
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
         *               &lt;enumeration value="material"/&gt;
         *               &lt;enumeration value="finish"/&gt;
         *               &lt;enumeration value="focalLength"/&gt;
         *               &lt;enumeration value="displayResolution"/&gt;
         *               &lt;enumeration value="capacity"/&gt;
         *               &lt;enumeration value="shape"/&gt;
         *               &lt;enumeration value="diameter"/&gt;
         *               &lt;enumeration value="sportsTeam"/&gt;
         *               &lt;enumeration value="count"/&gt;
         *               &lt;enumeration value="size"/&gt;
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
     *               &lt;enumeration value="material"/&gt;
     *               &lt;enumeration value="finish"/&gt;
     *               &lt;enumeration value="focalLength"/&gt;
     *               &lt;enumeration value="displayResolution"/&gt;
     *               &lt;enumeration value="capacity"/&gt;
     *               &lt;enumeration value="shape"/&gt;
     *               &lt;enumeration value="diameter"/&gt;
     *               &lt;enumeration value="sportsTeam"/&gt;
     *               &lt;enumeration value="count"/&gt;
     *               &lt;enumeration value="size"/&gt;
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
