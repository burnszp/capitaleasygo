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
 * <p>librarytubeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="librarytubeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="librarytube_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="libraryobject_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="wallthickness" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" default="0" />
 *       &lt;attribute name="boresize" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" default="0" />
 *       &lt;attribute name="isslit" type="{http://www.mentor.com/harness/Schema/LibrarySchema}BasebooleanType" default="0" />
 *       &lt;attribute name="isconvoluted" type="{http://www.mentor.com/harness/Schema/LibrarySchema}BasebooleanType" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarytubeType")
public class LibrarytubeType implements Serializable{

    @XmlAttribute(name = "librarytube_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String librarytubeId;
    @XmlAttribute(name = "libraryobject_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object libraryobjectId;
    @XmlAttribute(name = "wallthickness")
    protected String wallthickness;
    @XmlAttribute(name = "boresize")
    protected String boresize;
    @XmlAttribute(name = "isslit")
    protected String isslit;
    @XmlAttribute(name = "isconvoluted")
    protected String isconvoluted;

    /**
     * 获取librarytubeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarytubeId() {
        return librarytubeId;
    }

    /**
     * 设置librarytubeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarytubeId(String value) {
        this.librarytubeId = value;
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
     * 获取wallthickness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWallthickness() {
        if (wallthickness == null) {
            return "0";
        } else {
            return wallthickness;
        }
    }

    /**
     * 设置wallthickness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWallthickness(String value) {
        this.wallthickness = value;
    }

    /**
     * 获取boresize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoresize() {
        if (boresize == null) {
            return "0";
        } else {
            return boresize;
        }
    }

    /**
     * 设置boresize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoresize(String value) {
        this.boresize = value;
    }

    /**
     * 获取isslit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsslit() {
        if (isslit == null) {
            return "0";
        } else {
            return isslit;
        }
    }

    /**
     * 设置isslit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsslit(String value) {
        this.isslit = value;
    }

    /**
     * 获取isconvoluted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsconvoluted() {
        if (isconvoluted == null) {
            return "0";
        } else {
            return isconvoluted;
        }
    }

    /**
     * 设置isconvoluted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsconvoluted(String value) {
        this.isconvoluted = value;
    }

}
