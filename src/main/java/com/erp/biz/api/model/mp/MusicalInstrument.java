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
 * <p>MusicalInstrument complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MusicalInstrument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="MusicCasesAndBags" type="{http://walmart.com/}MusicCasesAndBags"/&gt;
 *         &lt;element name="SoundAndRecording" type="{http://walmart.com/}SoundAndRecording"/&gt;
 *         &lt;element name="MusicalInstruments" type="{http://walmart.com/}MusicalInstruments"/&gt;
 *         &lt;element name="InstrumentAccessories" type="{http://walmart.com/}InstrumentAccessories"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MusicalInstrument", propOrder = {
    "musicCasesAndBags",
    "soundAndRecording",
    "musicalInstruments",
    "instrumentAccessories"
})
public class MusicalInstrument {

    @XmlElement(name = "MusicCasesAndBags")
    protected MusicCasesAndBags musicCasesAndBags;
    @XmlElement(name = "SoundAndRecording")
    protected SoundAndRecording soundAndRecording;
    @XmlElement(name = "MusicalInstruments")
    protected MusicalInstruments musicalInstruments;
    @XmlElement(name = "InstrumentAccessories")
    protected InstrumentAccessories instrumentAccessories;

    /**
     * 获取musicCasesAndBags属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MusicCasesAndBags }
     *     
     */
    public MusicCasesAndBags getMusicCasesAndBags() {
        return musicCasesAndBags;
    }

    /**
     * 设置musicCasesAndBags属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MusicCasesAndBags }
     *     
     */
    public void setMusicCasesAndBags(MusicCasesAndBags value) {
        this.musicCasesAndBags = value;
    }

    /**
     * 获取soundAndRecording属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SoundAndRecording }
     *     
     */
    public SoundAndRecording getSoundAndRecording() {
        return soundAndRecording;
    }

    /**
     * 设置soundAndRecording属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SoundAndRecording }
     *     
     */
    public void setSoundAndRecording(SoundAndRecording value) {
        this.soundAndRecording = value;
    }

    /**
     * 获取musicalInstruments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MusicalInstruments }
     *     
     */
    public MusicalInstruments getMusicalInstruments() {
        return musicalInstruments;
    }

    /**
     * 设置musicalInstruments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MusicalInstruments }
     *     
     */
    public void setMusicalInstruments(MusicalInstruments value) {
        this.musicalInstruments = value;
    }

    /**
     * 获取instrumentAccessories属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InstrumentAccessories }
     *     
     */
    public InstrumentAccessories getInstrumentAccessories() {
        return instrumentAccessories;
    }

    /**
     * 设置instrumentAccessories属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentAccessories }
     *     
     */
    public void setInstrumentAccessories(InstrumentAccessories value) {
        this.instrumentAccessories = value;
    }

}
