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
 * <p>Media complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Media"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="Movies" type="{http://walmart.com/}Movies"/&gt;
 *         &lt;element name="TVShows" type="{http://walmart.com/}TVShows"/&gt;
 *         &lt;element name="Music" type="{http://walmart.com/}Music"/&gt;
 *         &lt;element name="BooksAndMagazines" type="{http://walmart.com/}BooksAndMagazines"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Media", propOrder = {
    "movies",
    "tvShows",
    "music",
    "booksAndMagazines"
})
public class Media {

    @XmlElement(name = "Movies")
    protected Movies movies;
    @XmlElement(name = "TVShows")
    protected TVShows tvShows;
    @XmlElement(name = "Music")
    protected Music music;
    @XmlElement(name = "BooksAndMagazines")
    protected BooksAndMagazines booksAndMagazines;

    /**
     * 获取movies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Movies }
     *     
     */
    public Movies getMovies() {
        return movies;
    }

    /**
     * 设置movies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Movies }
     *     
     */
    public void setMovies(Movies value) {
        this.movies = value;
    }

    /**
     * 获取tvShows属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TVShows }
     *     
     */
    public TVShows getTVShows() {
        return tvShows;
    }

    /**
     * 设置tvShows属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TVShows }
     *     
     */
    public void setTVShows(TVShows value) {
        this.tvShows = value;
    }

    /**
     * 获取music属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Music }
     *     
     */
    public Music getMusic() {
        return music;
    }

    /**
     * 设置music属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Music }
     *     
     */
    public void setMusic(Music value) {
        this.music = value;
    }

    /**
     * 获取booksAndMagazines属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BooksAndMagazines }
     *     
     */
    public BooksAndMagazines getBooksAndMagazines() {
        return booksAndMagazines;
    }

    /**
     * 设置booksAndMagazines属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BooksAndMagazines }
     *     
     */
    public void setBooksAndMagazines(BooksAndMagazines value) {
        this.booksAndMagazines = value;
    }

}
