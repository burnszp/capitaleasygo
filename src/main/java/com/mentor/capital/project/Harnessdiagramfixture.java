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
import javax.xml.bind.annotation.XmlIDREF;
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
    "symboldataOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrStructurenodecomponentplacementOrHarnesselbowcomponentplacementOrDiagramsegmentcomponentplacementOrSegmentcomponentplacementOrHarnessdiagramfixturegfxOrPropertiedgraphicOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrRedsymboldata"
})
@XmlRootElement(name = "harnessdiagramfixture")
public class Harnessdiagramfixture {

    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "connref", required = true)
    @XmlIDREF
    protected Object connref;
    @XmlAttribute(name = "visibility")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visibility;
    @XmlAttribute(name = "layernum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String layernum;
    @XmlAttribute(name = "attributeref")
    @XmlIDREF
    protected Object attributeref;
    @XmlAttribute(name = "parentid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String parentid;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "owningcomponenttype")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String owningcomponenttype;
    @XmlAttribute(name = "datum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String datum;
    @XmlAttribute(name = "datumoffset")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String datumoffset;
    @XmlAttribute(name = "isexcludefromapplystyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isexcludefromapplystyle;
    @XmlElements({
        @XmlElement(name = "symboldata", type = Symboldata.class),
        @XmlElement(name = "attributetext", type = Attributetext.class),
        @XmlElement(name = "diagramtext", type = Diagramtext.class),
        @XmlElement(name = "compositetext", type = Compositetext.class),
        @XmlElement(name = "xreftextcontainer", type = Xreftextcontainer.class),
        @XmlElement(name = "structurenodecomponentplacement", type = Structurenodecomponentplacement.class),
        @XmlElement(name = "harnesselbowcomponentplacement", type = Harnesselbowcomponentplacement.class),
        @XmlElement(name = "diagramsegmentcomponentplacement", type = Diagramsegmentcomponentplacement.class),
        @XmlElement(name = "segmentcomponentplacement", type = Segmentcomponentplacement.class),
        @XmlElement(name = "harnessdiagramfixturegfx", type = Harnessdiagramfixturegfx.class),
        @XmlElement(name = "propertiedgraphic", type = Propertiedgraphic.class),
        @XmlElement(name = "proptext", type = Proptext.class),
        @XmlElement(name = "arc", type = Arc.class),
        @XmlElement(name = "circle", type = Circle.class),
        @XmlElement(name = "comment", type = Comment.class),
        @XmlElement(name = "curve", type = Curve.class),
        @XmlElement(name = "image", type = Image.class),
        @XmlElement(name = "gfxgroup", type = Gfxgroup.class),
        @XmlElement(name = "line", type = Line.class),
        @XmlElement(name = "polygon", type = Polygon.class),
        @XmlElement(name = "polyline", type = Polyline.class),
        @XmlElement(name = "propertiedtext", type = Propertiedtext.class),
        @XmlElement(name = "rectangle", type = Rectangle.class),
        @XmlElement(name = "widtharc", type = Widtharc.class),
        @XmlElement(name = "table", type = Table.class),
        @XmlElement(name = "tablegroup", type = Tablegroup.class),
        @XmlElement(name = "redsymboldata", type = Redsymboldata.class)
    })
    protected List<Object> symboldataOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrStructurenodecomponentplacementOrHarnesselbowcomponentplacementOrDiagramsegmentcomponentplacementOrSegmentcomponentplacementOrHarnessdiagramfixturegfxOrPropertiedgraphicOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrRedsymboldata;

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
     * Gets the value of the connref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getConnref() {
        return connref;
    }

    /**
     * Sets the value of the connref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setConnref(Object value) {
        this.connref = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibility() {
        if (visibility == null) {
            return "true";
        } else {
            return visibility;
        }
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the layernum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayernum() {
        return layernum;
    }

    /**
     * Sets the value of the layernum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayernum(String value) {
        this.layernum = value;
    }

    /**
     * Gets the value of the attributeref property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAttributeref() {
        return attributeref;
    }

    /**
     * Sets the value of the attributeref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAttributeref(Object value) {
        this.attributeref = value;
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
     * Gets the value of the owningcomponenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwningcomponenttype() {
        return owningcomponenttype;
    }

    /**
     * Sets the value of the owningcomponenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwningcomponenttype(String value) {
        this.owningcomponenttype = value;
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
     * Gets the value of the datumoffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumoffset() {
        return datumoffset;
    }

    /**
     * Sets the value of the datumoffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumoffset(String value) {
        this.datumoffset = value;
    }

    /**
     * Gets the value of the isexcludefromapplystyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsexcludefromapplystyle() {
        if (isexcludefromapplystyle == null) {
            return "false";
        } else {
            return isexcludefromapplystyle;
        }
    }

    /**
     * Sets the value of the isexcludefromapplystyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsexcludefromapplystyle(String value) {
        this.isexcludefromapplystyle = value;
    }

    /**
     * Gets the value of the symboldataOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrStructurenodecomponentplacementOrHarnesselbowcomponentplacementOrDiagramsegmentcomponentplacementOrSegmentcomponentplacementOrHarnessdiagramfixturegfxOrPropertiedgraphicOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrRedsymboldata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the symboldataOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrStructurenodecomponentplacementOrHarnesselbowcomponentplacementOrDiagramsegmentcomponentplacementOrSegmentcomponentplacementOrHarnessdiagramfixturegfxOrPropertiedgraphicOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrRedsymboldata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSymboldataOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrStructurenodecomponentplacementOrHarnesselbowcomponentplacementOrDiagramsegmentcomponentplacementOrSegmentcomponentplacementOrHarnessdiagramfixturegfxOrPropertiedgraphicOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrRedsymboldata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Symboldata }
     * {@link Attributetext }
     * {@link Diagramtext }
     * {@link Compositetext }
     * {@link Xreftextcontainer }
     * {@link Structurenodecomponentplacement }
     * {@link Harnesselbowcomponentplacement }
     * {@link Diagramsegmentcomponentplacement }
     * {@link Segmentcomponentplacement }
     * {@link Harnessdiagramfixturegfx }
     * {@link Propertiedgraphic }
     * {@link Proptext }
     * {@link Arc }
     * {@link Circle }
     * {@link Comment }
     * {@link Curve }
     * {@link Image }
     * {@link Gfxgroup }
     * {@link Line }
     * {@link Polygon }
     * {@link Polyline }
     * {@link Propertiedtext }
     * {@link Rectangle }
     * {@link Widtharc }
     * {@link Table }
     * {@link Tablegroup }
     * {@link Redsymboldata }
     * 
     * 
     */
    public List<Object> getSymboldataOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrStructurenodecomponentplacementOrHarnesselbowcomponentplacementOrDiagramsegmentcomponentplacementOrSegmentcomponentplacementOrHarnessdiagramfixturegfxOrPropertiedgraphicOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrRedsymboldata() {
        if (symboldataOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrStructurenodecomponentplacementOrHarnesselbowcomponentplacementOrDiagramsegmentcomponentplacementOrSegmentcomponentplacementOrHarnessdiagramfixturegfxOrPropertiedgraphicOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrRedsymboldata == null) {
            symboldataOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrStructurenodecomponentplacementOrHarnesselbowcomponentplacementOrDiagramsegmentcomponentplacementOrSegmentcomponentplacementOrHarnessdiagramfixturegfxOrPropertiedgraphicOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrRedsymboldata = new ArrayList<Object>();
        }
        return this.symboldataOrAttributetextOrDiagramtextOrCompositetextOrXreftextcontainerOrStructurenodecomponentplacementOrHarnesselbowcomponentplacementOrDiagramsegmentcomponentplacementOrSegmentcomponentplacementOrHarnessdiagramfixturegfxOrPropertiedgraphicOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrRedsymboldata;
    }

}
