package com.lam2000.base_module.view.zoomview.matrix;

import java.lang.System;

/**
 * Applies changes to the matrix, holds the content and container sizes and
 * transformed rects, dispatches updates.
 *
 * It also uses [StateController] because it can start (and end) animations.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 o2\u00020\u0001:\u0002noB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0015\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0001\u00a2\u0006\u0002\bQJ&\u0010M\u001a\u00020N2\u0017\u0010O\u001a\u0013\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020N0R\u00a2\u0006\u0002\bTH\u0000\u00a2\u0006\u0002\bQJ\u0015\u0010U\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0000\u00a2\u0006\u0002\bVJ&\u0010U\u001a\u00020N2\u0017\u0010O\u001a\u0013\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020N0R\u00a2\u0006\u0002\bTH\u0000\u00a2\u0006\u0002\bVJ\r\u0010W\u001a\u00020NH\u0000\u00a2\u0006\u0002\bXJ\r\u0010Y\u001a\u00020NH\u0000\u00a2\u0006\u0002\bZJ\b\u0010[\u001a\u00020NH\u0002J\u0010\u0010\\\u001a\u00020N2\u0006\u0010]\u001a\u00020-H\u0002J\u0018\u0010^\u001a\u00020N2\u0006\u0010_\u001a\u00020\u00172\u0006\u0010`\u001a\u00020-H\u0002J\u0015\u0010a\u001a\u00020-2\u0006\u0010b\u001a\u00020cH\u0000\u00a2\u0006\u0002\bdJ\u0015\u0010e\u001a\u00020N2\u0006\u0010b\u001a\u00020cH\u0000\u00a2\u0006\u0002\bfJ%\u0010g\u001a\u00020N2\u0006\u0010h\u001a\u00020\u00172\u0006\u0010i\u001a\u00020\u00172\u0006\u0010`\u001a\u00020-H\u0000\u00a2\u0006\u0002\bjJ%\u0010k\u001a\u00020N2\u0006\u0010h\u001a\u00020\u00172\u0006\u0010i\u001a\u00020\u00172\u0006\u0010`\u001a\u00020-H\u0000\u00a2\u0006\u0002\blJ\b\u0010m\u001a\u00020NH\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017@BX\u0080\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017@BX\u0080\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u00178@X\u0080\u0004\u00a2\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u001aR\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020\u00178@X\u0080\u0004\u00a2\u0006\f\u0012\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010\u001aR\u000e\u0010&\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\'\u001a\u00020\u00178@X\u0080\u0004\u00a2\u0006\f\u0012\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010\u001aR\u001a\u0010*\u001a\u00020\u00178@X\u0080\u0004\u00a2\u0006\f\u0012\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010\u001aR\u001e\u0010.\u001a\u00020-2\u0006\u0010\u0016\u001a\u00020-@BX\u0080\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u00101\u001a\u0002028@X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u00105\u001a\u0002068@X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\u00178@X\u0080\u0004\u00a2\u0006\f\u0012\u0004\b:\u0010\u001f\u001a\u0004\b;\u0010\u001aR\u001a\u0010<\u001a\u00020\u00178@X\u0080\u0004\u00a2\u0006\f\u0012\u0004\b=\u0010\u001f\u001a\u0004\b>\u0010\u001aR\u0016\u0010?\u001a\u00020@8@X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u001a\u0010C\u001a\u00020\u00178@X\u0080\u0004\u00a2\u0006\f\u0012\u0004\bD\u0010\u001f\u001a\u0004\bE\u0010\u001aR\u001a\u0010F\u001a\u00020\u00178@X\u0080\u0004\u00a2\u0006\f\u0012\u0004\bG\u0010\u001f\u001a\u0004\bH\u0010\u001aR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u000202X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010J\u001a\u00020\u00178@X\u0080\u0004\u00a2\u0006\f\u0012\u0004\bK\u0010\u001f\u001a\u0004\bL\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006p"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/matrix/MatrixController;", "", "zoomManager", "Lcom/lam2000/base_module/view/zoomview/movement/ZoomManager;", "panManager", "Lcom/lam2000/base_module/view/zoomview/movement/PanManager;", "stateController", "Lcom/lam2000/base_module/view/zoomview/StateController;", "callback", "Lcom/lam2000/base_module/view/zoomview/matrix/MatrixController$Callback;", "(Lcom/lam2000/base_module/view/zoomview/movement/ZoomManager;Lcom/lam2000/base_module/view/zoomview/movement/PanManager;Lcom/lam2000/base_module/view/zoomview/StateController;Lcom/lam2000/base_module/view/zoomview/matrix/MatrixController$Callback;)V", "activeAnimators", "", "Landroid/animation/ValueAnimator;", "animationDuration", "", "getAnimationDuration$base_module_debug", "()J", "setAnimationDuration$base_module_debug", "(J)V", "cancelAnimationListener", "Landroid/animation/AnimatorListenerAdapter;", "<set-?>", "", "containerHeight", "getContainerHeight$base_module_debug", "()F", "containerWidth", "getContainerWidth$base_module_debug", "contentHeight", "getContentHeight$base_module_debug$annotations", "()V", "getContentHeight$base_module_debug", "contentRect", "Landroid/graphics/RectF;", "contentScaledHeight", "getContentScaledHeight$base_module_debug$annotations", "getContentScaledHeight$base_module_debug", "contentScaledRect", "contentScaledWidth", "getContentScaledWidth$base_module_debug$annotations", "getContentScaledWidth$base_module_debug", "contentWidth", "getContentWidth$base_module_debug$annotations", "getContentWidth$base_module_debug", "", "isInitialized", "isInitialized$base_module_debug", "()Z", "matrix", "Landroid/graphics/Matrix;", "getMatrix$base_module_debug", "()Landroid/graphics/Matrix;", "pan", "Lcom/lam2000/base_module/view/zoomview/AbsolutePoint;", "getPan$base_module_debug", "()Lcom/lam2000/base_module/view/zoomview/AbsolutePoint;", "panX", "getPanX$base_module_debug$annotations", "getPanX$base_module_debug", "panY", "getPanY$base_module_debug$annotations", "getPanY$base_module_debug", "scaledPan", "Lcom/lam2000/base_module/view/zoomview/ScaledPoint;", "getScaledPan$base_module_debug", "()Lcom/lam2000/base_module/view/zoomview/ScaledPoint;", "scaledPanX", "getScaledPanX$base_module_debug$annotations", "getScaledPanX$base_module_debug", "scaledPanY", "getScaledPanY$base_module_debug$annotations", "getScaledPanY$base_module_debug", "stub", "zoom", "getZoom$base_module_debug$annotations", "getZoom$base_module_debug", "animateUpdate", "", "update", "Lcom/lam2000/base_module/view/zoomview/matrix/MatrixUpdate;", "animateUpdate$base_module_debug", "Lkotlin/Function1;", "Lcom/lam2000/base_module/view/zoomview/matrix/MatrixUpdate$Builder;", "Lkotlin/ExtensionFunctionType;", "applyUpdate", "applyUpdate$base_module_debug", "cancelAnimations", "cancelAnimations$base_module_debug", "clear", "clear$base_module_debug", "dispatch", "ensurePan", "allowOverPan", "onSizeChanged", "oldZoom", "forceReset", "post", "action", "Ljava/lang/Runnable;", "post$base_module_debug", "postOnAnimation", "postOnAnimation$base_module_debug", "setContainerSize", "width", "height", "setContainerSize$base_module_debug", "setContentSize", "setContentSize$base_module_debug", "sync", "Callback", "Companion", "base-module_debug"})
public final class MatrixController {
    private final com.lam2000.base_module.view.zoomview.movement.ZoomManager zoomManager = null;
    private final com.lam2000.base_module.view.zoomview.movement.PanManager panManager = null;
    private final com.lam2000.base_module.view.zoomview.StateController stateController = null;
    private final com.lam2000.base_module.view.zoomview.matrix.MatrixController.Callback callback = null;
    private android.graphics.RectF contentScaledRect;
    private android.graphics.RectF contentRect;
    private android.graphics.Matrix stub;
    private boolean isInitialized = false;
    
    /**
     * Returns the current matrix. This can be changed from the outside, but is not
     * guaranteed to remain stable.
     *
     * @return the current matrix.
     */
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Matrix matrix = null;
    
    /**
     * Returns the container width as passed to [setContainerSize].
     * @return the current width
     */
    private float containerWidth = 0.0F;
    
    /**
     * Returns the container height as passed to [setContainerSize].
     * @return the current height
     */
    private float containerHeight = 0.0F;
    
    /**
     * The current pan as a [ScaledPoint]
     * This field will be updated according to current scaled pan when accessed.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.lam2000.base_module.view.zoomview.ScaledPoint scaledPan = null;
    
    /**
     * The current pan as an [AbsolutePoint].
     * This field will be updated according to current pan when accessed.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.lam2000.base_module.view.zoomview.AbsolutePoint pan = null;
    private long animationDuration = 280L;
    private final java.util.Set<android.animation.ValueAnimator> activeAnimators = null;
    private final android.animation.AnimatorListenerAdapter cancelAnimationListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.view.zoomview.matrix.MatrixController.Companion Companion = null;
    private static final java.lang.String TAG = null;
    private static final com.lam2000.base_module.view.zoomview.ZoomLogger LOG = null;
    private static final android.view.animation.AccelerateDecelerateInterpolator ANIMATION_INTERPOLATOR = null;
    
    public MatrixController(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.movement.ZoomManager zoomManager, @org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.movement.PanManager panManager, @org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.StateController stateController, @org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.matrix.MatrixController.Callback callback) {
        super();
    }
    
    public final boolean isInitialized$base_module_debug() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Matrix getMatrix$base_module_debug() {
        return null;
    }
    
    @com.lam2000.base_module.view.zoomview.ZoomApi.ScaledPan()
    @java.lang.Deprecated()
    public static void getContentScaledWidth$base_module_debug$annotations() {
    }
    
    public final float getContentScaledWidth$base_module_debug() {
        return 0.0F;
    }
    
    @com.lam2000.base_module.view.zoomview.ZoomApi.ScaledPan()
    @java.lang.Deprecated()
    public static void getContentScaledHeight$base_module_debug$annotations() {
    }
    
    public final float getContentScaledHeight$base_module_debug() {
        return 0.0F;
    }
    
    /**
     * Returns the content width as passed to [setContentSize].
     * @return the current width
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    @java.lang.Deprecated()
    public static void getContentWidth$base_module_debug$annotations() {
    }
    
    public final float getContentWidth$base_module_debug() {
        return 0.0F;
    }
    
    /**
     * Returns the content height as passed to [setContentSize].
     * @return the current height
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    @java.lang.Deprecated()
    public static void getContentHeight$base_module_debug$annotations() {
    }
    
    public final float getContentHeight$base_module_debug() {
        return 0.0F;
    }
    
    public final float getContainerWidth$base_module_debug() {
        return 0.0F;
    }
    
    public final float getContainerHeight$base_module_debug() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.zoomview.ScaledPoint getScaledPan$base_module_debug() {
        return null;
    }
    
    /**
     * The current horizontal scaled pan, which is the pan position of the content
     * according to the current zoom value (so it's scaled).
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.ScaledPan()
    @java.lang.Deprecated()
    public static void getScaledPanX$base_module_debug$annotations() {
    }
    
    public final float getScaledPanX$base_module_debug() {
        return 0.0F;
    }
    
    /**
     * The current vertical scaled pan, which is the pan position of the content
     * according to the current zoom value (so it's scaled).
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.ScaledPan()
    @java.lang.Deprecated()
    public static void getScaledPanY$base_module_debug$annotations() {
    }
    
    public final float getScaledPanY$base_module_debug() {
        return 0.0F;
    }
    
    /**
     * Gets the current zoom value.
     * This value will match the scaleX - scaleY values you get into the [Matrix],
     * and is the actual scale value of the content from its original size.
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.RealZoom()
    @java.lang.Deprecated()
    public static void getZoom$base_module_debug$annotations() {
    }
    
    public final float getZoom$base_module_debug() {
        return 0.0F;
    }
    
    /**
     * Returns the current horizontal pan value, in content coordinates
     * (that is, as if there was no zoom at all) referring to what was passed
     * to [setContentSize].
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    @java.lang.Deprecated()
    public static void getPanX$base_module_debug$annotations() {
    }
    
    public final float getPanX$base_module_debug() {
        return 0.0F;
    }
    
    /**
     * Returns the current vertical pan value, in content coordinates
     * (that is, as if there was no zoom at all) referring to what was passed
     * to [setContentSize].
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    @java.lang.Deprecated()
    public static void getPanY$base_module_debug$annotations() {
    }
    
    public final float getPanY$base_module_debug() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.zoomview.AbsolutePoint getPan$base_module_debug() {
        return null;
    }
    
    public final boolean post$base_module_debug(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable action) {
        return false;
    }
    
    public final void postOnAnimation$base_module_debug(@org.jetbrains.annotations.NotNull()
    java.lang.Runnable action) {
    }
    
    /**
     * Clears our state.
     */
    public final void clear$base_module_debug() {
    }
    
    public final void setContentSize$base_module_debug(float width, float height, boolean forceReset) {
    }
    
    public final void setContainerSize$base_module_debug(float width, float height, boolean forceReset) {
    }
    
    private final void onSizeChanged(float oldZoom, boolean forceReset) {
    }
    
    /**
     * Should be called anytime the [stub] matrix is edited or the [contentRect]
     * changes. This updates all the *scaled* values that this class exposes.
     */
    private final void sync() {
    }
    
    private final void dispatch() {
    }
    
    /**
     * Calls [PanManager.checkBounds] on both directions
     * and applies the correction to the matrix if needed.
     */
    private final void ensurePan(boolean allowOverPan) {
    }
    
    /**
     * Builds and applies a [MatrixUpdate].
     */
    public final void applyUpdate$base_module_debug(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.lam2000.base_module.view.zoomview.matrix.MatrixUpdate.Builder, kotlin.Unit> update) {
    }
    
    /**
     * Applies the given [MatrixUpdate].
     */
    public final void applyUpdate$base_module_debug(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.matrix.MatrixUpdate update) {
    }
    
    public final long getAnimationDuration$base_module_debug() {
        return 0L;
    }
    
    public final void setAnimationDuration$base_module_debug(long p0) {
    }
    
    public final void cancelAnimations$base_module_debug() {
    }
    
    /**
     * Builds and applies the given [MatrixUpdate] by calling [applyUpdate]
     * repeatedly until the final position is reached, interpolating in the middle.
     */
    public final void animateUpdate$base_module_debug(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.lam2000.base_module.view.zoomview.matrix.MatrixUpdate.Builder, kotlin.Unit> update) {
    }
    
    /**
     * Calls [applyUpdate] repeatedly until the final position is reached,
     * interpolating in the middle.
     */
    @android.annotation.SuppressLint(value = {"ObjectAnimatorBinding"})
    public final void animateUpdate$base_module_debug(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.matrix.MatrixUpdate update) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\r"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/matrix/MatrixController$Callback;", "", "onMatrixSizeChanged", "", "oldZoom", "", "firstTime", "", "onMatrixUpdate", "post", "action", "Ljava/lang/Runnable;", "postOnAnimation", "base-module_debug"})
    public static abstract interface Callback {
        
        public abstract void onMatrixUpdate();
        
        public abstract void onMatrixSizeChanged(float oldZoom, boolean firstTime);
        
        public abstract boolean post(@org.jetbrains.annotations.NotNull()
        java.lang.Runnable action);
        
        public abstract void postOnAnimation(@org.jetbrains.annotations.NotNull()
        java.lang.Runnable action);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/matrix/MatrixController$Companion;", "", "()V", "ANIMATION_INTERPOLATOR", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "LOG", "Lcom/lam2000/base_module/view/zoomview/ZoomLogger;", "TAG", "", "kotlin.jvm.PlatformType", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}