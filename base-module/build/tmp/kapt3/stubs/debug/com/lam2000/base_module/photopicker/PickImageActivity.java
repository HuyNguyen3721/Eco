package com.lam2000.base_module.photopicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0014J\b\u0010$\u001a\u00020\"H\u0014J\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\"H\u0014J\u0012\u0010\'\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J,\u0010*\u001a\u00020\"2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020\u0002H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010 \u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/lam2000/base_module/photopicker/PickImageActivity;", "Lcom/lam2000/base_module/activity/BaseActivity;", "Lcom/lam2000/base_module/databinding/ActivityPickImageBinding;", "()V", "adapter", "Lcom/lam2000/base_module/photopicker/ImageAlbumAdapter;", "directories", "", "Lcom/lam2000/base_module/photopicker/PhotoDirectory;", "directoryAdapter", "Lcom/lam2000/base_module/photopicker/PopupDirectoryListAdapter;", "isSingleSelect", "", "()Z", "isSingleSelect$delegate", "Lkotlin/Lazy;", "listPopupWindow", "Landroidx/appcompat/widget/ListPopupWindow;", "maxPhoto", "", "getMaxPhoto", "()Ljava/lang/Integer;", "maxPhoto$delegate", "minPhoto", "getMinPhoto", "()I", "minPhoto$delegate", "pickerViewModel", "Lcom/lam2000/base_module/photopicker/PickerViewModel;", "getPickerViewModel", "()Lcom/lam2000/base_module/photopicker/PickerViewModel;", "pickerViewModel$delegate", "selectedAdapter", "adjustHeight", "", "initData", "initListener", "initPopupDirs", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDirectoryItemClick", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "id", "", "viewBinding", "Companion", "base-module_debug"})
public final class PickImageActivity extends com.lam2000.base_module.activity.BaseActivity<com.lam2000.base_module.databinding.ActivityPickImageBinding> {
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.photopicker.PickImageActivity.Companion Companion = null;
    private static final java.lang.String TAG = "PICK_IMAGE";
    private static final java.lang.String KEY_LIMIT_MAX_IMAGE = "KEY_LIMIT_MAX_IMAGE";
    private static final java.lang.String KEY_LIMIT_MIN_IMAGE = "KEY_LIMIT_MIN_IMAGE";
    private static final java.lang.String KEY_PICK_ONE = "KEY_PICK_ONE";
    private static final int COUNT_MAX = 5;
    public static final int REQUEST_CODE = 273;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String URI_IMAGES_RESULT = "URI_IMAGES_RESULT";
    private final kotlin.Lazy pickerViewModel$delegate = null;
    private androidx.appcompat.widget.ListPopupWindow listPopupWindow;
    private com.lam2000.base_module.photopicker.ImageAlbumAdapter adapter;
    private com.lam2000.base_module.photopicker.ImageAlbumAdapter selectedAdapter;
    private com.lam2000.base_module.photopicker.PopupDirectoryListAdapter directoryAdapter;
    private final java.util.List<com.lam2000.base_module.photopicker.PhotoDirectory> directories = null;
    private final kotlin.Lazy maxPhoto$delegate = null;
    private final kotlin.Lazy minPhoto$delegate = null;
    private final kotlin.Lazy isSingleSelect$delegate = null;
    
    public PickImageActivity() {
        super();
    }
    
    private final com.lam2000.base_module.photopicker.PickerViewModel getPickerViewModel() {
        return null;
    }
    
    private final java.lang.Integer getMaxPhoto() {
        return null;
    }
    
    private final int getMinPhoto() {
        return 0;
    }
    
    private final boolean isSingleSelect() {
        return false;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void initView() {
    }
    
    private final void initPopupDirs() {
    }
    
    @java.lang.Override()
    protected void initData() {
    }
    
    @java.lang.Override()
    protected void initListener() {
    }
    
    private final void onDirectoryItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    }
    
    private final void adjustHeight() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.lam2000.base_module.databinding.ActivityPickImageBinding viewBinding() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\r0\u0011J<\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\r0\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/lam2000/base_module/photopicker/PickImageActivity$Companion;", "", "()V", "COUNT_MAX", "", "KEY_LIMIT_MAX_IMAGE", "", "KEY_LIMIT_MIN_IMAGE", "KEY_PICK_ONE", "REQUEST_CODE", "TAG", "URI_IMAGES_RESULT", "start", "", "activity", "Lcom/lam2000/base_module/activity/BaseActivity;", "result", "Lkotlin/Function1;", "", "Landroid/net/Uri;", "minImage", "maxImage", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void start(@org.jetbrains.annotations.NotNull()
        com.lam2000.base_module.activity.BaseActivity<?> activity, int minImage, int maxImage, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.util.List<android.net.Uri>, kotlin.Unit> result) {
        }
        
        public final void start(@org.jetbrains.annotations.NotNull()
        com.lam2000.base_module.activity.BaseActivity<?> activity, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.util.List<android.net.Uri>, kotlin.Unit> result) {
        }
    }
}