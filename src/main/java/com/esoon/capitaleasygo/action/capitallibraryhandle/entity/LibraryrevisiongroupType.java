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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>libraryrevisiongroupType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="libraryrevisiongroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="libraryrevision" type="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryrevisionType"/>
 *       &lt;/choice>
 *       &lt;attribute name="revisiongrp_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libraryrevisiongroupType", propOrder = {
    "libraryrevision"
})
public class LibraryrevisiongroupType implements Serializable{

    protected List<LibraryrevisionType> libraryrevision;
    @XmlAttribute(name = "revisiongrp_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String revisiongrpId;

    /**
     * Gets the value of the libraryrevision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libraryrevision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibraryrevision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibraryrevisionType }
     * 
     * 
     */
    public List<LibraryrevisionType> getLibraryrevision() {
        if (libraryrevision == null) {
            libraryrevision = new ArrayList<LibraryrevisionType>();
        }
        return this.libraryrevision;
    }

    /**
     * 获取revisiongrpId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisiongrpId() {
        return revisiongrpId;
    }

    /**
     * 设置revisiongrpId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisiongrpId(String value) {
        this.revisiongrpId = value;
    }

}
