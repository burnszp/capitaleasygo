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
 * <p>librarymultiplewirecavitiesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="librarymultiplewirecavitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="librarymultiplewirecavities_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="libraryobject_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="librarywiregrpspec_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="cavity" type="{http://www.mentor.com/harness/Schema/LibrarySchema}OptionalString40" />
 *       &lt;attribute name="unique_number" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="partnumber" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String30" />
 *       &lt;attribute name="librarywirespec_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="combination" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="groupnumber" type="{http://www.w3.org/2001/XMLSchema}long" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarymultiplewirecavitiesType")
public class LibrarymultiplewirecavitiesType implements Serializable{

    @XmlAttribute(name = "librarymultiplewirecavities_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String librarymultiplewirecavitiesId;
    @XmlAttribute(name = "libraryobject_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object libraryobjectId;
    @XmlAttribute(name = "librarywiregrpspec_id")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object librarywiregrpspecId;
    @XmlAttribute(name = "cavity")
    protected String cavity;
    @XmlAttribute(name = "unique_number")
    protected Long uniqueNumber;
    @XmlAttribute(name = "partnumber")
    protected String partnumber;
    @XmlAttribute(name = "librarywirespec_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object librarywirespecId;
    @XmlAttribute(name = "combination")
    protected Long combination;
    @XmlAttribute(name = "groupnumber")
    protected Long groupnumber;

    /**
     * 获取librarymultiplewirecavitiesId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarymultiplewirecavitiesId() {
        return librarymultiplewirecavitiesId;
    }

    /**
     * 设置librarymultiplewirecavitiesId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarymultiplewirecavitiesId(String value) {
        this.librarymultiplewirecavitiesId = value;
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
     * 获取librarywiregrpspecId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLibrarywiregrpspecId() {
        return librarywiregrpspecId;
    }

    /**
     * 设置librarywiregrpspecId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLibrarywiregrpspecId(Object value) {
        this.librarywiregrpspecId = value;
    }

    /**
     * 获取cavity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavity() {
        return cavity;
    }

    /**
     * 设置cavity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavity(String value) {
        this.cavity = value;
    }

    /**
     * 获取uniqueNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUniqueNumber() {
        return uniqueNumber;
    }

    /**
     * 设置uniqueNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUniqueNumber(Long value) {
        this.uniqueNumber = value;
    }

    /**
     * 获取partnumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnumber() {
        return partnumber;
    }

    /**
     * 设置partnumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnumber(String value) {
        this.partnumber = value;
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
     * 获取combination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCombination() {
        return combination;
    }

    /**
     * 设置combination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCombination(Long value) {
        this.combination = value;
    }

    /**
     * 获取groupnumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getGroupnumber() {
        if (groupnumber == null) {
            return  0L;
        } else {
            return groupnumber;
        }
    }

    /**
     * 设置groupnumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupnumber(Long value) {
        this.groupnumber = value;
    }

}
