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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>DocumentBase complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DocumentBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="librarycolor" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarycolorType"/>
 *         &lt;element name="librarymaterial" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarymaterialType"/>
 *         &lt;element name="librarycomponenttype" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarycomponenttypeType"/>
 *         &lt;element name="customerorganisation" type="{http://www.mentor.com/harness/Schema/LibrarySchema}customerorganisationType"/>
 *         &lt;element name="manufacturingsiteorganisation" type="{http://www.mentor.com/harness/Schema/LibrarySchema}manufacturingsiteorganisationType"/>
 *         &lt;element name="supplierorganisation" type="{http://www.mentor.com/harness/Schema/LibrarySchema}supplierorganisationType"/>
 *         &lt;element name="librarywirespec" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarywirespecType"/>
 *         &lt;element name="librarywirethickness" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarywirethicknessType"/>
 *         &lt;element name="chsuserproperty" type="{http://www.mentor.com/harness/Schema/LibrarySchema}chsuserpropertyType"/>
 *         &lt;element name="chsuserpropertytype" type="{http://www.mentor.com/harness/Schema/LibrarySchema}chsuserpropertytypeType"/>
 *         &lt;element name="librarycustomercolcode" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarycustomercolcodeType"/>
 *         &lt;element name="librarypitch" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarypitchType"/>
 *         &lt;element name="librarywirepitch" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarywirepitchType"/>
 *         &lt;element name="librarywiregroupcode" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarywiregroupcodeType"/>
 *         &lt;element name="assemblypart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}assemblyType"/>
 *         &lt;element name="backshellpart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}backshellType"/>
 *         &lt;element name="backshellplugpart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}backshellPlugType"/>
 *         &lt;element name="backshellsealpart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}backshellSealType"/>
 *         &lt;element name="cavitygrouppart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}cavitygroupType"/>
 *         &lt;element name="cavityplugpart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}cavityPlugType"/>
 *         &lt;element name="cavitysealpart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}cavitySealType"/>
 *         &lt;element name="clippart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}clipType"/>
 *         &lt;element name="connectorpart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}connectorType"/>
 *         &lt;element name="connectorsealpart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}connectorSealType"/>
 *         &lt;element name="devicepart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}deviceType"/>
 *         &lt;element name="grommetpart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}grommetType"/>
 *         &lt;element name="heatshrinksleevepart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}heatshrinkSleeveType"/>
 *         &lt;element name="idcconnectorpart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}idcconnectorType"/>
 *         &lt;element name="inhouseassemblypart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}inhouseAssemblyType"/>
 *         &lt;element name="multicorepart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}multicoreType"/>
 *         &lt;element name="otherpart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}otherType"/>
 *         &lt;element name="soldersleevepart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}solderSleeveType"/>
 *         &lt;element name="splicepart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}spliceType"/>
 *         &lt;element name="tapepart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}tapeType"/>
 *         &lt;element name="terminalpart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}terminalType"/>
 *         &lt;element name="tubepart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}tubeType"/>
 *         &lt;element name="ultrasonicweldpart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}ultrasonicweldType"/>
 *         &lt;element name="wirepart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}wireType"/>
 *         &lt;element name="fixturepart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}fixtureType"/>
 *         &lt;element name="libraryrevisiongroup" type="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryrevisiongroupType"/>
 *         &lt;element name="libraryscopecode" type="{http://www.mentor.com/harness/Schema/LibrarySchema}libraryscopeType"/>
 *       &lt;/choice>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExportDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProgramDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}language" default="en" />
 *       &lt;attribute name="NumberFormat" type="{http://www.w3.org/2001/XMLSchema}string" default="en" />
 *       &lt;attribute name="DateFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProgramVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExportTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OriginalEncoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SchemaValidation" type="{http://www.w3.org/2001/XMLSchema}string" default="true" />
 *       &lt;attribute name="ExportVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="XMLVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InvocationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ButtonPressed" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentBase", propOrder = {
    "librarycolorOrLibrarymaterialOrLibrarycomponenttype"
})
public class DocumentBase implements Serializable{

