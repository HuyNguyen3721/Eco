package com.lam2000.base_module.view.zoomview;

import java.lang.System;

/**
 * Holds constants for [ZoomApi.setAlignment].
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b\u0012J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b\u0017J\u001d\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\b\u001aJ\u001d\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/Alignment;", "", "()V", "BOTTOM", "", "CENTER", "CENTER_HORIZONTAL", "CENTER_VERTICAL", "LEFT", "MASK", "NONE", "NONE_HORIZONTAL", "NONE_VERTICAL", "NO_VALUE", "RIGHT", "TOP", "getHorizontal", "alignment", "getHorizontal$base_module_debug", "getVertical", "getVertical$base_module_debug", "isNone", "", "isNone$base_module_debug", "toHorizontalGravity", "valueIfNone", "toHorizontalGravity$base_module_debug", "toVerticalGravity", "toVerticalGravity$base_module_debug", "base-module_debug"})
public final class Alignment {
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.view.zoomview.Alignment INSTANCE = null;
    private static final int MASK = 240;
    private static final int NO_VALUE = 0;
    
    /**
     * Aligns top side of the content to the top side of the container.
     */
    public static final int TOP = 1;
    
    /**
     * Aligns the bottom side of the content to the bottom side of the container.
     */
    public static final int BOTTOM = 2;
    
    /**
     * Centers the content vertically inside the container.
     */
    public static final int CENTER_VERTICAL = 3;
    
    /**
     * No forced alignment on the vertical axis.
     */
    public static final int NONE_VERTICAL = 4;
    
    /**
     * Aligns left side of the content to the left side of the container.
     */
    public static final int LEFT = 16;
    
    /**
     * Aligns right side of the content to the right side of the container.
     */
    public static final int RIGHT = 32;
    
    /**
     * Centers the content horizontally inside the container.
     */
    public static final int CENTER_HORIZONTAL = 48;
    
    /**
     * No forced alignment on the horizontal axis.
     */
    public static final int NONE_HORIZONTAL = 64;
    
    /**
     * Shorthand for [CENTER_HORIZONTAL] and [CENTER_VERTICAL] together.
     */
    public static final int CENTER = 51;
    
    /**
     * Shorthand for [NONE_HORIZONTAL] and [NONE_VERTICAL] together.
     */
    public static final int NONE = 68;
    
    private Alignment() {
        super();
    }
    
    /**
     * Returns the horizontal alignment for this alignment,
     * or [NO_VALUE] if no value was set.
     */
    public final int getHorizontal$base_module_debug(int alignment) {
        return 0;
    }
    
    /**
     * Returns the vertical alignment for this alignment,
     * or [NO_VALUE] if no value was set.
     */
    public final int getVertical$base_module_debug(int alignment) {
        return 0;
    }
    
    /**
     * Returns whether this alignment is of 'none' type.
     * In case [alignment] includes both axes, both are required to be 'none' or [NO_VALUE].
     */
    public final boolean isNone$base_module_debug(int alignment) {
        return false;
    }
    
    /**
     * Transforms this alignment to a horizontal gravity value.
     */
    @android.annotation.SuppressLint(value = {"RtlHardcoded"})
    @kotlin.Suppress(names = {"MoveVariableDeclarationIntoWhen"})
    public final int toHorizontalGravity$base_module_debug(int alignment, int valueIfNone) {
        return 0;
    }
    
    /**
     * Transforms this alignment to a vertical gravity value.
     */
    @kotlin.Suppress(names = {"MoveVariableDeclarationIntoWhen"})
    public final int toVerticalGravity$base_module_debug(int alignment, int valueIfNone) {
        return 0;
    }
}