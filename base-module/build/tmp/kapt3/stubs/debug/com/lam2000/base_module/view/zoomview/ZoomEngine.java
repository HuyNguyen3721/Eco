package com.lam2000.base_module.view.zoomview;

import java.lang.System;

/**
 * A low level class that listens to touch events and posts zoom and pan updates.
 * The most useful output is a [Matrix] that can be used to do pretty much everything,
 * from canvas drawing to View hierarchies translations.
 *
 * Users are required to:
 * - Pass the container view in the constructor
 * - Notify the helper of the content size, using [setContentSize]
 * - Pass touch events to [onInterceptTouchEvent] and [onTouchEvent]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000 \u009e\u00012\u00020\u0001:\b\u009d\u0001\u009e\u0001\u009f\u0001\u00a0\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u001f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\u000e\u0010M\u001a\u00020N2\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010O\u001a\u00020PH\u0016J\u0006\u0010Q\u001a\u00020NJ\u0006\u0010R\u001a\u00020CJ\u0006\u0010S\u001a\u00020CJ\u0010\u0010T\u001a\u00020C2\u0006\u0010U\u001a\u00020CH\u0003J\b\u0010V\u001a\u000207H\u0002J\b\u0010W\u001a\u00020\u000eH\u0002J\u0006\u0010X\u001a\u00020CJ\u0006\u0010Y\u001a\u00020CJ\b\u0010Z\u001a\u00020\u000eH\u0016J\b\u0010[\u001a\u00020CH\u0016J\b\u0010\\\u001a\u00020\u000eH\u0016J\b\u0010]\u001a\u00020CH\u0016J(\u0010^\u001a\u00020N2\u0006\u0010E\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020\u000e2\u0006\u0010a\u001a\u00020PH\u0016J\u001f\u0010b\u001a\u00020N2\b\u0010E\u001a\u0004\u0018\u00010\u000e2\u0006\u0010a\u001a\u00020PH\u0016\u00a2\u0006\u0002\u0010cJ\u000e\u0010d\u001a\u00020P2\u0006\u0010e\u001a\u00020fJ\u000e\u0010g\u001a\u00020P2\u0006\u0010e\u001a\u00020fJ \u0010h\u001a\u00020N2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010j\u001a\u00020\u000e2\u0006\u0010a\u001a\u00020PH\u0016J \u0010k\u001a\u00020N2\u0006\u0010_\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020\u000e2\u0006\u0010a\u001a\u00020PH\u0016J\u0018\u0010l\u001a\u00020N2\u0006\u00103\u001a\u00020\u000e2\u0006\u0010a\u001a\u00020PH\u0016J\u000e\u0010m\u001a\u00020N2\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010n\u001a\u00020N2\u0006\u0010o\u001a\u00020CH\u0016J\u0010\u0010p\u001a\u00020N2\u0006\u0010q\u001a\u00020PH\u0016J\u0010\u0010r\u001a\u00020N2\u0006\u0010s\u001a\u00020tH\u0016J\u000e\u0010u\u001a\u00020N2\u0006\u0010\u0004\u001a\u00020\u0005J\"\u0010v\u001a\u00020N2\u0006\u0010w\u001a\u00020\u000e2\u0006\u0010x\u001a\u00020\u000e2\b\b\u0002\u0010y\u001a\u00020PH\u0007J\u0010\u0010z\u001a\u00020N2\u0006\u0010{\u001a\u00020|H\u0007J\"\u0010z\u001a\u00020N2\u0006\u0010w\u001a\u00020\u000e2\u0006\u0010x\u001a\u00020\u000e2\b\b\u0002\u0010y\u001a\u00020PH\u0007J\u0010\u0010}\u001a\u00020N2\u0006\u0010~\u001a\u00020PH\u0016J\u0010\u0010\u007f\u001a\u00020N2\u0006\u0010~\u001a\u00020PH\u0016J\u001b\u0010\u0080\u0001\u001a\u00020N2\u0007\u0010\u0081\u0001\u001a\u00020\u000e2\u0007\u0010\u0082\u0001\u001a\u00020CH\u0016J\u001b\u0010\u0083\u0001\u001a\u00020N2\u0007\u0010\u0084\u0001\u001a\u00020\u000e2\u0007\u0010\u0082\u0001\u001a\u00020CH\u0016J\u0011\u0010\u0085\u0001\u001a\u00020N2\u0006\u0010~\u001a\u00020PH\u0016J\u0013\u0010\u0086\u0001\u001a\u00020N2\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0016J\u0012\u0010\u0089\u0001\u001a\u00020N2\u0007\u0010\u008a\u0001\u001a\u00020PH\u0016J\u0012\u0010\u008b\u0001\u001a\u00020N2\u0007\u0010\u008c\u0001\u001a\u00020PH\u0016J\u0012\u0010\u008d\u0001\u001a\u00020N2\u0007\u0010\u008c\u0001\u001a\u00020PH\u0016J\u0013\u0010\u008e\u0001\u001a\u00020N2\b\u0010\u0087\u0001\u001a\u00030\u008f\u0001H\u0016J\u0011\u0010\u0090\u0001\u001a\u00020N2\u0006\u0010~\u001a\u00020PH\u0016J\u0011\u0010\u0091\u0001\u001a\u00020N2\u0006\u0010~\u001a\u00020PH\u0016J\u001b\u0010\u0092\u0001\u001a\u00020N2\u0007\u0010\u0093\u0001\u001a\u00020C2\u0007\u0010\u0094\u0001\u001a\u00020CH\u0016J\u0011\u0010\u0095\u0001\u001a\u00020N2\u0006\u0010~\u001a\u00020PH\u0016J\u0011\u0010\u0096\u0001\u001a\u00020N2\u0006\u0010~\u001a\u00020PH\u0016J\u0011\u0010\u0097\u0001\u001a\u00020N2\u0006\u0010~\u001a\u00020PH\u0016J\u001a\u0010\u0098\u0001\u001a\u00020N2\u0007\u0010\u0099\u0001\u001a\u00020\u000e2\u0006\u0010a\u001a\u00020PH\u0016J\t\u0010\u009a\u0001\u001a\u00020NH\u0016J\t\u0010\u009b\u0001\u001a\u00020NH\u0016J\u0019\u0010\u009c\u0001\u001a\u00020N2\u0006\u0010E\u001a\u00020\u000e2\u0006\u0010a\u001a\u00020PH\u0016R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u000e8F\u00a2\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u000e8F\u00a2\u0006\f\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001c\u0010\u0015R\u0017\u0010\u001d\u001a\u00020\u001e8F\u00a2\u0006\f\u0012\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'R\u0014\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b*\u0010\u0015R\u001a\u0010+\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\f\u0012\u0004\b,\u0010\u0015\u001a\u0004\b-\u0010\u0010R\u001a\u0010.\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\f\u0012\u0004\b/\u0010\u0015\u001a\u0004\b0\u0010\u0010R\u000e\u00101\u001a\u000202X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00103\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\f\u0012\u0004\b4\u0010\u0015\u001a\u0004\b5\u0010\u0010R\u0014\u00106\u001a\u0002078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b;\u0010\u0010R\u0014\u0010<\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b=\u0010\u0010R\u000e\u0010>\u001a\u00020?X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020CX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010E\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\f\u0012\u0004\bF\u0010\u0015\u001a\u0004\bG\u0010\u0010R\u001a\u0010H\u001a\u00020IX\u0080\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bJ\u0010\u0015\u001a\u0004\bK\u0010L\u00a8\u0006\u00a1\u0001"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomEngine;", "Lcom/lam2000/base_module/view/zoomview/ZoomApi;", "context", "Landroid/content/Context;", "container", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "listener", "Lcom/lam2000/base_module/view/zoomview/ZoomEngine$Listener;", "(Landroid/content/Context;Landroid/view/View;Lcom/lam2000/base_module/view/zoomview/ZoomEngine$Listener;)V", "(Landroid/content/Context;)V", "callbacks", "Lcom/lam2000/base_module/view/zoomview/ZoomEngine$Callbacks;", "containerHeight", "", "getContainerHeight", "()F", "containerWidth", "getContainerWidth", "contentHeight", "getContentHeight$annotations", "()V", "getContentHeight", "contentWidth", "getContentWidth$annotations", "getContentWidth", "dispatcher", "Lcom/lam2000/base_module/view/zoomview/UpdatesDispatcher;", "getDispatcher$annotations", "matrix", "Landroid/graphics/Matrix;", "getMatrix$annotations", "getMatrix", "()Landroid/graphics/Matrix;", "matrixController", "Lcom/lam2000/base_module/view/zoomview/matrix/MatrixController;", "pan", "Lcom/lam2000/base_module/view/zoomview/AbsolutePoint;", "getPan", "()Lcom/lam2000/base_module/view/zoomview/AbsolutePoint;", "panManager", "Lcom/lam2000/base_module/view/zoomview/movement/PanManager;", "getPanManager$annotations", "panX", "getPanX$annotations", "getPanX", "panY", "getPanY$annotations", "getPanY", "pinchDetector", "Lcom/lam2000/base_module/view/zoomview/gestures/PinchDetector;", "realZoom", "getRealZoom$annotations", "getRealZoom", "scaledPan", "Lcom/lam2000/base_module/view/zoomview/ScaledPoint;", "getScaledPan", "()Lcom/lam2000/base_module/view/zoomview/ScaledPoint;", "scaledPanX", "getScaledPanX", "scaledPanY", "getScaledPanY", "scrollFlingDetector", "Lcom/lam2000/base_module/view/zoomview/gestures/ScrollFlingDetector;", "stateController", "Lcom/lam2000/base_module/view/zoomview/StateController;", "transformationGravity", "", "transformationType", "zoom", "getZoom$annotations", "getZoom", "zoomManager", "Lcom/lam2000/base_module/view/zoomview/movement/ZoomManager;", "getZoomManager$base_module_debug$annotations", "getZoomManager$base_module_debug", "()Lcom/lam2000/base_module/view/zoomview/movement/ZoomManager;", "addListener", "", "cancelAnimations", "", "clear", "computeHorizontalScrollOffset", "computeHorizontalScrollRange", "computeTransformationGravity", "input", "computeTransformationPan", "computeTransformationZoom", "computeVerticalScrollOffset", "computeVerticalScrollRange", "getMaxZoom", "getMaxZoomType", "getMinZoom", "getMinZoomType", "moveTo", "x", "y", "animate", "moveToCenter", "(Ljava/lang/Float;Z)V", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "panBy", "dx", "dy", "panTo", "realZoomTo", "removeListener", "setAlignment", "alignment", "setAllowFlingInOverscroll", "allow", "setAnimationDuration", "duration", "", "setContainer", "setContainerSize", "width", "height", "applyTransformation", "setContentSize", "rect", "Landroid/graphics/RectF;", "setFlingEnabled", "enabled", "setHorizontalPanEnabled", "setMaxZoom", "maxZoom", "type", "setMinZoom", "minZoom", "setOneFingerScrollEnabled", "setOverPanRange", "provider", "Lcom/lam2000/base_module/view/zoomview/OverPanRangeProvider;", "setOverPinchable", "overPinchable", "setOverScrollHorizontal", "overScroll", "setOverScrollVertical", "setOverZoomRange", "Lcom/lam2000/base_module/view/zoomview/OverZoomRangeProvider;", "setScrollEnabled", "setThreeFingersScrollEnabled", "setTransformation", "transformation", "gravity", "setTwoFingersScrollEnabled", "setVerticalPanEnabled", "setZoomEnabled", "zoomBy", "zoomFactor", "zoomIn", "zoomOut", "zoomTo", "Callbacks", "Companion", "Listener", "SimpleListener", "base-module_debug"})
public class ZoomEngine implements com.lam2000.base_module.view.zoomview.ZoomApi {
    private int transformationType = 0;
    private int transformationGravity = 0;
    private android.view.View container;
    private final com.lam2000.base_module.view.zoomview.ZoomEngine.Callbacks callbacks = null;
    private final com.lam2000.base_module.view.zoomview.UpdatesDispatcher dispatcher = null;
    private final com.lam2000.base_module.view.zoomview.StateController stateController = null;
    private final com.lam2000.base_module.view.zoomview.movement.PanManager panManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.lam2000.base_module.view.zoomview.movement.ZoomManager zoomManager = null;
    private final com.lam2000.base_module.view.zoomview.matrix.MatrixController matrixController = null;
    private final com.lam2000.base_module.view.zoomview.gestures.ScrollFlingDetector scrollFlingDetector = null;
    private final com.lam2000.base_module.view.zoomview.gestures.PinchDetector pinchDetector = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.view.zoomview.ZoomEngine.Companion Companion = null;
    
    /**
     * The default animation duration
     */
    public static final long DEFAULT_ANIMATION_DURATION = 280L;
    private static final java.lang.String TAG = null;
    private static final com.lam2000.base_module.view.zoomview.ZoomLogger LOG = null;
    
    public ZoomEngine(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    /**
     * Constructs an helper instance.
     *
     * @param context a valid context
     * @param container the view hosting the zoomable content
     */
    public ZoomEngine(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View container) {
        super();
    }
    
    /**
     * Constructs an helper instance.
     * Deprecated: use [addListener] to add a listener.
     *
     * @param context a valid context
     * @param container the view hosting the zoomable content
     * @param listener a listener for events
     */
    @java.lang.Deprecated()
    public ZoomEngine(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View container, @org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.ZoomEngine.Listener listener) {
        super();
    }
    
    @kotlin.Suppress(names = {"LeakingThis"})
    @java.lang.Deprecated()
    private static void getDispatcher$annotations() {
    }
    
    @kotlin.Suppress(names = {"LeakingThis"})
    @java.lang.Deprecated()
    private static void getPanManager$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.zoomview.movement.ZoomManager getZoomManager$base_module_debug() {
        return null;
    }
    
    @kotlin.Suppress(names = {"LeakingThis"})
    @java.lang.Deprecated()
    public static void getZoomManager$base_module_debug$annotations() {
    }
    
    /**
     * Gets the current zoom value, including the base zoom that was eventually applied during
     * the starting transformation, see [setTransformation].
     * This value will match the scaleX - scaleY values you get into the [Matrix],
     * and is the actual scale value of the content from its original size.
     *
     * @return the real zoom
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.RealZoom()
    @java.lang.Override()
    @java.lang.Deprecated()
    public static void getRealZoom$annotations() {
    }
    
    @java.lang.Override()
    public float getRealZoom() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.lam2000.base_module.view.zoomview.AbsolutePoint getPan() {
        return null;
    }
    
    /**
     * Returns the current horizontal pan value, in content absolute coordinates
     * (that is, as if there was no zoom at all).
     *
     * @return the current horizontal pan
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    @java.lang.Override()
    @java.lang.Deprecated()
    public static void getPanX$annotations() {
    }
    
    @java.lang.Override()
    public float getPanX() {
        return 0.0F;
    }
    
    /**
     * Returns the current vertical pan value, in content absolute coordinates
     * (that is, as if there was no zoom at all).
     *
     * @return the current vertical pan
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    @java.lang.Override()
    @java.lang.Deprecated()
    public static void getPanY$annotations() {
    }
    
    @java.lang.Override()
    public float getPanY() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.lam2000.base_module.view.zoomview.ScaledPoint getScaledPan() {
        return null;
    }
    
    @java.lang.Override()
    public float getScaledPanX() {
        return 0.0F;
    }
    
    @java.lang.Override()
    public float getScaledPanY() {
        return 0.0F;
    }
    
    /**
     * Returns the current matrix. This can be changed from the outside, but is not
     * guaranteed to remain stable.
     *
     * @return the current matrix.
     */
    @kotlin.Suppress(names = {"MemberVisibilityCanBePrivate"})
    @java.lang.Deprecated()
    public static void getMatrix$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Matrix getMatrix() {
        return null;
    }
    
    /**
     * Returns the content width as passed to [setContentSize].
     * @return the current width
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    @java.lang.Deprecated()
    public static void getContentWidth$annotations() {
    }
    
    public final float getContentWidth() {
        return 0.0F;
    }
    
    /**
     * Returns the content height as passed to [setContentSize].
     * @return the current height
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    @java.lang.Deprecated()
    public static void getContentHeight$annotations() {
    }
    
    public final float getContentHeight() {
        return 0.0F;
    }
    
    public final float getContainerWidth() {
        return 0.0F;
    }
    
    public final float getContainerHeight() {
        return 0.0F;
    }
    
    /**
     * Gets the current zoom value, which can be used as a reference when calling
     * [zoomTo] or [zoomBy].
     *
     * This can be different than the actual scale you get in the matrix, because at startup
     * we apply a base transformation, see [setTransformation].
     * All zoom calls, including min zoom and max zoom, refer to this axis, where zoom is set to 1
     * right after the initial transformation.
     *
     * @return the current zoom
     * @see realZoom
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
    @java.lang.Override()
    @java.lang.Deprecated()
    public static void getZoom$annotations() {
    }
    
    @java.lang.Override()
    public float getZoom() {
        return 0.0F;
    }
    
    /**
     * Registers a new [Listener] to be notified of matrix updates.
     * @param listener the new listener
     */
    public final void addListener(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.ZoomEngine.Listener listener) {
    }
    
    /**
     * Removes a previously registered listener.
     * @param listener the listener to be removed
     */
    @kotlin.Suppress(names = {"unused"})
    public final void removeListener(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.ZoomEngine.Listener listener) {
    }
    
    /**
     * Controls whether the content should be over-scrollable horizontally.
     * If it is, drag and fling horizontal events can scroll the content outside the safe area,
     * then return to safe values.
     *
     * @param overScroll whether to allow horizontal over scrolling
     */
    @java.lang.Override()
    public void setOverScrollHorizontal(boolean overScroll) {
    }
    
    /**
     * Controls whether the content should be over-scrollable vertically.
     * If it is, drag and fling vertical events can scroll the content outside the safe area,
     * then return to safe values.
     *
     * @param overScroll whether to allow vertical over scrolling
     */
    @java.lang.Override()
    public void setOverScrollVertical(boolean overScroll) {
    }
    
    /**
     * Set the [OverPanRangeProvider] that specifies the amount of
     * overpan to allow.
     */
    @java.lang.Override()
    public void setOverPanRange(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.OverPanRangeProvider provider) {
    }
    
    /**
     * Controls whether horizontal panning using gestures is enabled.
     *
     * @param enabled true enables horizontal panning, false disables it
     */
    @java.lang.Override()
    public void setHorizontalPanEnabled(boolean enabled) {
    }
    
    /**
     * Controls whether vertical panning using gestures is enabled.
     *
     * @param enabled true enables vertical panning, false disables it
     */
    @java.lang.Override()
    public void setVerticalPanEnabled(boolean enabled) {
    }
    
    /**
     * Controls whether the content should be overPinchable.
     * If it is, pinch events can change the zoom outside the safe bounds,
     * than return to safe values.
     *
     * @param overPinchable whether to allow over pinching
     */
    @java.lang.Override()
    public void setOverPinchable(boolean overPinchable) {
    }
    
    /**
     * Set the [OverZoomRangeProvider] that specifies the amount of
     * overzoom to allow.
     */
    @java.lang.Override()
    public void setOverZoomRange(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.OverZoomRangeProvider provider) {
    }
    
    /**
     * Controls whether zoom using pinch gesture is enabled or not.
     *
     * @param enabled true enables zooming, false disables it
     */
    @java.lang.Override()
    public void setZoomEnabled(boolean enabled) {
    }
    
    /**
     * Controls whether fling gesture is enabled or not.
     *
     * @param enabled true enables fling gesture, false disables it
     */
    @java.lang.Override()
    public void setFlingEnabled(boolean enabled) {
    }
    
    /**
     * Controls whether scroll gesture is enabled or not.
     *
     * @param enabled true enables scroll gesture, false disables it
     */
    @java.lang.Override()
    public void setScrollEnabled(boolean enabled) {
    }
    
    /**
     * Controls whether one finger scroll gesture is enabled or not.
     *
     * @param enabled true enables one finger scroll gesture, false disables it
     */
    @java.lang.Override()
    public void setOneFingerScrollEnabled(boolean enabled) {
    }
    
    /**
     * Controls whether two fingers scroll gesture is enabled or not.
     *
     * @param enabled true enables two fingers scroll gesture, false disables it
     */
    @java.lang.Override()
    public void setTwoFingersScrollEnabled(boolean enabled) {
    }
    
    /**
     * Controls whether three fingers scroll gesture is enabled or not.
     *
     * @param enabled true enables three fingers scroll gesture, false disables it
     */
    @java.lang.Override()
    public void setThreeFingersScrollEnabled(boolean enabled) {
    }
    
    /**
     * Controls whether fling events are allowed when the view is in an overscrolled state.
     *
     * @param allow true allows fling in overscroll, false disables it
     */
    @java.lang.Override()
    public void setAllowFlingInOverscroll(boolean allow) {
    }
    
    /**
     * Sets the base transformation to be applied to the content.
     * Defaults to [ZoomApi.TRANSFORMATION_CENTER_INSIDE] with [Gravity.CENTER],
     * which means that the content will be zoomed so that it fits completely inside the container.
     *
     * @param transformation the transformation type
     * @param gravity        the transformation gravity. Might be ignored for some transformations
     */
    @java.lang.Override()
    public void setTransformation(int transformation, int gravity) {
    }
    
    /**
     * Sets the content alignment. Can be any of the constants defined in [Alignment].
     * The content will be aligned and forced to the specified side of the container.
     * Defaults to [ZoomApi.ALIGNMENT_DEFAULT].
     *
     * Keep in mind that this is disabled when the content is larger than the container,
     * because a forced alignment in this case would result in part of the content being unreachable.
     *
     * @param alignment the new alignment
     */
    @java.lang.Override()
    public void setAlignment(@com.lam2000.base_module.view.zoomview.ZoomApi.Alignment()
    int alignment) {
    }
    
    /**
     * Set a container to perform transformations on.
     * This method can only be called once at initialization time. It throws an exception if
     * it is called twice.
     *
     * @param container view
     */
    public final void setContainer(@org.jetbrains.annotations.NotNull()
    android.view.View container) {
    }
    
    /**
     * Notifies the helper of the content size (be it a child View, a Bitmap, or whatever else).
     * This is needed for the helper to start working.
     *
     * @param rect the content rect
     */
    @java.lang.Deprecated()
    public final void setContentSize(@org.jetbrains.annotations.NotNull()
    android.graphics.RectF rect) {
    }
    
    /**
     * Notifies the helper of the content size (be it a child View, a Bitmap, or whatever else).
     * This is needed for the helper to start working.
     *
     * @param width the content width
     * @param height the content height
     * @param applyTransformation whether to apply the transformation defined by [setTransformation]
     */
    public final void setContentSize(float width, float height) {
    }
    
    /**
     * Notifies the helper of the content size (be it a child View, a Bitmap, or whatever else).
     * This is needed for the helper to start working.
     *
     * @param width the content width
     * @param height the content height
     * @param applyTransformation whether to apply the transformation defined by [setTransformation]
     */
    public final void setContentSize(float width, float height, boolean applyTransformation) {
    }
    
    /**
     * Sets the size of the container view. Normally you don't need to call this because the size
     * is detected from the container passed to the constructor using a global layout listener.
     *
     * However, there are cases where you might want to update it, for example during
     * [View.onSizeChanged] (called during shared element transitions).
     *
     * @param width the container width
     * @param height the container height
     * @param applyTransformation whether to apply the transformation defined by [setTransformation]
     */
    public final void setContainerSize(float width, float height) {
    }
    
    /**
     * Sets the size of the container view. Normally you don't need to call this because the size
     * is detected from the container passed to the constructor using a global layout listener.
     *
     * However, there are cases where you might want to update it, for example during
     * [View.onSizeChanged] (called during shared element transitions).
     *
     * @param width the container width
     * @param height the container height
     * @param applyTransformation whether to apply the transformation defined by [setTransformation]
     */
    public final void setContainerSize(float width, float height, boolean applyTransformation) {
    }
    
    /**
     * Clears the current state, and stops dispatching matrix events
     * until the view is laid out again and [ZoomEngine.setContentSize]
     * is called.
     */
    @kotlin.Suppress(names = {"unused"})
    public final void clear() {
    }
    
    /**
     * Computes the starting zoom, which means applying the transformation.
     */
    private final float computeTransformationZoom() {
        return 0.0F;
    }
    
    /**
     * Computes the starting pan coordinates, given the current content dimensions and container
     * dimensions. This means applying the transformation gravity.
     */
    private final com.lam2000.base_module.view.zoomview.ScaledPoint computeTransformationPan() {
        return null;
    }
    
    /**
     * Computes an actual [Gravity] value from the input gravity,
     * which might also be [ZoomApi.TRANSFORMATION_GRAVITY_AUTO]. In this case we should
     * try to infer a [Gravity] from the alignment, then fallback to center.
     */
    @android.annotation.SuppressLint(value = {"RtlHardcoded"})
    private final int computeTransformationGravity(int input) {
        return 0;
    }
    
    /**
     * This is required when the content is a View that has clickable hierarchies inside.
     * If true is returned, implementors should not pass the call to super.
     *
     * @param ev the motion event
     * @return whether we want to intercept the event
     */
    public final boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent ev) {
        return false;
    }
    
    /**
     * Process the given touch event.
     * If true is returned, implementors should not pass the call to super.
     *
     * @param ev the motion event
     * @return whether we want to steal the event
     */
    public final boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent ev) {
        return false;
    }
    
    /**
     * A low level API that can animate both zoom and pan at the same time.
     * Zoom might not be the actual matrix scale, see [ZoomApi.zoom] and [ZoomApi.realZoom].
     * The coordinates are referred to the content size passed in [setContentSize]
     * so they do not depend on current zoom.
     *
     * @param zoom    the desired zoom value
     * @param x       the desired left coordinate
     * @param y       the desired top coordinate
     * @param animate whether to animate the transition
     */
    @java.lang.Override()
    public void moveTo(@com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
    float zoom, @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    float x, @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    float y, boolean animate) {
    }
    
    /**
     * Moves to the center of the content.
     *
     * @param zoom    the desired zoom value
     * @param animate whether to animate the transition
     */
    @java.lang.Override()
    public void moveToCenter(@org.jetbrains.annotations.Nullable()
    @com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
    java.lang.Float zoom, boolean animate) {
    }
    
    /**
     * Pans the content until the top-left coordinates match the given x-y
     * values. These are referred to the content size passed in [setContentSize],
     * so they do not depend on current zoom.
     *
     * @param x       the desired left coordinate
     * @param y       the desired top coordinate
     * @param animate whether to animate the transition
     */
    @java.lang.Override()
    public void panTo(@com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    float x, @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    float y, boolean animate) {
    }
    
    /**
     * Pans the content by the given quantity in dx-dy values.
     * These are referred to the content size passed in [setContentSize],
     * so they do not depend on current zoom.
     *
     *
     * In other words, asking to pan by 1 pixel might result in a bigger pan, if the content
     * was zoomed in.
     *
     * @param dx      the desired delta x
     * @param dy      the desired delta y
     * @param animate whether to animate the transition
     */
    @java.lang.Override()
    public void panBy(@com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    float dx, @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    float dy, boolean animate) {
    }
    
    /**
     * Zooms to the given scale. This might not be the actual matrix zoom,
     * see [ZoomApi.zoom] and [ZoomApi.realZoom].
     *
     * @param zoom    the new scale value
     * @param animate whether to animate the transition
     */
    @java.lang.Override()
    public void zoomTo(@com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
    float zoom, boolean animate) {
    }
    
    /**
     * Applies the given factor to the current zoom.
     *
     * @param zoomFactor a multiplicative factor
     * @param animate    whether to animate the transition
     */
    @java.lang.Override()
    public void zoomBy(float zoomFactor, boolean animate) {
    }
    
    /**
     * Applies a small, animated zoom-in.
     * Shorthand for [zoomBy] with factor 1.3.
     */
    @java.lang.Override()
    public void zoomIn() {
    }
    
    /**
     * Applies a small, animated zoom-out.
     * Shorthand for [zoomBy] with factor 0.7.
     */
    @java.lang.Override()
    public void zoomOut() {
    }
    
    /**
     * Animates the actual matrix zoom to the given value.
     *
     * @param realZoom the new real zoom value
     * @param animate  whether to animate the transition
     */
    @java.lang.Override()
    public void realZoomTo(@com.lam2000.base_module.view.zoomview.ZoomApi.RealZoom()
    float realZoom, boolean animate) {
    }
    
    /**
     * Get the currently allowed max zoom.
     * If [ZoomApi.setOverPinchable] is set to true, this can be over-pinched
     * for a brief time.
     *
     * @see zoom
     * @see realZoom
     */
    @java.lang.Override()
    public float getMaxZoom() {
        return 0.0F;
    }
    
    /**
     * Get the currently set max zoom type.
     *
     * @see getMaxZoom
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.ZoomType()
    @java.lang.Override()
    public int getMaxZoomType() {
        return 0;
    }
    
    /**
     * Which is the max zoom that should be allowed.
     * If [setOverPinchable] is set to true, this can be over-pinched
     * for a brief time.
     *
     * @param maxZoom the max zoom
     * @param type    the constraint mode
     * @see ZoomApi.zoom
     * @see ZoomApi.realZoom
     * @see ZoomApi.TYPE_ZOOM
     *
     * @see ZoomApi.TYPE_REAL_ZOOM
     */
    @java.lang.Override()
    public void setMaxZoom(float maxZoom, @com.lam2000.base_module.view.zoomview.ZoomApi.ZoomType()
    int type) {
    }
    
    /**
     * Get the currently allowed min zoom.
     * If [ZoomApi.setOverPinchable] is set to true, this can be over-pinched
     * for a brief time.
     *
     * @see zoom
     * @see realZoom
     */
    @java.lang.Override()
    public float getMinZoom() {
        return 0.0F;
    }
    
    /**
     * Get the currently set min zoom type.
     *
     * @see getMinZoom
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.ZoomType()
    @java.lang.Override()
    public int getMinZoomType() {
        return 0;
    }
    
    /**
     * Which is the min zoom that should be allowed.
     * If [setOverPinchable] is set to true, this can be over-pinched
     * for a brief time.
     *
     * @param minZoom the min zoom
     * @param type    the constraint mode
     * @see ZoomApi.zoom
     * @see ZoomApi.realZoom
     */
    @java.lang.Override()
    public void setMinZoom(float minZoom, @com.lam2000.base_module.view.zoomview.ZoomApi.ZoomType()
    int type) {
    }
    
    /**
     * Sets the duration of animations triggered by zoom and pan APIs.
     * Defaults to [ZoomEngine.DEFAULT_ANIMATION_DURATION].
     *
     * @param duration new animation duration
     */
    @java.lang.Override()
    public void setAnimationDuration(long duration) {
    }
    
    /**
     * Cancels all currently active animations triggered by either API calls with `animate = true`
     * or touch input flings. If no animation is currently active this is a no-op.
     *
     * @return true if anything was cancelled, false otherwise
     */
    @java.lang.Override()
    public boolean cancelAnimations() {
        return false;
    }
    
    /**
     * Helper for implementing [View.computeHorizontalScrollOffset]
     * in custom views.
     *
     * @return the horizontal scroll offset.
     */
    public final int computeHorizontalScrollOffset() {
        return 0;
    }
    
    /**
     * Helper for implementing [View.computeHorizontalScrollRange]
     * in custom views.
     *
     * @return the horizontal scroll range.
     */
    public final int computeHorizontalScrollRange() {
        return 0;
    }
    
    /**
     * Helper for implementing [View.computeVerticalScrollOffset]
     * in custom views.
     *
     * @return the vertical scroll offset.
     */
    public final int computeVerticalScrollOffset() {
        return 0;
    }
    
    /**
     * Helper for implementing [View.computeVerticalScrollRange]
     * in custom views.
     *
     * @return the vertical scroll range.
     */
    public final int computeVerticalScrollRange() {
        return 0;
    }
    
    /**
     * Which is the max zoom that should be allowed.
     * If [ZoomApi.setOverPinchable] is set to true, this can be over-pinched
     * for a brief time.
     *
     * @param maxZoom the max zoom
     */
    public void setMaxZoom(@com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
    float maxZoom) {
    }
    
    /**
     * Which is the min zoom that should be allowed.
     * If [ZoomApi.setOverPinchable] is set to true, this can be over-pinched
     * for a brief time.
     *
     * @param minZoom the min zoom
     */
    public void setMinZoom(@com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
    float minZoom) {
    }
    
    /**
     * Sets the base transformation to be applied to the content.
     * See [setTransformation].
     *
     * @param transformation the transformation type
     */
    public void setTransformation(@com.lam2000.base_module.view.zoomview.ZoomApi.Transformation()
    int transformation) {
    }
    
    /**
     * Used for various components callbacks. We don't want to implement this in ZoomEngine
     * itself or these APIs will be publicly exposed as interface methods are public.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0016\u00a8\u0006\u001c"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomEngine$Callbacks;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lcom/lam2000/base_module/view/zoomview/StateController$Callback;", "Lcom/lam2000/base_module/view/zoomview/matrix/MatrixController$Callback;", "(Lcom/lam2000/base_module/view/zoomview/ZoomEngine;)V", "cleanupState", "", "oldState", "", "endScrollGesture", "isStateAllowed", "", "newState", "maybeStartPinchGesture", "event", "Landroid/view/MotionEvent;", "maybeStartScrollFlingGesture", "onGlobalLayout", "onMatrixSizeChanged", "oldZoom", "", "firstTime", "onMatrixUpdate", "onStateIdle", "post", "action", "Ljava/lang/Runnable;", "postOnAnimation", "base-module_debug"})
    final class Callbacks implements android.view.ViewTreeObserver.OnGlobalLayoutListener, com.lam2000.base_module.view.zoomview.StateController.Callback, com.lam2000.base_module.view.zoomview.matrix.MatrixController.Callback {
        
        public Callbacks() {
            super();
        }
        
        @java.lang.Override()
        public void onGlobalLayout() {
        }
        
        @java.lang.Override()
        public boolean post(@org.jetbrains.annotations.NotNull()
        java.lang.Runnable action) {
            return false;
        }
        
        @java.lang.Override()
        public void postOnAnimation(@org.jetbrains.annotations.NotNull()
        java.lang.Runnable action) {
        }
        
        @java.lang.Override()
        public void onMatrixUpdate() {
        }
        
        /**
         * If we need to apply the transformation ([firstTime] is true), we do so.
         * If we don't, we still do some computations to keep the appearance unchanged.
         */
        @java.lang.Override()
        public void onMatrixSizeChanged(float oldZoom, boolean firstTime) {
        }
        
        @java.lang.Override()
        public boolean isStateAllowed(int newState) {
            return false;
        }
        
        @java.lang.Override()
        public void onStateIdle() {
        }
        
        @java.lang.Override()
        public void cleanupState(@com.lam2000.base_module.view.zoomview.StateController.State()
        int oldState) {
        }
        
        @java.lang.Override()
        public void endScrollGesture() {
        }
        
        @java.lang.Override()
        public boolean maybeStartPinchGesture(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event) {
            return false;
        }
        
        @java.lang.Override()
        public boolean maybeStartScrollFlingGesture(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event) {
            return false;
        }
    }
    
    /**
     * An interface to listen for updates in the inner matrix. This will be called
     * typically on animation frames.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomEngine$Listener;", "", "onIdle", "", "engine", "Lcom/lam2000/base_module/view/zoomview/ZoomEngine;", "onUpdate", "matrix", "Landroid/graphics/Matrix;", "base-module_debug"})
    public static abstract interface Listener {
        
        /**
         * Notifies that the inner matrix was updated. The passed matrix can be changed,
         * but is not guaranteed to be stable. For a long lasting value it is recommended
         * to make a copy of it using [Matrix.set].
         *
         * @param engine the engine hosting the matrix
         * @param matrix a matrix with the given updates
         */
        public abstract void onUpdate(@org.jetbrains.annotations.NotNull()
        com.lam2000.base_module.view.zoomview.ZoomEngine engine, @org.jetbrains.annotations.NotNull()
        android.graphics.Matrix matrix);
        
        /**
         * Notifies that the engine is in an idle state. This means that (most probably)
         * running animations have completed and there are no touch actions in place.
         *
         * @param engine this engine
         */
        public abstract void onIdle(@org.jetbrains.annotations.NotNull()
        com.lam2000.base_module.view.zoomview.ZoomEngine engine);
    }
    
    /**
     * A simple implementation of [Listener] that will extract the translation
     * and scale values from the output matrix.
     */
    @kotlin.Suppress(names = {"unused"})
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J-\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH \u00a2\u0006\u0002\b\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomEngine$SimpleListener;", "Lcom/lam2000/base_module/view/zoomview/ZoomEngine$Listener;", "()V", "mMatrixValues", "", "onUpdate", "", "engine", "Lcom/lam2000/base_module/view/zoomview/ZoomEngine;", "matrix", "Landroid/graphics/Matrix;", "panX", "", "panY", "zoom", "onUpdate$base_module_debug", "base-module_debug"})
    public static abstract class SimpleListener implements com.lam2000.base_module.view.zoomview.ZoomEngine.Listener {
        private final float[] mMatrixValues = null;
        
        public SimpleListener() {
            super();
        }
        
        @java.lang.Override()
        public void onUpdate(@org.jetbrains.annotations.NotNull()
        com.lam2000.base_module.view.zoomview.ZoomEngine engine, @org.jetbrains.annotations.NotNull()
        android.graphics.Matrix matrix) {
        }
        
        /**
         * Notifies that the engine has computed new updates for some of the pan or scale values.
         *
         * @param engine the engine
         * @param panX the new horizontal pan value
         * @param panY the new vertical pan value
         * @param zoom the new scale value
         */
        public abstract void onUpdate$base_module_debug(@org.jetbrains.annotations.NotNull()
        com.lam2000.base_module.view.zoomview.ZoomEngine engine, float panX, float panY, float zoom);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomEngine$Companion;", "", "()V", "DEFAULT_ANIMATION_DURATION", "", "LOG", "Lcom/lam2000/base_module/view/zoomview/ZoomLogger;", "TAG", "", "kotlin.jvm.PlatformType", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}