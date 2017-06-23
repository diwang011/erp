//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.23 时间 11:38:50 AM CST 
//


package com.erp.biz.api.model.mp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>HealthAndBeauty complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HealthAndBeauty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="MedicalAids" type="{http://walmart.com/}MedicalAids"/&gt;
 *         &lt;element name="Optical" type="{http://walmart.com/}Optical"/&gt;
 *         &lt;element name="MedicineAndSupplements" type="{http://walmart.com/}MedicineAndSupplements"/&gt;
 *         &lt;element name="HealthAndBeautyElectronics" type="{http://walmart.com/}HealthAndBeautyElectronics"/&gt;
 *         &lt;element name="PersonalCare" type="{http://walmart.com/}PersonalCare"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthAndBeauty", propOrder = {
    "medicalAids",
    "optical",
    "medicineAndSupplements",
    "healthAndBeautyElectronics",
    "personalCare"
})
public class HealthAndBeauty {

    @XmlElement(name = "MedicalAids")
    protected MedicalAids medicalAids;
    @XmlElement(name = "Optical")
    protected Optical optical;
    @XmlElement(name = "MedicineAndSupplements")
    protected MedicineAndSupplements medicineAndSupplements;
    @XmlElement(name = "HealthAndBeautyElectronics")
    protected HealthAndBeautyElectronics healthAndBeautyElectronics;
    @XmlElement(name = "PersonalCare")
    protected PersonalCare personalCare;

    /**
     * 获取medicalAids属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MedicalAids }
     *     
     */
    public MedicalAids getMedicalAids() {
        return medicalAids;
    }

    /**
     * 设置medicalAids属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalAids }
     *     
     */
    public void setMedicalAids(MedicalAids value) {
        this.medicalAids = value;
    }

    /**
     * 获取optical属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Optical }
     *     
     */
    public Optical getOptical() {
        return optical;
    }

    /**
     * 设置optical属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Optical }
     *     
     */
    public void setOptical(Optical value) {
        this.optical = value;
    }

    /**
     * 获取medicineAndSupplements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MedicineAndSupplements }
     *     
     */
    public MedicineAndSupplements getMedicineAndSupplements() {
        return medicineAndSupplements;
    }

    /**
     * 设置medicineAndSupplements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MedicineAndSupplements }
     *     
     */
    public void setMedicineAndSupplements(MedicineAndSupplements value) {
        this.medicineAndSupplements = value;
    }

    /**
     * 获取healthAndBeautyElectronics属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HealthAndBeautyElectronics }
     *     
     */
    public HealthAndBeautyElectronics getHealthAndBeautyElectronics() {
        return healthAndBeautyElectronics;
    }

    /**
     * 设置healthAndBeautyElectronics属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HealthAndBeautyElectronics }
     *     
     */
    public void setHealthAndBeautyElectronics(HealthAndBeautyElectronics value) {
        this.healthAndBeautyElectronics = value;
    }

    /**
     * 获取personalCare属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonalCare }
     *     
     */
    public PersonalCare getPersonalCare() {
        return personalCare;
    }

    /**
     * 设置personalCare属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalCare }
     *     
     */
    public void setPersonalCare(PersonalCare value) {
        this.personalCare = value;
    }

}
