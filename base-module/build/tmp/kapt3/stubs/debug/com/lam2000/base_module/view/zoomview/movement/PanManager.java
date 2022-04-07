package com.lam2000.base_module.view.zoomview.movement;

import java.lang.System;

/**
 * Contains:
 *
 * - utilities for transforming pan
 * - the pan boundaries and utilities for correcting it
 * - utilities for computing the pan status
 * - the pan settings (whether it's enabled or not).
 *
 * Does NOT hold the current pan values, which is done by the [MatrixController].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 @2\u00020\u0001:\u0002@AB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J%\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u0013H\u0001\u00a2\u0006\u0002\b6J\u001d\u00107\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u00132\u0006\u00108\u001a\u00020\u0013H\u0001\u00a2\u0006\u0002\b9J\b\u0010:\u001a\u00020;H\u0016J\u001d\u0010<\u001a\u00020;2\u0006\u00105\u001a\u00020\u00132\u0006\u0010=\u001a\u00020>H\u0000\u00a2\u0006\u0002\b?R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u000f8@X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u001a\u0010\u001d\u001a\u00020\u001e8@X\u0080\u0004\u00a2\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001e8@X\u0080\u0004\u00a2\u0006\f\u0012\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R\u001a\u0010&\u001a\u00020\'X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R\u001a\u0010/\u001a\u00020\u0013X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017\u00a8\u0006B"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/movement/PanManager;", "Lcom/lam2000/base_module/view/zoomview/movement/MovementManager;", "engine", "Lcom/lam2000/base_module/view/zoomview/ZoomEngine;", "provider", "Lkotlin/Function0;", "Lcom/lam2000/base_module/view/zoomview/matrix/MatrixController;", "(Lcom/lam2000/base_module/view/zoomview/ZoomEngine;Lkotlin/jvm/functions/Function0;)V", "alignment", "", "getAlignment$base_module_debug", "()I", "setAlignment$base_module_debug", "(I)V", "correction", "Lcom/lam2000/base_module/view/zoomview/ScaledPoint;", "getCorrection$base_module_debug", "()Lcom/lam2000/base_module/view/zoomview/ScaledPoint;", "horizontalOverPanEnabled", "", "getHorizontalOverPanEnabled$base_module_debug", "()Z", "setHorizontalOverPanEnabled$base_module_debug", "(Z)V", "horizontalPanEnabled", "getHorizontalPanEnabled$base_module_debug", "setHorizontalPanEnabled$base_module_debug", "isEnabled", "isOverEnabled", "maxHorizontalOverPan", "", "getMaxHorizontalOverPan$base_module_debug$annotations", "()V", "getMaxHorizontalOverPan$base_module_debug", "()F", "maxVerticalOverPan", "getMaxVerticalOverPan$base_module_debug$annotations", "getMaxVerticalOverPan$base_module_debug", "overPanRangeProvider", "Lcom/lam2000/base_module/view/zoomview/OverPanRangeProvider;", "getOverPanRangeProvider$base_module_debug", "()Lcom/lam2000/base_module/view/zoomview/OverPanRangeProvider;", "setOverPanRangeProvider$base_module_debug", "(Lcom/lam2000/base_module/view/zoomview/OverPanRangeProvider;)V", "verticalOverPanEnabled", "getVerticalOverPanEnabled$base_module_debug", "setVerticalOverPanEnabled$base_module_debug", "verticalPanEnabled", "getVerticalPanEnabled$base_module_debug", "setVerticalPanEnabled$base_module_debug", "applyGravity", "gravity", "extraSpace", "horizontal", "applyGravity$base_module_debug", "checkBounds", "allowOverScroll", "checkBounds$base_module_debug", "clear", "", "computeStatus", "output", "Lcom/lam2000/base_module/view/zoomview/movement/PanManager$Status;", "computeStatus$base_module_debug", "Companion", "Status", "base-module_debug"})
public final class PanManager extends com.lam2000.base_module.view.zoomview.movement.MovementManager {
    private final com.lam2000.base_module.view.zoomview.ZoomEngine engine = null;
    private boolean horizontalOverPanEnabled = true;
    private boolean verticalOverPanEnabled = true;
    private boolean horizontalPanEnabled = true;
    private boolean verticalPanEnabled = true;
    private int alignment = 51;
    @org.jetbrains.annotations.NotNull()
    private com.lam2000.base_module.view.zoomview.OverPanRangeProvider overPanRangeProvider;
    
    /**
     * The scaled correction that should be applied to the content in order
     * to respect the constraints (e.g. boundaries or special gravity alignments)
     */
    @org.jetbrains.annotations.NotNull()
    private final com.lam2000.base_module.view.zoomview.ScaledPoint correction = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.view.zoomview.movement.PanManager.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private static final com.lam2000.base_module.view.zoomview.ZoomLogger LOG = null;
    
    public PanManager(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.ZoomEngine engine, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<com.lam2000.base_module.view.zoomview.matrix.MatrixController> provider) {
        super(null);
    }
    
    public final boolean getHorizontalOverPanEnabled$base_module_debug() {
        return false;
    }
    
    public final void setHorizontalOverPanEnabled$base_module_debug(boolean p0) {
    }
    
    public final boolean getVerticalOverPanEnabled$base_module_debug() {
        return false;
    }
    
    public final void setVerticalOverPanEnabled$base_module_debug(boolean p0) {
    }
    
    public final boolean getHorizontalPanEnabled$base_module_debug() {
        return false;
    }
    
    public final void setHorizontalPanEnabled$base_module_debug(boolean p0) {
    }
    
    public final boolean getVerticalPanEnabled$base_module_debug() {
        return false;
    }
    
    public final void setVerticalPanEnabled$base_module_debug(boolean p0) {
    }
    
    public final int getAlignment$base_module_debug() {
        return 0;
    }
    
    public final void setAlignment$base_module_debug(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.zoomview.OverPanRangeProvider getOverPanRangeProvider$base_module_debug() {
        return null;
    }
    
    public final void setOverPanRangeProvider$base_module_debug(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.OverPanRangeProvider p0) {
    }
    
    @java.lang.Override()
    public boolean isOverEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    /**
     * Puts minimum, maximum and current values in the [Status] object.
     * Since axes are shifted (pans are negative), min values are related to bottom-right,
     * while max values are related to top-left.
     */
    public final void computeStatus$base_module_debug(boolean horizontal, @org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.movement.PanManager.Status output) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.zoomview.ScaledPoint getCorrection$base_module_debug() {
        return null;
    }
    
    /**
     * Checks the current pan state.
     *
     * @param horizontal true when checking horizontal pan, false for vertical
     * @param allowOverScroll set to true if pan values within overscroll range should be considered valid
     *
     * @return the pan correction to be applied to get into a valid state (0 if valid already)
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.ScaledPan()
    @android.annotation.SuppressLint(value = {"RtlHardcoded"})
    public final float checkBounds$base_module_debug(boolean horizontal, boolean allowOverScroll) {
        return 0.0F;
    }
    
    /**
     * The amount of overscroll that is allowed in horizontal direction.
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.ScaledPan()
    @java.lang.Deprecated()
    public static void getMaxHorizontalOverPan$base_module_debug$annotations() {
    }
    
    public final float getMaxHorizontalOverPan$base_module_debug() {
        return 0.0F;
    }
    
    /**
     * The amount of overscroll that is allowed in vertical direction.
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.ScaledPan()
    @java.lang.Deprecated()
    public static void getMaxVerticalOverPan$base_module_debug$annotations() {
    }
    
    public final float getMaxVerticalOverPan$base_module_debug() {
        return 0.0F;
    }
    
    /**
     * Returns 0 for 'start' gravities, [extraSpace] for 'end' gravities, and half of it
     * for 'center' gravities.
     */
    @android.annotation.SuppressLint(value = {"RtlHardcoded"})
    public final float applyGravity$base_module_debug(int gravity, float extraSpace, boolean horizontal) {
        return 0.0F;
    }
    
    /**
     * Represent a snapshot of the current pan status along some dimension.
     * This can be filled by calling [computeStatus].
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\tR \u0010\u0014\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/movement/PanManager$Status;", "", "()V", "currentValue", "", "getCurrentValue$base_module_debug$annotations", "getCurrentValue$base_module_debug", "()I", "setCurrentValue$base_module_debug", "(I)V", "isInOverPan", "", "isInOverPan$base_module_debug", "()Z", "setInOverPan$base_module_debug", "(Z)V", "maxValue", "getMaxValue$base_module_debug$annotations", "getMaxValue$base_module_debug", "setMaxValue$base_module_debug", "minValue", "getMinValue$base_module_debug$annotations", "getMinValue$base_module_debug", "setMinValue$base_module_debug", "base-module_debug"})
    public static final class Status {
        private int minValue = 0;
        private int currentValue = 0;
        private int maxValue = 0;
        private boolean isInOverPan = false;
        
        public Status() {
            super();
        }
        
        public final int getMinValue$base_module_debug() {
            return 0;
        }
        
        @com.lam2000.base_module.view.zoomview.ZoomApi.ScaledPan()
        @java.lang.Deprecated()
        public static void getMinValue$base_module_debug$annotations() {
        }
        
        public final void setMinValue$base_module_debug(int p0) {
        }
        
        public final int getCurrentValue$base_module_debug() {
            return 0;
        }
        
        @com.lam2000.base_module.view.zoomview.ZoomApi.ScaledPan()
        @java.lang.Deprecated()
        public static void getCurrentValue$base_module_debug$annotations() {
        }
        
        public final void setCurrentValue$base_module_debug(int p0) {
        }
        
        public final int getMaxValue$base_module_debug() {
            return 0;
        }
        
        @com.lam2000.base_module.view.zoomview.ZoomApi.ScaledPan()
        @java.lang.Deprecated()
        public static void getMaxValue$base_module_debug$annotations() {
        }
        
        public final void setMaxValue$base_module_debug(int p0) {
        }
        
        public final boolean isInOverPan$base_module_debug() {
            return false;
        }
        
        public final void setInOverPan$base_module_debug(boolean p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/movement/PanManager$Companion;", "", "()V", "LOG", "Lcom/lam2000/base_module/view/zoomview/ZoomLogger;", "TAG", "", "kotlin.jvm.PlatformType", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}