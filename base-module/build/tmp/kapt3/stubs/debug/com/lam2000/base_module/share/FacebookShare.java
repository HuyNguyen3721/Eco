package com.lam2000.base_module.share;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/lam2000/base_module/share/FacebookShare;", "Lcom/lam2000/base_module/share/BaseShare;", "Lcom/lam2000/base_module/share/ShareFileDelegate;", "()V", "shareImages", "", "context", "Landroid/content/Context;", "file", "Ljava/io/File;", "title", "", "shareVideo", "Companion", "base-module_debug"})
public final class FacebookShare extends com.lam2000.base_module.share.BaseShare implements com.lam2000.base_module.share.ShareFileDelegate {
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.share.FacebookShare.Companion Companion = null;
    private static final java.lang.String FACEBOOK_PACKAGE = "com.facebook.katana";
    
    public FacebookShare() {
        super();
    }
    
    @java.lang.Override()
    public void shareVideo(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @java.lang.Override()
    public void shareImages(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.io.File file, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/lam2000/base_module/share/FacebookShare$Companion;", "", "()V", "FACEBOOK_PACKAGE", "", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}