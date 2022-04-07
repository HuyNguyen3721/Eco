package com.lam2000.base_module.view.zoomview;

import java.lang.System;

/**
 * Deals with touch input, holds the internal [state] integer,
 * and applies special logic to touch inputs and state changes to
 * prefer one gesture over the other, for example.
 *
 * Note: the [Callback] is responsible for actually trying to start
 * the gesture in the callbacks. Whenever needed, [setState] must be called to keep
 * this class in sync with what's happening.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 /2\u00020\u0001:\u0003./0B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\r\u0010\f\u001a\u00020\rH\u0000\u00a2\u0006\u0002\b\u000eJ\r\u0010\u000f\u001a\u00020\rH\u0000\u00a2\u0006\u0002\b\u0010J\r\u0010\u0011\u001a\u00020\rH\u0000\u00a2\u0006\u0002\b\u0012J\r\u0010\u0013\u001a\u00020\rH\u0000\u00a2\u0006\u0002\b\u0014J\r\u0010\u0015\u001a\u00020\rH\u0000\u00a2\u0006\u0002\b\u0016J\r\u0010\u0017\u001a\u00020\rH\u0000\u00a2\u0006\u0002\b\u0018J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000\u00a2\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000\u00a2\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001cH\u0002J\r\u0010\"\u001a\u00020\rH\u0000\u00a2\u0006\u0002\b#J\r\u0010$\u001a\u00020\rH\u0000\u00a2\u0006\u0002\b%J\r\u0010&\u001a\u00020\rH\u0000\u00a2\u0006\u0002\b\'J\r\u0010(\u001a\u00020\rH\u0000\u00a2\u0006\u0002\b)J\u0010\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u0006H\u0002J\f\u0010,\u001a\u00020-*\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u00a8\u00061"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/StateController;", "", "callback", "Lcom/lam2000/base_module/view/zoomview/StateController$Callback;", "(Lcom/lam2000/base_module/view/zoomview/StateController$Callback;)V", "<set-?>", "", "state", "getState$base_module_debug$annotations", "()V", "getState$base_module_debug", "()I", "isAnimating", "", "isAnimating$base_module_debug", "isFlinging", "isFlinging$base_module_debug", "isIdle", "isIdle$base_module_debug", "isPinching", "isPinching$base_module_debug", "isScrolling", "isScrolling$base_module_debug", "makeIdle", "makeIdle$base_module_debug", "needsCleanupWhenCalledTwice", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onInterceptTouchEvent$base_module_debug", "onTouchEvent", "onTouchEvent$base_module_debug", "processTouchEvent", "event", "setAnimating", "setAnimating$base_module_debug", "setFlinging", "setFlinging$base_module_debug", "setPinching", "setPinching$base_module_debug", "setScrolling", "setScrolling$base_module_debug", "setState", "newState", "toStateName", "", "Callback", "Companion", "State", "base-module_debug"})
public final class StateController {
    private final com.lam2000.base_module.view.zoomview.StateController.Callback callback = null;
    
    /**
     * Returns the current state.
     * One of the [State] constants.
     */
    private int state = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.view.zoomview.StateController.Companion Companion = null;
    public static final int IDLE = 0;
    public static final int SCROLLING = 1;
    public static final int PINCHING = 2;
    public static final int ANIMATING = 3;
    public static final int FLINGING = 4;
    
    /**
     * Constant for [processTouchEvent].
     * Indicates that we are not interested in this event stream.
     */
    private static final int TOUCH_NO = 0;
    
    /**
     * Constant for [processTouchEvent].
     * Indicates that we are interested in this event stream,
     * but we're not sure we have something just yet.
     * The gesture might start at a later point.
     */
    private static final int TOUCH_LISTEN = 1;
    
    /**
     * Constant for [processTouchEvent].
     * Indicates that we want to own this stream and intercept
     * it as long as this value is returned.
     */
    private static final int TOUCH_STEAL = 2;
    
    public StateController(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.StateController.Callback callback) {
        super();
    }
    
    public final int getState$base_module_debug() {
        return 0;
    }
    
    /**
     * Returns the current state.
     * One of the [State] constants.
     */
    @com.lam2000.base_module.view.zoomview.StateController.State()
    @java.lang.Deprecated()
    public static void getState$base_module_debug$annotations() {
    }
    
    /**
     * Whether this state needs cleanup even if called twice.
     * The [ANIMATING] state currently needs it.
     */
    private final boolean needsCleanupWhenCalledTwice(@com.lam2000.base_module.view.zoomview.StateController.State()
    int state) {
        return false;
    }
    
    /**
     * Private function to set the current state.
     * External callers should use [setPinching], [setScrolling], [makeIdle]... instead.
     * @return true if the new state was applied, false otherwise
     */
    private final boolean setState(@com.lam2000.base_module.view.zoomview.StateController.State()
    int newState) {
        return false;
    }
    
    /**
     * Processes the event. Should be called during the
     * [android.view.ViewGroup.onInterceptTouchEvent] callback.
     */
    public final boolean onInterceptTouchEvent$base_module_debug(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent ev) {
        return false;
    }
    
    /**
     * Processes the event. Should be called during the
     * [android.view.View.onTouchEvent] callback.
     */
    public final boolean onTouchEvent$base_module_debug(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent ev) {
        return false;
    }
    
    /**
     * Processes the touch event and returns one of [TOUCH_LISTEN],
     * [TOUCH_STEAL] or [TOUCH_NO].
     */
    private final int processTouchEvent(android.view.MotionEvent event) {
        return 0;
    }
    
    /**
     * Whether we are in [FLINGING] state.
     */
    public final boolean isFlinging$base_module_debug() {
        return false;
    }
    
    /**
     * Whether we are in [SCROLLING] state.
     */
    @kotlin.Suppress(names = {"MemberVisibilityCanBePrivate"})
    public final boolean isScrolling$base_module_debug() {
        return false;
    }
    
    /**
     * Whether we are in [PINCHING] state.
     */
    @kotlin.Suppress(names = {"MemberVisibilityCanBePrivate"})
    public final boolean isPinching$base_module_debug() {
        return false;
    }
    
    /**
     * Whether we are in [ANIMATING] state.
     */
    public final boolean isAnimating$base_module_debug() {
        return false;
    }
    
    /**
     * Whether we are in [IDLE] state.
     */
    @kotlin.Suppress(names = {"MemberVisibilityCanBePrivate"})
    public final boolean isIdle$base_module_debug() {
        return false;
    }
    
    /**
     * Moves state to [FLINGING]. Returns true if successful.
     */
    public final boolean setFlinging$base_module_debug() {
        return false;
    }
    
    /**
     * Moves state to [SCROLLING]. Returns true if successful.
     */
    public final boolean setScrolling$base_module_debug() {
        return false;
    }
    
    /**
     * Moves state to [PINCHING]. Returns true if successful.
     */
    public final boolean setPinching$base_module_debug() {
        return false;
    }
    
    /**
     * Moves state to [ANIMATING]. Returns true if successful.
     */
    public final boolean setAnimating$base_module_debug() {
        return false;
    }
    
    /**
     * Moves state to [IDLE]. Returns true if successful.
     */
    public final boolean makeIdle$base_module_debug() {
        return false;
    }
    
    private final java.lang.String toStateName(int $this$toStateName) {
        return null;
    }
    
    /**
     * Receives callbacks from this controller.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\u0003H&\u00a8\u0006\u000f"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/StateController$Callback;", "", "cleanupState", "", "oldState", "", "endScrollGesture", "isStateAllowed", "", "newState", "maybeStartPinchGesture", "event", "Landroid/view/MotionEvent;", "maybeStartScrollFlingGesture", "onStateIdle", "base-module_debug"})
    public static abstract interface Callback {
        
        public abstract boolean isStateAllowed(@com.lam2000.base_module.view.zoomview.StateController.State()
        int newState);
        
        public abstract void onStateIdle();
        
        public abstract void cleanupState(@com.lam2000.base_module.view.zoomview.StateController.State()
        int oldState);
        
        public abstract boolean maybeStartPinchGesture(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event);
        
        public abstract boolean maybeStartScrollFlingGesture(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent event);
        
        public abstract void endScrollGesture();
    }
    
    @androidx.annotation.IntDef(value = {0, 1, 2, 3, 4})
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/StateController$State;", "", "base-module_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface State {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/StateController$Companion;", "", "()V", "ANIMATING", "", "FLINGING", "IDLE", "PINCHING", "SCROLLING", "TOUCH_LISTEN", "TOUCH_NO", "TOUCH_STEAL", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}