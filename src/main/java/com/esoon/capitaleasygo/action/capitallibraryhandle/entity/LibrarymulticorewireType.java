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
 * <p>librarymulticorewireType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="librarymulticorewireType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="libraryinnercorewire" type="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryinnercorewireType"/>
 *       &lt;/choice>
 *       &lt;attribute name="librarymulticorewire_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="libraryobject_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="osspec" type="{http://www.mentor.com/harness/Schema/LibrarySchema}OptionalString30" />
 *       &lt;attribute name="oscolor" type="{http://www.mentor.com/harness/Schema/LibrarySchema}OptionalString30" />
 *       &lt;attribute name="ostype" type="{http://www.mentor.com/harness/Schema/LibrarySchema}BaseSheathType" default="Sheath" />
 *       &lt;attribute name="signature1" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_20_10" default="0" />
 *       &lt;attribute name="indicatortype" type="{http://www.mentor.com/harness/Schema/LibrarySchema}OptionalString255" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarymulticorewireType", propOrder = {
    "libraryinnercorewire"
})
public class LibrarymulticorewireType implements Serializable{

    protected List<LibraryinnercorewireType> libraryinnercorewire;
    @XmlAttribute(name = "librarymulticorewire_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String librarymulticorewireId;
    @XmlAttribute(name = "libraryobject_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object libraryobjectId;
    @XmlAttribute(name = "osspec")
    protected String osspec;
    @XmlAttribute(name = "oscolor")
    protected String oscolor;
    @XmlAttribute(name = "ostype")
    protected String ostype;
    @XmlAttribute(name = "signature1")
    protected Double signature1;
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
     * 获取librarymulticorewireId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarymulticorewireId() {
        return librarymulticorewireId;
    }

    /**
     * 设置librarymulticorewireId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarymulticorewireId(String value) {
        this.librarymulticorewireId = value;
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
     * 获取osspec属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsspec() {
        return osspec;
    }

    /**
     * 设置osspec属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsspec(String value) {
        this.osspec = value;
    }

    /**
     * 获取oscolor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOscolor() {
        return oscolor;
    }

    /**
     * 设置oscolor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOscolor(String value) {
        this.oscolor = value;
    }

    /**
     * 获取ostype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOstype() {
        if (ostype == null) {
            return "Sheath";
        } else {
            return ostype;
        }
    }

    /**
     * 设置ostype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOstype(String value) {
        this.ostype = value;
    }

    /**
     * 获取signature1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getSignature1() {
        if (signature1 == null) {
            return  0.0D;
        } else {
            return signature1;
        }
    }

    /**
     * 设置signature1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSignature1(Double value) {
        this.signature1 = value;
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
