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
 * <p>libraryconnectordetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="libraryconnectordetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="libraryconnectordetails_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="bundlediameter" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" default="0" />
 *       &lt;attribute name="libraryobject_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="minodmatseal" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" default="0" />
 *       &lt;attribute name="maxodmatseal" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libraryconnectordetailsType")
public class LibraryconnectordetailsType implements Serializable{

    @XmlAttribute(name = "libraryconnectordetails_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String libraryconnectordetailsId;
    @XmlAttribute(name = "bundlediameter")
    protected String bundlediameter;
    @XmlAttribute(name = "libraryobject_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object libraryobjectId;
    @XmlAttribute(name = "minodmatseal")
    protected String minodmatseal;
    @XmlAttribute(name = "maxodmatseal")
    protected String maxodmatseal;

    /**
     * 获取libraryconnectordetailsId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryconnectordetailsId() {
        return libraryconnectordetailsId;
    }

    /**
     * 设置libraryconnectordetailsId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryconnectordetailsId(String value) {
        this.libraryconnectordetailsId = value;
    }

    /**
     * 获取bundlediameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundlediameter() {
        if (bundlediameter == null) {
            return "0";
        } else {
            return bundlediameter;
        }
    }

    /**
     * 设置bundlediameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundlediameter(String value) {
        this.bundlediameter = value;
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
     * 获取minodmatseal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinodmatseal() {
        if (minodmatseal == null) {
            return "0";
        } else {
            return minodmatseal;
        }
    }

    /**
     * 设置minodmatseal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinodmatseal(String value) {
        this.minodmatseal = value;
    }

    /**
     * 获取maxodmatseal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxodmatseal() {
        if (maxodmatseal == null) {
            return "0";
        } else {
            return maxodmatseal;
        }
    }

    /**
     * 设置maxodmatseal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxodmatseal(String value) {
        this.maxodmatseal = value;
    }

}
