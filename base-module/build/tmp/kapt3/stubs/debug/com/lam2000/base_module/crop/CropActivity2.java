package com.lam2000.base_module.crop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0014J\b\u0010\u001d\u001a\u00020\u001bH\u0014J\b\u0010\u001e\u001a\u00020\u001bH\u0014J\b\u0010\u001f\u001a\u00020\u001bH\u0016J\u0012\u0010 \u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&H\u0016J&\u0010\'\u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010$2\b\u0010(\u001a\u0004\u0018\u00010\u00152\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u001bH\u0014J\b\u0010,\u001a\u00020\u001bH\u0014J\b\u0010-\u001a\u00020\u001bH\u0002J\b\u0010.\u001a\u00020\u0002H\u0014R#\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\u00a8\u00060"}, d2 = {"Lcom/lam2000/base_module/crop/CropActivity2;", "Lcom/lam2000/base_module/activity/BaseActivity;", "Lcom/lam2000/base_module/databinding/ActivityCrop2Binding;", "Landroid/view/View$OnClickListener;", "Lcom/lam2000/base_module/crop/cropper/CropImageView$OnSetImageUriCompleteListener;", "Lcom/lam2000/base_module/crop/cropper/CropImageView$OnCropImageCompleteListener;", "()V", "dataCrop", "Lkotlin/Function1;", "Landroid/content/Context;", "", "Lcom/lam2000/base_module/crop/ItemCrop;", "getDataCrop", "()Lkotlin/jvm/functions/Function1;", "itemCropAdapter", "Lcom/lam2000/base_module/crop/ItemCropAdapter;", "mOptions", "Lcom/lam2000/base_module/crop/cropper/CropImageOptions;", "onChanged", "", "uriImage", "Landroid/net/Uri;", "getUriImage", "()Landroid/net/Uri;", "uriImage$delegate", "Lkotlin/Lazy;", "cropImage", "", "initData", "initListener", "initView", "onBackPressed", "onClick", "view", "Landroid/view/View;", "onCropImageComplete", "Lcom/lam2000/base_module/crop/cropper/CropImageView;", "result", "Lcom/lam2000/base_module/crop/cropper/CropImageView$CropResult;", "onSetImageUriComplete", "uri", "error", "Ljava/lang/Exception;", "onStart", "onStop", "resetAll", "viewBinding", "Companion", "base-module_debug"})
public final class CropActivity2 extends com.lam2000.base_module.activity.BaseActivity<com.lam2000.base_module.databinding.ActivityCrop2Binding> implements android.view.View.OnClickListener, com.lam2000.base_module.crop.cropper.CropImageView.OnSetImageUriCompleteListener, com.lam2000.base_module.crop.cropper.CropImageView.OnCropImageCompleteListener {
    private com.lam2000.base_module.crop.ItemCropAdapter itemCropAdapter;
    private boolean onChanged = false;
    private com.lam2000.base_module.crop.cropper.CropImageOptions mOptions;
    @org.jetbrains.annotations.Nullable()
    private final kotlin.Lazy uriImage$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<android.content.Context, java.util.List<com.lam2000.base_module.crop.ItemCrop>> dataCrop = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.crop.CropActivity2.Companion Companion = null;
    private static final java.lang.String DATA_INTENT_CROP = "data intent crop";
    
    public CropActivity2() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getUriImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<android.content.Context, java.util.List<com.lam2000.base_module.crop.ItemCrop>> getDataCrop() {
        return null;
    }
    
    @java.lang.Override()
    protected void initView() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    public void onSetImageUriComplete(@org.jetbrains.annotations.Nullable()
    com.lam2000.base_module.crop.cropper.CropImageView view, @org.jetbrains.annotations.Nullable()
    android.net.Uri uri, @org.jetbrains.annotations.Nullable()
    java.lang.Exception error) {
    }
    
    @java.lang.Override()
    public void onCropImageComplete(@org.jetbrains.annotations.Nullable()
    com.lam2000.base_module.crop.cropper.CropImageView view, @org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.crop.cropper.CropImageView.CropResult result) {
    }
    
    @java.lang.Override()
    protected void initListener() {
    }
    
    private final void resetAll() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
    
    private final void cropImage() {
    }
    
    @java.lang.Override()
    protected void initData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.lam2000.base_module.databinding.ActivityCrop2Binding viewBinding() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00060\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/lam2000/base_module/crop/CropActivity2$Companion;", "", "()V", "DATA_INTENT_CROP", "", "start", "", "activity", "Lcom/lam2000/base_module/activity/BaseActivity;", "uri", "Landroid/net/Uri;", "result", "Lkotlin/Function1;", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void start(@org.jetbrains.annotations.NotNull()
        com.lam2000.base_module.activity.BaseActivity<?> activity, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit> result) {
        }
    }
}