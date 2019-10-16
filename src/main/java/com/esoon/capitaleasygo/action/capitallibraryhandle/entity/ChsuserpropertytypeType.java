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
 * <p>chsuserpropertytypeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="chsuserpropertytypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="chsuserpropertytype_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String64" />
 *       &lt;attribute name="librarycomponenttype_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String64" />
 *       &lt;attribute name="chsuserproperty_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chsuserpropertytypeType")
public class ChsuserpropertytypeType implements Serializable{

    @XmlAttribute(name = "chsuserpropertytype_id", required = true)
    protected String chsuserpropertytypeId;
    @XmlAttribute(name = "librarycomponenttype_id", required = true)
    protected String librarycomponenttypeId;
    @XmlAttribute(name = "chsuserproperty_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object chsuserpropertyId;

    /**
     * 获取chsuserpropertytypeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChsuserpropertytypeId() {
        return chsuserpropertytypeId;
    }

    /**
     * 设置chsuserpropertytypeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChsuserpropertytypeId(String value) {
        this.chsuserpropertytypeId = value;
    }

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

}
