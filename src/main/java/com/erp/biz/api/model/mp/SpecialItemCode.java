//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.05.23 时间 11:38:50 AM CST 
//


package com.erp.biz.api.model.mp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This element identifies specific items for promotional or special tracking purposes. A collateral item is a trade item delivered from a manufacturer to the retail selling floor that is not considered inventory and has no retail value. A Gift with Purchase (GWP) is a trade item given to a consumer as part of a promotional event, contingent on the consumer making a purchase of another item or items. A Gift with Purchase is considered inventory and has no retail value. A Purchase with Purchase (PWP) is a trade item sold to a consumer at a special price as part of a promotional event, contingent on the consumer purchasing another item or items. A Purchase with Purchase is considered inventory and has a retail value. A Dynamic Assortment is when the quantity of the case remains fixed, however the mix of the lower level GTINs may vary from case to case. If Next Lower Level Trade Item Information is specified the actual quantity of each child item may be different from pack to pack. The pack may even contain only one of the child items, however the pack will always contain the number of items specified in the Qty of Next Level Item(s). For example Dynamic Assortment: Chia Pets are sold individually to the consumer and each different Chia Pet is marked with a unique GTIN. The items are ordered by the case, which has its own unique GTIN. The case will contain a random assortment of Chia Pets. There is no guarantee that the same ratio of child items will be in a case from order to order but the total quantity [Qty of Next Level Item(s)] of items in the case will remain the same
 * 
 * <p>SpecialItemCode complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SpecialItemCode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="specialItemCodeValue" maxOccurs="unbounded"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *               &lt;minLength value="1"/&gt;
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
@XmlType(name = "SpecialItemCode", propOrder = {
    "specialItemCodeValue"
})
public class SpecialItemCode {

    @XmlElement(required = true)
    protected List<String> specialItemCodeValue;

    /**
     * Gets the value of the specialItemCodeValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialItemCodeValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialItemCodeValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSpecialItemCodeValue() {
        if (specialItemCodeValue == null) {
            specialItemCodeValue = new ArrayList<String>();
        }
        return this.specialItemCodeValue;
    }

}
