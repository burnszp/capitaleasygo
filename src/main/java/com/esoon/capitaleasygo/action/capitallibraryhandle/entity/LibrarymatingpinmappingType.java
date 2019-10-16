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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>librarymatingpinmappingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="librarymatingpinmappingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="librarymatingpinmapping_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String64" />
 *       &lt;attribute name="librarymating_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String64" />
 *       &lt;attribute name="librarycavity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="mappedcavity_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarymatingpinmappingType")
public class LibrarymatingpinmappingType implements Serializable{

    @XmlAttribute(name = "librarymatingpinmapping_id", required = true)
    protected String librarymatingpinmappingId;
    @XmlAttribute(name = "librarymating_id", required = true)
    protected String librarymatingId;
    @XmlAttribute(name = "librarycavity_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object librarycavityId;
    @XmlAttribute(name = "mappedcavity_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object mappedcavityId;

    /**
     * 获取librarymatingpinmappingId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarymatingpinmappingId() {
        return librarymatingpinmappingId;
    }

    /**
     * 设置librarymatingpinmappingId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarymatingpinmappingId(String value) {
        this.librarymatingpinmappingId = value;
    }

    /**
     * 获取librarymatingId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarymatingId() {
        return librarymatingId;
    }

    /**
     * 设置librarymatingId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarymatingId(String value) {
        this.librarymatingId = value;
    }

    /**
     * 获取librarycavityId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLibrarycavityId() {
        return librarycavityId;
    }

    /**
     * 设置librarycavityId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLibrarycavityId(Object value) {
        this.librarycavityId = value;
    }

    /**
     * 获取mappedcavityId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMappedcavityId() {
        return mappedcavityId;
    }

    /**
     * 设置mappedcavityId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMappedcavityId(Object value) {
        this.mappedcavityId = value;
    }

}
