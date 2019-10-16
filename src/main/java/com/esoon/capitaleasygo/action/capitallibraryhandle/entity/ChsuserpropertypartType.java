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
 * <p>chsuserpropertypartType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="chsuserpropertypartType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="chsuserpropertypart_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="libraryobject_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="chsuserproperty_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="userpropertyvalue" type="{http://www.mentor.com/harness/Schema/LibrarySchema}OptionalString1024" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chsuserpropertypartType")
public class ChsuserpropertypartType implements Serializable{

    @XmlAttribute(name = "chsuserpropertypart_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String chsuserpropertypartId;
    @XmlAttribute(name = "libraryobject_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object libraryobjectId;
    @XmlAttribute(name = "chsuserproperty_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object chsuserpropertyId;
    @XmlAttribute(name = "userpropertyvalue")
    protected String userpropertyvalue;

    /**
     * 获取chsuserpropertypartId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChsuserpropertypartId() {
        return chsuserpropertypartId;
    }

    /**
     * 设置chsuserpropertypartId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChsuserpropertypartId(String value) {
        this.chsuserpropertypartId = value;
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
     * 获取chsuserpropertyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getChsuserpropertyId() {
        return chsuserpropertyId;
    }

    /**
     * 设置chsuserpropertyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setChsuserpropertyId(Object value) {
        this.chsuserpropertyId = value;
    }

    /**
     * 获取userpropertyvalue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserpropertyvalue() {
        return userpropertyvalue;
    }

    /**
     * 设置userpropertyvalue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserpropertyvalue(String value) {
        this.userpropertyvalue = value;
    }

}
