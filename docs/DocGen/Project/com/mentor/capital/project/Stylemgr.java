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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
    "fontstyle",
    "graphicsstyle",
    "shapestyleOrInsulationrunshapestyleOrInsulationlayershapestyleOrHarnessdesignshapestyleOrLogicdesignshapestyleOrTopodesignshapestyleOrCapitaltopodesignshapestyleOrFunctiondesignshapestyleOrPlatformtopodesignshapestyle",
    "conditionalshapestyle",
    "leaderlinestyle",
    "tablestyleOrDynamictablestyle",
    "quadrantdecorationstyleOrDecorationstyle",
    "linedecorationstyleOrDimensiondecorationstyleOrContiguousdimensiondecorationstyle",
    "segmentdecorationstyle",
    "internodeoptionstyle"
})
@XmlRootElement(name = "stylemgr")
public class Stylemgr {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "modified")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String modified;
    @XmlAttribute(name = "parentid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentid;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    protected List<Fontstyle> fontstyle;
    protected List<Graphicsstyle> graphicsstyle;
    @XmlElements({
        @XmlElement(name = "shapestyle", type = Shapestyle.class),
        @XmlElement(name = "insulationrunshapestyle", type = Insulationrunshapestyle.class),
        @XmlElement(name = "insulationlayershapestyle", type = Insulationlayershapestyle.class),
        @XmlElement(name = "harnessdesignshapestyle", type = Harnessdesignshapestyle.class),
        @XmlElement(name = "logicdesignshapestyle", type = Logicdesignshapestyle.class),
        @XmlElement(name = "topodesignshapestyle", type = Topodesignshapestyle.class),
        @XmlElement(name = "capitaltopodesignshapestyle", type = Capitaltopodesignshapestyle.class),
        @XmlElement(name = "functiondesignshapestyle", type = Functiondesignshapestyle.class),
        @XmlElement(name = "platformtopodesignshapestyle", type = Platformtopodesignshapestyle.class)
    })
    protected List<Object> shapestyleOrInsulationrunshapestyleOrInsulationlayershapestyleOrHarnessdesignshapestyleOrLogicdesignshapestyleOrTopodesignshapestyleOrCapitaltopodesignshapestyleOrFunctiondesignshapestyleOrPlatformtopodesignshapestyle;
    protected List<Conditionalshapestyle> conditionalshapestyle;
    protected List<Leaderlinestyle> leaderlinestyle;
    @XmlElements({
        @XmlElement(name = "tablestyle", type = Tablestyle.class),
        @XmlElement(name = "dynamictablestyle", type = Dynamictablestyle.class)
    })
    protected List<Object> tablestyleOrDynamictablestyle;
    @XmlElements({
        @XmlElement(name = "quadrantdecorationstyle", type = Quadrantdecorationstyle.class),
        @XmlElement(name = "decorationstyle", type = Decorationstyle.class)
    })
    protected List<Object> quadrantdecorationstyleOrDecorationstyle;
    @XmlElements({
        @XmlElement(name = "linedecorationstyle", type = Linedecorationstyle.class),
        @XmlElement(name = "dimensiondecorationstyle", type = Dimensiondecorationstyle.class),
        @XmlElement(name = "contiguousdimensiondecorationstyle", type = Contiguousdimensiondecorationstyle.class)
    })
    protected List<Object> linedecorationstyleOrDimensiondecorationstyleOrContiguousdimensiondecorationstyle;
    protected List<Segmentdecorationstyle> segmentdecorationstyle;
    protected List<Internodeoptionstyle> internodeoptionstyle;

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
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModified(String value) {
        this.modified = value;
    }

    /**
     * Gets the value of the parentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * Sets the value of the parentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentid(String value) {
        this.parentid = value;
    }

    /**
     * Gets the value of the baseid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseid() {
        return baseid;
    }

    /**
     * Sets the value of the baseid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseid(String value) {
        this.baseid = value;
    }

    /**
     * Gets the value of the fontstyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fontstyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFontstyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fontstyle }
     * 
     * 
     */
    public List<Fontstyle> getFontstyle() {
        if (fontstyle == null) {
            fontstyle = new ArrayList<Fontstyle>();
        }
        return this.fontstyle;
    }

    /**
     * Gets the value of the graphicsstyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphicsstyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphicsstyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Graphicsstyle }
     * 
     * 
     */
    public List<Graphicsstyle> getGraphicsstyle() {
        if (graphicsstyle == null) {
            graphicsstyle = new ArrayList<Graphicsstyle>();
        }
        return this.graphicsstyle;
    }

    /**
     * Gets the value of the shapestyleOrInsulationrunshapestyleOrInsulationlayershapestyleOrHarnessdesignshapestyleOrLogicdesignshapestyleOrTopodesignshapestyleOrCapitaltopodesignshapestyleOrFunctiondesignshapestyleOrPlatformtopodesignshapestyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shapestyleOrInsulationrunshapestyleOrInsulationlayershapestyleOrHarnessdesignshapestyleOrLogicdesignshapestyleOrTopodesignshapestyleOrCapitaltopodesignshapestyleOrFunctiondesignshapestyleOrPlatformtopodesignshapestyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShapestyleOrInsulationrunshapestyleOrInsulationlayershapestyleOrHarnessdesignshapestyleOrLogicdesignshapestyleOrTopodesignshapestyleOrCapitaltopodesignshapestyleOrFunctiondesignshapestyleOrPlatformtopodesignshapestyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Shapestyle }
     * {@link Insulationrunshapestyle }
     * {@link Insulationlayershapestyle }
     * {@link Harnessdesignshapestyle }
     * {@link Logicdesignshapestyle }
     * {@link Topodesignshapestyle }
     * {@link Capitaltopodesignshapestyle }
     * {@link Functiondesignshapestyle }
     * {@link Platformtopodesignshapestyle }
     * 
     * 
     */
    public List<Object> getShapestyleOrInsulationrunshapestyleOrInsulationlayershapestyleOrHarnessdesignshapestyleOrLogicdesignshapestyleOrTopodesignshapestyleOrCapitaltopodesignshapestyleOrFunctiondesignshapestyleOrPlatformtopodesignshapestyle() {
        if (shapestyleOrInsulationrunshapestyleOrInsulationlayershapestyleOrHarnessdesignshapestyleOrLogicdesignshapestyleOrTopodesignshapestyleOrCapitaltopodesignshapestyleOrFunctiondesignshapestyleOrPlatformtopodesignshapestyle == null) {
            shapestyleOrInsulationrunshapestyleOrInsulationlayershapestyleOrHarnessdesignshapestyleOrLogicdesignshapestyleOrTopodesignshapestyleOrCapitaltopodesignshapestyleOrFunctiondesignshapestyleOrPlatformtopodesignshapestyle = new ArrayList<Object>();
        }
        return this.shapestyleOrInsulationrunshapestyleOrInsulationlayershapestyleOrHarnessdesignshapestyleOrLogicdesignshapestyleOrTopodesignshapestyleOrCapitaltopodesignshapestyleOrFunctiondesignshapestyleOrPlatformtopodesignshapestyle;
    }

    /**
     * Gets the value of the conditionalshapestyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionalshapestyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionalshapestyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Conditionalshapestyle }
     * 
     * 
     */
    public List<Conditionalshapestyle> getConditionalshapestyle() {
        if (conditionalshapestyle == null) {
            conditionalshapestyle = new ArrayList<Conditionalshapestyle>();
        }
        return this.conditionalshapestyle;
    }

    /**
     * Gets the value of the leaderlinestyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leaderlinestyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeaderlinestyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Leaderlinestyle }
     * 
     * 
     */
    public List<Leaderlinestyle> getLeaderlinestyle() {
        if (leaderlinestyle == null) {
            leaderlinestyle = new ArrayList<Leaderlinestyle>();
        }
        return this.leaderlinestyle;
    }

    /**
     * Gets the value of the tablestyleOrDynamictablestyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tablestyleOrDynamictablestyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTablestyleOrDynamictablestyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tablestyle }
     * {@link Dynamictablestyle }
     * 
     * 
     */
    public List<Object> getTablestyleOrDynamictablestyle() {
        if (tablestyleOrDynamictablestyle == null) {
            tablestyleOrDynamictablestyle = new ArrayList<Object>();
        }
        return this.tablestyleOrDynamictablestyle;
    }

    /**
     * Gets the value of the quadrantdecorationstyleOrDecorationstyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quadrantdecorationstyleOrDecorationstyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuadrantdecorationstyleOrDecorationstyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Quadrantdecorationstyle }
     * {@link Decorationstyle }
     * 
     * 
     */
    public List<Object> getQuadrantdecorationstyleOrDecorationstyle() {
        if (quadrantdecorationstyleOrDecorationstyle == null) {
            quadrantdecorationstyleOrDecorationstyle = new ArrayList<Object>();
        }
        return this.quadrantdecorationstyleOrDecorationstyle;
    }

    /**
     * Gets the value of the linedecorationstyleOrDimensiondecorationstyleOrContiguousdimensiondecorationstyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linedecorationstyleOrDimensiondecorationstyleOrContiguousdimensiondecorationstyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinedecorationstyleOrDimensiondecorationstyleOrContiguousdimensiondecorationstyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linedecorationstyle }
     * {@link Dimensiondecorationstyle }
     * {@link Contiguousdimensiondecorationstyle }
     * 
     * 
     */
    public List<Object> getLinedecorationstyleOrDimensiondecorationstyleOrContiguousdimensiondecorationstyle() {
        if (linedecorationstyleOrDimensiondecorationstyleOrContiguousdimensiondecorationstyle == null) {
            linedecorationstyleOrDimensiondecorationstyleOrContiguousdimensiondecorationstyle = new ArrayList<Object>();
        }
        return this.linedecorationstyleOrDimensiondecorationstyleOrContiguousdimensiondecorationstyle;
    }

    /**
     * Gets the value of the segmentdecorationstyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentdecorationstyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentdecorationstyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Segmentdecorationstyle }
     * 
     * 
     */
    public List<Segmentdecorationstyle> getSegmentdecorationstyle() {
        if (segmentdecorationstyle == null) {
            segmentdecorationstyle = new ArrayList<Segmentdecorationstyle>();
        }
        return this.segmentdecorationstyle;
    }

    /**
     * Gets the value of the internodeoptionstyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internodeoptionstyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternodeoptionstyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Internodeoptionstyle }
     * 
     * 
     */
    public List<Internodeoptionstyle> getInternodeoptionstyle() {
        if (internodeoptionstyle == null) {
            internodeoptionstyle = new ArrayList<Internodeoptionstyle>();
        }
        return this.internodeoptionstyle;
    }

}