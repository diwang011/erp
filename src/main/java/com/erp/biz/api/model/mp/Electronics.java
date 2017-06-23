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
 * <p>Electronics complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Electronics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="VideoGames" type="{http://walmart.com/}VideoGames"/&gt;
 *         &lt;element name="VideoProjectors" type="{http://walmart.com/}VideoProjectors"/&gt;
 *         &lt;element name="ElectronicsAccessories" type="{http://walmart.com/}ElectronicsAccessories"/&gt;
 *         &lt;element name="ComputerComponents" type="{http://walmart.com/}ComputerComponents"/&gt;
 *         &lt;element name="ElectronicsCables" type="{http://walmart.com/}ElectronicsCables"/&gt;
 *         &lt;element name="Software" type="{http://walmart.com/}Software"/&gt;
 *         &lt;element name="Computers" type="{http://walmart.com/}Computers"/&gt;
 *         &lt;element name="TVsAndVideoDisplays" type="{http://walmart.com/}TVsAndVideoDisplays"/&gt;
 *         &lt;element name="CellPhones" type="{http://walmart.com/}CellPhones"/&gt;
 *         &lt;element name="PrintersScannersAndImaging" type="{http://walmart.com/}PrintersScannersAndImaging"/&gt;
 *         &lt;element name="ElectronicsOther" type="{http://walmart.com/}ElectronicsOther"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Electronics", propOrder = {
    "videoGames",
    "videoProjectors",
    "electronicsAccessories",
    "computerComponents",
    "electronicsCables",
    "software",
    "computers",
    "tVsAndVideoDisplays",
    "cellPhones",
    "printersScannersAndImaging",
    "electronicsOther"
})
public class Electronics {

    @XmlElement(name = "VideoGames")
    protected VideoGames videoGames;
    @XmlElement(name = "VideoProjectors")
    protected VideoProjectors videoProjectors;
    @XmlElement(name = "ElectronicsAccessories")
    protected ElectronicsAccessories electronicsAccessories;
    @XmlElement(name = "ComputerComponents")
    protected ComputerComponents computerComponents;
    @XmlElement(name = "ElectronicsCables")
    protected ElectronicsCables electronicsCables;
    @XmlElement(name = "Software")
    protected Software software;
    @XmlElement(name = "Computers")
    protected Computers computers;
    @XmlElement(name = "TVsAndVideoDisplays")
    protected TVsAndVideoDisplays tVsAndVideoDisplays;
    @XmlElement(name = "CellPhones")
    protected CellPhones cellPhones;
    @XmlElement(name = "PrintersScannersAndImaging")
    protected PrintersScannersAndImaging printersScannersAndImaging;
    @XmlElement(name = "ElectronicsOther")
    protected ElectronicsOther electronicsOther;

    /**
     * 获取videoGames属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoGames }
     *     
     */
    public VideoGames getVideoGames() {
        return videoGames;
    }

    /**
     * 设置videoGames属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoGames }
     *     
     */
    public void setVideoGames(VideoGames value) {
        this.videoGames = value;
    }

    /**
     * 获取videoProjectors属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VideoProjectors }
     *     
     */
    public VideoProjectors getVideoProjectors() {
        return videoProjectors;
    }

    /**
     * 设置videoProjectors属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VideoProjectors }
     *     
     */
    public void setVideoProjectors(VideoProjectors value) {
        this.videoProjectors = value;
    }

    /**
     * 获取electronicsAccessories属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ElectronicsAccessories }
     *     
     */
    public ElectronicsAccessories getElectronicsAccessories() {
        return electronicsAccessories;
    }

    /**
     * 设置electronicsAccessories属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicsAccessories }
     *     
     */
    public void setElectronicsAccessories(ElectronicsAccessories value) {
        this.electronicsAccessories = value;
    }

    /**
     * 获取computerComponents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ComputerComponents }
     *     
     */
    public ComputerComponents getComputerComponents() {
        return computerComponents;
    }

    /**
     * 设置computerComponents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ComputerComponents }
     *     
     */
    public void setComputerComponents(ComputerComponents value) {
        this.computerComponents = value;
    }

    /**
     * 获取electronicsCables属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ElectronicsCables }
     *     
     */
    public ElectronicsCables getElectronicsCables() {
        return electronicsCables;
    }

    /**
     * 设置electronicsCables属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicsCables }
     *     
     */
    public void setElectronicsCables(ElectronicsCables value) {
        this.electronicsCables = value;
    }

    /**
     * 获取software属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Software }
     *     
     */
    public Software getSoftware() {
        return software;
    }

    /**
     * 设置software属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Software }
     *     
     */
    public void setSoftware(Software value) {
        this.software = value;
    }

    /**
     * 获取computers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Computers }
     *     
     */
    public Computers getComputers() {
        return computers;
    }

    /**
     * 设置computers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Computers }
     *     
     */
    public void setComputers(Computers value) {
        this.computers = value;
    }

    /**
     * 获取tVsAndVideoDisplays属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TVsAndVideoDisplays }
     *     
     */
    public TVsAndVideoDisplays getTVsAndVideoDisplays() {
        return tVsAndVideoDisplays;
    }

    /**
     * 设置tVsAndVideoDisplays属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TVsAndVideoDisplays }
     *     
     */
    public void setTVsAndVideoDisplays(TVsAndVideoDisplays value) {
        this.tVsAndVideoDisplays = value;
    }

    /**
     * 获取cellPhones属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CellPhones }
     *     
     */
    public CellPhones getCellPhones() {
        return cellPhones;
    }

    /**
     * 设置cellPhones属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CellPhones }
     *     
     */
    public void setCellPhones(CellPhones value) {
        this.cellPhones = value;
    }

    /**
     * 获取printersScannersAndImaging属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PrintersScannersAndImaging }
     *     
     */
    public PrintersScannersAndImaging getPrintersScannersAndImaging() {
        return printersScannersAndImaging;
    }

    /**
     * 设置printersScannersAndImaging属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PrintersScannersAndImaging }
     *     
     */
    public void setPrintersScannersAndImaging(PrintersScannersAndImaging value) {
        this.printersScannersAndImaging = value;
    }

    /**
     * 获取electronicsOther属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ElectronicsOther }
     *     
     */
    public ElectronicsOther getElectronicsOther() {
        return electronicsOther;
    }

    /**
     * 设置electronicsOther属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicsOther }
     *     
     */
    public void setElectronicsOther(ElectronicsOther value) {
        this.electronicsOther = value;
    }

}
