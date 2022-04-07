package com.lam2000.base_module.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u001a0\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u001aA\u0010\u000b\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000e\u001aB\u0010\u000f\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"CROSS_FADE_DURATION", "", "loadBlurredImage", "", "Landroid/widget/ImageView;", "url", "", "color", "requestListener", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "loadPhotoUrl", "colorInt", "colorString", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/bumptech/glide/request/RequestListener;)V", "loadPhotoUrlWithThumbnail", "thumbnailUrl", "centerCrop", "", "base-module_debug"})
public final class ImageExtensionsKt {
    public static final int CROSS_FADE_DURATION = 350;
    
    public static final void loadPhotoUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadPhotoUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.Integer colorInt, @org.jetbrains.annotations.Nullable()
    java.lang.String colorString, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.request.RequestListener<android.graphics.drawable.Drawable> requestListener) {
    }
    
    public static final void loadPhotoUrlWithThumbnail(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadPhotoUrlWithThumbnail, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String thumbnailUrl, @org.jetbrains.annotations.Nullable()
    java.lang.String color, boolean centerCrop, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.request.RequestListener<android.graphics.drawable.Drawable> requestListener) {
    }
    
    public static final void loadBlurredImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadBlurredImage, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String color, @org.jetbrains.annotations.Nullable()
    com.bumptech.glide.request.RequestListener<android.graphics.drawable.Drawable> requestListener) {
    }
}