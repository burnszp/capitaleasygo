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
 * <p>librarytapeselectionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="librarytapeselectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/LibrarySchema}SelectionAttributes"/>
 *       &lt;attribute name="librarytape_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="librarytapeselection_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="layer" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="overlaps" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarytapeselectionType")
public class LibrarytapeselectionType implements Serializable{

    @XmlAttribute(name = "librarytape_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object librarytapeId;
    @XmlAttribute(name = "librarytapeselection_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String librarytapeselectionId;
    @XmlAttribute(name = "layer")
    @XmlSchemaType(name = "unsignedInt")
    protected Long layer;
    @XmlAttribute(name = "overlaps")
    @XmlSchemaType(name = "unsignedInt")
    protected Long overlaps;
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
     * 获取librarytapeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLibrarytapeId() {
        return librarytapeId;
    }

    /**
     * 设置librarytapeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLibrarytapeId(Object value) {
        this.librarytapeId = value;
    }

    /**
     * 获取librarytapeselectionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarytapeselectionId() {
        return librarytapeselectionId;
    }

    /**
     * 设置librarytapeselectionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarytapeselectionId(String value) {
        this.librarytapeselectionId = value;
    }

    /**
     * 获取layer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLayer() {
        return layer;
    }

    /**
     * 设置layer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLayer(Long value) {
        this.layer = value;
    }

    /**
     * 获取overlaps属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOverlaps() {
        return overlaps;
    }

    /**
     * 设置overlaps属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOverlaps(Long value) {
        this.overlaps = value;
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
