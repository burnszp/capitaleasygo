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
 * <p>librarycolorType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="librarycolorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="librarycolor_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String64" />
 *       &lt;attribute name="colorcode" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String4" />
 *       &lt;attribute name="description" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String30" />
 *       &lt;attribute name="colordefinition" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarycolorType")
public class LibrarycolorType implements Serializable{

    @XmlAttribute(name = "librarycolor_id", required = true)
    protected String librarycolorId;
    @XmlAttribute(name = "colorcode", required = true)
    protected String colorcode;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "colordefinition")
    protected Integer colordefinition;

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
     * 获取colorcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorcode() {
        return colorcode;
    }

    /**
     * 设置colorcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorcode(String value) {
        this.colorcode = value;
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
     * 获取colordefinition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getColordefinition() {
        if (colordefinition == null) {
            return  0;
        } else {
            return colordefinition;
        }
    }

    /**
     * 设置colordefinition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColordefinition(Integer value) {
        this.colordefinition = value;
    }

}
