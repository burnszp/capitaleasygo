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
 * <p>libraryterminationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="libraryterminationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="librarytermination_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="librarymultipletermination_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="librarywirespec_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="librarywiregrpspec_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="termroworder" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libraryterminationType")
public class LibraryterminationType implements Serializable{

    @XmlAttribute(name = "librarytermination_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String libraryterminationId;
    @XmlAttribute(name = "librarymultipletermination_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object librarymultipleterminationId;
    @XmlAttribute(name = "librarywirespec_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object librarywirespecId;
    @XmlAttribute(name = "librarywiregrpspec_id")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object librarywiregrpspecId;
    @XmlAttribute(name = "termroworder", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long termroworder;

    /**
     * 获取libraryterminationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryterminationId() {
        return libraryterminationId;
    }

    /**
     * 设置libraryterminationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryterminationId(String value) {
        this.libraryterminationId = value;
    }

    /**
     * 获取librarymultipleterminationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLibrarymultipleterminationId() {
        return librarymultipleterminationId;
    }

    /**
     * 设置librarymultipleterminationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLibrarymultipleterminationId(Object value) {
        this.librarymultipleterminationId = value;
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
     * 获取termroworder属性的值。
     * 
     */
    public long getTermroworder() {
        return termroworder;
    }

    /**
     * 设置termroworder属性的值。
     * 
     */
    public void setTermroworder(long value) {
        this.termroworder = value;
    }

}
