/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jfree.chart.annotations;

import java.awt.geom.Rectangle2D;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.ui.RectangleEdge;

/**
 *
 * @author paolo
 */
public class XAnchoredAnnotation extends XYTextAnnotation {

    public XAnchoredAnnotation(String text, double y) {
        super(text, Double.NaN, y);
    }

    @Override
    protected float getAnchorX(ValueAxis rangeAxis, Rectangle2D dataArea, RectangleEdge rangeEdge) {
        return (float) rangeAxis.valueToJava2D(rangeAxis.getUpperBound(), dataArea, rangeEdge);
    }

    @Override
    public double getX() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setX(double y) {
        throw new UnsupportedOperationException();
    }
    
    
    
}