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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "arcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharc"
})
@XmlRootElement(name = "zoneareagfx")
public class Zoneareagfx {

    @XmlElements({
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
        @XmlElement(name = "widtharc", type = Widtharc.class)
    })
    protected List<Object> arcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharc;

    /**
     * Gets the value of the arcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
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
     * 
     * 
     */
    public List<Object> getArcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharc() {
        if (arcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharc == null) {
            arcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharc = new ArrayList<Object>();
        }
        return this.arcOrCircleOrCommentOrCurveOrImageOrGfxgroupOrLineOrPolygonOrPolylineOrPropertiedtextOrRectangleOrWidtharc;
    }

}
