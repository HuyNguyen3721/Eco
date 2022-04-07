package com.lam2000.base_module.view.zoomview;

import java.lang.System;

/**
 * Utility class that can log traces and info.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001H\u0000\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\b\tJ#\u0010\f\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001H\u0000\u00a2\u0006\u0004\b\r\u0010\nJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\b\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J)\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001H\u0002\u00a2\u0006\u0002\u0010\u0014J#\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001H\u0000\u00a2\u0006\u0004\b\u0016\u0010\nJ\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\b\u0016J#\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\b\"\u00020\u0001H\u0000\u00a2\u0006\u0004\b\u0018\u0010\nJ\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\b\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomLogger;", "", "mTag", "", "(Ljava/lang/String;)V", "e", "", "data", "", "e$base_module_debug", "([Ljava/lang/Object;)V", "message", "i", "i$base_module_debug", "should", "", "messageLevel", "", "string", "ofData", "(I[Ljava/lang/Object;)Ljava/lang/String;", "v", "v$base_module_debug", "w", "w$base_module_debug", "Companion", "LogLevel", "base-module_debug"})
public final class ZoomLogger {
    private final java.lang.String mTag = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.view.zoomview.ZoomLogger.Companion Companion = null;
    
    /**
     * Verbose logging level
     */
    public static final int LEVEL_VERBOSE = 0;
    
    /**
     * Info logging level
     */
    public static final int LEVEL_INFO = 1;
    
    /**
     * Warning logging level
     */
    public static final int LEVEL_WARNING = 2;
    
    /**
     * Error logging level
     */
    public static final int LEVEL_ERROR = 3;
    
    /**
     * Current logging level
     */
    private static int level = 3;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String lastMessage;
    @org.jetbrains.annotations.Nullable()
    private static java.lang.String lastTag;
    
    private ZoomLogger(java.lang.String mTag) {
        super();
    }
    
    @kotlin.Suppress(names = {"unused"})
    public final void v$base_module_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void i$base_module_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @kotlin.Suppress(names = {"MemberVisibilityCanBePrivate"})
    public final void w$base_module_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @kotlin.Suppress(names = {"MemberVisibilityCanBePrivate"})
    public final void e$base_module_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    private final boolean should(@com.lam2000.base_module.view.zoomview.ZoomLogger.LogLevel()
    int messageLevel) {
        return false;
    }
    
    private final java.lang.String string(@com.lam2000.base_module.view.zoomview.ZoomLogger.LogLevel()
    int messageLevel, java.lang.Object... ofData) {
        return null;
    }
    
    public final void v$base_module_debug(@org.jetbrains.annotations.NotNull()
    java.lang.Object... data) {
    }
    
    public final void i$base_module_debug(@org.jetbrains.annotations.NotNull()
    java.lang.Object... data) {
    }
    
    public final void w$base_module_debug(@org.jetbrains.annotations.NotNull()
    java.lang.Object... data) {
    }
    
    @kotlin.Suppress(names = {"unused"})
    public final void e$base_module_debug(@org.jetbrains.annotations.NotNull()
    java.lang.Object... data) {
    }
    
    /**
     * Set the most verbose log level to output in log
     *
     * @param logLevel a log level
     */
    public static final void setLogLevel(@com.lam2000.base_module.view.zoomview.ZoomLogger.LogLevel()
    int logLevel) {
    }
    
    @androidx.annotation.IntDef(value = {0, 1, 2, 3})
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomLogger$LogLevel;", "", "base-module_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface LogLevel {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0000\u00a2\u0006\u0002\b\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/lam2000/base_module/view/zoomview/ZoomLogger$Companion;", "", "()V", "LEVEL_ERROR", "", "LEVEL_INFO", "LEVEL_VERBOSE", "LEVEL_WARNING", "lastMessage", "", "getLastMessage$base_module_debug", "()Ljava/lang/String;", "setLastMessage$base_module_debug", "(Ljava/lang/String;)V", "lastTag", "getLastTag$base_module_debug", "setLastTag$base_module_debug", "level", "create", "Lcom/lam2000/base_module/view/zoomview/ZoomLogger;", "tag", "create$base_module_debug", "setLogLevel", "", "logLevel", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Set the most verbose log level to output in log
         *
         * @param logLevel a log level
         */
        public final void setLogLevel(@com.lam2000.base_module.view.zoomview.ZoomLogger.LogLevel()
        int logLevel) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLastMessage$base_module_debug() {
            return null;
        }
        
        public final void setLastMessage$base_module_debug(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLastTag$base_module_debug() {
            return null;
        }
        
        public final void setLastTag$base_module_debug(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lam2000.base_module.view.zoomview.ZoomLogger create$base_module_debug(@org.jetbrains.annotations.NotNull()
        java.lang.String tag) {
            return null;
        }
    }
}