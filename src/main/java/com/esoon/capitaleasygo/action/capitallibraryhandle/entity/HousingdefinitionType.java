//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.10.31 时间 04:02:39 PM CST 
//


package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>housingdefinitionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="housingdefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="housingscope" type="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryhousingscopeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="housdef_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="housingdefinition_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="libraryobject_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="cavitygroup_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="cavityname" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String40" />
 *       &lt;attribute name="selectionstatus" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String10" />
 *       &lt;attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="quantity" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" />
 *       &lt;attribute name="mode" type="{http://www.mentor.com/harness/Schema/LibrarySchema}HousingModeType" />
 *       &lt;attribute name="scope" type="{http://www.mentor.com/harness/Schema/LibrarySchema}BasebooleanType" default="0" />
 *       &lt;attribute name="psblocked" type="{http://www.mentor.com/harness/Schema/LibrarySchema}OptionalString255" />
 *       &lt;attribute name="position" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String40" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "housingdefinitionType", propOrder = {
    "housingscope"
})
public class HousingdefinitionType implements Serializable{

    protected List<LibraryhousingscopeType> housingscope;
    @XmlAttribute(name = "housdef_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String housdefId;
    @XmlAttribute(name = "housingdefinition_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object housingdefinitionId;
    @XmlAttribute(name = "libraryobject_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object libraryobjectId;
    @XmlAttribute(name = "cavitygroup_id")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object cavitygroupId;
    @XmlAttribute(name = "cavityname")
    protected String cavityname;
    @XmlAttribute(name = "selectionstatus", required = true)
    protected String selectionstatus;
    @XmlAttribute(name = "priority")
    @XmlSchemaType(name = "unsignedInt")
    protected Long priority;
    @XmlAttribute(name = "quantity")
    protected String quantity;
    @XmlAttribute(name = "mode")
    protected Short mode;
    @XmlAttribute(name = "scope")
    protected String scope;
    @XmlAttribute(name = "psblocked")
    protected String psblocked;
    @XmlAttribute(name = "position")
    protected String position;

    /**
     * Gets the value of the housingscope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the housingscope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHousingscope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibraryhousingscopeType }
     * 
     * 
     */
    public List<LibraryhousingscopeType> getHousingscope() {
        if (housingscope == null) {
            housingscope = new ArrayList<LibraryhousingscopeType>();
        }
        return this.housingscope;
    }

    /**
     * 获取housdefId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHousdefId() {
        return housdefId;
    }

    /**
     * 设置housdefId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHousdefId(String value) {
        this.housdefId = value;
    }

    /**
     * 获取housingdefinitionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHousingdefinitionId() {
        return housingdefinitionId;
    }

    /**
     * 设置housingdefinitionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHousingdefinitionId(Object value) {
        this.housingdefinitionId = value;
    }

    /**
     * 获取libraryobjectId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLibraryobjectId() {
        return libraryobjectId;
    }

    /**
     * 设置libraryobjectId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLibraryobjectId(Object value) {
        this.libraryobjectId = value;
    }

    /**
     * 获取cavitygroupId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCavitygroupId() {
        return cavitygroupId;
    }

    /**
     * 设置cavitygroupId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCavitygroupId(Object value) {
        this.cavitygroupId = value;
    }

    /**
     * 获取cavityname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavityname() {
        return cavityname;
    }

    /**
     * 设置cavityname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavityname(String value) {
        this.cavityname = value;
    }

    /**
     * 获取selectionstatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionstatus() {
        return selectionstatus;
    }

    /**
     * 设置selectionstatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionstatus(String value) {
        this.selectionstatus = value;
    }

    /**
     * 获取priority属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * 设置priority属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriority(Long value) {
        this.priority = value;
    }

    /**
     * 获取quantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * 获取mode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMode() {
        return mode;
    }

    /**
     * 设置mode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMode(Short value) {
        this.mode = value;
    }

    /**
     * 获取scope属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        if (scope == null) {
            return "0";
        } else {
            return scope;
        }
    }

    /**
     * 设置scope属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * 获取psblocked属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsblocked() {
        return psblocked;
    }

    /**
     * 设置psblocked属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsblocked(String value) {
        this.psblocked = value;
    }

    /**
     * 获取position属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置position属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

}
