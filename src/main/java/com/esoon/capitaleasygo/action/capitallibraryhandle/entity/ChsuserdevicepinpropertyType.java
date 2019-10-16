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
 * <p>chsuserdevicepinpropertyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="chsuserdevicepinpropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="devicepinprop_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="property_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="pin_id" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="propertyvalue" type="{http://www.mentor.com/harness/Schema/LibrarySchema}OptionalString255" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chsuserdevicepinpropertyType")
public class ChsuserdevicepinpropertyType implements Serializable{

    @XmlAttribute(name = "devicepinprop_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String devicepinpropId;
    @XmlAttribute(name = "property_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object propertyId;
    @XmlAttribute(name = "pin_id", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object pinId;
    @XmlAttribute(name = "propertyvalue")
    protected String propertyvalue;

    /**
     * 获取devicepinpropId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevicepinpropId() {
        return devicepinpropId;
    }

    /**
     * 设置devicepinpropId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevicepinpropId(String value) {
        this.devicepinpropId = value;
    }

    /**
     * 获取propertyId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPropertyId() {
        return propertyId;
    }

    /**
     * 设置propertyId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPropertyId(Object value) {
        this.propertyId = value;
    }

    /**
     * 获取pinId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPinId() {
        return pinId;
    }

    /**
     * 设置pinId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPinId(Object value) {
        this.pinId = value;
    }

    /**
     * 获取propertyvalue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyvalue() {
        return propertyvalue;
    }

    /**
     * 设置propertyvalue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyvalue(String value) {
        this.propertyvalue = value;
    }

}
