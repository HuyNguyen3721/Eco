package com.lam2000.base_module.view.zoomview.movement;

import java.lang.System;

/**
 * Contains:
 *
 * - utilities for transforming zoom
 * - the min and max zoom values
 * - the zoom settings (whether it's enabled or not).
 *
 * Does NOT hold the current zoom value, which is done by the [MatrixController].
 * Holds the current [transformationZoom] so we can convert zoom types.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u0000 B2\u00020\u0001:\u0001BB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u001d\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\tH\u0000\u00a2\u0006\u0002\b4J\b\u00105\u001a\u000206H\u0016J\r\u0010\u0019\u001a\u00020\u0010H\u0000\u00a2\u0006\u0002\b7J\r\u0010#\u001a\u00020\u0010H\u0000\u00a2\u0006\u0002\b8J\u0015\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0010H\u0000\u00a2\u0006\u0002\b;J\u001d\u0010\u001a\u001a\u0002062\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u001dH\u0000\u00a2\u0006\u0002\b=J\u001d\u0010$\u001a\u0002062\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010<\u001a\u00020\u001dH\u0000\u00a2\u0006\u0002\b>J\u0015\u0010?\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\u0010H\u0000\u00a2\u0006\u0002\bAR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\tX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00108@X\u0080\u0004\u00a2\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00108@X\u0080\u0004\u00a2\u0006\f\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u001bR\u001a\u0010%\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b\'\u0010!R\u001a\u0010(\u001a\u00020)X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u0010X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u001b\u00a8\u0006C"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/movement/ZoomManager;", "Lcom/lam2000/base_module/view/zoomview/movement/MovementManager;", "engine", "Lcom/lam2000/base_module/view/zoomview/ZoomEngine;", "provider", "Lkotlin/Function0;", "Lcom/lam2000/base_module/view/zoomview/matrix/MatrixController;", "(Lcom/lam2000/base_module/view/zoomview/ZoomEngine;Lkotlin/jvm/functions/Function0;)V", "isEnabled", "", "()Z", "setEnabled", "(Z)V", "isOverEnabled", "setOverEnabled", "maxOverZoomIn", "", "getMaxOverZoomIn$base_module_debug$annotations", "()V", "getMaxOverZoomIn$base_module_debug", "()F", "maxOverZoomOut", "getMaxOverZoomOut$base_module_debug$annotations", "getMaxOverZoomOut$base_module_debug", "maxZoom", "getMaxZoom", "setMaxZoom", "(F)V", "maxZoomMode", "", "getMaxZoomMode", "()I", "setMaxZoomMode", "(I)V", "minZoom", "getMinZoom", "setMinZoom", "minZoomMode", "getMinZoomMode", "setMinZoomMode", "overZoomRangeProvider", "Lcom/lam2000/base_module/view/zoomview/OverZoomRangeProvider;", "getOverZoomRangeProvider$base_module_debug", "()Lcom/lam2000/base_module/view/zoomview/OverZoomRangeProvider;", "setOverZoomRangeProvider$base_module_debug", "(Lcom/lam2000/base_module/view/zoomview/OverZoomRangeProvider;)V", "transformationZoom", "getTransformationZoom$base_module_debug", "setTransformationZoom$base_module_debug", "checkBounds", "value", "allowOverZoom", "checkBounds$base_module_debug", "clear", "", "getMaxZoom$base_module_debug", "getMinZoom$base_module_debug", "realZoomToZoom", "realZoom", "realZoomToZoom$base_module_debug", "type", "setMaxZoom$base_module_debug", "setMinZoom$base_module_debug", "zoomToRealZoom", "zoom", "zoomToRealZoom$base_module_debug", "Companion", "base-module_debug"})
public final class ZoomManager extends com.lam2000.base_module.view.zoomview.movement.MovementManager {
    private final com.lam2000.base_module.view.zoomview.ZoomEngine engine = null;
    private float transformationZoom = 0.0F;
    private float minZoom = 0.8F;
    private int minZoomMode = 0;
    private float maxZoom = 2.5F;
    private int maxZoomMode = 0;
    @org.jetbrains.annotations.NotNull()
    private com.lam2000.base_module.view.zoomview.OverZoomRangeProvider overZoomRangeProvider;
    private boolean isEnabled = true;
    private boolean isOverEnabled = true;
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.view.zoomview.movement.ZoomManager.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private static final com.lam2000.base_module.view.zoomview.ZoomLogger LOG = null;
    
    public ZoomManager(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.ZoomEngine engine, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<com.lam2000.base_module.view.zoomview.matrix.MatrixController> provider) {
        super(null);
    }
    
    public final float getTransformationZoom$base_module_debug() {
        return 0.0F;
    }
    
    public final void setTransformationZoom$base_module_debug(float p0) {
    }
    
    public final float getMinZoom() {
        return 0.0F;
    }
    
    public final void setMinZoom(float p0) {
    }
    
    public final int getMinZoomMode() {
        return 0;
    }
    
    public final void setMinZoomMode(int p0) {
    }
    
    public final float getMaxZoom() {
        return 0.0F;
    }
    
    public final void setMaxZoom(float p0) {
    }
    
    public final int getMaxZoomMode() {
        return 0;
    }
    
    public final void setMaxZoomMode(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.zoomview.OverZoomRangeProvider getOverZoomRangeProvider$base_module_debug() {
        return null;
    }
    
    public final void setOverZoomRangeProvider$base_module_debug(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.OverZoomRangeProvider p0) {
    }
    
    @java.lang.Override()
    public boolean isEnabled() {
        return false;
    }
    
    public void setEnabled(boolean p0) {
    }
    
    @java.lang.Override()
    public boolean isOverEnabled() {
        return false;
    }
    
    public void setOverEnabled(boolean p0) {
    }
    
    /**
     * Clears the current variable state, that is,
     * resets [transformationZoom].
     */
    @java.lang.Override()
    public void clear() {
    }
    
    /**
     * Transforms a [ZoomApi.RealZoom] into a [ZoomApi.Zoom].
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
    public final float realZoomToZoom$base_module_debug(@com.lam2000.base_module.view.zoomview.ZoomApi.RealZoom()
    float realZoom) {
        return 0.0F;
    }
    
    /**
     * Transforms a [ZoomApi.Zoom] into a [ZoomApi.RealZoom].
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.RealZoom()
    public final float zoomToRealZoom$base_module_debug(@com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
    float zoom) {
        return 0.0F;
    }
    
    /**
     * Sets the maximum zoom and type allowed.
     */
    public final void setMaxZoom$base_module_debug(float maxZoom, @com.lam2000.base_module.view.zoomview.ZoomApi.ZoomType()
    int type) {
    }
    
    /**
     * Sets the minimum zoom and type allowed.
     */
    public final void setMinZoom$base_module_debug(float minZoom, @com.lam2000.base_module.view.zoomview.ZoomApi.ZoomType()
    int type) {
    }
    
    /**
     * The amount of overzoom that is allowed in inwards direction.
     * This value is calculated by the [overZoomRangeProvider].
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.RealZoom()
    @java.lang.Deprecated()
    public static void getMaxOverZoomIn$base_module_debug$annotations() {
    }
    
    public final float getMaxOverZoomIn$base_module_debug() {
        return 0.0F;
    }
    
    /**
     * The amount of overzoom that is allowed in outwards direction.
     * This value is calculated by the [overZoomRangeProvider].
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.RealZoom()
    @java.lang.Deprecated()
    public static void getMaxOverZoomOut$base_module_debug$annotations() {
    }
    
    public final float getMaxOverZoomOut$base_module_debug() {
        return 0.0F;
    }
    
    /**
     * Returns the current minimum zoom as a [ZoomApi.RealZoom] value.
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.RealZoom()
    public final float getMinZoom$base_module_debug() {
        return 0.0F;
    }
    
    /**
     * Returns the current maximum zoom as a [ZoomApi.RealZoom] value.
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.RealZoom()
    public final float getMaxZoom$base_module_debug() {
        return 0.0F;
    }
    
    /**
     * Checks if the passed in zoom level is in expected bounds.
     *
     * @param value the zoom level to check
     * @param allowOverZoom set to true if zoom values within overpinch range should be considered valid
     * @return the zoom level that will lead into a valid state when applied.
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.RealZoom()
    public final float checkBounds$base_module_debug(@com.lam2000.base_module.view.zoomview.ZoomApi.RealZoom()
    float value, boolean allowOverZoom) {
        return 0.0F;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/movement/ZoomManager$Companion;", "", "()V", "LOG", "Lcom/lam2000/base_module/view/zoomview/ZoomLogger;", "TAG", "", "kotlin.jvm.PlatformType", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}