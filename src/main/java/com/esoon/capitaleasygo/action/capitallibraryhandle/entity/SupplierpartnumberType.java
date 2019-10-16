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
 * <p>supplierpartnumberType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="supplierpartnumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="supplierpartnumber_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="supplierpartnumber" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String30" />
 *       &lt;attribute name="libraryobject_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="supplierorganisation_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="specification" type="{http://www.mentor.com/harness/Schema/LibrarySchema}OptionalString200" />
 *       &lt;attribute name="reellength" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_12_6" />
 *       &lt;attribute name="preferred" type="{http://www.mentor.com/harness/Schema/LibrarySchema}BasebooleanType" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supplierpartnumberType")
public class SupplierpartnumberType implements Serializable{

    @XmlAttribute(name = "supplierpartnumber_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String supplierpartnumberId;
    @XmlAttribute(name = "supplierpartnumber")
    protected String supplierpartnumber;
    @XmlAttribute(name = "libraryobject_id")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object libraryobjectId;
    @XmlAttribute(name = "supplierorganisation_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object supplierorganisationId;
    @XmlAttribute(name = "specification")
    protected String specification;
    @XmlAttribute(name = "reellength")
    protected String reellength;
    @XmlAttribute(name = "preferred")
    protected String preferred;

    /**
     * 获取supplierpartnumberId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierpartnumberId() {
        return supplierpartnumberId;
    }

    /**
     * 设置supplierpartnumberId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierpartnumberId(String value) {
        this.supplierpartnumberId = value;
    }

    /**
     * 获取supplierpartnumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierpartnumber() {
        return supplierpartnumber;
    }

    /**
     * 设置supplierpartnumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierpartnumber(String value) {
        this.supplierpartnumber = value;
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
     * 获取supplierorganisationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSupplierorganisationId() {
        return supplierorganisationId;
    }

    /**
     * 设置supplierorganisationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSupplierorganisationId(Object value) {
        this.supplierorganisationId = value;
    }

    /**
     * 获取specification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * 设置specification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecification(String value) {
        this.specification = value;
    }

    /**
     * 获取reellength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReellength() {
        return reellength;
    }

    /**
     * 设置reellength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReellength(String value) {
        this.reellength = value;
    }

    /**
     * 获取preferred属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferred() {
        if (preferred == null) {
            return "0";
        } else {
            return preferred;
        }
    }

    /**
     * 设置preferred属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferred(String value) {
        this.preferred = value;
    }

}
