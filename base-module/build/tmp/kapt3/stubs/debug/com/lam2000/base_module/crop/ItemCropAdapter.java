package com.lam2000.base_module.crop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001!B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\u0019\u001a\u00020\u000f2\n\u0010\u001a\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001c\u0010\u001d\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001cH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0002X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\""}, d2 = {"Lcom/lam2000/base_module/crop/ItemCropAdapter;", "Lcom/lam2000/base_module/adapter/BaseRecyclerAdapter;", "Lcom/lam2000/base_module/crop/ItemCrop;", "Lcom/lam2000/base_module/crop/ItemCropAdapter$ViewHolder;", "context", "Landroid/content/Context;", "list", "", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "itemSelectListener", "Lkotlin/Function1;", "", "getItemSelectListener", "()Lkotlin/jvm/functions/Function1;", "setItemSelectListener", "(Lkotlin/jvm/functions/Function1;)V", "itemSelected", "getItemSelected", "()Lcom/lam2000/base_module/crop/ItemCrop;", "setItemSelected", "(Lcom/lam2000/base_module/crop/ItemCrop;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "base-module_debug"})
public final class ItemCropAdapter extends com.lam2000.base_module.adapter.BaseRecyclerAdapter<com.lam2000.base_module.crop.ItemCrop, com.lam2000.base_module.crop.ItemCropAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private com.lam2000.base_module.crop.ItemCrop itemSelected;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.lam2000.base_module.crop.ItemCrop, kotlin.Unit> itemSelectListener;
    
    public ItemCropAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.lam2000.base_module.crop.ItemCrop> list) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.crop.ItemCrop getItemSelected() {
        return null;
    }
    
    public final void setItemSelected(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.crop.ItemCrop p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.lam2000.base_module.crop.ItemCrop, kotlin.Unit> getItemSelectListener() {
        return null;
    }
    
    public final void setItemSelectListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.lam2000.base_module.crop.ItemCrop, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.crop.ItemCropAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.lam2000.base_module.crop.ItemCropAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/lam2000/base_module/crop/ItemCropAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/lam2000/base_module/crop/ItemCropAdapter;Landroid/view/View;)V", "binding", "Lcom/lam2000/base_module/databinding/ItemBaseCropBinding;", "bindData", "", "itemCrop", "Lcom/lam2000/base_module/crop/ItemCrop;", "base-module_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.lam2000.base_module.databinding.ItemBaseCropBinding binding;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindData(@org.jetbrains.annotations.NotNull()
        com.lam2000.base_module.crop.ItemCrop itemCrop) {
        }
    }
}