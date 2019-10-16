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
 * <p>librarywirespecType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="librarywirespecType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="librarywirespec_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="librarymaterial_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="materialcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="csa" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" default="0" />
 *       &lt;attribute name="wirusual" type="{http://www.mentor.com/harness/Schema/LibrarySchema}BasebooleanType" default="0" />
 *       &lt;attribute name="wirespec" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String20" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarywirespecType")
public class LibrarywirespecType implements Serializable{

    @XmlAttribute(name = "librarywirespec_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String librarywirespecId;
    @XmlAttribute(name = "librarymaterial_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object librarymaterialId;
    @XmlAttribute(name = "materialcode")
    protected String materialcode;
    @XmlAttribute(name = "csa")
    protected String csa;
    @XmlAttribute(name = "wirusual")
    protected String wirusual;
    @XmlAttribute(name = "wirespec", required = true)
    protected String wirespec;

    /**
     * 获取librarywirespecId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarywirespecId() {
        return librarywirespecId;
    }

    /**
     * 设置librarywirespecId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarywirespecId(String value) {
        this.librarywirespecId = value;
    }

    /**
     * 获取librarymaterialId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLibrarymaterialId() {
        return librarymaterialId;
    }

    /**
     * 设置librarymaterialId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLibrarymaterialId(Object value) {
        this.librarymaterialId = value;
    }

    /**
     * 获取materialcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialcode() {
        return materialcode;
    }

    /**
     * 设置materialcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialcode(String value) {
        this.materialcode = value;
    }

    /**
     * 获取csa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsa() {
        if (csa == null) {
            return "0";
        } else {
            return csa;
        }
    }

    /**
     * 设置csa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsa(String value) {
        this.csa = value;
    }

    /**
     * 获取wirusual属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirusual() {
        if (wirusual == null) {
            return "0";
        } else {
            return wirusual;
        }
    }

    /**
     * 设置wirusual属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirusual(String value) {
        this.wirusual = value;
    }

    /**
     * 获取wirespec属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirespec() {
        return wirespec;
    }

    /**
     * 设置wirespec属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirespec(String value) {
        this.wirespec = value;
    }

}
