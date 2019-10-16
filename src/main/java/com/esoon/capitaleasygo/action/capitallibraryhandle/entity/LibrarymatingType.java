//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.10.31 时间 04:02:39 PM CST 
//


package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>librarymatingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="librarymatingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="librarymatingpinmapping" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarymatingpinmappingType"/>
 *       &lt;/choice>
 *       &lt;attribute name="librarymating_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String64" />
 *       &lt;attribute name="libraryobject_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="matedconnector_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="combination" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarymatingType", propOrder = {
    "librarymatingpinmapping"
})
public class LibrarymatingType implements Serializable{

    protected List<LibrarymatingpinmappingType> librarymatingpinmapping;
    @XmlAttribute(name = "librarymating_id", required = true)
    protected String librarymatingId;
    @XmlAttribute(name = "libraryobject_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object libraryobjectId;
    @XmlAttribute(name = "matedconnector_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object matedconnectorId;
    @XmlAttribute(name = "combination", required = true)
    protected BigDecimal combination;

    /**
     * Gets the value of the librarymatingpinmapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the librarymatingpinmapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibrarymatingpinmapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibrarymatingpinmappingType }
     * 
     * 
     */
    public List<LibrarymatingpinmappingType> getLibrarymatingpinmapping() {
        if (librarymatingpinmapping == null) {
            librarymatingpinmapping = new ArrayList<LibrarymatingpinmappingType>();
        }
        return this.librarymatingpinmapping;
    }

    /**
     * 获取librarymatingId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarymatingId() {
        return librarymatingId;
    }

    /**
     * 设置librarymatingId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarymatingId(String value) {
        this.librarymatingId = value;
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
     * 获取matedconnectorId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMatedconnectorId() {
        return matedconnectorId;
    }

    /**
     * 设置matedconnectorId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMatedconnectorId(Object value) {
        this.matedconnectorId = value;
    }

    /**
     * 获取combination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCombination() {
        return combination;
    }

    /**
     * 设置combination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCombination(BigDecimal value) {
        this.combination = value;
    }

}
