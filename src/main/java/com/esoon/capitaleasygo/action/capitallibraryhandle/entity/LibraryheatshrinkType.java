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
 * <p>libraryheatshrinkType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="libraryheatshrinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/LibrarySchema}SelectionAttributes"/>
 *       &lt;attribute name="libraryheatshrink_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="libraryobject_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libraryheatshrinkType")
public class LibraryheatshrinkType implements Serializable{

    @XmlAttribute(name = "libraryheatshrink_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String libraryheatshrinkId;
    @XmlAttribute(name = "libraryobject_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object libraryobjectId;
    @XmlAttribute(name = "minimumcsa", required = true)
    protected String minimumcsa;
    @XmlAttribute(name = "maximumcsa", required = true)
    protected String maximumcsa;
    @XmlAttribute(name = "minimumwire", required = true)
    protected String minimumwire;
    @XmlAttribute(name = "maximumwire", required = true)
    protected String maximumwire;
    @XmlAttribute(name = "minwirecount", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long minwirecount;
    @XmlAttribute(name = "maxwirecount", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long maxwirecount;
    @XmlAttribute(name = "autoselectable")
    protected String autoselectable;

    /**
     * 获取libraryheatshrinkId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryheatshrinkId() {
        return libraryheatshrinkId;
    }

    /**
     * 设置libraryheatshrinkId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryheatshrinkId(String value) {
        this.libraryheatshrinkId = value;
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
     * 获取minimumwire属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumwire() {
        return minimumwire;
    }

    /**
     * 设置minimumwire属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumwire(String value) {
        this.minimumwire = value;
    }

    /**
     * 获取maximumwire属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumwire() {
        return maximumwire;
    }

    /**
     * 设置maximumwire属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumwire(String value) {
        this.maximumwire = value;
    }

    /**
     * 获取minwirecount属性的值。
     * 
     */
    public long getMinwirecount() {
        return minwirecount;
    }

    /**
     * 设置minwirecount属性的值。
     * 
     */
    public void setMinwirecount(long value) {
        this.minwirecount = value;
    }

    /**
     * 获取maxwirecount属性的值。
     * 
     */
    public long getMaxwirecount() {
        return maxwirecount;
    }

    /**
     * 设置maxwirecount属性的值。
     * 
     */
    public void setMaxwirecount(long value) {
        this.maxwirecount = value;
    }

    /**
     * 获取autoselectable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoselectable() {
        if (autoselectable == null) {
            return "0";
        } else {
            return autoselectable;
        }
    }

    /**
     * 设置autoselectable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoselectable(String value) {
        this.autoselectable = value;
    }

}
