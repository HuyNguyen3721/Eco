package com.lam2000.base_module.view.zoomview.gestures;

import java.lang.System;

/**
 * Deals with pinch gestures.
 *
 * - Detects them
 * - Checks state using [stateController]
 * - Checks zoom using [zoomManager]
 * - Applies updates using the [matrixController]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001#B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0015\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0000\u00a2\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/gestures/PinchDetector;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "context", "Landroid/content/Context;", "zoomManager", "Lcom/lam2000/base_module/view/zoomview/movement/ZoomManager;", "panManager", "Lcom/lam2000/base_module/view/zoomview/movement/PanManager;", "stateController", "Lcom/lam2000/base_module/view/zoomview/StateController;", "matrixController", "Lcom/lam2000/base_module/view/zoomview/matrix/MatrixController;", "(Landroid/content/Context;Lcom/lam2000/base_module/view/zoomview/movement/ZoomManager;Lcom/lam2000/base_module/view/zoomview/movement/PanManager;Lcom/lam2000/base_module/view/zoomview/StateController;Lcom/lam2000/base_module/view/zoomview/matrix/MatrixController;)V", "currentFocusOffset", "Lcom/lam2000/base_module/view/zoomview/AbsolutePoint;", "detector", "Landroid/view/ScaleGestureDetector;", "initialFocusPoint", "computeZoomPivot", "Landroid/graphics/PointF;", "fixPan", "containerPointToContentPoint", "containerPoint", "contentPointToContainerPoint", "contentPoint", "handleOnScaleEnd", "", "maybeStart", "", "event", "Landroid/view/MotionEvent;", "maybeStart$base_module_debug", "onScale", "onScaleBegin", "onScaleEnd", "Companion", "base-module_debug"})
public final class PinchDetector implements android.view.ScaleGestureDetector.OnScaleGestureListener {
    private final com.lam2000.base_module.view.zoomview.movement.ZoomManager zoomManager = null;
    private final com.lam2000.base_module.view.zoomview.movement.PanManager panManager = null;
    private final com.lam2000.base_module.view.zoomview.StateController stateController = null;
    private final com.lam2000.base_module.view.zoomview.matrix.MatrixController matrixController = null;
    private final android.view.ScaleGestureDetector detector = null;
    
    /**
     * Point holding a [AbsolutePan] coordinate
     */
    private final com.lam2000.base_module.view.zoomview.AbsolutePoint initialFocusPoint = null;
    
    /**
     * Indicating the current pan offset introduced by a pinch focus shift as [AbsolutePan] value
     */
    private final com.lam2000.base_module.view.zoomview.AbsolutePoint currentFocusOffset = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.view.zoomview.gestures.PinchDetector.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private static final com.lam2000.base_module.view.zoomview.ZoomLogger LOG = null;
    
    public PinchDetector(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.movement.ZoomManager zoomManager, @org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.movement.PanManager panManager, @org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.StateController stateController, @org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.matrix.MatrixController matrixController) {
        super();
    }
    
    /**
     * Starts a pinch gesture or continues an ongoing gesture.
     * Returns true if we are interested in the result.
     */
    public final boolean maybeStart$base_module_debug(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onScaleBegin(@org.jetbrains.annotations.NotNull()
    android.view.ScaleGestureDetector detector) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onScale(@org.jetbrains.annotations.NotNull()
    android.view.ScaleGestureDetector detector) {
        return false;
    }
    
    /**
     * Resets the fields of this pinch gesture listener
     * to prepare it for the next pinch gesture detection
     * and remove any remaining data from the previous gesture.
     */
    @java.lang.Override()
    public void onScaleEnd(@org.jetbrains.annotations.NotNull()
    android.view.ScaleGestureDetector detector) {
    }
    
    private final void handleOnScaleEnd() {
    }
    
    /**
     * Calculate pivot point to use for zoom based on pan fixes to be applied.
     *
     * @param fixPan the amount of pan to apply to get into a valid state (no overscroll)
     * @return x-axis and y-axis view coordinates
     */
    private final android.graphics.PointF computeZoomPivot(com.lam2000.base_module.view.zoomview.AbsolutePoint fixPan) {
        return null;
    }
    
    /**
     * Calculates the content [AbsolutePoint] value for a container coordinate.
     * This is the reverse operation to [contentPointToContainerPoint].
     *
     * Example:
     * When the viewport is 1000x1000 and the [ZoomLayout] content is 3000x3000 and exactly centered
     * and you call [containerPointToContentPoint(-500,-500)] the result will be 1500x1500
     *
     * @param containerPoint screen point
     * @return the content absolute coordinate
     */
    private final com.lam2000.base_module.view.zoomview.AbsolutePoint containerPointToContentPoint(android.graphics.PointF containerPoint) {
        return null;
    }
    
    /**
     * Calculates the container coordinate from an [AbsolutePoint].
     * This is the reverse operation to [containerPointToContentPoint].
     *
     * @return the container coordinate
     */
    private final android.graphics.PointF contentPointToContainerPoint(com.lam2000.base_module.view.zoomview.AbsolutePoint contentPoint) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/gestures/PinchDetector$Companion;", "", "()V", "LOG", "Lcom/lam2000/base_module/view/zoomview/ZoomLogger;", "TAG", "", "kotlin.jvm.PlatformType", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}