package com.lam2000.base_module.photopicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001$BK\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u001d\u001a\u00020\u000f2\n\u0010\u001e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u001c\u0010 \u001a\u00060\u0003R\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006%"}, d2 = {"Lcom/lam2000/base_module/photopicker/ImageAlbumAdapter;", "Lcom/lam2000/base_module/adapter/BaseRecyclerAdapter;", "Lcom/lam2000/base_module/photopicker/Photo;", "Lcom/lam2000/base_module/photopicker/ImageAlbumAdapter$ViewHolder;", "context", "Landroid/content/Context;", "list", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "columnNumber", "", "isShowRemove", "", "onItemSelected", "Lkotlin/Function1;", "", "(Landroid/content/Context;Ljava/util/ArrayList;IZLkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "imageSize", "()Z", "setShowRemove", "(Z)V", "getOnItemSelected", "()Lkotlin/jvm/functions/Function1;", "setOnItemSelected", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "base-module_debug"})
public final class ImageAlbumAdapter extends com.lam2000.base_module.adapter.BaseRecyclerAdapter<com.lam2000.base_module.photopicker.Photo, com.lam2000.base_module.photopicker.ImageAlbumAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    private boolean isShowRemove;
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super com.lam2000.base_module.photopicker.Photo, kotlin.Unit> onItemSelected;
    private int imageSize = 0;
    
    public ImageAlbumAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.lam2000.base_module.photopicker.Photo> list, int columnNumber, boolean isShowRemove, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.lam2000.base_module.photopicker.Photo, kotlin.Unit> onItemSelected) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public final boolean isShowRemove() {
        return false;
    }
    
    public final void setShowRemove(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.lam2000.base_module.photopicker.Photo, kotlin.Unit> getOnItemSelected() {
        return null;
    }
    
    public final void setOnItemSelected(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.lam2000.base_module.photopicker.Photo, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.photopicker.ImageAlbumAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.lam2000.base_module.photopicker.ImageAlbumAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0096\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/lam2000/base_module/photopicker/ImageAlbumAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/lam2000/base_module/databinding/ItemImageBinding;", "(Lcom/lam2000/base_module/photopicker/ImageAlbumAdapter;Lcom/lam2000/base_module/databinding/ItemImageBinding;)V", "bindData", "", "imageModel", "Lcom/lam2000/base_module/photopicker/Photo;", "base-module_debug"})
    public class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.lam2000.base_module.databinding.ItemImageBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.lam2000.base_module.databinding.ItemImageBinding binding) {
            super(null);
        }
        
        @android.annotation.SuppressLint(value = {"CheckResult"})
        public final void bindData(@org.jetbrains.annotations.NotNull()
        com.lam2000.base_module.photopicker.Photo imageModel) {
        }
    }
}