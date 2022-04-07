package com.lam2000.base_module.view.zoomview.matrix;

import java.lang.System;

/**
 * Represents an update request.
 * Use [obtain] to create a new one.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0000\u0018\u0000 &2\u00020\u0001:\u0002%&B_\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0010R\u0014\u0010\f\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0014\u0010\u000f\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$\u00a8\u0006\'"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/matrix/MatrixUpdate;", "", "zoom", "", "isZoomRelative", "", "canOverZoom", "pan", "Lcom/lam2000/base_module/view/zoomview/AbsolutePoint;", "scaledPan", "Lcom/lam2000/base_module/view/zoomview/ScaledPoint;", "isPanRelative", "canOverPan", "pivotX", "pivotY", "notify", "(FZZLcom/lam2000/base_module/view/zoomview/AbsolutePoint;Lcom/lam2000/base_module/view/zoomview/ScaledPoint;ZZLjava/lang/Float;Ljava/lang/Float;Z)V", "getCanOverPan$base_module_debug", "()Z", "getCanOverZoom$base_module_debug", "hasPan", "getHasPan$base_module_debug", "hasZoom", "getHasZoom$base_module_debug", "isPanRelative$base_module_debug", "isZoomRelative$base_module_debug", "getNotify$base_module_debug", "getPan$base_module_debug", "()Lcom/lam2000/base_module/view/zoomview/AbsolutePoint;", "getPivotX$base_module_debug", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getPivotY$base_module_debug", "getScaledPan$base_module_debug", "()Lcom/lam2000/base_module/view/zoomview/ScaledPoint;", "getZoom$base_module_debug", "()F", "Builder", "Companion", "base-module_debug"})
public final class MatrixUpdate {
    private final float zoom = 0.0F;
    private final boolean isZoomRelative = false;
    private final boolean canOverZoom = false;
    @org.jetbrains.annotations.Nullable()
    private final com.lam2000.base_module.view.zoomview.AbsolutePoint pan = null;
    @org.jetbrains.annotations.Nullable()
    private final com.lam2000.base_module.view.zoomview.ScaledPoint scaledPan = null;
    private final boolean isPanRelative = false;
    private final boolean canOverPan = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Float pivotX = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Float pivotY = null;
    private final boolean notify = false;
    
    /**
     * Whether this update updates pan.
     */
    private final boolean hasPan = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.view.zoomview.matrix.MatrixUpdate.Companion Companion = null;
    
    private MatrixUpdate(float zoom, boolean isZoomRelative, boolean canOverZoom, com.lam2000.base_module.view.zoomview.AbsolutePoint pan, com.lam2000.base_module.view.zoomview.ScaledPoint scaledPan, boolean isPanRelative, boolean canOverPan, java.lang.Float pivotX, java.lang.Float pivotY, boolean notify) {
        super();
    }
    
    public final float getZoom$base_module_debug() {
        return 0.0F;
    }
    
    public final boolean isZoomRelative$base_module_debug() {
        return false;
    }
    
    public final boolean getCanOverZoom$base_module_debug() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.lam2000.base_module.view.zoomview.AbsolutePoint getPan$base_module_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.lam2000.base_module.view.zoomview.ScaledPoint getScaledPan$base_module_debug() {
        return null;
    }
    
    public final boolean isPanRelative$base_module_debug() {
        return false;
    }
    
    public final boolean getCanOverPan$base_module_debug() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getPivotX$base_module_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getPivotY$base_module_debug() {
        return null;
    }
    
    public final boolean getNotify$base_module_debug() {
        return false;
    }
    
    public final boolean getHasZoom$base_module_debug() {
        return false;
    }
    
    public final boolean getHasPan$base_module_debug() {
        return false;
    }
    
    /**
     * Helps constructing a new update.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u001b\u001a\u00020\u001cH\u0000\u00a2\u0006\u0002\b\u001dJ\u001f\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b!J\u001f\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u00182\u0006\u0010\t\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b!J\u001f\u0010\"\u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b#J\u001f\u0010\"\u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00182\u0006\u0010\t\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b#J#\u0010$\u001a\u00020\u001f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0000\u00a2\u0006\u0004\b%\u0010&J\u001d\u0010\'\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b(J\u001d\u0010)\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b*R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\bR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0015R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/matrix/MatrixUpdate$Builder;", "", "()V", "notify", "", "getNotify$base_module_debug", "()Z", "setNotify$base_module_debug", "(Z)V", "overPan", "getOverPan$base_module_debug", "setOverPan$base_module_debug", "overZoom", "getOverZoom$base_module_debug$annotations", "getOverZoom$base_module_debug", "setOverZoom$base_module_debug", "pan", "Lcom/lam2000/base_module/view/zoomview/AbsolutePoint;", "panRelative", "pivotX", "", "Ljava/lang/Float;", "pivotY", "scaledPan", "Lcom/lam2000/base_module/view/zoomview/ScaledPoint;", "zoom", "zoomRelative", "build", "Lcom/lam2000/base_module/view/zoomview/matrix/MatrixUpdate;", "build$base_module_debug", "panBy", "", "delta", "panBy$base_module_debug", "panTo", "panTo$base_module_debug", "pivot", "pivot$base_module_debug", "(Ljava/lang/Float;Ljava/lang/Float;)V", "zoomBy", "zoomBy$base_module_debug", "zoomTo", "zoomTo$base_module_debug", "base-module_debug"})
    public static final class Builder {
        private float zoom = 0.0F / 0.0F;
        private boolean zoomRelative = false;
        private boolean overZoom = false;
        private com.lam2000.base_module.view.zoomview.AbsolutePoint pan;
        private com.lam2000.base_module.view.zoomview.ScaledPoint scaledPan;
        private boolean panRelative = false;
        private boolean overPan = false;
        private java.lang.Float pivotX;
        private java.lang.Float pivotY;
        private boolean notify = true;
        
        public Builder() {
            super();
        }
        
        public final boolean getOverZoom$base_module_debug() {
            return false;
        }
        
        @kotlin.Suppress(names = {"MemberVisibilityCanBePrivate"})
        @java.lang.Deprecated()
        public static void getOverZoom$base_module_debug$annotations() {
        }
        
        public final void setOverZoom$base_module_debug(boolean p0) {
        }
        
        public final boolean getOverPan$base_module_debug() {
            return false;
        }
        
        public final void setOverPan$base_module_debug(boolean p0) {
        }
        
        public final boolean getNotify$base_module_debug() {
            return false;
        }
        
        public final void setNotify$base_module_debug(boolean p0) {
        }
        
        public final void zoomTo$base_module_debug(float zoom, boolean overZoom) {
        }
        
        @kotlin.Suppress(names = {"unused"})
        public final void zoomBy$base_module_debug(float zoom, boolean overZoom) {
        }
        
        public final void panBy$base_module_debug(@org.jetbrains.annotations.Nullable()
        com.lam2000.base_module.view.zoomview.AbsolutePoint delta, boolean overPan) {
        }
        
        public final void panTo$base_module_debug(@org.jetbrains.annotations.Nullable()
        com.lam2000.base_module.view.zoomview.AbsolutePoint pan, boolean overPan) {
        }
        
        public final void panBy$base_module_debug(@org.jetbrains.annotations.Nullable()
        com.lam2000.base_module.view.zoomview.ScaledPoint delta, boolean overPan) {
        }
        
        public final void panTo$base_module_debug(@org.jetbrains.annotations.Nullable()
        com.lam2000.base_module.view.zoomview.ScaledPoint pan, boolean overPan) {
        }
        
        public final void pivot$base_module_debug(@org.jetbrains.annotations.Nullable()
        java.lang.Float pivotX, @org.jetbrains.annotations.Nullable()
        java.lang.Float pivotY) {
        }
        
        /**
         * Builds a new [MatrixUpdate] with the current
         * options set.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.lam2000.base_module.view.zoomview.matrix.MatrixUpdate build$base_module_debug() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\u0002\b\tH\u0000\u00a2\u0006\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/matrix/MatrixUpdate$Companion;", "", "()V", "obtain", "Lcom/lam2000/base_module/view/zoomview/matrix/MatrixUpdate;", "builder", "Lkotlin/Function1;", "Lcom/lam2000/base_module/view/zoomview/matrix/MatrixUpdate$Builder;", "", "Lkotlin/ExtensionFunctionType;", "obtain$base_module_debug", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Creates a new update by acting on the given [Builder].
         */
        @org.jetbrains.annotations.NotNull()
        public final com.lam2000.base_module.view.zoomview.matrix.MatrixUpdate obtain$base_module_debug(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.lam2000.base_module.view.zoomview.matrix.MatrixUpdate.Builder, kotlin.Unit> builder) {
            return null;
        }
    }
}