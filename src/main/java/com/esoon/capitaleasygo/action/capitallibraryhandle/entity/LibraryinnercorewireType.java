//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.10.31 时间 04:02:39 PM CST 
//


package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.io.Serializable;
import java.math.BigInteger;
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
 * <p>libraryinnercorewireType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="libraryinnercorewireType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="libraryinnercorewire" type="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryinnercorewireType"/>
 *       &lt;/choice>
 *       &lt;attribute name="libraryinnercorewire_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="librarymulticorewire_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="wirecolor" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}OptionalString30" />
 *       &lt;attribute name="librarymaterial_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="librarywirespec_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="sheathtype" type="{http://www.mentor.com/harness/Schema/LibrarySchema}BaseInnercoreType" default="Single" />
 *       &lt;attribute name="wiretext" type="{http://www.mentor.com/harness/Schema/LibrarySchema}OptionalString30" />
 *       &lt;attribute name="sequence" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="parent_no" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="conductor_role" type="{http://www.mentor.com/harness/Schema/LibrarySchema}conductorRoleType" />
 *       &lt;attribute name="indicatortype" type="{http://www.mentor.com/harness/Schema/LibrarySchema}OptionalString255" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libraryinnercorewireType", propOrder = {
    "libraryinnercorewire"
})
public class LibraryinnercorewireType implements Serializable{

    protected List<LibraryinnercorewireType> libraryinnercorewire;
    @XmlAttribute(name = "libraryinnercorewire_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String libraryinnercorewireId;
    @XmlAttribute(name = "librarymulticorewire_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object librarymulticorewireId;
    @XmlAttribute(name = "wirecolor", required = true)
    protected String wirecolor;
    @XmlAttribute(name = "librarymaterial_id")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object librarymaterialId;
    @XmlAttribute(name = "librarywirespec_id")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object librarywirespecId;
    @XmlAttribute(name = "sheathtype")
    protected String sheathtype;
    @XmlAttribute(name = "wiretext")
    protected String wiretext;
    @XmlAttribute(name = "sequence")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequence;
    @XmlAttribute(name = "parent_no")
    protected Integer parentNo;
    @XmlAttribute(name = "conductor_role")
    protected String conductorRole;
    @XmlAttribute(name = "indicatortype")
    protected String indicatortype;

    /**
     * Gets the value of the libraryinnercorewire property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libraryinnercorewire property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibraryinnercorewire().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibraryinnercorewireType }
     * 
     * 
     */
    public List<LibraryinnercorewireType> getLibraryinnercorewire() {
        if (libraryinnercorewire == null) {
            libraryinnercorewire = new ArrayList<LibraryinnercorewireType>();
        }
        return this.libraryinnercorewire;
    }

    /**
     * 获取libraryinnercorewireId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryinnercorewireId() {
        return libraryinnercorewireId;
    }

    /**
     * 设置libraryinnercorewireId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryinnercorewireId(String value) {
        this.libraryinnercorewireId = value;
    }

    /**
     * 获取librarymulticorewireId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLibrarymulticorewireId() {
        return librarymulticorewireId;
    }

    /**
     * 设置librarymulticorewireId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLibrarymulticorewireId(Object value) {
        this.librarymulticorewireId = value;
    }

    /**
     * 获取wirecolor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirecolor() {
        return wirecolor;
    }

    /**
     * 设置wirecolor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirecolor(String value) {
        this.wirecolor = value;
    }

    /**
     * 获取librarymaterialId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLibrarymaterialId() {
        return librarymaterialId;
    }

    /**
     * 设置librarymaterialId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLibrarymaterialId(Object value) {
        this.librarymaterialId = value;
    }

    /**
     * 获取librarywirespecId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLibrarywirespecId() {
        return librarywirespecId;
    }

    /**
     * 设置librarywirespecId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLibrarywirespecId(Object value) {
        this.librarywirespecId = value;
    }

    /**
     * 获取sheathtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheathtype() {
        if (sheathtype == null) {
            return "Single";
        } else {
            return sheathtype;
        }
    }

    /**
     * 设置sheathtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheathtype(String value) {
        this.sheathtype = value;
    }

    /**
     * 获取wiretext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiretext() {
        return wiretext;
    }

    /**
     * 设置wiretext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiretext(String value) {
        this.wiretext = value;
    }

    /**
     * 获取sequence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * 设置sequence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

    /**
     * 获取parentNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentNo() {
        return parentNo;
    }

    /**
     * 设置parentNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentNo(Integer value) {
        this.parentNo = value;
    }

    /**
     * 获取conductorRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConductorRole() {
        return conductorRole;
    }

    /**
     * 设置conductorRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConductorRole(String value) {
        this.conductorRole = value;
    }

    /**
     * 获取indicatortype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicatortype() {
        return indicatortype;
    }

    /**
     * 设置indicatortype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicatortype(String value) {
        this.indicatortype = value;
    }

}
