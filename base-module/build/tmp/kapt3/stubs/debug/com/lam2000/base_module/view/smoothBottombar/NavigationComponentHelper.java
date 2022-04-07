package com.lam2000.base_module.view.smoothBottombar;

import java.lang.System;

/**
 * Created by Mayokun Adeniyi on 24/04/2020.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/lam2000/base_module/view/smoothBottombar/NavigationComponentHelper;", "", "()V", "Companion", "base-module_debug"})
public final class NavigationComponentHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.view.smoothBottombar.NavigationComponentHelper.Companion Companion = null;
    
    public NavigationComponentHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bJ\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/lam2000/base_module/view/smoothBottombar/NavigationComponentHelper$Companion;", "", "()V", "matchDestination", "", "destination", "Landroidx/navigation/NavDestination;", "destId", "", "setupWithNavController", "", "menu", "Landroid/view/Menu;", "smoothBottomBar", "Lcom/lam2000/base_module/view/smoothBottombar/SmoothBottomBar;", "navController", "Landroidx/navigation/NavController;", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void setupWithNavController(@org.jetbrains.annotations.NotNull()
        android.view.Menu menu, @org.jetbrains.annotations.NotNull()
        com.lam2000.base_module.view.smoothBottombar.SmoothBottomBar smoothBottomBar, @org.jetbrains.annotations.NotNull()
        androidx.navigation.NavController navController) {
        }
        
        /**
         * Determines whether the given `destId` matches the NavDestination. This handles
         * both the default case (the destination's id matches the given id) and the nested case where
         * the given id is a parent/grandparent/etc of the destination.
         */
        public final boolean matchDestination(@org.jetbrains.annotations.NotNull()
        androidx.navigation.NavDestination destination, @androidx.annotation.IdRes()
        int destId) {
            return false;
        }
    }
}