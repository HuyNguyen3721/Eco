package com.lam2000.base_module.view.zoomview.movement;

import java.lang.System;

/**
 * Base class for movement managers like [PanManager] or [ZoomManager].
 *
 * They will typically need access to the [MatrixController] to check the
 * current matrix state.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b \u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH&R\u0014\u0010\u0006\u001a\u00020\u00048DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0012\u0010\f\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/movement/MovementManager;", "", "controllerProvider", "Lkotlin/Function0;", "Lcom/lam2000/base_module/view/zoomview/matrix/MatrixController;", "(Lkotlin/jvm/functions/Function0;)V", "controller", "getController", "()Lcom/lam2000/base_module/view/zoomview/matrix/MatrixController;", "isEnabled", "", "()Z", "isOverEnabled", "clear", "", "base-module_debug"})
public abstract class MovementManager {
    private final kotlin.jvm.functions.Function0<com.lam2000.base_module.view.zoomview.matrix.MatrixController> controllerProvider = null;
    
    public MovementManager(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<com.lam2000.base_module.view.zoomview.matrix.MatrixController> controllerProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.lam2000.base_module.view.zoomview.matrix.MatrixController getController() {
        return null;
    }
    
    /**
     * Whether this movement is enabled.
     */
    public abstract boolean isEnabled();
    
    /**
     * Whether over-movement is allowed, which means,
     * temporarily going over the boundaries during a gesture.
     */
    public abstract boolean isOverEnabled();
    
    /**
     * Resets to the initial state.
     * Should not clear settings (like min/max values and options),
     * but just the current state if any.
     */
    public abstract void clear();
}