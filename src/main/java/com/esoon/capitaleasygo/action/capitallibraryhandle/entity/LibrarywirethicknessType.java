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
 * <p>librarywirethicknessType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="librarywirethicknessType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="librarywirethickness_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="mincsa" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" />
 *       &lt;attribute name="maxcsa" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" />
 *       &lt;attribute name="thickness" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" />
 *       &lt;attribute name="librarymaterial_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarywirethicknessType")
public class LibrarywirethicknessType implements Serializable{

    @XmlAttribute(name = "librarywirethickness_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String librarywirethicknessId;
    @XmlAttribute(name = "mincsa")
    protected String mincsa;
    @XmlAttribute(name = "maxcsa")
    protected String maxcsa;
    @XmlAttribute(name = "thickness")
    protected String thickness;
    @XmlAttribute(name = "librarymaterial_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object librarymaterialId;

    /**
     * 获取librarywirethicknessId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarywirethicknessId() {
        return librarywirethicknessId;
    }

    /**
     * 设置librarywirethicknessId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarywirethicknessId(String value) {
        this.librarywirethicknessId = value;
    }

    /**
     * 获取mincsa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMincsa() {
        return mincsa;
    }

    /**
     * 设置mincsa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMincsa(String value) {
        this.mincsa = value;
    }

    /**
     * 获取maxcsa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxcsa() {
        return maxcsa;
    }

    /**
     * 设置maxcsa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxcsa(String value) {
        this.maxcsa = value;
    }

    /**
     * 获取thickness属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThickness() {
        return thickness;
    }

    /**
     * 设置thickness属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThickness(String value) {
        this.thickness = value;
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

}
