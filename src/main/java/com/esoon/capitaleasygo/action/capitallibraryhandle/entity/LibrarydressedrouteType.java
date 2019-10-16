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
 * <p>librarydressedrouteType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="librarydressedrouteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="librarydressedroute_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="libraryobject_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="route" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String10" />
 *       &lt;attribute name="cavity" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String40" />
 *       &lt;attribute name="addon" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="wire_addon" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" default="0" />
 *       &lt;attribute name="knockoff" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="wire_knockoff" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarydressedrouteType")
public class LibrarydressedrouteType implements Serializable{

    @XmlAttribute(name = "librarydressedroute_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String librarydressedrouteId;
    @XmlAttribute(name = "libraryobject_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object libraryobjectId;
    @XmlAttribute(name = "route", required = true)
    protected String route;
    @XmlAttribute(name = "cavity", required = true)
    protected String cavity;
    @XmlAttribute(name = "addon")
    protected BigDecimal addon;
    @XmlAttribute(name = "wire_addon")
    protected String wireAddon;
    @XmlAttribute(name = "knockoff")
    protected BigDecimal knockoff;
    @XmlAttribute(name = "wire_knockoff")
    protected String wireKnockoff;

    /**
     * 获取librarydressedrouteId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarydressedrouteId() {
        return librarydressedrouteId;
    }

    /**
     * 设置librarydressedrouteId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarydressedrouteId(String value) {
        this.librarydressedrouteId = value;
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
     * 获取route属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * 设置route属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * 获取cavity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavity() {
        return cavity;
    }

    /**
     * 设置cavity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavity(String value) {
        this.cavity = value;
    }

    /**
     * 获取addon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAddon() {
        return addon;
    }

    /**
     * 设置addon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAddon(BigDecimal value) {
        this.addon = value;
    }

    /**
     * 获取wireAddon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWireAddon() {
        if (wireAddon == null) {
            return "0";
        } else {
            return wireAddon;
        }
    }

    /**
     * 设置wireAddon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWireAddon(String value) {
        this.wireAddon = value;
    }

    /**
     * 获取knockoff属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKnockoff() {
        return knockoff;
    }

    /**
     * 设置knockoff属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKnockoff(BigDecimal value) {
        this.knockoff = value;
    }

    /**
     * 获取wireKnockoff属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWireKnockoff() {
        if (wireKnockoff == null) {
            return "0";
        } else {
            return wireKnockoff;
        }
    }

    /**
     * 设置wireKnockoff属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWireKnockoff(String value) {
        this.wireKnockoff = value;
    }

}
