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
    "datadictionary",
    "connectionpointOrPropertiedgraphicOrStylingxrefdetailsOrXreftextcontainerOrAttributetextOrDiagramtextOrCompositetextOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrTopoholeOrCrossreferenceable"
})
@XmlRootElement(name = "toposlot")
public class Toposlot {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "baseid")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String baseid;
    @XmlAttribute(name = "connref", required = true)
    @XmlIDREF
    protected Object connref;
    @XmlAttribute(name = "diagramid", required = true)
    @XmlIDREF
    protected Object diagramid;
    @XmlAttribute(name = "crossreferenceable")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String crossreferenceable;
    @XmlAttribute(name = "spacing")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String spacing;
    @XmlAttribute(name = "x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String x;
    @XmlAttribute(name = "y", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String y;
    @XmlAttribute(name = "transform")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String transform;
    @XmlAttribute(name = "visibility")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String visibility;
    @XmlAttribute(name = "layernum")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String layernum;
    @XmlAttribute(name = "attributeref")
    @XmlIDREF
    protected Object attributeref;
    @XmlAttribute(name = "isexcludefromapplystyle")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isexcludefromapplystyle;
    @XmlElement(required = true)
    protected Datadictionary datadictionary;
    @XmlElements({
        @XmlElement(name = "connectionpoint", type = Connectionpoint.class),
        @XmlElement(name = "propertiedgraphic", type = Propertiedgraphic.class),
        @XmlElement(name = "stylingxrefdetails", type = Stylingxrefdetails.class),
        @XmlElement(name = "xreftextcontainer", type = Xreftextcontainer.class),
        @XmlElement(name = "attributetext", type = Attributetext.class),
        @XmlElement(name = "diagramtext", type = Diagramtext.class),
        @XmlElement(name = "compositetext", type = Compositetext.class),
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
        @XmlElement(name = "topohole", type = Topohole.class),
        @XmlElement(name = "crossreferenceable", type = Crossreferenceable.class)
    })
    protected List<Object> connectionpointOrPropertiedgraphicOrStylingxrefdetailsOrXreftextcontainerOrAttributetextOrDiagramtextOrCompositetextOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrTopoholeOrCrossreferenceable;

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
     * Gets the value of the diagramid property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDiagramid() {
        return diagramid;
    }

    /**
     * Sets the value of the diagramid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDiagramid(Object value) {
        this.diagramid = value;
    }

    /**
     * Gets the value of the crossreferenceable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossreferenceable() {
        return crossreferenceable;
    }

    /**
     * Sets the value of the crossreferenceable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossreferenceable(String value) {
        this.crossreferenceable = value;
    }

    /**
     * Gets the value of the spacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpacing() {
        return spacing;
    }

    /**
     * Sets the value of the spacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpacing(String value) {
        this.spacing = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX(String value) {
        this.x = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY(String value) {
        this.y = value;
    }

    /**
     * Gets the value of the transform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransform() {
        if (transform == null) {
            return "1.0 0.0 0.0 1.0 0.0 0.0";
        } else {
            return transform;
        }
    }

    /**
     * Sets the value of the transform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransform(String value) {
        this.transform = value;
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
     * Gets the value of the datadictionary property.
     * 
     * @return
     *     possible object is
     *     {@link Datadictionary }
     *     
     */
    public Datadictionary getDatadictionary() {
        return datadictionary;
    }

    /**
     * Sets the value of the datadictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Datadictionary }
     *     
     */
    public void setDatadictionary(Datadictionary value) {
        this.datadictionary = value;
    }

    /**
     * Gets the value of the connectionpointOrPropertiedgraphicOrStylingxrefdetailsOrXreftextcontainerOrAttributetextOrDiagramtextOrCompositetextOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrTopoholeOrCrossreferenceable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionpointOrPropertiedgraphicOrStylingxrefdetailsOrXreftextcontainerOrAttributetextOrDiagramtextOrCompositetextOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrTopoholeOrCrossreferenceable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionpointOrPropertiedgraphicOrStylingxrefdetailsOrXreftextcontainerOrAttributetextOrDiagramtextOrCompositetextOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrTopoholeOrCrossreferenceable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Connectionpoint }
     * {@link Propertiedgraphic }
     * {@link Stylingxrefdetails }
     * {@link Xreftextcontainer }
     * {@link Attributetext }
     * {@link Diagramtext }
     * {@link Compositetext }
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
     * {@link Topohole }
     * {@link Crossreferenceable }
     * 
     * 
     */
    public List<Object> getConnectionpointOrPropertiedgraphicOrStylingxrefdetailsOrXreftextcontainerOrAttributetextOrDiagramtextOrCompositetextOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrTopoholeOrCrossreferenceable() {
        if (connectionpointOrPropertiedgraphicOrStylingxrefdetailsOrXreftextcontainerOrAttributetextOrDiagramtextOrCompositetextOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrTopoholeOrCrossreferenceable == null) {
            connectionpointOrPropertiedgraphicOrStylingxrefdetailsOrXreftextcontainerOrAttributetextOrDiagramtextOrCompositetextOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrTopoholeOrCrossreferenceable = new ArrayList<Object>();
        }
        return this.connectionpointOrPropertiedgraphicOrStylingxrefdetailsOrXreftextcontainerOrAttributetextOrDiagramtextOrCompositetextOrProptextOrArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharcOrTableOrTablegroupOrTopoholeOrCrossreferenceable;
    }

}
