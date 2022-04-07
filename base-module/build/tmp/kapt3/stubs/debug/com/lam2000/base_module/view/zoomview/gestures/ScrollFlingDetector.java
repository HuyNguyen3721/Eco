package com.lam2000.base_module.view.zoomview.gestures;

import java.lang.System;

/**
 * Deals with scroll and fling gestures.
 *
 * - Detects them
 * - Checks state using [stateController]
 * - Checks pan using [panManager]
 * - Applies updates using the [matrixController]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\t\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0001?B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\r\u0010\'\u001a\u00020(H\u0000\u00a2\u0006\u0002\b)J\r\u0010*\u001a\u00020(H\u0000\u00a2\u0006\u0002\b+J\b\u0010,\u001a\u00020\u000eH\u0002J\u0015\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020/H\u0000\u00a2\u0006\u0002\b0J\u0010\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020/H\u0016J,\u00103\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010/2\b\u00105\u001a\u0004\u0018\u00010/2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000207H\u0016J\u0012\u00109\u001a\u00020(2\b\u00102\u001a\u0004\u0018\u00010/H\u0016J,\u0010:\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u00010/2\b\u00105\u001a\u0004\u0018\u00010/2\u0006\u0010;\u001a\u0002072\u0006\u0010<\u001a\u000207H\u0016J\u0012\u0010=\u001a\u00020(2\b\u00102\u001a\u0004\u0018\u00010/H\u0016J\u0012\u0010>\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010/H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u000eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u000eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\u000eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R\u001a\u0010$\u001a\u00020\u000eX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012\u00a8\u0006@"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/gestures/ScrollFlingDetector;", "Landroid/view/GestureDetector$OnGestureListener;", "context", "Landroid/content/Context;", "panManager", "Lcom/lam2000/base_module/view/zoomview/movement/PanManager;", "stateController", "Lcom/lam2000/base_module/view/zoomview/StateController;", "matrixController", "Lcom/lam2000/base_module/view/zoomview/matrix/MatrixController;", "(Landroid/content/Context;Lcom/lam2000/base_module/view/zoomview/movement/PanManager;Lcom/lam2000/base_module/view/zoomview/StateController;Lcom/lam2000/base_module/view/zoomview/matrix/MatrixController;)V", "detector", "Landroid/view/GestureDetector;", "flingEnabled", "", "getFlingEnabled$base_module_debug", "()Z", "setFlingEnabled$base_module_debug", "(Z)V", "flingInOverPanEnabled", "getFlingInOverPanEnabled$base_module_debug", "setFlingInOverPanEnabled$base_module_debug", "flingScroller", "Landroid/widget/OverScroller;", "oneFingerScrollEnabled", "getOneFingerScrollEnabled$base_module_debug", "setOneFingerScrollEnabled$base_module_debug", "panStatusX", "Lcom/lam2000/base_module/view/zoomview/movement/PanManager$Status;", "panStatusY", "scrollEnabled", "getScrollEnabled$base_module_debug", "setScrollEnabled$base_module_debug", "threeFingersScrollEnabled", "getThreeFingersScrollEnabled$base_module_debug", "setThreeFingersScrollEnabled$base_module_debug", "twoFingersScrollEnabled", "getTwoFingersScrollEnabled$base_module_debug", "setTwoFingersScrollEnabled$base_module_debug", "cancelFling", "", "cancelFling$base_module_debug", "cancelScroll", "cancelScroll$base_module_debug", "correctOverpan", "maybeStart", "event", "Landroid/view/MotionEvent;", "maybeStart$base_module_debug", "onDown", "e", "onFling", "e1", "e2", "velocityX", "", "velocityY", "onLongPress", "onScroll", "distanceX", "distanceY", "onShowPress", "onSingleTapUp", "Companion", "base-module_debug"})
public final class ScrollFlingDetector implements android.view.GestureDetector.OnGestureListener {
    private final com.lam2000.base_module.view.zoomview.movement.PanManager panManager = null;
    private final com.lam2000.base_module.view.zoomview.StateController stateController = null;
    private final com.lam2000.base_module.view.zoomview.matrix.MatrixController matrixController = null;
    private final android.view.GestureDetector detector = null;
    private final android.widget.OverScroller flingScroller = null;
    private final com.lam2000.base_module.view.zoomview.movement.PanManager.Status panStatusX = null;
    private final com.lam2000.base_module.view.zoomview.movement.PanManager.Status panStatusY = null;
    private boolean flingEnabled = true;
    private boolean scrollEnabled = true;
    private boolean oneFingerScrollEnabled = true;
    private boolean twoFingersScrollEnabled = true;
    private boolean threeFingersScrollEnabled = true;
    private boolean flingInOverPanEnabled = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.view.zoomview.gestures.ScrollFlingDetector.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private static final com.lam2000.base_module.view.zoomview.ZoomLogger LOG = null;
    
    public ScrollFlingDetector(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.movement.PanManager panManager, @org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.StateController stateController, @org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.matrix.MatrixController matrixController) {
        super();
    }
    
    public final boolean getFlingEnabled$base_module_debug() {
        return false;
    }
    
    public final void setFlingEnabled$base_module_debug(boolean p0) {
    }
    
    public final boolean getScrollEnabled$base_module_debug() {
        return false;
    }
    
    public final void setScrollEnabled$base_module_debug(boolean p0) {
    }
    
    public final boolean getOneFingerScrollEnabled$base_module_debug() {
        return false;
    }
    
    public final void setOneFingerScrollEnabled$base_module_debug(boolean p0) {
    }
    
    public final boolean getTwoFingersScrollEnabled$base_module_debug() {
        return false;
    }
    
    public final void setTwoFingersScrollEnabled$base_module_debug(boolean p0) {
    }
    
    public final boolean getThreeFingersScrollEnabled$base_module_debug() {
        return false;
    }
    
    public final void setThreeFingersScrollEnabled$base_module_debug(boolean p0) {
    }
    
    public final boolean getFlingInOverPanEnabled$base_module_debug() {
        return false;
    }
    
    public final void setFlingInOverPanEnabled$base_module_debug(boolean p0) {
    }
    
    /**
     * Starts a pinch gesture or continues an ongoing gesture.
     * Returns true if we are interested in the result.
     */
    public final boolean maybeStart$base_module_debug(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    /**
     * Cancels the current fling gesture. It will be released in the
     * next UI cycle, where we will go to idle state.
     */
    public final void cancelFling$base_module_debug() {
    }
    
    /**
     * Cancels the current scroll gesture. If we are in overpan, this
     * animates back to a reasonable value. Otherwise, just go to
     * idle state.
     */
    public final void cancelScroll$base_module_debug() {
    }
    
    /**
     * Initiates an animation to correct any existing overpan
     * @return true if a correction was initiated, false otherwise
     */
    private final boolean correctOverpan() {
        return false;
    }
    
    @java.lang.Override()
    public boolean onDown(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
        return false;
    }
    
    /**
     * Fling event was detected. Start animating.
     */
    @java.lang.Override()
    public boolean onFling(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e1, @org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
    
    /**
     * Scroll event detected.
     *
     * We assume overScroll is true. If this is the case, it will be reset in [cancelScroll].
     * If not, the applyScaledPan function will ignore our delta.
     *
     * TODO this this not true! ^
     */
    @java.lang.Override()
    public boolean onScroll(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e1, @org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e2, @com.lam2000.base_module.view.zoomview.ZoomApi.ScaledPan()
    float distanceX, @com.lam2000.base_module.view.zoomview.ZoomApi.ScaledPan()
    float distanceY) {
        return false;
    }
    
    @java.lang.Override()
    public void onShowPress(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e) {
    }
    
    @java.lang.Override()
    public boolean onSingleTapUp(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e) {
        return false;
    }
    
    @java.lang.Override()
    public void onLongPress(@org.jetbrains.annotations.Nullable()
    android.view.MotionEvent e) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/gestures/ScrollFlingDetector$Companion;", "", "()V", "LOG", "Lcom/lam2000/base_module/view/zoomview/ZoomLogger;", "TAG", "", "kotlin.jvm.PlatformType", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}