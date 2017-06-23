//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.04.18 时间 04:29:33 PM CST 
//


package com.erp.biz.api.model.inventory;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="InventoryHeader" type="{http://walmart.com/}InventoryHeader"/&gt;
 *         &lt;choice maxOccurs="100000"&gt;
 *           &lt;element name="inventory" type="{http://walmart.com/}inventory"/&gt;
 *         &lt;/choice&gt;
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
    "inventoryHeader",
    "inventory"
})
@XmlRootElement(name = "InventoryFeed")
public class InventoryFeed {

    @XmlElement(name = "InventoryHeader", required = true)
    protected InventoryHeader inventoryHeader;
    protected List<Inventory> inventory;

    /**
     * 获取inventoryHeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InventoryHeader }
     *     
     */
    public InventoryHeader getInventoryHeader() {
        return inventoryHeader;
    }

    /**
     * 设置inventoryHeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryHeader }
     *     
     */
    public void setInventoryHeader(InventoryHeader value) {
        this.inventoryHeader = value;
    }

    /**
     * Gets the value of the inventory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Inventory }
     * 
     * 
     */
    public List<Inventory> getInventory() {
        if (inventory == null) {
            inventory = new ArrayList<Inventory>();
        }
        return this.inventory;
    }

}
