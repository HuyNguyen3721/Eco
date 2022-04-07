package com.lam2000.base_module.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00020\u0007\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0002\u001a\f\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u0002\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010\u001a\n\u0010\u0011\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\u0012\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0006*\u00020\u0002\u001a\u0012\u0010\u0014\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u001e\u0010\u0015\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u001a$\u0010\u0017\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u001a\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\u001a"}, d2 = {"infoDetail", "", "Ljava/io/File;", "getInfoDetail", "(Ljava/io/File;)Ljava/lang/String;", "containOnlyFile", "", "", "getFileLength", "getFileSize", "", "getThumbnail", "Landroid/graphics/Bitmap;", "installApp", "", "context", "Landroid/content/Context;", "isImage", "isPdf", "isVideo", "openFile", "share", "fileType", "shareMultiFile", "uriFromFile", "Landroid/net/Uri;", "base-module_debug"})
public final class FileExtensionsKt {
    
    public static final boolean isPdf(@org.jetbrains.annotations.NotNull()
    java.io.File $this$isPdf) {
        return false;
    }
    
    public static final boolean isVideo(@org.jetbrains.annotations.NotNull()
    java.io.File $this$isVideo) {
        return false;
    }
    
    public static final boolean isImage(@org.jetbrains.annotations.NotNull()
    java.io.File $this$isImage) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Bitmap getThumbnail(@org.jetbrains.annotations.NotNull()
    java.io.File $this$getThumbnail) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getInfoDetail(@org.jetbrains.annotations.NotNull()
    java.io.File $this$infoDetail) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getFileLength(@org.jetbrains.annotations.NotNull()
    java.io.File $this$getFileLength) {
        return null;
    }
    
    public static final void openFile(@org.jetbrains.annotations.NotNull()
    java.io.File $this$openFile, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public static final void installApp(@org.jetbrains.annotations.NotNull()
    java.io.File $this$installApp, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.net.Uri uriFromFile(@org.jetbrains.annotations.NotNull()
    java.io.File $this$uriFromFile, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public static final long getFileSize(@org.jetbrains.annotations.NotNull()
    java.io.File $this$getFileSize) {
        return 0L;
    }
    
    public static final void share(@org.jetbrains.annotations.NotNull()
    java.io.File $this$share, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String fileType) {
    }
    
    public static final void shareMultiFile(@org.jetbrains.annotations.NotNull()
    java.util.List<java.io.File> $this$shareMultiFile, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String fileType) {
    }
    
    public static final boolean containOnlyFile(@org.jetbrains.annotations.NotNull()
    java.util.List<java.io.File> $this$containOnlyFile) {
        return false;
    }
}