//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2013.10.31 时间 04:02:39 PM CST 
//


package com.esoon.capitaleasygo.action.capitallibraryhandle.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>supplierorganisationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="supplierorganisationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/LibrarySchema}OrganisationAttributes"/>
 *       &lt;attribute name="supplierorganisation_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="datum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="roundingmethod" type="{http://www.mentor.com/harness/Schema/LibrarySchema}BaseRoundingMethodType" />
 *       &lt;attribute name="roundingvalue" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="maximumroundtolerance" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="minimumroundtolerance" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="percentageaddon" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="addonperjunction" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="usepitch" type="{http://www.mentor.com/harness/Schema/LibrarySchema}BasebooleanType" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supplierorganisationType")
public class SupplierorganisationType implements Serializable{

    @XmlAttribute(name = "supplierorganisation_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String supplierorganisationId;
    @XmlAttribute(name = "datum")
    protected String datum;
    @XmlAttribute(name = "roundingmethod")
    protected String roundingmethod;
    @XmlAttribute(name = "roundingvalue")
    protected BigDecimal roundingvalue;
    @XmlAttribute(name = "maximumroundtolerance")
    protected BigDecimal maximumroundtolerance;
    @XmlAttribute(name = "minimumroundtolerance")
    protected BigDecimal minimumroundtolerance;
    @XmlAttribute(name = "percentageaddon")
    protected BigDecimal percentageaddon;
    @XmlAttribute(name = "addonperjunction")
    protected BigDecimal addonperjunction;
    @XmlAttribute(name = "usepitch")
    protected String usepitch;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "address1")
    protected String address1;
    @XmlAttribute(name = "address2")
    protected String address2;
    @XmlAttribute(name = "address3")
    protected String address3;
    @XmlAttribute(name = "address4")
    protected String address4;
    @XmlAttribute(name = "postcode")
    protected String postcode;
    @XmlAttribute(name = "country")
    protected String country;
    @XmlAttribute(name = "contact")
    protected String contact;
    @XmlAttribute(name = "telephonenumber")
    protected String telephonenumber;
    @XmlAttribute(name = "faxnumber")
    protected String faxnumber;
    @XmlAttribute(name = "internalref")
    protected String internalref;

    /**
     * 获取supplierorganisationId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierorganisationId() {
        return supplierorganisationId;
    }

    /**
     * 设置supplierorganisationId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierorganisationId(String value) {
        this.supplierorganisationId = value;
    }

    /**
     * 获取datum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatum() {
        return datum;
    }

    /**
     * 设置datum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatum(String value) {
        this.datum = value;
    }

    /**
     * 获取roundingmethod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoundingmethod() {
        return roundingmethod;
    }

    /**
     * 设置roundingmethod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoundingmethod(String value) {
        this.roundingmethod = value;
    }

    /**
     * 获取roundingvalue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoundingvalue() {
        return roundingvalue;
    }

    /**
     * 设置roundingvalue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoundingvalue(BigDecimal value) {
        this.roundingvalue = value;
    }

    /**
     * 获取maximumroundtolerance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumroundtolerance() {
        return maximumroundtolerance;
    }

    /**
     * 设置maximumroundtolerance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumroundtolerance(BigDecimal value) {
        this.maximumroundtolerance = value;
    }

    /**
     * 获取minimumroundtolerance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumroundtolerance() {
        return minimumroundtolerance;
    }

    /**
     * 设置minimumroundtolerance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumroundtolerance(BigDecimal value) {
        this.minimumroundtolerance = value;
    }

    /**
     * 获取percentageaddon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercentageaddon() {
        return percentageaddon;
    }

    /**
     * 设置percentageaddon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercentageaddon(BigDecimal value) {
        this.percentageaddon = value;
    }

    /**
     * 获取addonperjunction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAddonperjunction() {
        return addonperjunction;
    }

    /**
     * 设置addonperjunction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAddonperjunction(BigDecimal value) {
        this.addonperjunction = value;
    }

    /**
     * 获取usepitch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsepitch() {
        if (usepitch == null) {
            return "0";
        } else {
            return usepitch;
        }
    }

    /**
     * 设置usepitch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsepitch(String value) {
        this.usepitch = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取address1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * 设置address1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * 获取address2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * 设置address2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * 获取address3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * 设置address3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * 获取address4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress4() {
        return address4;
    }

    /**
     * 设置address4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress4(String value) {
        this.address4 = value;
    }

    /**
     * 获取postcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 设置postcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * 获取country属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置country属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * 获取contact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * 设置contact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * 获取telephonenumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephonenumber() {
        return telephonenumber;
    }

    /**
     * 设置telephonenumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephonenumber(String value) {
        this.telephonenumber = value;
    }

    /**
     * 获取faxnumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxnumber() {
        return faxnumber;
    }

    /**
     * 设置faxnumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxnumber(String value) {
        this.faxnumber = value;
    }

    /**
     * 获取internalref属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalref() {
        return internalref;
    }

    /**
     * 设置internalref属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalref(String value) {
        this.internalref = value;
    }

}
