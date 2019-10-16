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
 * <p>libraryfixtureType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="libraryfixtureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="libraryfixturedetails_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="autoselectable" type="{http://www.mentor.com/harness/Schema/LibrarySchema}BasebooleanType" default="0" />
 *       &lt;attribute name="bundlecount" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="minbundlewidth" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" default="0" />
 *       &lt;attribute name="maxbundlewidth" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" default="0" />
 *       &lt;attribute name="minwirecount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="0" />
 *       &lt;attribute name="maxwirecount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" default="0" />
 *       &lt;attribute name="shaftdiameter" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" default="0" />
 *       &lt;attribute name="libraryobject_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libraryfixtureType")
public class LibraryfixtureType implements Serializable{

    @XmlAttribute(name = "libraryfixturedetails_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String libraryfixturedetailsId;
    @XmlAttribute(name = "autoselectable")
    protected String autoselectable;
    @XmlAttribute(name = "bundlecount")
    protected Integer bundlecount;
    @XmlAttribute(name = "minbundlewidth")
    protected String minbundlewidth;
    @XmlAttribute(name = "maxbundlewidth")
    protected String maxbundlewidth;
    @XmlAttribute(name = "minwirecount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long minwirecount;
    @XmlAttribute(name = "maxwirecount")
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxwirecount;
    @XmlAttribute(name = "shaftdiameter")
    protected String shaftdiameter;
    @XmlAttribute(name = "libraryobject_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object libraryobjectId;

    /**
     * 获取libraryfixturedetailsId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryfixturedetailsId() {
        return libraryfixturedetailsId;
    }

    /**
     * 设置libraryfixturedetailsId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryfixturedetailsId(String value) {
        this.libraryfixturedetailsId = value;
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

    /**
     * 获取bundlecount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getBundlecount() {
        if (bundlecount == null) {
            return  0;
        } else {
            return bundlecount;
        }
    }

    /**
     * 设置bundlecount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBundlecount(Integer value) {
        this.bundlecount = value;
    }

    /**
     * 获取minbundlewidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinbundlewidth() {
        if (minbundlewidth == null) {
            return "0";
        } else {
            return minbundlewidth;
        }
    }

    /**
     * 设置minbundlewidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinbundlewidth(String value) {
        this.minbundlewidth = value;
    }

    /**
     * 获取maxbundlewidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxbundlewidth() {
        if (maxbundlewidth == null) {
            return "0";
        } else {
            return maxbundlewidth;
        }
    }

    /**
     * 设置maxbundlewidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxbundlewidth(String value) {
        this.maxbundlewidth = value;
    }

    /**
     * 获取minwirecount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getMinwirecount() {
        if (minwirecount == null) {
            return  0L;
        } else {
            return minwirecount;
        }
    }

    /**
     * 设置minwirecount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMinwirecount(Long value) {
        this.minwirecount = value;
    }

    /**
     * 获取maxwirecount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getMaxwirecount() {
        if (maxwirecount == null) {
            return  0L;
        } else {
            return maxwirecount;
        }
    }

    /**
     * 设置maxwirecount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxwirecount(Long value) {
        this.maxwirecount = value;
    }

    /**
     * 获取shaftdiameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShaftdiameter() {
        if (shaftdiameter == null) {
            return "0";
        } else {
            return shaftdiameter;
        }
    }

    /**
     * 设置shaftdiameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShaftdiameter(String value) {
        this.shaftdiameter = value;
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

}
