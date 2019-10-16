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
 * <p>librarycustomercolcodeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="librarycustomercolcodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="librarycustomercolcode_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="customerorganisation_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="librarycolor_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String64" />
 *       &lt;attribute name="customercolcode" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String4" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarycustomercolcodeType")
public class LibrarycustomercolcodeType implements Serializable{

    @XmlAttribute(name = "librarycustomercolcode_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String librarycustomercolcodeId;
    @XmlAttribute(name = "customerorganisation_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object customerorganisationId;
    @XmlAttribute(name = "librarycolor_id", required = true)
    protected String librarycolorId;
    @XmlAttribute(name = "customercolcode", required = true)
    protected String customercolcode;

    /**
     * 获取librarycustomercolcodeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarycustomercolcodeId() {
        return librarycustomercolcodeId;
    }

    /**
     * 设置librarycustomercolcodeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarycustomercolcodeId(String value) {
        this.librarycustomercolcodeId = value;
    }

    /**
     * 获取customerorganisationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCustomerorganisationId() {
        return customerorganisationId;
    }

    /**
     * 设置customerorganisationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCustomerorganisationId(Object value) {
        this.customerorganisationId = value;
    }

    /**
     * 获取librarycolorId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarycolorId() {
        return librarycolorId;
    }

    /**
     * 设置librarycolorId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarycolorId(String value) {
        this.librarycolorId = value;
    }

    /**
     * 获取customercolcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomercolcode() {
        return customercolcode;
    }

    /**
     * 设置customercolcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomercolcode(String value) {
        this.customercolcode = value;
    }

}
