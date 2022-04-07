package com.lam2000.base_module.view.zoomview;

import java.lang.System;

/**
 * An interface for zoom controls.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\bf\u0018\u0000 [2\u00020\u0001:\bYZ[\\]^_`J\b\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\u0007H&J\b\u0010\"\u001a\u00020#H&J\b\u0010$\u001a\u00020\u0007H&J\b\u0010%\u001a\u00020#H&J(\u0010&\u001a\u00020\'2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020 H&J!\u0010+\u001a\u00020\'2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010*\u001a\u00020 H&\u00a2\u0006\u0002\u0010,J \u0010-\u001a\u00020\'2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u0010*\u001a\u00020 H&J \u00100\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020 H&J\u0018\u00101\u001a\u00020\'2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010*\u001a\u00020 H&J\u0010\u00102\u001a\u00020\'2\u0006\u00103\u001a\u00020#H&J\u0010\u00104\u001a\u00020\'2\u0006\u00105\u001a\u00020 H&J\u0010\u00106\u001a\u00020\'2\u0006\u00107\u001a\u000208H&J\u0010\u00109\u001a\u00020\'2\u0006\u0010:\u001a\u00020 H&J\u0010\u0010;\u001a\u00020\'2\u0006\u0010:\u001a\u00020 H&J\u0010\u0010<\u001a\u00020\'2\u0006\u0010=\u001a\u00020\u0007H\u0016J\u0018\u0010<\u001a\u00020\'2\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020#H&J\u0010\u0010?\u001a\u00020\'2\u0006\u0010@\u001a\u00020\u0007H\u0016J\u0018\u0010?\u001a\u00020\'2\u0006\u0010@\u001a\u00020\u00072\u0006\u0010>\u001a\u00020#H&J\u0010\u0010A\u001a\u00020\'2\u0006\u0010:\u001a\u00020 H&J\u0010\u0010B\u001a\u00020\'2\u0006\u0010C\u001a\u00020DH&J\u0010\u0010E\u001a\u00020\'2\u0006\u0010F\u001a\u00020 H&J\u0010\u0010G\u001a\u00020\'2\u0006\u0010H\u001a\u00020 H&J\u0010\u0010I\u001a\u00020\'2\u0006\u0010H\u001a\u00020 H&J\u0010\u0010J\u001a\u00020\'2\u0006\u0010C\u001a\u00020KH&J\u0010\u0010L\u001a\u00020\'2\u0006\u0010:\u001a\u00020 H&J\u0010\u0010M\u001a\u00020\'2\u0006\u0010:\u001a\u00020 H&J\u0010\u0010N\u001a\u00020\'2\u0006\u0010O\u001a\u00020#H\u0016J\u0018\u0010N\u001a\u00020\'2\u0006\u0010O\u001a\u00020#2\u0006\u0010P\u001a\u00020#H&J\u0010\u0010Q\u001a\u00020\'2\u0006\u0010:\u001a\u00020 H&J\u0010\u0010R\u001a\u00020\'2\u0006\u0010:\u001a\u00020 H&J\u0010\u0010S\u001a\u00020\'2\u0006\u0010:\u001a\u00020 H&J\u0018\u0010T\u001a\u00020\'2\u0006\u0010U\u001a\u00020\u00072\u0006\u0010*\u001a\u00020 H&J\b\u0010V\u001a\u00020\'H&J\b\u0010W\u001a\u00020\'H&J\u0018\u0010X\u001a\u00020\'2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010*\u001a\u00020 H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\f\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u000f\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\f\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u0012\u0010\u0012\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\f\u0012\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000bR\u0018\u0010\u0019\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\f\u0012\u0004\b\u001a\u0010\t\u001a\u0004\b\u001b\u0010\u000bR\u0018\u0010\u001c\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\f\u0012\u0004\b\u001d\u0010\t\u001a\u0004\b\u001e\u0010\u000b\u00a8\u0006a"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomApi;", "", "pan", "Lcom/lam2000/base_module/view/zoomview/AbsolutePoint;", "getPan", "()Lcom/lam2000/base_module/view/zoomview/AbsolutePoint;", "panX", "", "getPanX$annotations", "()V", "getPanX", "()F", "panY", "getPanY$annotations", "getPanY", "realZoom", "getRealZoom$annotations", "getRealZoom", "scaledPan", "Lcom/lam2000/base_module/view/zoomview/ScaledPoint;", "getScaledPan", "()Lcom/lam2000/base_module/view/zoomview/ScaledPoint;", "scaledPanX", "getScaledPanX$annotations", "getScaledPanX", "scaledPanY", "getScaledPanY$annotations", "getScaledPanY", "zoom", "getZoom$annotations", "getZoom", "cancelAnimations", "", "getMaxZoom", "getMaxZoomType", "", "getMinZoom", "getMinZoomType", "moveTo", "", "x", "y", "animate", "moveToCenter", "(Ljava/lang/Float;Z)V", "panBy", "dx", "dy", "panTo", "realZoomTo", "setAlignment", "alignment", "setAllowFlingInOverscroll", "allow", "setAnimationDuration", "duration", "", "setFlingEnabled", "enabled", "setHorizontalPanEnabled", "setMaxZoom", "maxZoom", "type", "setMinZoom", "minZoom", "setOneFingerScrollEnabled", "setOverPanRange", "provider", "Lcom/lam2000/base_module/view/zoomview/OverPanRangeProvider;", "setOverPinchable", "overPinchable", "setOverScrollHorizontal", "overScroll", "setOverScrollVertical", "setOverZoomRange", "Lcom/lam2000/base_module/view/zoomview/OverZoomRangeProvider;", "setScrollEnabled", "setThreeFingersScrollEnabled", "setTransformation", "transformation", "gravity", "setTwoFingersScrollEnabled", "setVerticalPanEnabled", "setZoomEnabled", "zoomBy", "zoomFactor", "zoomIn", "zoomOut", "zoomTo", "AbsolutePan", "Alignment", "Companion", "RealZoom", "ScaledPan", "Transformation", "Zoom", "ZoomType", "base-module_debug"})
public abstract interface ZoomApi {
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.view.zoomview.ZoomApi.Companion Companion = null;
    
    /**
     * Flag for zoom constraints and settings.
     * With [ZoomApi.TYPE_ZOOM] the constraint is measured over the zoom in [ZoomApi.zoom].
     * This is not the actual matrix scale value.
     *
     * @see zoom
     * @see realZoom
     */
    public static final int TYPE_ZOOM = 0;
    
    /**
     * Flag for zoom constraints and settings.
     * With [ZoomApi.TYPE_REAL_ZOOM] the constraint is measured over the zoom in [ZoomApi.realZoom],
     * which is the actual scale you get in the matrix.
     *
     * @see zoom
     * @see realZoom
     */
    public static final int TYPE_REAL_ZOOM = 1;
    
    /**
     * Constant for [ZoomApi.setTransformation].
     * The content will be zoomed so that it fits completely inside the container.
     */
    public static final int TRANSFORMATION_CENTER_INSIDE = 0;
    
    /**
     * Constant for [ZoomApi.setTransformation].
     * The content will be zoomed so that its smaller side fits exactly inside the container.
     * The larger side will be partially cropped.
     */
    public static final int TRANSFORMATION_CENTER_CROP = 1;
    
    /**
     * Constant for [ZoomApi.setTransformation].
     * No transformation will be applied, which means that both [ZoomApi.zoom] and
     * [ZoomApi.realZoom] will return the same value.
     */
    public static final int TRANSFORMATION_NONE = 2;
    
    /**
     * Constant for [ZoomApi.setTransformation] gravity.
     * This means that the gravity will be inferred from the alignment or
     * fallback to a reasonable default.
     */
    public static final int TRANSFORMATION_GRAVITY_AUTO = 0;
    
    /**
     * The default [setMinZoom] applied by the engine if none is specified.
     */
    public static final float MIN_ZOOM_DEFAULT = 0.8F;
    
    /**
     * The default [setMinZoom] type applied by the engine if none is specified.
     */
    public static final int MIN_ZOOM_DEFAULT_TYPE = 0;
    
    /**
     * The default [setMaxZoom] applied by the engine if none is specified.
     */
    public static final float MAX_ZOOM_DEFAULT = 2.5F;
    
    /**
     * The default [setMaxZoom] type applied by the engine if none is specified.
     */
    public static final int MAX_ZOOM_DEFAULT_TYPE = 0;
    
    /**
     * The default value for [setAlignment].
     */
    public static final int ALIGNMENT_DEFAULT = 51;
    
    /**
     * Gets the current zoom value, which can be used as a reference when calling
     * [ZoomApi.zoomTo] or [ZoomApi.zoomBy].
     *
     *
     * This can be different than the actual scale you get in the matrix, because at startup
     * we apply a base zoom to respect the "center inside" policy.
     * All zoom calls, including min zoom and max zoom, refer to this axis, where zoom is set to 1
     * right after the initial transformation.
     *
     * @return the current zoom
     * @see realZoom
     */
    public abstract float getZoom();
    
    /**
     * Gets the current zoom value, including the base zoom that was eventually applied when
     * initializing to respect the "center inside" policy. This will match the scaleX - scaleY
     * values you get into the [Matrix], and is the actual scale value of the content
     * from its original size.
     *
     * @return the real zoom
     * @see zoom
     */
    public abstract float getRealZoom();
    
    /**
     * The current pan as an [AbsolutePoint].
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.lam2000.base_module.view.zoomview.AbsolutePoint getPan();
    
    /**
     * Returns the current horizontal pan value, in content absolute coordinates
     * (that is, as if there was no zoom at all).
     *
     * @return the current horizontal pan
     */
    public abstract float getPanX();
    
    /**
     * Returns the current vertical pan value, in content absolute coordinates
     * (that is, as if there was no zoom at all).
     *
     * @return the current vertical pan
     */
    public abstract float getPanY();
    
    /**
     * The current pan as a [ScaledPoint], that is, taking into account the current zoom.
     * This basically returns the [pan] value multiplied by the current [realZoom].
     */
    @org.jetbrains.annotations.NotNull()
    public abstract com.lam2000.base_module.view.zoomview.ScaledPoint getScaledPan();
    
    /**
     * Returns the current horizontal pan value, in content scaled coordinates
     * (that is, including the current zoom).
     * This is equivalent to [panX] multiplied by [realZoom].
     *
     * @return the current horizontal pan
     */
    public abstract float getScaledPanX();
    
    /**
     * Returns the current vertical pan value, in content scaled coordinates
     * (that is, including the current zoom).
     * This is equivalent to [panY] multiplied by [realZoom].
     *
     * @return the current vertical pan
     */
    public abstract float getScaledPanY();
    
    /**
     * Controls whether the content should be over-scrollable horizontally.
     * If it is, drag and fling horizontal events can scroll the content outside the safe area,
     * then return to safe values.
     *
     * @param overScroll whether to allow horizontal over scrolling
     */
    public abstract void setOverScrollHorizontal(boolean overScroll);
    
    /**
     * Controls whether the content should be over-scrollable vertically.
     * If it is, drag and fling vertical events can scroll the content outside the safe area,
     * then return to safe values.
     *
     * @param overScroll whether to allow vertical over scrolling
     */
    public abstract void setOverScrollVertical(boolean overScroll);
    
    /**
     * Set the [OverPanRangeProvider] that specifies the amount of
     * overpan to allow.
     */
    public abstract void setOverPanRange(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.OverPanRangeProvider provider);
    
    /**
     * Controls whether horizontal panning using gestures is enabled.
     *
     * @param enabled true enables horizontal panning, false disables it
     */
    public abstract void setHorizontalPanEnabled(boolean enabled);
    
    /**
     * Controls whether vertical panning using gestures is enabled.
     *
     * @param enabled true enables vertical panning, false disables it
     */
    public abstract void setVerticalPanEnabled(boolean enabled);
    
    /**
     * Controls whether zoom using pinch gesture is enabled or not.
     *
     * @param enabled true enables zooming, false disables it
     */
    public abstract void setZoomEnabled(boolean enabled);
    
    /**
     * Controls whether the content should be overPinchable.
     * If it is, pinch events can change the zoom outside the safe bounds,
     * than return to safe values.
     *
     * @param overPinchable whether to allow over pinching
     */
    public abstract void setOverPinchable(boolean overPinchable);
    
    /**
     * Set the [OverZoomRangeProvider] that specifies the amount of
     * overzoom to allow.
     *
     * @param provider the range provider
     */
    public abstract void setOverZoomRange(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.OverZoomRangeProvider provider);
    
    /**
     * Controls whether fling gesture is enabled or not.
     *
     * @param enabled true enables fling gesture, false disables it
     */
    public abstract void setFlingEnabled(boolean enabled);
    
    /**
     * Controls whether scroll gesture is enabled or not.
     *
     * @param enabled true enables scroll gesture, false disables it
     */
    public abstract void setScrollEnabled(boolean enabled);
    
    /**
     * Controls whether one finger scroll gesture is enabled or not.
     *
     * @param enabled true enables one finger scroll gesture, false disables it
     */
    public abstract void setOneFingerScrollEnabled(boolean enabled);
    
    /**
     * Controls whether two fingers scroll gesture is enabled or not.
     *
     * @param enabled true enables two fingers scroll gesture, false disables it
     */
    public abstract void setTwoFingersScrollEnabled(boolean enabled);
    
    /**
     * Controls whether three fingers scroll gesture is enabled or not.
     *
     * @param enabled true enables three fingers scroll gesture, false disables it
     */
    public abstract void setThreeFingersScrollEnabled(boolean enabled);
    
    /**
     * Controls whether fling events are allowed when the view is in an overscrolled state.
     *
     * @param allow true allows fling in overscroll, false disables it
     */
    public abstract void setAllowFlingInOverscroll(boolean allow);
    
    /**
     * Sets the base transformation to be applied to the content.
     * See [setTransformation].
     *
     * @param transformation the transformation type
     */
    public abstract void setTransformation(@com.lam2000.base_module.view.zoomview.ZoomApi.Transformation()
    int transformation);
    
    /**
     * Sets the base transformation to be applied to the content.
     * Defaults to [TRANSFORMATION_CENTER_INSIDE] with [android.view.Gravity.CENTER],
     * which means that the content will be zoomed so that it fits completely inside the container.
     *
     * @param transformation the transformation type
     * @param gravity        the transformation gravity. Might be ignored for some transformations
     */
    public abstract void setTransformation(@com.lam2000.base_module.view.zoomview.ZoomApi.Transformation()
    int transformation, int gravity);
    
    /**
     * Sets the content alignment. Can be any of the constants defined in [Alignment].
     * The content will be aligned and forced to the specified side of the container.
     * Defaults to [ALIGNMENT_DEFAULT].
     *
     * Keep in mind that this is disabled when the content is larger than the container,
     * because a forced alignment in this case would result in part of the content being unreachable.
     *
     * @param alignment the new alignment
     */
    public abstract void setAlignment(@com.lam2000.base_module.view.zoomview.ZoomApi.Alignment()
    int alignment);
    
    /**
     * A low level API that can animate both zoom and pan at the same time.
     * Zoom might not be the actual matrix scale, see [ZoomApi.zoom] and [ZoomApi.realZoom].
     * The coordinates are referred to the content size so they do not depend on current zoom.
     *
     * @param zoom    the desired zoom value
     * @param x       the desired left coordinate
     * @param y       the desired top coordinate
     * @param animate whether to animate the transition
     */
    public abstract void moveTo(@com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
    float zoom, @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    float x, @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    float y, boolean animate);
    
    /**
     * Moves to the center of the content.
     *
     * @param zoom    the desired zoom value
     * @param animate whether to animate the transition
     */
    public abstract void moveToCenter(@org.jetbrains.annotations.Nullable()
    @com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
    java.lang.Float zoom, boolean animate);
    
    /**
     * Pans the content until the top-left coordinates match the given x-y
     * values. These are referred to the content size so they do not depend on current zoom.
     *
     * @param x       the desired left coordinate
     * @param y       the desired top coordinate
     * @param animate whether to animate the transition
     */
    public abstract void panTo(@com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    float x, @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    float y, boolean animate);
    
    /**
     * Pans the content by the given quantity in dx-dy values.
     * These are referred to the content size so they do not depend on current zoom.
     *
     *
     * In other words, asking to pan by 1 pixel might result in a bigger pan, if the content
     * was zoomed in.
     *
     * @param dx      the desired delta x
     * @param dy      the desired delta y
     * @param animate whether to animate the transition
     */
    public abstract void panBy(@com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    float dx, @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
    float dy, boolean animate);
    
    /**
     * Zooms to the given scale. This might not be the actual matrix zoom,
     * see [ZoomApi.zoom] and [ZoomApi.realZoom].
     *
     * @param zoom    the new scale value
     * @param animate whether to animate the transition
     */
    public abstract void zoomTo(@com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
    float zoom, boolean animate);
    
    /**
     * Applies the given factor to the current zoom.
     *
     * @param zoomFactor a multiplicative factor
     * @param animate    whether to animate the transition
     */
    public abstract void zoomBy(float zoomFactor, boolean animate);
    
    /**
     * Applies a small, animated zoom-in.
     */
    public abstract void zoomIn();
    
    /**
     * Applies a small, animated zoom-out.
     */
    public abstract void zoomOut();
    
    /**
     * Animates the actual matrix zoom to the given value.
     *
     * @param realZoom the new real zoom value
     * @param animate  whether to animate the transition
     */
    public abstract void realZoomTo(@com.lam2000.base_module.view.zoomview.ZoomApi.RealZoom()
    float realZoom, boolean animate);
    
    /**
     * Get the currently allowed max zoom.
     * If [ZoomApi.setOverPinchable] is set to true, this can be over-pinched
     * for a brief time.
     *
     * @see zoom
     * @see realZoom
     */
    public abstract float getMaxZoom();
    
    /**
     * Get the currently set max zoom type.
     *
     * @see getMaxZoom
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.ZoomType()
    public abstract int getMaxZoomType();
    
    /**
     * Which is the max zoom that should be allowed.
     * If [ZoomApi.setOverPinchable] is set to true, this can be over-pinched
     * for a brief time.
     *
     * @param maxZoom the max zoom
     */
    public abstract void setMaxZoom(@com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
    float maxZoom);
    
    /**
     * Which is the max zoom that should be allowed.
     * If [ZoomApi.setOverPinchable] is set to true, this can be over-pinched
     * for a brief time.
     *
     * @param maxZoom the max zoom
     * @param type    the constraint mode
     * @see zoom
     * @see realZoom
     */
    public abstract void setMaxZoom(float maxZoom, @com.lam2000.base_module.view.zoomview.ZoomApi.ZoomType()
    int type);
    
    /**
     * Get the currently allowed min zoom.
     * If [ZoomApi.setOverPinchable] is set to true, this can be over-pinched
     * for a brief time.
     *
     * @see zoom
     * @see realZoom
     */
    public abstract float getMinZoom();
    
    /**
     * Get the currently set min zoom type.
     *
     * @see getMinZoom
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.ZoomType()
    public abstract int getMinZoomType();
    
    /**
     * Which is the min zoom that should be allowed.
     * If [ZoomApi.setOverPinchable] is set to true, this can be over-pinched
     * for a brief time.
     *
     * @param minZoom the min zoom
     */
    public abstract void setMinZoom(@com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
    float minZoom);
    
    /**
     * Which is the min zoom that should be allowed.
     * If [ZoomApi.setOverPinchable] is set to true, this can be over-pinched
     * for a brief time.
     *
     * @param minZoom the min zoom
     * @param type    the constraint mode
     * @see zoom
     * @see realZoom
     */
    public abstract void setMinZoom(float minZoom, @com.lam2000.base_module.view.zoomview.ZoomApi.ZoomType()
    int type);
    
    /**
     * Sets the duration of animations triggered by zoom and pan APIs.
     * Defaults to [ZoomEngine.DEFAULT_ANIMATION_DURATION].
     *
     * @param duration new animation duration
     */
    public abstract void setAnimationDuration(long duration);
    
    /**
     * Cancels all currently active animations triggered by either API calls with `animate = true`
     * or touch input flings. If no animation is currently active this is a no-op.
     *
     * @return true if anything was cancelled, false otherwise
     */
    public abstract boolean cancelAnimations();
    
    /**
     * Annotation to indicate a RealZoom value.
     *
     * @see realZoom
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomApi$RealZoom;", "", "base-module_debug"})
    @java.lang.annotation.Target(value = {java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.LOCAL_VARIABLE, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER})
    public static abstract @interface RealZoom {
    }
    
    /**
     * Annotation to indicate a zoom value.
     *
     * @see zoom
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomApi$Zoom;", "", "base-module_debug"})
    @java.lang.annotation.Target(value = {java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.LOCAL_VARIABLE, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER})
    public static abstract @interface Zoom {
    }
    
    /**
     * Annotation to indicate an AbsolutePan value.
     *
     * @see panX
     * @see panY
     * @see ScaledPan
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomApi$AbsolutePan;", "", "base-module_debug"})
    @java.lang.annotation.Target(value = {java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.LOCAL_VARIABLE, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER})
    public static abstract @interface AbsolutePan {
    }
    
    /**
     * Annotation to indicate a ScaledPan value.
     *
     * @see panX
     * @see panY
     * @see AbsolutePan
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomApi$ScaledPan;", "", "base-module_debug"})
    @java.lang.annotation.Target(value = {java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.LOCAL_VARIABLE, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER})
    public static abstract @interface ScaledPan {
    }
    
    /**
     * Defines the available zoom types
     *
     * @see zoom
     * @see realZoom
     */
    @androidx.annotation.IntDef(value = {0, 1})
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomApi$ZoomType;", "", "base-module_debug"})
    @java.lang.annotation.Target(value = {java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    @kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.LOCAL_VARIABLE, kotlin.annotation.AnnotationTarget.PROPERTY, kotlin.annotation.AnnotationTarget.VALUE_PARAMETER})
    public static abstract @interface ZoomType {
    }
    
    /**
     * Defines the available transformation types
     */
    @androidx.annotation.IntDef(value = {0, 1, 2})
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomApi$Transformation;", "", "base-module_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface Transformation {
    }
    
    /**
     * Defines the available alignments
     */
    @androidx.annotation.IntDef(value = {2, 3, 4, 1, 16, 48, 64, 32, 51, 68}, flag = true)
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomApi$Alignment;", "", "base-module_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface Alignment {
    }
    
    /**
     * An interface for zoom controls.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        /**
         * Gets the current zoom value, which can be used as a reference when calling
         * [ZoomApi.zoomTo] or [ZoomApi.zoomBy].
         *
         *
         * This can be different than the actual scale you get in the matrix, because at startup
         * we apply a base zoom to respect the "center inside" policy.
         * All zoom calls, including min zoom and max zoom, refer to this axis, where zoom is set to 1
         * right after the initial transformation.
         *
         * @return the current zoom
         * @see realZoom
         */
        @com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
        @java.lang.Deprecated()
        public static void getZoom$annotations() {
        }
        
        /**
         * Gets the current zoom value, including the base zoom that was eventually applied when
         * initializing to respect the "center inside" policy. This will match the scaleX - scaleY
         * values you get into the [Matrix], and is the actual scale value of the content
         * from its original size.
         *
         * @return the real zoom
         * @see zoom
         */
        @com.lam2000.base_module.view.zoomview.ZoomApi.RealZoom()
        @java.lang.Deprecated()
        public static void getRealZoom$annotations() {
        }
        
        /**
         * Returns the current horizontal pan value, in content absolute coordinates
         * (that is, as if there was no zoom at all).
         *
         * @return the current horizontal pan
         */
        @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
        @java.lang.Deprecated()
        public static void getPanX$annotations() {
        }
        
        /**
         * Returns the current vertical pan value, in content absolute coordinates
         * (that is, as if there was no zoom at all).
         *
         * @return the current vertical pan
         */
        @com.lam2000.base_module.view.zoomview.ZoomApi.AbsolutePan()
        @java.lang.Deprecated()
        public static void getPanY$annotations() {
        }
        
        /**
         * Returns the current horizontal pan value, in content scaled coordinates
         * (that is, including the current zoom).
         * This is equivalent to [panX] multiplied by [realZoom].
         *
         * @return the current horizontal pan
         */
        @com.lam2000.base_module.view.zoomview.ZoomApi.ScaledPan()
        @java.lang.Deprecated()
        public static void getScaledPanX$annotations() {
        }
        
        /**
         * Returns the current vertical pan value, in content scaled coordinates
         * (that is, including the current zoom).
         * This is equivalent to [panY] multiplied by [realZoom].
         *
         * @return the current vertical pan
         */
        @com.lam2000.base_module.view.zoomview.ZoomApi.ScaledPan()
        @java.lang.Deprecated()
        public static void getScaledPanY$annotations() {
        }
        
        /**
         * Sets the base transformation to be applied to the content.
         * See [setTransformation].
         *
         * @param transformation the transformation type
         */
        public static void setTransformation(@org.jetbrains.annotations.NotNull()
        com.lam2000.base_module.view.zoomview.ZoomApi $this, @com.lam2000.base_module.view.zoomview.ZoomApi.Transformation()
        int transformation) {
        }
        
        /**
         * Which is the max zoom that should be allowed.
         * If [ZoomApi.setOverPinchable] is set to true, this can be over-pinched
         * for a brief time.
         *
         * @param maxZoom the max zoom
         */
        public static void setMaxZoom(@org.jetbrains.annotations.NotNull()
        com.lam2000.base_module.view.zoomview.ZoomApi $this, @com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
        float maxZoom) {
        }
        
        /**
         * Which is the min zoom that should be allowed.
         * If [ZoomApi.setOverPinchable] is set to true, this can be over-pinched
         * for a brief time.
         *
         * @param minZoom the min zoom
         */
        public static void setMinZoom(@org.jetbrains.annotations.NotNull()
        com.lam2000.base_module.view.zoomview.ZoomApi $this, @com.lam2000.base_module.view.zoomview.ZoomApi.Zoom()
        float minZoom) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomApi$Companion;", "", "()V", "ALIGNMENT_DEFAULT", "", "MAX_ZOOM_DEFAULT", "", "MAX_ZOOM_DEFAULT_TYPE", "MIN_ZOOM_DEFAULT", "MIN_ZOOM_DEFAULT_TYPE", "TRANSFORMATION_CENTER_CROP", "TRANSFORMATION_CENTER_INSIDE", "TRANSFORMATION_GRAVITY_AUTO", "TRANSFORMATION_NONE", "TYPE_REAL_ZOOM", "TYPE_ZOOM", "base-module_debug"})
    public static final class Companion {
        
        /**
         * Flag for zoom constraints and settings.
         * With [ZoomApi.TYPE_ZOOM] the constraint is measured over the zoom in [ZoomApi.zoom].
         * This is not the actual matrix scale value.
         *
         * @see zoom
         * @see realZoom
         */
        public static final int TYPE_ZOOM = 0;
        
        /**
         * Flag for zoom constraints and settings.
         * With [ZoomApi.TYPE_REAL_ZOOM] the constraint is measured over the zoom in [ZoomApi.realZoom],
         * which is the actual scale you get in the matrix.
         *
         * @see zoom
         * @see realZoom
         */
        public static final int TYPE_REAL_ZOOM = 1;
        
        /**
         * Constant for [ZoomApi.setTransformation].
         * The content will be zoomed so that it fits completely inside the container.
         */
        public static final int TRANSFORMATION_CENTER_INSIDE = 0;
        
        /**
         * Constant for [ZoomApi.setTransformation].
         * The content will be zoomed so that its smaller side fits exactly inside the container.
         * The larger side will be partially cropped.
         */
        public static final int TRANSFORMATION_CENTER_CROP = 1;
        
        /**
         * Constant for [ZoomApi.setTransformation].
         * No transformation will be applied, which means that both [ZoomApi.zoom] and
         * [ZoomApi.realZoom] will return the same value.
         */
        public static final int TRANSFORMATION_NONE = 2;
        
        /**
         * Constant for [ZoomApi.setTransformation] gravity.
         * This means that the gravity will be inferred from the alignment or
         * fallback to a reasonable default.
         */
        public static final int TRANSFORMATION_GRAVITY_AUTO = 0;
        
        /**
         * The default [setMinZoom] applied by the engine if none is specified.
         */
        public static final float MIN_ZOOM_DEFAULT = 0.8F;
        
        /**
         * The default [setMinZoom] type applied by the engine if none is specified.
         */
        public static final int MIN_ZOOM_DEFAULT_TYPE = 0;
        
        /**
         * The default [setMaxZoom] applied by the engine if none is specified.
         */
        public static final float MAX_ZOOM_DEFAULT = 2.5F;
        
        /**
         * The default [setMaxZoom] type applied by the engine if none is specified.
         */
        public static final int MAX_ZOOM_DEFAULT_TYPE = 0;
        
        /**
         * The default value for [setAlignment].
         */
        public static final int ALIGNMENT_DEFAULT = 51;
        
        private Companion() {
            super();
        }
    }
}