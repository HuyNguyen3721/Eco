package com.lam2000.base_module.view.zoomview;

import java.lang.System;

/**
 * This class represents a point on the [ZoomEngine] content surface.
 *
 * It is absolute because it is defined with respect to the content own size & coordinate system,
 * meaning that 0, 0 represents the content top-left corner.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000\u00a2\u0006\u0002\u0010\u0003B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0000J\u001c\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0004\u001a\u00020\u001c2\b\b\u0002\u0010\u0006\u001a\u00020\u001cH\u0007J\u0011\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001cH\u0086\u0002J\u001f\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020 H\u0000\u00a2\u0006\u0002\b#J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020\u0000H\u0086\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b\u00a8\u0006\'"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/AbsolutePoint;", "", "point", "(Lcom/lam2000/base_module/view/zoomview/AbsolutePoint;)V", "x", "", "y", "(FF)V", "getX", "()F", "setX", "(F)V", "getY", "setY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "minus", "absolutePoint", "plus", "set", "", "p", "", "times", "factor", "toScaled", "Lcom/lam2000/base_module/view/zoomview/ScaledPoint;", "scale", "outPoint", "toScaled$base_module_debug", "toString", "", "unaryMinus", "base-module_debug"})
public final class AbsolutePoint {
    private float x;
    private float y;
    
    /**
     * This class represents a point on the [ZoomEngine] content surface.
     *
     * It is absolute because it is defined with respect to the content own size & coordinate system,
     * meaning that 0, 0 represents the content top-left corner.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.zoomview.AbsolutePoint copy(@com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    float x, @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    float y) {
        return null;
    }
    
    /**
     * This class represents a point on the [ZoomEngine] content surface.
     *
     * It is absolute because it is defined with respect to the content own size & coordinate system,
     * meaning that 0, 0 represents the content top-left corner.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    /**
     * This class represents a point on the [ZoomEngine] content surface.
     *
     * It is absolute because it is defined with respect to the content own size & coordinate system,
     * meaning that 0, 0 represents the content top-left corner.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * This class represents a point on the [ZoomEngine] content surface.
     *
     * It is absolute because it is defined with respect to the content own size & coordinate system,
     * meaning that 0, 0 represents the content top-left corner.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public AbsolutePoint() {
        super();
    }
    
    public AbsolutePoint(@com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    float x, @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    float y) {
        super();
    }
    
    public final float component1() {
        return 0.0F;
    }
    
    public final float getX() {
        return 0.0F;
    }
    
    public final void setX(float p0) {
    }
    
    public final float component2() {
        return 0.0F;
    }
    
    public final float getY() {
        return 0.0F;
    }
    
    public final void setY(float p0) {
    }
    
    /**
     * Copy constructor
     *
     * @param point point to duplicate
     */
    public AbsolutePoint(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.AbsolutePoint point) {
        super();
    }
    
    /**
     * Set new coordinates
     *
     * @param x x-axis value
     * @param y y-axis value
     */
    public final void set() {
    }
    
    /**
     * Set new coordinates
     *
     * @param x x-axis value
     * @param y y-axis value
     */
    public final void set(@org.jetbrains.annotations.NotNull()
    @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    java.lang.Number x) {
    }
    
    /**
     * Set new coordinates
     *
     * @param x x-axis value
     * @param y y-axis value
     */
    public final void set(@org.jetbrains.annotations.NotNull()
    @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    java.lang.Number x, @org.jetbrains.annotations.NotNull()
    @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    java.lang.Number y) {
    }
    
    /**
     * Set new coordinates
     *
     * @param p the [AbsolutePoint] to copy values from
     */
    public final void set(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.AbsolutePoint p) {
    }
    
    /**
     * Substract a point from another point
     *
     * @param absolutePoint the point to substract
     */
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.zoomview.AbsolutePoint minus(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.AbsolutePoint absolutePoint) {
        return null;
    }
    
    /**
     * Negate a point
     *
     * @return the negative value of this point
     */
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.zoomview.AbsolutePoint unaryMinus() {
        return null;
    }
    
    /**
     * Add a point to another point
     *
     * @param absolutePoint the point to add
     */
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.zoomview.AbsolutePoint plus(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.AbsolutePoint absolutePoint) {
        return null;
    }
    
    /**
     * Multiply every value in the point by a given factor
     *
     * @param factor the factor to use
     * @return the multiplied point
     */
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.zoomview.AbsolutePoint times(@org.jetbrains.annotations.NotNull()
    java.lang.Number factor) {
        return null;
    }
    
    /**
     * Returns a [ScaledPoint] for this point, assuming that
     * the current zoom level is [scale].
     */
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.zoomview.ScaledPoint toScaled$base_module_debug(float scale, @org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.ScaledPoint outPoint) {
        return null;
    }
}