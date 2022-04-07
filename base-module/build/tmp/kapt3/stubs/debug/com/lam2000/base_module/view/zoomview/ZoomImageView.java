package com.lam2000.base_module.view.zoomview;

import java.lang.System;

/**
 * Uses [ZoomEngine] to allow zooming and pan events to the inner drawable.
 */
@android.annotation.SuppressLint(value = {"AppCompatCustomView"})
@kotlin.Suppress(names = {"LeakingThis"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010*\u001a\u00020\u0010H\u0096\u0001J\b\u0010+\u001a\u00020\bH\u0014J\b\u0010,\u001a\u00020\bH\u0014J\b\u0010-\u001a\u00020\bH\u0014J\b\u0010.\u001a\u00020\bH\u0014J\t\u0010/\u001a\u00020\u0019H\u0096\u0001J\t\u00100\u001a\u00020\bH\u0096\u0001J\t\u00101\u001a\u00020\u0019H\u0096\u0001J\t\u00102\u001a\u00020\bH\u0096\u0001J)\u00103\u001a\u0002042\u0006\u0010(\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u0010H\u0096\u0001J\"\u00108\u001a\u0002042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00192\u0006\u00107\u001a\u00020\u0010H\u0096\u0001\u00a2\u0006\u0002\u00109J\u0010\u0010:\u001a\u0002042\u0006\u0010;\u001a\u00020<H\u0014J(\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020\bH\u0014J\u0010\u0010B\u001a\u00020\u00102\u0006\u0010C\u001a\u00020DH\u0017J!\u0010E\u001a\u0002042\u0006\u0010F\u001a\u00020\u00192\u0006\u0010G\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u0010H\u0096\u0001J!\u0010H\u001a\u0002042\u0006\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u0010H\u0096\u0001J\u0019\u0010I\u001a\u0002042\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u0010H\u0096\u0001J\u0011\u0010J\u001a\u0002042\u0006\u0010K\u001a\u00020\bH\u0096\u0001J\u0011\u0010L\u001a\u0002042\u0006\u0010M\u001a\u00020\u0010H\u0096\u0001J\u0011\u0010N\u001a\u0002042\u0006\u0010O\u001a\u00020PH\u0096\u0001J\u0011\u0010Q\u001a\u0002042\u0006\u0010R\u001a\u00020\u0010H\u0096\u0001J\u0011\u0010S\u001a\u0002042\u0006\u0010R\u001a\u00020\u0010H\u0096\u0001J\u0012\u0010T\u001a\u0002042\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J\u0011\u0010W\u001a\u0002042\u0006\u0010X\u001a\u00020\u0019H\u0096\u0001J\u0019\u0010W\u001a\u0002042\u0006\u0010X\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\bH\u0096\u0001J\u0011\u0010Z\u001a\u0002042\u0006\u0010[\u001a\u00020\u0019H\u0096\u0001J\u0019\u0010Z\u001a\u0002042\u0006\u0010[\u001a\u00020\u00192\u0006\u0010Y\u001a\u00020\bH\u0096\u0001J\u0011\u0010\\\u001a\u0002042\u0006\u0010R\u001a\u00020\u0010H\u0096\u0001J\u0011\u0010]\u001a\u0002042\u0006\u0010^\u001a\u00020_H\u0096\u0001J\u0011\u0010`\u001a\u0002042\u0006\u0010a\u001a\u00020\u0010H\u0096\u0001J\u0011\u0010b\u001a\u0002042\u0006\u0010c\u001a\u00020\u0010H\u0096\u0001J\u0011\u0010d\u001a\u0002042\u0006\u0010c\u001a\u00020\u0010H\u0096\u0001J\u0011\u0010e\u001a\u0002042\u0006\u0010^\u001a\u00020fH\u0096\u0001J\u0011\u0010g\u001a\u0002042\u0006\u0010R\u001a\u00020\u0010H\u0096\u0001J\u0011\u0010h\u001a\u0002042\u0006\u0010R\u001a\u00020\u0010H\u0096\u0001J\u0011\u0010i\u001a\u0002042\u0006\u0010j\u001a\u00020\bH\u0096\u0001J\u0019\u0010i\u001a\u0002042\u0006\u0010j\u001a\u00020\b2\u0006\u0010k\u001a\u00020\bH\u0096\u0001J\u0011\u0010l\u001a\u0002042\u0006\u0010R\u001a\u00020\u0010H\u0096\u0001J\u0011\u0010m\u001a\u0002042\u0006\u0010R\u001a\u00020\u0010H\u0096\u0001J\u0011\u0010n\u001a\u0002042\u0006\u0010R\u001a\u00020\u0010H\u0096\u0001J\u0019\u0010o\u001a\u0002042\u0006\u0010p\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u0010H\u0096\u0001J\t\u0010q\u001a\u000204H\u0096\u0001J\t\u0010r\u001a\u000204H\u0096\u0001J\u0019\u0010s\u001a\u0002042\u0006\u0010(\u001a\u00020\u00192\u0006\u00107\u001a\u00020\u0010H\u0096\u0001R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u0015X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u0019X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0012\u0010\u001e\u001a\u00020\u0019X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0012\u0010 \u001a\u00020!X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#R\u0012\u0010$\u001a\u00020\u0019X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u001bR\u0012\u0010&\u001a\u00020\u0019X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u001bR\u0012\u0010(\u001a\u00020\u0019X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u001b\u00a8\u0006t"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomImageView;", "Landroid/widget/ImageView;", "Lcom/lam2000/base_module/view/zoomview/ZoomApi;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "engine", "Lcom/lam2000/base_module/view/zoomview/ZoomEngine;", "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/lam2000/base_module/view/zoomview/ZoomEngine;)V", "getEngine", "()Lcom/lam2000/base_module/view/zoomview/ZoomEngine;", "isInSharedElementTransition", "", "()Z", "mMatrix", "Landroid/graphics/Matrix;", "pan", "Lcom/lam2000/base_module/view/zoomview/AbsolutePoint;", "getPan", "()Lcom/lam2000/base_module/view/zoomview/AbsolutePoint;", "panX", "", "getPanX", "()F", "panY", "getPanY", "realZoom", "getRealZoom", "scaledPan", "Lcom/lam2000/base_module/view/zoomview/ScaledPoint;", "getScaledPan", "()Lcom/lam2000/base_module/view/zoomview/ScaledPoint;", "scaledPanX", "getScaledPanX", "scaledPanY", "getScaledPanY", "zoom", "getZoom", "cancelAnimations", "computeHorizontalScrollOffset", "computeHorizontalScrollRange", "computeVerticalScrollOffset", "computeVerticalScrollRange", "getMaxZoom", "getMaxZoomType", "getMinZoom", "getMinZoomType", "moveTo", "", "x", "y", "animate", "moveToCenter", "(Ljava/lang/Float;Z)V", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onSizeChanged", "w", "h", "oldw", "oldh", "onTouchEvent", "ev", "Landroid/view/MotionEvent;", "panBy", "dx", "dy", "panTo", "realZoomTo", "setAlignment", "alignment", "setAllowFlingInOverscroll", "allow", "setAnimationDuration", "duration", "", "setFlingEnabled", "enabled", "setHorizontalPanEnabled", "setImageDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setMaxZoom", "maxZoom", "type", "setMinZoom", "minZoom", "setOneFingerScrollEnabled", "setOverPanRange", "provider", "Lcom/lam2000/base_module/view/zoomview/OverPanRangeProvider;", "setOverPinchable", "overPinchable", "setOverScrollHorizontal", "overScroll", "setOverScrollVertical", "setOverZoomRange", "Lcom/lam2000/base_module/view/zoomview/OverZoomRangeProvider;", "setScrollEnabled", "setThreeFingersScrollEnabled", "setTransformation", "transformation", "gravity", "setTwoFingersScrollEnabled", "setVerticalPanEnabled", "setZoomEnabled", "zoomBy", "zoomFactor", "zoomIn", "zoomOut", "zoomTo", "base-module_debug"})
public class ZoomImageView extends android.widget.ImageView implements com.lam2000.base_module.view.zoomview.ZoomApi {
    @org.jetbrains.annotations.NotNull()
    private final com.lam2000.base_module.view.zoomview.ZoomEngine engine = null;
    private final android.graphics.Matrix mMatrix = null;
    
    private ZoomImageView(android.content.Context context, android.util.AttributeSet attrs, @androidx.annotation.AttrRes()
    int defStyleAttr, @kotlin.Suppress(names = {"MemberVisibilityCanBePrivate"})
    com.lam2000.base_module.view.zoomview.ZoomEngine engine) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.view.zoomview.ZoomEngine getEngine() {
        return null;
    }
    
    public ZoomImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ZoomImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ZoomImageView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, @androidx.annotation.AttrRes()
    int defStyleAttr) {
        super(null);
    }
    
    private final boolean isInSharedElementTransition() {
        return false;
    }
    
    @java.lang.Override()
    public void setImageDrawable(@org.jetbrains.annotations.Nullable()
    android.graphics.drawable.Drawable drawable) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent ev) {
        return false;
    }
    
    @java.lang.Override()
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override()
    protected int computeHorizontalScrollOffset() {
        return 0;
    }
    
    @java.lang.Override()
    protected int computeHorizontalScrollRange() {
        return 0;
    }
    
    @java.lang.Override()
    protected int computeVerticalScrollOffset() {
        return 0;
    }
    
    @java.lang.Override()
    protected int computeVerticalScrollRange() {
        return 0;
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.lam2000.base_module.view.zoomview.AbsolutePoint getPan() {
        return null;
    }
    
    @java.lang.Override()
    public float getPanX() {
        return 0.0F;
    }
    
    @java.lang.Override()
    public float getPanY() {
        return 0.0F;
    }
    
    @java.lang.Override()
    public float getRealZoom() {
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
    
    @java.lang.Override()
    public float getZoom() {
        return 0.0F;
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
     * Controls whether fling events are allowed when the view is in an overscrolled state.
     *
     * @param allow true allows fling in overscroll, false disables it
     */
    @java.lang.Override()
    public void setAllowFlingInOverscroll(boolean allow) {
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
     * Controls whether fling gesture is enabled or not.
     *
     * @param enabled true enables fling gesture, false disables it
     */
    @java.lang.Override()
    public void setFlingEnabled(boolean enabled) {
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
     * Which is the max zoom that should be allowed.
     * If [ZoomApi.setOverPinchable] is set to true, this can be over-pinched
     * for a brief time.
     *
     * @param maxZoom the max zoom
     */
    @java.lang.Override()
    public void setMaxZoom(@com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
    float maxZoom) {
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
     * Which is the min zoom that should be allowed.
     * If [ZoomApi.setOverPinchable] is set to true, this can be over-pinched
     * for a brief time.
     *
     * @param minZoom the min zoom
     */
    @java.lang.Override()
    public void setMinZoom(@com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
    float minZoom) {
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
     * Controls whether one finger scroll gesture is enabled or not.
     *
     * @param enabled true enables one finger scroll gesture, false disables it
     */
    @java.lang.Override()
    public void setOneFingerScrollEnabled(boolean enabled) {
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
     * Set the [OverZoomRangeProvider] that specifies the amount of
     * overzoom to allow.
     */
    @java.lang.Override()
    public void setOverZoomRange(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.OverZoomRangeProvider provider) {
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
     * Controls whether three fingers scroll gesture is enabled or not.
     *
     * @param enabled true enables three fingers scroll gesture, false disables it
     */
    @java.lang.Override()
    public void setThreeFingersScrollEnabled(boolean enabled) {
    }
    
    /**
     * Sets the base transformation to be applied to the content.
     * See [setTransformation].
     *
     * @param transformation the transformation type
     */
    @java.lang.Override()
    public void setTransformation(@com.lam2000.base_module.view.zoomview.ZoomApi.Transformation()
    int transformation) {
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
    public void setTransformation(@com.lam2000.base_module.view.zoomview.ZoomApi.Transformation()
    int transformation, int gravity) {
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
     * Controls whether vertical panning using gestures is enabled.
     *
     * @param enabled true enables vertical panning, false disables it
     */
    @java.lang.Override()
    public void setVerticalPanEnabled(boolean enabled) {
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
}