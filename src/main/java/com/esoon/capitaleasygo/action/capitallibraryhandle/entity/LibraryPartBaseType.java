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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>libraryPartBaseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="libraryPartBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="librarygraphic" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarygraphicType"/>
 *         &lt;element name="customerpartnumber" type="{http://www.mentor.com/harness/Schema/LibrarySchema}customerpartnumberType"/>
 *         &lt;element name="supplierpartnumber" type="{http://www.mentor.com/harness/Schema/LibrarySchema}supplierpartnumberType"/>
 *         &lt;element name="housingdefinition" type="{http://www.mentor.com/harness/Schema/LibrarySchema}housingdefinitionType"/>
 *         &lt;element name="chsuserpropertypart" type="{http://www.mentor.com/harness/Schema/LibrarySchema}chsuserpropertypartType"/>
 *         &lt;element name="librarycomponentscope" type="{http://www.mentor.com/harness/Schema/LibrarySchema}librarycomponentscopeType"/>
 *         &lt;element name="libmodificationhistory" type="{http://www.mentor.com/harness/Schema/LibrarySchema}libmodificationhistoryType"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.mentor.com/harness/Schema/LibrarySchema}BaseAttributes"/>
 *       &lt;attribute name="libraryobject_id" use="required" type="{http://www.mentor.com/harness/Schema/LibrarySchema}UID" />
 *       &lt;attribute name="librarycolor_id" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String64" />
 *       &lt;attribute name="librarymaterial_id" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="librarycomponenttype_id" type="{http://www.mentor.com/harness/Schema/LibrarySchema}String64" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libraryPartBaseType", propOrder = {
    "librarygraphicOrCustomerpartnumberOrSupplierpartnumber"
})
@XmlSeeAlso({
    ConnectorType.class,
    CavitySealType.class,
    TerminalType.class,
    MulticoreType.class,
    InhouseAssemblyType.class,
    DeviceType.class,
    BackshellType.class,
    SolderSleeveType.class,
    UltrasonicweldType.class,
    GrommetType.class,
    TapeType.class,
    HeatshrinkSleeveType.class,
    ConnectorSealType.class,
    BackshellPlugType.class,
    CavityPlugType.class,
    AssemblyType.class,
    TubeType.class,
    OtherType.class,
    BackshellSealType.class,
    ClipType.class,
    IdcconnectorType.class,
    CavitygroupType.class,
    WireType.class,
    SpliceType.class,
    FixtureType.class
})
public class LibraryPartBaseType implements Serializable,Cloneable{
	@Override
	public Object clone(){
		// TODO Auto-generated method stub
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

    @XmlElements({
        @XmlElement(name = "librarygraphic", type = LibrarygraphicType.class),
        @XmlElement(name = "customerpartnumber", type = CustomerpartnumberType.class),
        @XmlElement(name = "supplierpartnumber", type = SupplierpartnumberType.class),
        @XmlElement(name = "housingdefinition", type = HousingdefinitionType.class),
        @XmlElement(name = "chsuserpropertypart", type = ChsuserpropertypartType.class),
        @XmlElement(name = "librarycomponentscope", type = LibrarycomponentscopeType.class),
        @XmlElement(name = "libmodificationhistory", type = LibmodificationhistoryType.class)
    })
    protected List<Object> librarygraphicOrCustomerpartnumberOrSupplierpartnumber;
    @XmlAttribute(name = "libraryobject_id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String libraryobjectId;
    @XmlAttribute(name = "librarycolor_id")
    protected String librarycolorId;
    @XmlAttribute(name = "librarymaterial_id")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object librarymaterialId;
    @XmlAttribute(name = "librarycomponenttype_id")
    protected String librarycomponenttypeId;
    @XmlAttribute(name = "groupname")
    protected BaseGroupType groupname;
    @XmlAttribute(name = "ca_attach")
    protected String caAttach;
    @XmlAttribute(name = "unitofmeasure")
    protected String unitofmeasure;
    @XmlAttribute(name = "partnumber", required = true)
    protected String partnumber;
    @XmlAttribute(name = "description")
    protected String description;
    @XmlAttribute(name = "alternatepartnumber")
    protected String alternatepartnumber;
    @XmlAttribute(name = "replacedby")
    protected String replacedby;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "length")
    protected String length;
    @XmlAttribute(name = "partlength")
    protected BigDecimal partlength;
    @XmlAttribute(name = "width")
    protected String width;
    @XmlAttribute(name = "depth")
    protected String depth;
    @XmlAttribute(name = "weight")
    protected String weight;
    @XmlAttribute(name = "includeonbom")
    protected Boolean includeonbom;
    @XmlAttribute(name = "userf1")
    protected String userf1;
    @XmlAttribute(name = "userf2")
    protected String userf2;
    @XmlAttribute(name = "userf3")
    protected String userf3;
    @XmlAttribute(name = "userf4")
    protected String userf4;
    @XmlAttribute(name = "userf5")
    protected String userf5;
    @XmlAttribute(name = "partstatus")
    protected String partstatus;
    @XmlAttribute(name = "multstriplength")
    protected String multstriplength;
    @XmlAttribute(name = "striplength")
    protected String striplength;
    @XmlAttribute(name = "specification")
    protected String specification;
    @XmlAttribute(name = "graphics")
    protected Boolean graphics;
    @XmlAttribute(name = "addon")
    protected String addon;
    @XmlAttribute(name = "knockoff")
    protected String knockoff;
    @XmlAttribute(name = "cavityqt")
    @XmlSchemaType(name = "unsignedInt")
    protected Long cavityqt;
    @XmlAttribute(name = "matinghalf")
    protected String matinghalf;
    @XmlAttribute(name = "testblock")
    protected String testblock;
    @XmlAttribute(name = "backshell")
    protected String backshell;
    @XmlAttribute(name = "connectoropen")
    protected String connectoropen;
    @XmlAttribute(name = "numlocks")
    @XmlSchemaType(name = "unsignedInt")
    protected Long numlocks;
    @XmlAttribute(name = "outsidediameter")
    protected String outsidediameter;
    @XmlAttribute(name = "pingroup")
    protected String pingroup;
    @XmlAttribute(name = "domainname")
    protected String domainname;
    @XmlAttribute(name = "domainref")
    protected String domainref;
    @XmlAttribute(name = "revisiongrp_id")
    protected String revisiongrpId;
    @XmlAttribute(name = "latest")
    protected Boolean latest;
    @XmlAttribute(name = "architecturalcost")
    protected String architecturalcost;
    @XmlAttribute(name = "partmodified")
    protected Long partmodified;

    /**
     * Gets the value of the librarygraphicOrCustomerpartnumberOrSupplierpartnumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the librarygraphicOrCustomerpartnumberOrSupplierpartnumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibrarygraphicType }
     * {@link CustomerpartnumberType }
     * {@link SupplierpartnumberType }
     * {@link HousingdefinitionType }
     * {@link ChsuserpropertypartType }
     * {@link LibrarycomponentscopeType }
     * {@link LibmodificationhistoryType }
     * 
     * 
     */
    public List<Object> getLibrarygraphicOrCustomerpartnumberOrSupplierpartnumber() {
        if (librarygraphicOrCustomerpartnumberOrSupplierpartnumber == null) {
            librarygraphicOrCustomerpartnumberOrSupplierpartnumber = new ArrayList<Object>();
        }
        return this.librarygraphicOrCustomerpartnumberOrSupplierpartnumber;
    }

    /**
     * 获取libraryobjectId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryobjectId() {
        return libraryobjectId;
    }

    /**
     * 设置libraryobjectId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryobjectId(String value) {
        this.libraryobjectId = value;
    }

    /**
     * 获取librarycolorId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarycolorId() {
        return librarycolorId;
    }

    /**
     * 设置librarycolorId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarycolorId(String value) {
        this.librarycolorId = value;
    }

    /**
     * 获取librarymaterialId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLibrarymaterialId() {
        return librarymaterialId;
    }

    /**
     * 设置librarymaterialId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLibrarymaterialId(Object value) {
        this.librarymaterialId = value;
    }

    /**
     * 获取librarycomponenttypeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarycomponenttypeId() {
        return librarycomponenttypeId;
    }

    /**
     * 设置librarycomponenttypeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarycomponenttypeId(String value) {
        this.librarycomponenttypeId = value;
    }

    /**
     * 获取groupname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaseGroupType }
     *     
     */
    public BaseGroupType getGroupname() {
        return groupname;
    }

    /**
     * 设置groupname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaseGroupType }
     *     
     */
    public void setGroupname(BaseGroupType value) {
        this.groupname = value;
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
     * 获取unitofmeasure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitofmeasure() {
        return unitofmeasure;
    }

    /**
     * 设置unitofmeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitofmeasure(String value) {
        this.unitofmeasure = value;
    }

    /**
     * 获取partnumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnumber() {
        return partnumber;
    }

    /**
     * 设置partnumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnumber(String value) {
        this.partnumber = value;
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

    /**
     * 获取alternatepartnumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternatepartnumber() {
        return alternatepartnumber;
    }

    /**
     * 设置alternatepartnumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternatepartnumber(String value) {
        this.alternatepartnumber = value;
    }

    /**
     * 获取replacedby属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplacedby() {
        return replacedby;
    }

    /**
     * 设置replacedby属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplacedby(String value) {
        this.replacedby = value;
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
     * 获取length属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLength() {
        if (length == null) {
            return "0";
        } else {
            return length;
        }
    }

    /**
     * 设置length属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLength(String value) {
        this.length = value;
    }

    /**
     * 获取partlength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartlength() {
        return partlength;
    }

    /**
     * 设置partlength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartlength(BigDecimal value) {
        this.partlength = value;
    }

    /**
     * 获取width属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        if (width == null) {
            return "0";
        } else {
            return width;
        }
    }

    /**
     * 设置width属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * 获取depth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepth() {
        if (depth == null) {
            return "0";
        } else {
            return depth;
        }
    }

    /**
     * 设置depth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepth(String value) {
        this.depth = value;
    }

    /**
     * 获取weight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        if (weight == null) {
            return "0";
        } else {
            return weight;
        }
    }

    /**
     * 设置weight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * 获取includeonbom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIncludeonbom() {
        if (includeonbom == null) {
            return true;
        } else {
            return includeonbom;
        }
    }

    /**
     * 设置includeonbom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeonbom(Boolean value) {
        this.includeonbom = value;
    }

    /**
     * 获取userf1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserf1() {
        return userf1;
    }

    /**
     * 设置userf1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserf1(String value) {
        this.userf1 = value;
    }

    /**
     * 获取userf2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserf2() {
        return userf2;
    }

    /**
     * 设置userf2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserf2(String value) {
        this.userf2 = value;
    }

    /**
     * 获取userf3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserf3() {
        return userf3;
    }

    /**
     * 设置userf3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserf3(String value) {
        this.userf3 = value;
    }

    /**
     * 获取userf4属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserf4() {
        return userf4;
    }

    /**
     * 设置userf4属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserf4(String value) {
        this.userf4 = value;
    }

    /**
     * 获取userf5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserf5() {
        return userf5;
    }

    /**
     * 设置userf5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserf5(String value) {
        this.userf5 = value;
    }

    /**
     * 获取partstatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartstatus() {
        if (partstatus == null) {
            return "New";
        } else {
            return partstatus;
        }
    }

    /**
     * 设置partstatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartstatus(String value) {
        this.partstatus = value;
    }

    /**
     * 获取multstriplength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultstriplength() {
        if (multstriplength == null) {
            return "0";
        } else {
            return multstriplength;
        }
    }

    /**
     * 设置multstriplength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultstriplength(String value) {
        this.multstriplength = value;
    }

    /**
     * 获取striplength属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStriplength() {
        if (striplength == null) {
            return "0";
        } else {
            return striplength;
        }
    }

    /**
     * 设置striplength属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStriplength(String value) {
        this.striplength = value;
    }

    /**
     * 获取specification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * 设置specification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecification(String value) {
        this.specification = value;
    }

    /**
     * 获取graphics属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isGraphics() {
        if (graphics == null) {
            return false;
        } else {
            return graphics;
        }
    }

    /**
     * 设置graphics属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGraphics(Boolean value) {
        this.graphics = value;
    }

    /**
     * 获取addon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddon() {
        return addon;
    }

    /**
     * 设置addon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddon(String value) {
        this.addon = value;
    }

    /**
     * 获取knockoff属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKnockoff() {
        return knockoff;
    }

    /**
     * 设置knockoff属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKnockoff(String value) {
        this.knockoff = value;
    }

    /**
     * 获取cavityqt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCavityqt() {
        return cavityqt;
    }

    /**
     * 设置cavityqt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCavityqt(Long value) {
        this.cavityqt = value;
    }

    /**
     * 获取matinghalf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatinghalf() {
        return matinghalf;
    }

    /**
     * 设置matinghalf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatinghalf(String value) {
        this.matinghalf = value;
    }

    /**
     * 获取testblock属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestblock() {
        return testblock;
    }

    /**
     * 设置testblock属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestblock(String value) {
        this.testblock = value;
    }

    /**
     * 获取backshell属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackshell() {
        return backshell;
    }

    /**
     * 设置backshell属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackshell(String value) {
        this.backshell = value;
    }

    /**
     * 获取connectoropen属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectoropen() {
        if (connectoropen == null) {
            return "0";
        } else {
            return connectoropen;
        }
    }

    /**
     * 设置connectoropen属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectoropen(String value) {
        this.connectoropen = value;
    }

    /**
     * 获取numlocks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getNumlocks() {
        if (numlocks == null) {
            return  0L;
        } else {
            return numlocks;
        }
    }

    /**
     * 设置numlocks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumlocks(Long value) {
        this.numlocks = value;
    }

    /**
     * 获取outsidediameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsidediameter() {
        if (outsidediameter == null) {
            return "0";
        } else {
            return outsidediameter;
        }
    }

    /**
     * 设置outsidediameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutsidediameter(String value) {
        this.outsidediameter = value;
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
     * 获取domainname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainname() {
        return domainname;
    }

    /**
     * 设置domainname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainname(String value) {
        this.domainname = value;
    }

    /**
     * 获取domainref属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainref() {
        return domainref;
    }

    /**
     * 设置domainref属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainref(String value) {
        this.domainref = value;
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

    /**
     * 获取latest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLatest() {
        if (latest == null) {
            return true;
        } else {
            return latest;
        }
    }

    /**
     * 设置latest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLatest(Boolean value) {
        this.latest = value;
    }

    /**
     * 获取architecturalcost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchitecturalcost() {
        if (architecturalcost == null) {
            return "0";
        } else {
            return architecturalcost;
        }
    }

    /**
     * 设置architecturalcost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchitecturalcost(String value) {
        this.architecturalcost = value;
    }

    /**
     * 获取partmodified属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartmodified() {
        return partmodified;
    }

    /**
     * 设置partmodified属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartmodified(Long value) {
        this.partmodified = value;
    }

}
