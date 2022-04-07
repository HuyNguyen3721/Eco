package com.lam2000.base_module.view.zoomview;

import java.lang.System;

/**
 * Holds [ZoomEngine.Listener] and dispatches updates to them
 * when [dispatchOnIdle] or [dispatchOnMatrix] are called.
 *
 * It asks for a new matrix at each listener update which is important
 * so they don't mess each other.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\tH\u0000\u00a2\u0006\u0002\b\rJ\r\u0010\u000e\u001a\u00020\tH\u0000\u00a2\u0006\u0002\b\u000fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0000\u00a2\u0006\u0002\b\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/UpdatesDispatcher;", "", "engine", "Lcom/lam2000/base_module/view/zoomview/ZoomEngine;", "(Lcom/lam2000/base_module/view/zoomview/ZoomEngine;)V", "listeners", "", "Lcom/lam2000/base_module/view/zoomview/ZoomEngine$Listener;", "addListener", "", "listener", "addListener$base_module_debug", "dispatchOnIdle", "dispatchOnIdle$base_module_debug", "dispatchOnMatrix", "dispatchOnMatrix$base_module_debug", "removeListener", "removeListener$base_module_debug", "base-module_debug"})
public final class UpdatesDispatcher {
    private final com.lam2000.base_module.view.zoomview.ZoomEngine engine = null;
    private final java.util.List<com.lam2000.base_module.view.zoomview.ZoomEngine.Listener> listeners = null;
    
    public UpdatesDispatcher(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.ZoomEngine engine) {
        super();
    }
    
    /**
     * Dispatches [ZoomEngine.Listener.onUpdate] updates.
     */
    public final void dispatchOnMatrix$base_module_debug() {
    }
    
    /**
     * Dispatches [ZoomEngine.Listener.onIdle] updates.
     */
    public final void dispatchOnIdle$base_module_debug() {
    }
    
    /**
     * Registers a new [Listener] to be notified of matrix updates.
     * @param listener the new listener
     */
    public final void addListener$base_module_debug(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.ZoomEngine.Listener listener) {
    }
    
    /**
     * Removes a previously registered listener.
     * @param listener the listener to be removed
     */
    public final void removeListener$base_module_debug(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.ZoomEngine.Listener listener) {
    }
}