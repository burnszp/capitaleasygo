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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>chsuserpropertyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="chsuserpropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="chsuserproperty_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="userpropertyname" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String30" />
 *       &lt;attribute name="propdesc" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String255" />
 *       &lt;attribute name="datatype" type="{http://www.mentor.com/harness/Schema/LibrarySchema}ChsuserpropertyDataType" default="String" />
 *       &lt;attribute name="propertystatus" type="{http://www.mentor.com/harness/Schema/LibrarySchema}BasebooleanType" />
 *       &lt;attribute name="pinproperty" type="{http://www.mentor.com/harness/Schema/LibrarySchema}BasebooleanType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chsuserpropertyType")
public class ChsuserpropertyType1 implements Serializable{

    @XmlAttribute(name = "chsuserproperty_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String chsuserpropertyId;
    @XmlAttribute(name = "userpropertyname", required = true)
    protected String userpropertyname;
    @XmlAttribute(name = "propdesc", required = true)
    protected String propdesc;
    @XmlAttribute(name = "datatype")
    protected String datatype;
    @XmlAttribute(name = "propertystatus")
    protected String propertystatus;
    @XmlAttribute(name = "pinproperty")
    protected String pinproperty;

    /**
     * 获取chsuserpropertyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChsuserpropertyId() {
        return chsuserpropertyId;
    }

    /**
     * 设置chsuserpropertyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChsuserpropertyId(String value) {
        this.chsuserpropertyId = value;
    }

    /**
     * 获取userpropertyname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserpropertyname() {
        return userpropertyname;
    }

    /**
     * 设置userpropertyname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserpropertyname(String value) {
        this.userpropertyname = value;
    }

    /**
     * 获取propdesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropdesc() {
        return propdesc;
    }

    /**
     * 设置propdesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropdesc(String value) {
        this.propdesc = value;
    }

    /**
     * 获取datatype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatatype() {
        if (datatype == null) {
            return "String";
        } else {
            return datatype;
        }
    }

    /**
     * 设置datatype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatatype(String value) {
        this.datatype = value;
    }

    /**
     * 获取propertystatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertystatus() {
        return propertystatus;
    }

    /**
     * 设置propertystatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertystatus(String value) {
        this.propertystatus = value;
    }

    /**
     * 获取pinproperty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinproperty() {
        return pinproperty;
    }

    /**
     * 设置pinproperty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinproperty(String value) {
        this.pinproperty = value;
    }

}
