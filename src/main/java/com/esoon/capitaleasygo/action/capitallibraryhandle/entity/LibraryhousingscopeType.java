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
 * <p>libraryhousingscopeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="libraryhousingscopeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="libraryobject_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="housingdefinition_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="cavity" type="{http://www.mentor.com/harness/Schema/LibrarySchema}OptionalString40" />
 *       &lt;attribute name="scopehous_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="housdef_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="customerorganisation_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="manufacturingorganisation_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="custname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sitename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scopetype" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String10" />
 *       &lt;attribute name="scopecode_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libraryhousingscopeType")
public class LibraryhousingscopeType implements Serializable{

    @XmlAttribute(name = "libraryobject_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object libraryobjectId;
    @XmlAttribute(name = "housingdefinition_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object housingdefinitionId;
    @XmlAttribute(name = "cavity")
    protected String cavity;
    @XmlAttribute(name = "scopehous_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String scopehousId;
    @XmlAttribute(name = "housdef_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object housdefId;
    @XmlAttribute(name = "customerorganisation_id")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object customerorganisationId;
    @XmlAttribute(name = "manufacturingorganisation_id")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object manufacturingorganisationId;
    @XmlAttribute(name = "custname")
    protected String custname;
    @XmlAttribute(name = "sitename")
    protected String sitename;
    @XmlAttribute(name = "scopetype", required = true)
    protected String scopetype;
    @XmlAttribute(name = "scopecode_id")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object scopecodeId;

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
     * 获取housingdefinitionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHousingdefinitionId() {
        return housingdefinitionId;
    }

    /**
     * 设置housingdefinitionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHousingdefinitionId(Object value) {
        this.housingdefinitionId = value;
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
     * 获取scopehousId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopehousId() {
        return scopehousId;
    }

    /**
     * 设置scopehousId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopehousId(String value) {
        this.scopehousId = value;
    }

    /**
     * 获取housdefId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHousdefId() {
        return housdefId;
    }

    /**
     * 设置housdefId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHousdefId(Object value) {
        this.housdefId = value;
    }

    /**
     * 获取customerorganisationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCustomerorganisationId() {
        return customerorganisationId;
    }

    /**
     * 设置customerorganisationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCustomerorganisationId(Object value) {
        this.customerorganisationId = value;
    }

    /**
     * 获取manufacturingorganisationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getManufacturingorganisationId() {
        return manufacturingorganisationId;
    }

    /**
     * 设置manufacturingorganisationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setManufacturingorganisationId(Object value) {
        this.manufacturingorganisationId = value;
    }

    /**
     * 获取custname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustname() {
        return custname;
    }

    /**
     * 设置custname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustname(String value) {
        this.custname = value;
    }

    /**
     * 获取sitename属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitename() {
        return sitename;
    }

    /**
     * 设置sitename属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitename(String value) {
        this.sitename = value;
    }

    /**
     * 获取scopetype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopetype() {
        return scopetype;
    }

    /**
     * 设置scopetype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopetype(String value) {
        this.scopetype = value;
    }

    /**
     * 获取scopecodeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getScopecodeId() {
        return scopecodeId;
    }

    /**
     * 设置scopecodeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setScopecodeId(Object value) {
        this.scopecodeId = value;
    }

}