    @XmlElements({
        @XmlElement(name = "librarycolor", type = LibrarycolorType.class),
        @XmlElement(name = "librarymaterial", type = LibrarymaterialType.class),
        @XmlElement(name = "librarycomponenttype", type = LibrarycomponenttypeType.class),
        @XmlElement(name = "customerorganisation", type = CustomerorganisationType.class),
        @XmlElement(name = "manufacturingsiteorganisation", type = ManufacturingsiteorganisationType.class),
        @XmlElement(name = "supplierorganisation", type = SupplierorganisationType.class),
        @XmlElement(name = "librarywirespec", type = LibrarywirespecType.class),
        @XmlElement(name = "librarywirethickness", type = LibrarywirethicknessType.class),
        @XmlElement(name = "chsuserproperty", type = ChsuserpropertyType1.class),
        @XmlElement(name = "chsuserpropertytype", type = ChsuserpropertytypeType.class),
        @XmlElement(name = "librarycustomercolcode", type = LibrarycustomercolcodeType.class),
        @XmlElement(name = "librarypitch", type = LibrarypitchType.class),
        @XmlElement(name = "librarywirepitch", type = LibrarywirepitchType.class),
        @XmlElement(name = "librarywiregroupcode", type = LibrarywiregroupcodeType.class),
        @XmlElement(name = "assemblypart", type = AssemblyType.class),
        @XmlElement(name = "backshellpart", type = BackshellType.class),
        @XmlElement(name = "backshellplugpart", type = BackshellPlugType.class),
        @XmlElement(name = "backshellsealpart", type = BackshellSealType.class),
        @XmlElement(name = "cavitygrouppart", type = CavitygroupType.class),
        @XmlElement(name = "cavityplugpart", type = CavityPlugType.class),
        @XmlElement(name = "cavitysealpart", type = CavitySealType.class),
        @XmlElement(name = "clippart", type = ClipType.class),
        @XmlElement(name = "connectorpart", type = ConnectorType.class),
        @XmlElement(name = "connectorsealpart", type = ConnectorSealType.class),
        @XmlElement(name = "devicepart", type = DeviceType.class),
        @XmlElement(name = "grommetpart", type = GrommetType.class),
        @XmlElement(name = "heatshrinksleevepart", type = HeatshrinkSleeveType.class),
        @XmlElement(name = "idcconnectorpart", type = IdcconnectorType.class),
        @XmlElement(name = "inhouseassemblypart", type = InhouseAssemblyType.class),
        @XmlElement(name = "multicorepart", type = MulticoreType.class),
        @XmlElement(name = "otherpart", type = OtherType.class),
        @XmlElement(name = "soldersleevepart", type = SolderSleeveType.class),
        @XmlElement(name = "splicepart", type = SpliceType.class),
        @XmlElement(name = "tapepart", type = TapeType.class),
        @XmlElement(name = "terminalpart", type = TerminalType.class),
        @XmlElement(name = "tubepart", type = TubeType.class),
        @XmlElement(name = "ultrasonicweldpart", type = UltrasonicweldType.class),
        @XmlElement(name = "wirepart", type = WireType.class),
        @XmlElement(name = "fixturepart", type = FixtureType.class),
        @XmlElement(name = "libraryrevisiongroup", type = LibraryrevisiongroupType.class),
        @XmlElement(name = "libraryscopecode", type = LibraryscopeType.class)
    })
    protected List<Object> librarycolorOrLibrarymaterialOrLibrarycomponenttype;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "ExportDate", required = true)
    protected String exportDate;
    @XmlAttribute(name = "ProgramDate")
    protected String programDate;
    @XmlAttribute(name = "language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlAttribute(name = "NumberFormat")
    protected String numberFormat;
    @XmlAttribute(name = "DateFormat")
    protected String dateFormat;
    @XmlAttribute(name = "ProgramVersion")
    protected String programVersion;
    @XmlAttribute(name = "ExportTime")
    protected String exportTime;
    @XmlAttribute(name = "OriginalEncoding")
    protected String originalEncoding;
    @XmlAttribute(name = "SchemaValidation")
    protected String schemaValidation;
    @XmlAttribute(name = "ExportVersion")
    protected String exportVersion;
    @XmlAttribute(name = "XMLVersion")
    protected String xmlVersion;
    @XmlAttribute(name = "author")
    protected String author;
    @XmlAttribute(name = "InvocationType")
    protected String invocationType;
    @XmlAttribute(name = "ButtonPressed")
    protected String buttonPressed;

    /**
     * Gets the value of the librarycolorOrLibrarymaterialOrLibrarycomponenttype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the librarycolorOrLibrarymaterialOrLibrarycomponenttype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibrarycolorType }
     * {@link LibrarymaterialType }
     * {@link LibrarycomponenttypeType }
     * {@link CustomerorganisationType }
     * {@link ManufacturingsiteorganisationType }
     * {@link SupplierorganisationType }
     * {@link LibrarywirespecType }
     * {@link LibrarywirethicknessType }
     * {@link ChsuserpropertyType1 }
     * {@link ChsuserpropertytypeType }
     * {@link LibrarycustomercolcodeType }
     * {@link LibrarypitchType }
     * {@link LibrarywirepitchType }
     * {@link LibrarywiregroupcodeType }
     * {@link AssemblyType }
     * {@link BackshellType }
     * {@link BackshellPlugType }
     * {@link BackshellSealType }
     * {@link CavitygroupType }
     * {@link CavityPlugType }
     * {@link CavitySealType }
     * {@link ClipType }
     * {@link ConnectorType }
     * {@link ConnectorSealType }
     * {@link DeviceType }
     * {@link GrommetType }
     * {@link HeatshrinkSleeveType }
     * {@link IdcconnectorType }
     * {@link InhouseAssemblyType }
     * {@link MulticoreType }
     * {@link OtherType }
     * {@link SolderSleeveType }
     * {@link SpliceType }
     * {@link TapeType }
     * {@link TerminalType }
     * {@link TubeType }
     * {@link UltrasonicweldType }
     * {@link WireType }
     * {@link FixtureType }
     * {@link LibraryrevisiongroupType }
     * {@link LibraryscopeType }
     * 
     * 
     */
    public List<Object> getLibrarycolorOrLibrarymaterialOrLibrarycomponenttype() {
        if (librarycolorOrLibrarymaterialOrLibrarycomponenttype == null) {
            librarycolorOrLibrarymaterialOrLibrarycomponenttype = new ArrayList<Object>();
        }
        return this.librarycolorOrLibrarymaterialOrLibrarycomponenttype;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * 获取exportDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportDate() {
        return exportDate;
    }

    /**
     * 设置exportDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportDate(String value) {
        this.exportDate = value;
    }

    /**
     * 获取programDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramDate() {
        return programDate;
    }

    /**
     * 设置programDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramDate(String value) {
        this.programDate = value;
    }

    /**
     * 获取language属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        if (language == null) {
            return "en";
        } else {
            return language;
        }
    }

    /**
     * 设置language属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * 获取numberFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberFormat() {
        if (numberFormat == null) {
            return "en";
        } else {
            return numberFormat;
        }
    }

    /**
     * 设置numberFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberFormat(String value) {
        this.numberFormat = value;
    }

    /**
     * 获取dateFormat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * 设置dateFormat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateFormat(String value) {
        this.dateFormat = value;
    }

    /**
     * 获取programVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramVersion() {
        return programVersion;
    }

    /**
     * 设置programVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramVersion(String value) {
        this.programVersion = value;
    }

    /**
     * 获取exportTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportTime() {
        return exportTime;
    }

    /**
     * 设置exportTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportTime(String value) {
        this.exportTime = value;
    }

    /**
     * 获取originalEncoding属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalEncoding() {
        return originalEncoding;
    }

    /**
     * 设置originalEncoding属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalEncoding(String value) {
        this.originalEncoding = value;
    }

    /**
     * 获取schemaValidation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaValidation() {
        if (schemaValidation == null) {
            return "true";
        } else {
            return schemaValidation;
        }
    }

    /**
     * 设置schemaValidation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaValidation(String value) {
        this.schemaValidation = value;
    }

    /**
     * 获取exportVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportVersion() {
        return exportVersion;
    }

    /**
     * 设置exportVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportVersion(String value) {
        this.exportVersion = value;
    }

    /**
     * 获取xmlVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLVersion() {
        return xmlVersion;
    }

    /**
     * 设置xmlVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLVersion(String value) {
        this.xmlVersion = value;
    }

    /**
     * 获取author属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置author属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * 获取invocationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvocationType() {
        return invocationType;
    }

    /**
     * 设置invocationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvocationType(String value) {
        this.invocationType = value;
    }

    /**
     * 获取buttonPressed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getButtonPressed() {
        return buttonPressed;
    }

    /**
     * 设置buttonPressed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setButtonPressed(String value) {
        this.buttonPressed = value;
    }

}
