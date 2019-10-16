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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>librarycomponenttypeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="librarycomponenttypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="librarycomponenttype_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String64" />
 *       &lt;attribute name="typecode" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String4" />
 *       &lt;attribute name="description" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String40" />
 *       &lt;attribute name="clipgromident" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarycomponenttypeType")
public class LibrarycomponenttypeType implements Serializable{

    @XmlAttribute(name = "librarycomponenttype_id", required = true)
    protected String librarycomponenttypeId;
    @XmlAttribute(name = "typecode", required = true)
    protected String typecode;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "clipgromident")
    protected String clipgromident;

    /**
     * 获取librarycomponenttypeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarycomponenttypeId() {
        return librarycomponenttypeId;
    }

    /**
     * 设置librarycomponenttypeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarycomponenttypeId(String value) {
        this.librarycomponenttypeId = value;
    }

    /**
     * 获取typecode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypecode() {
        return typecode;
    }

    /**
     * 设置typecode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypecode(String value) {
        this.typecode = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取clipgromident属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClipgromident() {
        return clipgromident;
    }

    /**
     * 设置clipgromident属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClipgromident(String value) {
        this.clipgromident = value;
    }

}
