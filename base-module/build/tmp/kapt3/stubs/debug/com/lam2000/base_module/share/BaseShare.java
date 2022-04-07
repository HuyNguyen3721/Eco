package com.lam2000.base_module.share;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ&\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bJ.\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b\u00a8\u0006\u0010"}, d2 = {"Lcom/lam2000/base_module/share/BaseShare;", "", "()V", "hasPackage", "", "context", "Landroid/content/Context;", "packages", "", "shareStream", "", "file", "Ljava/io/File;", "streamType", "title", "Companion", "base-module_debug"})
public class BaseShare {
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.share.BaseShare.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VIDEO_STREAM = "video/*";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_STREAM = "image/*";
    
    public BaseShare() {
        super();
    }
    
    public final void shareStream(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    java.lang.String streamType, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final void shareStream(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    java.lang.String streamType, @org.jetbrains.annotations.NotNull()
    java.lang.String packages, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final boolean hasPackage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String packages) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/lam2000/base_module/share/BaseShare$Companion;", "", "()V", "IMAGE_STREAM", "", "VIDEO_STREAM", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}