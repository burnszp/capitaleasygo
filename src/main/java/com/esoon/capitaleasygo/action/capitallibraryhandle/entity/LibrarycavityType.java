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
 * <p>librarycavityType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="librarycavityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="chsuserdevicepinproperty" type="{http://www.mentor.com/harness/Schema/LibrarySchema}chsuserdevicepinpropertyType"/>
 *       &lt;/choice>
 *       &lt;attribute name="librarycavity_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="contactmaterial" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="libraryobject_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="librarypincontainer_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="cavityname" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String40" />
 *       &lt;attribute name="sortorder" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="imax" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_20_10_blank" />
 *       &lt;attribute name="imin" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_20_10_blank" />
 *       &lt;attribute name="inominal" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_20_10_blank" />
 *       &lt;attribute name="pintype" type="{http://www.mentor.com/harness/Schema/LibrarySchema}BasePinTypes" default="NC" />
 *       &lt;attribute name="vmin" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_20_10_blank" />
 *       &lt;attribute name="vnominal" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_20_10_blank" />
 *       &lt;attribute name="wirecsa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ca_attach" type="{http://www.mentor.com/harness/Schema/LibrarySchema}OptionalString255" />
 *       &lt;attribute name="timax" type="{http://www.mentor.com/harness/Schema/LibrarySchema}Decimal_20_10_blank" />
 *       &lt;attribute name="pingraphic" type="{http://www.mentor.com/harness/Schema/LibrarySchema}OptionalString255" />
 *       &lt;attribute name="pingroup" type="{http://www.mentor.com/harness/Schema/LibrarySchema}OptionalString255" />
 *       &lt;attribute name="isblocked" type="{http://www.mentor.com/harness/Schema/LibrarySchema}BasebooleanType" default="0" />
 *       &lt;attribute name="ca_mappingtype" type="{http://www.mentor.com/harness/Schema/LibrarySchema}AnalysisPinMappingType" default="Userdefined" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarycavityType", propOrder = {
    "chsuserdevicepinproperty"
})
public class LibrarycavityType implements Serializable{

    protected List<ChsuserdevicepinpropertyType> chsuserdevicepinproperty;
    @XmlAttribute(name = "librarycavity_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String librarycavityId;
    @XmlAttribute(name = "contactmaterial")
    protected String contactmaterial;
    @XmlAttribute(name = "libraryobject_id")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object libraryobjectId;
    @XmlAttribute(name = "librarypincontainer_id")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object librarypincontainerId;
    @XmlAttribute(name = "cavityname", required = true)
    protected String cavityname;
    @XmlAttribute(name = "sortorder", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long sortorder;
    @XmlAttribute(name = "imax")
    protected String imax;
    @XmlAttribute(name = "imin")
    protected String imin;
    @XmlAttribute(name = "inominal")
    protected String inominal;
    @XmlAttribute(name = "pintype")
    protected String pintype;
    @XmlAttribute(name = "vmin")
    protected String vmin;
    @XmlAttribute(name = "vnominal")
    protected String vnominal;
    @XmlAttribute(name = "wirecsa")
    protected String wirecsa;
    @XmlAttribute(name = "ca_attach")
    protected String caAttach;
    @XmlAttribute(name = "timax")
    protected String timax;
    @XmlAttribute(name = "pingraphic")
    protected String pingraphic;
    @XmlAttribute(name = "pingroup")
    protected String pingroup;
    @XmlAttribute(name = "isblocked")
    protected String isblocked;
    @XmlAttribute(name = "ca_mappingtype")
    protected String caMappingtype;

    /**
     * Gets the value of the chsuserdevicepinproperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chsuserdevicepinproperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChsuserdevicepinproperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChsuserdevicepinpropertyType }
     * 
     * 
     */
    public List<ChsuserdevicepinpropertyType> getChsuserdevicepinproperty() {
        if (chsuserdevicepinproperty == null) {
            chsuserdevicepinproperty = new ArrayList<ChsuserdevicepinpropertyType>();
        }
        return this.chsuserdevicepinproperty;
    }

    /**
     * 获取librarycavityId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarycavityId() {
        return librarycavityId;
    }

    /**
     * 设置librarycavityId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarycavityId(String value) {
        this.librarycavityId = value;
    }

    /**
     * 获取contactmaterial属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactmaterial() {
        return contactmaterial;
    }

    /**
     * 设置contactmaterial属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactmaterial(String value) {
        this.contactmaterial = value;
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
     * 获取librarypincontainerId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLibrarypincontainerId() {
        return librarypincontainerId;
    }

    /**
     * 设置librarypincontainerId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLibrarypincontainerId(Object value) {
        this.librarypincontainerId = value;
    }

    /**
     * 获取cavityname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCavityname() {
        return cavityname;
    }

    /**
     * 设置cavityname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCavityname(String value) {
        this.cavityname = value;
    }

    /**
     * 获取sortorder属性的值。
     * 
     */
    public long getSortorder() {
        return sortorder;
    }

    /**
     * 设置sortorder属性的值。
     * 
     */
    public void setSortorder(long value) {
        this.sortorder = value;
    }

    /**
     * 获取imax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImax() {
        return imax;
    }

    /**
     * 设置imax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImax(String value) {
        this.imax = value;
    }

    /**
     * 获取imin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImin() {
        return imin;
    }

    /**
     * 设置imin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImin(String value) {
        this.imin = value;
    }

    /**
     * 获取inominal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInominal() {
        return inominal;
    }

    /**
     * 设置inominal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInominal(String value) {
        this.inominal = value;
    }

    /**
     * 获取pintype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPintype() {
        if (pintype == null) {
            return "NC";
        } else {
            return pintype;
        }
    }

    /**
     * 设置pintype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPintype(String value) {
        this.pintype = value;
    }

    /**
     * 获取vmin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVmin() {
        return vmin;
    }

    /**
     * 设置vmin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVmin(String value) {
        this.vmin = value;
    }

    /**
     * 获取vnominal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVnominal() {
        return vnominal;
    }

    /**
     * 设置vnominal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVnominal(String value) {
        this.vnominal = value;
    }

    /**
     * 获取wirecsa属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWirecsa() {
        return wirecsa;
    }

    /**
     * 设置wirecsa属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWirecsa(String value) {
        this.wirecsa = value;
    }

    /**
     * 获取caAttach属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaAttach() {
        return caAttach;
    }

    /**
     * 设置caAttach属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaAttach(String value) {
        this.caAttach = value;
    }

    /**
     * 获取timax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimax() {
        return timax;
    }

    /**
     * 设置timax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimax(String value) {
        this.timax = value;
    }

    /**
     * 获取pingraphic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPingraphic() {
        return pingraphic;
    }

    /**
     * 设置pingraphic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPingraphic(String value) {
        this.pingraphic = value;
    }

    /**
     * 获取pingroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPingroup() {
        return pingroup;
    }

    /**
     * 设置pingroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPingroup(String value) {
        this.pingroup = value;
    }

    /**
     * 获取isblocked属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsblocked() {
        if (isblocked == null) {
            return "0";
        } else {
            return isblocked;
        }
    }

    /**
     * 设置isblocked属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsblocked(String value) {
        this.isblocked = value;
    }

    /**
     * 获取caMappingtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaMappingtype() {
        if (caMappingtype == null) {
            return "Userdefined";
        } else {
            return caMappingtype;
        }
    }

    /**
     * 设置caMappingtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaMappingtype(String value) {
        this.caMappingtype = value;
    }

}
