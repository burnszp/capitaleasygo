//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.10.31 时间 04:02:39 PM CST 
//


package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * <p>librarybackshellsealType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="librarybackshellsealType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="librarybackshellseal_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="libraryobject_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="minimumcsa" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" />
 *       &lt;attribute name="maximumcsa" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" />
 *       &lt;attribute name="precut" type="{http://www.w3.org/2001/XMLSchema}decimal" default="0" />
 *       &lt;attribute name="librarycolor_id" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String64" />
 *       &lt;attribute name="librarymaterial_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="librarycomponenttype_id" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String64" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarybackshellsealType")
public class LibrarybackshellsealType implements Serializable{

    @XmlAttribute(name = "librarybackshellseal_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String librarybackshellsealId;
    @XmlAttribute(name = "libraryobject_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object libraryobjectId;
    @XmlAttribute(name = "minimumcsa")
    protected String minimumcsa;
    @XmlAttribute(name = "maximumcsa")
    protected String maximumcsa;
    @XmlAttribute(name = "precut")
    protected BigDecimal precut;
    @XmlAttribute(name = "librarycolor_id")
    protected String librarycolorId;
    @XmlAttribute(name = "librarymaterial_id")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object librarymaterialId;
    @XmlAttribute(name = "librarycomponenttype_id")
    protected String librarycomponenttypeId;

    /**
     * 获取librarybackshellsealId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarybackshellsealId() {
        return librarybackshellsealId;
    }

    /**
     * 设置librarybackshellsealId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarybackshellsealId(String value) {
        this.librarybackshellsealId = value;
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
     * 获取minimumcsa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumcsa() {
        return minimumcsa;
    }

    /**
     * 设置minimumcsa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumcsa(String value) {
        this.minimumcsa = value;
    }

    /**
     * 获取maximumcsa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumcsa() {
        return maximumcsa;
    }

    /**
     * 设置maximumcsa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumcsa(String value) {
        this.maximumcsa = value;
    }

    /**
     * 获取precut属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrecut() {
        if (precut == null) {
            return new BigDecimal("0");
        } else {
            return precut;
        }
    }

    /**
     * 设置precut属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrecut(BigDecimal value) {
        this.precut = value;
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

}
