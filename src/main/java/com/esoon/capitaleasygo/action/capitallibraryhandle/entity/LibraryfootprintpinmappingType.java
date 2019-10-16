//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.10.31 时间 04:02:39 PM CST 
//


package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.io.Serializable;

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
 * <p>libraryfootprintpinmappingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="libraryfootprintpinmappingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="libraryfootprintpinmapping_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="libraryobject_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="librarydevicefootprint_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="pin_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="cavity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="conn_name" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String64" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libraryfootprintpinmappingType")
public class LibraryfootprintpinmappingType implements Serializable{

    @XmlAttribute(name = "libraryfootprintpinmapping_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String libraryfootprintpinmappingId;
    @XmlAttribute(name = "libraryobject_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object libraryobjectId;
    @XmlAttribute(name = "librarydevicefootprint_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object librarydevicefootprintId;
    @XmlAttribute(name = "pin_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object pinId;
    @XmlAttribute(name = "cavity_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object cavityId;
    @XmlAttribute(name = "conn_name", required = true)
    protected String connName;

    /**
     * 获取libraryfootprintpinmappingId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryfootprintpinmappingId() {
        return libraryfootprintpinmappingId;
    }

    /**
     * 设置libraryfootprintpinmappingId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryfootprintpinmappingId(String value) {
        this.libraryfootprintpinmappingId = value;
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
     * 获取librarydevicefootprintId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLibrarydevicefootprintId() {
        return librarydevicefootprintId;
    }

    /**
     * 设置librarydevicefootprintId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLibrarydevicefootprintId(Object value) {
        this.librarydevicefootprintId = value;
    }

    /**
     * 获取pinId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPinId() {
        return pinId;
    }

    /**
     * 设置pinId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPinId(Object value) {
        this.pinId = value;
    }

    /**
     * 获取cavityId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCavityId() {
        return cavityId;
    }

    /**
     * 设置cavityId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCavityId(Object value) {
        this.cavityId = value;
    }

    /**
     * 获取connName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnName() {
        return connName;
    }

    /**
     * 设置connName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnName(String value) {
        this.connName = value;
    }

}
