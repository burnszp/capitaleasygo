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
 * <p>librarywiregroupcodeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="librarywiregroupcodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="librarywiregroupcodespecification" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarywiregroupcodespecificationType"/>
 *       &lt;/choice>
 *       &lt;attribute name="wiregrp_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="wiregrpname" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String40" />
 *       &lt;attribute name="description" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String255" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarywiregroupcodeType", propOrder = {
    "librarywiregroupcodespecification"
})
public class LibrarywiregroupcodeType implements Serializable{

    protected List<LibrarywiregroupcodespecificationType> librarywiregroupcodespecification;
    @XmlAttribute(name = "wiregrp_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String wiregrpId;
    @XmlAttribute(name = "wiregrpname", required = true)
    protected String wiregrpname;
    @XmlAttribute(name = "description", required = true)
    protected String description;

    /**
     * Gets the value of the librarywiregroupcodespecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the librarywiregroupcodespecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibrarywiregroupcodespecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibrarywiregroupcodespecificationType }
     * 
     * 
     */
    public List<LibrarywiregroupcodespecificationType> getLibrarywiregroupcodespecification() {
        if (librarywiregroupcodespecification == null) {
            librarywiregroupcodespecification = new ArrayList<LibrarywiregroupcodespecificationType>();
        }
        return this.librarywiregroupcodespecification;
    }

    /**
     * 获取wiregrpId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiregrpId() {
        return wiregrpId;
    }

    /**
     * 设置wiregrpId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiregrpId(String value) {
        this.wiregrpId = value;
    }

    /**
     * 获取wiregrpname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiregrpname() {
        return wiregrpname;
    }

    /**
     * 设置wiregrpname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiregrpname(String value) {
        this.wiregrpname = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
