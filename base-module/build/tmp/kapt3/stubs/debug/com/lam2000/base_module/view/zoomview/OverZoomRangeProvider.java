package com.lam2000.base_module.view.zoomview;

import java.lang.System;

/**
 * Defines the allowed range for overzoom.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/OverZoomRangeProvider;", "", "getOverZoom", "", "engine", "Lcom/lam2000/base_module/view/zoomview/ZoomEngine;", "inwards", "", "Companion", "base-module_debug"})
public abstract interface OverZoomRangeProvider {
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.view.zoomview.OverZoomRangeProvider.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.view.zoomview.OverZoomRangeProvider DEFAULT = null;
    
    /**
     * Calculates the maximum overzoom to allow
     *
     * @param engine the zoom engine
     * @param inwards true for inwards, false for outwards
     * @return the maximum overzoom to allow
     */
    @com.lam2000.base_module.view.zoomview.ZoomApi.RealZoom()
    public abstract float getOverZoom(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.view.zoomview.ZoomEngine engine, boolean inwards);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0001\u00a8\u0006\u0005"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/OverZoomRangeProvider$Companion;", "", "()V", "DEFAULT", "Lcom/lam2000/base_module/view/zoomview/OverZoomRangeProvider;", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}