//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.10.31 时间 04:02:39 PM CST 
//


package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 * <p>librarymultipleterminationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="librarymultipleterminationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="librarytermination" type="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryterminationType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="librarymultipletermination_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="libraryobject_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="combination" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="crccheck" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String64" />
 *       &lt;attribute name="groupnumber" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarymultipleterminationType", propOrder = {
    "librarytermination"
})
public class LibrarymultipleterminationType implements Serializable{

    protected List<LibraryterminationType> librarytermination;
    @XmlAttribute(name = "librarymultipletermination_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String librarymultipleterminationId;
    @XmlAttribute(name = "libraryobject_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object libraryobjectId;
    @XmlAttribute(name = "combination")
    protected Long combination;
    @XmlAttribute(name = "crccheck", required = true)
    protected String crccheck;
    @XmlAttribute(name = "groupnumber")
    protected Long groupnumber;

    /**
     * Gets the value of the librarytermination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the librarytermination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibrarytermination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibraryterminationType }
     * 
     * 
     */
    public List<LibraryterminationType> getLibrarytermination() {
        if (librarytermination == null) {
            librarytermination = new ArrayList<LibraryterminationType>();
        }
        return this.librarytermination;
    }

    /**
     * 获取librarymultipleterminationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarymultipleterminationId() {
        return librarymultipleterminationId;
    }

    /**
     * 设置librarymultipleterminationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarymultipleterminationId(String value) {
        this.librarymultipleterminationId = value;
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
     * 获取combination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCombination() {
        return combination;
    }

    /**
     * 设置combination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCombination(Long value) {
        this.combination = value;
    }

    /**
     * 获取crccheck属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrccheck() {
        return crccheck;
    }

    /**
     * 设置crccheck属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrccheck(String value) {
        this.crccheck = value;
    }

    /**
     * 获取groupnumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupnumber() {
        return groupnumber;
    }

    /**
     * 设置groupnumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupnumber(Long value) {
        this.groupnumber = value;
    }

}
