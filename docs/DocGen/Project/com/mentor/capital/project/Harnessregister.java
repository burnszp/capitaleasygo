//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 11:46:37 AM CST 
//


package com.mentor.capital.project;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "scopecode"
})
@XmlRootElement(name = "harnessregister")
public class Harnessregister {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "datum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String datum;
    @XmlAttribute(name = "inteharn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inteharn;
    @XmlAttribute(name = "inteiss")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String inteiss;
    @XmlAttribute(name = "custharn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String custharn;
    @XmlAttribute(name = "custiss")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String custiss;
    @XmlAttribute(name = "source")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String source;
    @XmlAttribute(name = "relstat")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String relstat;
    @XmlAttribute(name = "arcstat")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String arcstat;
    @XmlAttribute(name = "harntype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String harntype;
    @XmlAttribute(name = "boardx")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String boardx;
    @XmlAttribute(name = "boardy")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String boardy;
    @XmlAttribute(name = "datumlen")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String datumlen;
    @XmlAttribute(name = "datumang")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String datumang;
    @XmlAttribute(name = "manual_term")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String manualTerm;
    @XmlAttribute(name = "manual_seal")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String manualSeal;
    @XmlAttribute(name = "parent_harnnum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentHarnnum;
    @XmlAttribute(name = "harnnum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String harnnum;
    @XmlAttribute(name = "module_code")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String moduleCode;
    @XmlAttribute(name = "core_module")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String coreModule;
    @XmlAttribute(name = "weight")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String weight;
    @XmlAttribute(name = "drawtitl")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String drawtitl;
    @XmlAttribute(name = "simcharn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String simcharn;
    @XmlAttribute(name = "simciss")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String simciss;
    @XmlAttribute(name = "simiharn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String simiharn;
    @XmlAttribute(name = "simiiss")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String simiiss;
    @XmlAttribute(name = "copyharn")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String copyharn;
    @XmlAttribute(name = "copyiss")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String copyiss;
    @XmlAttribute(name = "manustat")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String manustat;
    @XmlAttribute(name = "modrange")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modrange;
    @XmlAttribute(name = "lrhand")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String lrhand;
    @XmlAttribute(name = "engsize")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String engsize;
    @XmlAttribute(name = "trimlev")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String trimlev;
    @XmlAttribute(name = "alpha_code")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String alphaCode;
    @XmlAttribute(name = "userf1")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String userf1;
    @XmlAttribute(name = "userf2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String userf2;
    @XmlAttribute(name = "userf3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String userf3;
    @XmlAttribute(name = "userf4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String userf4;
    @XmlAttribute(name = "userf5")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String userf5;
    @XmlAttribute(name = "sitename")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String sitename;
    @XmlAttribute(name = "customername")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String customername;
    @XmlAttribute(name = "compstat")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String compstat;
    @XmlAttribute(name = "branstat")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String branstat;
    @XmlAttribute(name = "change_type")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String changeType;
    @XmlAttribute(name = "module_type")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String moduleType;
    @XmlAttribute(name = "module_type_specifc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String moduleTypeSpecifc;
    @XmlAttribute(name = "tubefactor")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String tubefactor;
    @XmlAttribute(name = "tubefactort")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String tubefactort;
    @XmlAttribute(name = "isdirty")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isdirty;
    @XmlAttribute(name = "intedate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String intedate;
    @XmlAttribute(name = "custdate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String custdate;
    @XmlAttribute(name = "scopedlib")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scopedlib;
    @XmlAttribute(name = "scopedoper")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String scopedoper;
    @XmlAttribute(name = "module_type_specific")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String moduleTypeSpecific;
    protected List<Scopecode> scopecode;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the datum property.
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
     * Sets the value of the datum property.
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
     * Gets the value of the inteharn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteharn() {
        return inteharn;
    }

    /**
     * Sets the value of the inteharn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteharn(String value) {
        this.inteharn = value;
    }

    /**
     * Gets the value of the inteiss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteiss() {
        return inteiss;
    }

    /**
     * Sets the value of the inteiss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteiss(String value) {
        this.inteiss = value;
    }

    /**
     * Gets the value of the custharn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustharn() {
        return custharn;
    }

    /**
     * Sets the value of the custharn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustharn(String value) {
        this.custharn = value;
    }

    /**
     * Gets the value of the custiss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustiss() {
        return custiss;
    }

    /**
     * Sets the value of the custiss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustiss(String value) {
        this.custiss = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the relstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelstat() {
        return relstat;
    }

    /**
     * Sets the value of the relstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelstat(String value) {
        this.relstat = value;
    }

    /**
     * Gets the value of the arcstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcstat() {
        return arcstat;
    }

    /**
     * Sets the value of the arcstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcstat(String value) {
        this.arcstat = value;
    }

    /**
     * Gets the value of the harntype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarntype() {
        return harntype;
    }

    /**
     * Sets the value of the harntype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarntype(String value) {
        this.harntype = value;
    }

    /**
     * Gets the value of the boardx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardx() {
        return boardx;
    }

    /**
     * Sets the value of the boardx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardx(String value) {
        this.boardx = value;
    }

    /**
     * Gets the value of the boardy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardy() {
        return boardy;
    }

    /**
     * Sets the value of the boardy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardy(String value) {
        this.boardy = value;
    }

    /**
     * Gets the value of the datumlen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumlen() {
        return datumlen;
    }

    /**
     * Sets the value of the datumlen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumlen(String value) {
        this.datumlen = value;
    }

    /**
     * Gets the value of the datumang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumang() {
        return datumang;
    }

    /**
     * Sets the value of the datumang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumang(String value) {
        this.datumang = value;
    }

    /**
     * Gets the value of the manualTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManualTerm() {
        return manualTerm;
    }

    /**
     * Sets the value of the manualTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManualTerm(String value) {
        this.manualTerm = value;
    }

    /**
     * Gets the value of the manualSeal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManualSeal() {
        return manualSeal;
    }

    /**
     * Sets the value of the manualSeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManualSeal(String value) {
        this.manualSeal = value;
    }

    /**
     * Gets the value of the parentHarnnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentHarnnum() {
        return parentHarnnum;
    }

    /**
     * Sets the value of the parentHarnnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentHarnnum(String value) {
        this.parentHarnnum = value;
    }

    /**
     * Gets the value of the harnnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarnnum() {
        return harnnum;
    }

    /**
     * Sets the value of the harnnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarnnum(String value) {
        this.harnnum = value;
    }

    /**
     * Gets the value of the moduleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleCode() {
        return moduleCode;
    }

    /**
     * Sets the value of the moduleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleCode(String value) {
        this.moduleCode = value;
    }

    /**
     * Gets the value of the coreModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreModule() {
        return coreModule;
    }

    /**
     * Sets the value of the coreModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreModule(String value) {
        this.coreModule = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
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
     * Gets the value of the drawtitl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawtitl() {
        return drawtitl;
    }

    /**
     * Sets the value of the drawtitl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawtitl(String value) {
        this.drawtitl = value;
    }

    /**
     * Gets the value of the simcharn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimcharn() {
        return simcharn;
    }

    /**
     * Sets the value of the simcharn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimcharn(String value) {
        this.simcharn = value;
    }

    /**
     * Gets the value of the simciss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimciss() {
        return simciss;
    }

    /**
     * Sets the value of the simciss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimciss(String value) {
        this.simciss = value;
    }

    /**
     * Gets the value of the simiharn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimiharn() {
        return simiharn;
    }

    /**
     * Sets the value of the simiharn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimiharn(String value) {
        this.simiharn = value;
    }

    /**
     * Gets the value of the simiiss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimiiss() {
        return simiiss;
    }

    /**
     * Sets the value of the simiiss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimiiss(String value) {
        this.simiiss = value;
    }

    /**
     * Gets the value of the copyharn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyharn() {
        return copyharn;
    }

    /**
     * Sets the value of the copyharn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyharn(String value) {
        this.copyharn = value;
    }

    /**
     * Gets the value of the copyiss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyiss() {
        return copyiss;
    }

    /**
     * Sets the value of the copyiss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyiss(String value) {
        this.copyiss = value;
    }

    /**
     * Gets the value of the manustat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManustat() {
        return manustat;
    }

    /**
     * Sets the value of the manustat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManustat(String value) {
        this.manustat = value;
    }

    /**
     * Gets the value of the modrange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModrange() {
        return modrange;
    }

    /**
     * Sets the value of the modrange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModrange(String value) {
        this.modrange = value;
    }

    /**
     * Gets the value of the lrhand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLrhand() {
        return lrhand;
    }

    /**
     * Sets the value of the lrhand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLrhand(String value) {
        this.lrhand = value;
    }

    /**
     * Gets the value of the engsize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngsize() {
        return engsize;
    }

    /**
     * Sets the value of the engsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngsize(String value) {
        this.engsize = value;
    }

    /**
     * Gets the value of the trimlev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrimlev() {
        return trimlev;
    }

    /**
     * Sets the value of the trimlev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrimlev(String value) {
        this.trimlev = value;
    }

    /**
     * Gets the value of the alphaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphaCode() {
        return alphaCode;
    }

    /**
     * Sets the value of the alphaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlphaCode(String value) {
        this.alphaCode = value;
    }

    /**
     * Gets the value of the userf1 property.
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
     * Sets the value of the userf1 property.
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
     * Gets the value of the userf2 property.
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
     * Sets the value of the userf2 property.
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
     * Gets the value of the userf3 property.
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
     * Sets the value of the userf3 property.
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
     * Gets the value of the userf4 property.
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
     * Sets the value of the userf4 property.
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
     * Gets the value of the userf5 property.
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
     * Sets the value of the userf5 property.
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
     * Gets the value of the sitename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitename() {
        return sitename;
    }

    /**
     * Sets the value of the sitename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitename(String value) {
        this.sitename = value;
    }

    /**
     * Gets the value of the customername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * Sets the value of the customername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomername(String value) {
        this.customername = value;
    }

    /**
     * Gets the value of the compstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompstat() {
        return compstat;
    }

    /**
     * Sets the value of the compstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompstat(String value) {
        this.compstat = value;
    }

    /**
     * Gets the value of the branstat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranstat() {
        return branstat;
    }

    /**
     * Sets the value of the branstat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranstat(String value) {
        this.branstat = value;
    }

    /**
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeType(String value) {
        this.changeType = value;
    }

    /**
     * Gets the value of the moduleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleType() {
        return moduleType;
    }

    /**
     * Sets the value of the moduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleType(String value) {
        this.moduleType = value;
    }

    /**
     * Gets the value of the moduleTypeSpecifc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleTypeSpecifc() {
        return moduleTypeSpecifc;
    }

    /**
     * Sets the value of the moduleTypeSpecifc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleTypeSpecifc(String value) {
        this.moduleTypeSpecifc = value;
    }

    /**
     * Gets the value of the tubefactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTubefactor() {
        return tubefactor;
    }

    /**
     * Sets the value of the tubefactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTubefactor(String value) {
        this.tubefactor = value;
    }

    /**
     * Gets the value of the tubefactort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTubefactort() {
        return tubefactort;
    }

    /**
     * Sets the value of the tubefactort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTubefactort(String value) {
        this.tubefactort = value;
    }

    /**
     * Gets the value of the isdirty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsdirty() {
        if (isdirty == null) {
            return "false";
        } else {
            return isdirty;
        }
    }

    /**
     * Sets the value of the isdirty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsdirty(String value) {
        this.isdirty = value;
    }

    /**
     * Gets the value of the intedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntedate() {
        return intedate;
    }

    /**
     * Sets the value of the intedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntedate(String value) {
        this.intedate = value;
    }

    /**
     * Gets the value of the custdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustdate() {
        return custdate;
    }

    /**
     * Sets the value of the custdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustdate(String value) {
        this.custdate = value;
    }

    /**
     * Gets the value of the scopedlib property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopedlib() {
        return scopedlib;
    }

    /**
     * Sets the value of the scopedlib property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopedlib(String value) {
        this.scopedlib = value;
    }

    /**
     * Gets the value of the scopedoper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopedoper() {
        return scopedoper;
    }

    /**
     * Sets the value of the scopedoper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopedoper(String value) {
        this.scopedoper = value;
    }

    /**
     * Gets the value of the moduleTypeSpecific property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleTypeSpecific() {
        return moduleTypeSpecific;
    }

    /**
     * Sets the value of the moduleTypeSpecific property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleTypeSpecific(String value) {
        this.moduleTypeSpecific = value;
    }

    /**
     * Gets the value of the scopecode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scopecode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScopecode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Scopecode }
     * 
     * 
     */
    public List<Scopecode> getScopecode() {
        if (scopecode == null) {
            scopecode = new ArrayList<Scopecode>();
        }
        return this.scopecode;
    }

}