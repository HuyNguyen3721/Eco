package com.lam2000.base_module.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001e\u001a\u00020\u0015J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\b\u0010 \u001a\u00020\u0016H$J\b\u0010!\u001a\u00020\u0016H$J\b\u0010\"\u001a\u00020\u0016H$J\b\u0010#\u001a\u00020\u0015H\u0014J\u0012\u0010$\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J+\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u001a2\u0006\u0010,\u001a\u00020-H\u0016\u00a2\u0006\u0002\u0010.J9\u0010/\u001a\u00020\u00162\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0016\u0010*\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0\u001a\"\u0004\u0018\u00010+H\u0016\u00a2\u0006\u0002\u00101J\u001a\u00102\u001a\u00020\u00162\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014J\u0010\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020\u00162\u0006\u00105\u001a\u000206H\u0016J \u00108\u001a\u00020\u00162\u0006\u00105\u001a\u0002092\u0006\u0010:\u001a\u00020)2\u0006\u0010;\u001a\u00020\u0015H\u0016J\u001c\u0010<\u001a\u00020\u00162\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0004J\u000e\u0010=\u001a\u00020\u00162\u0006\u0010>\u001a\u00020\u0015J\b\u0010?\u001a\u00020\u0016H\u0002J\u0010\u0010@\u001a\u00020\u00162\b\u0010A\u001a\u0004\u0018\u00010+J\r\u0010B\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\rR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006C"}, d2 = {"Lcom/lam2000/base_module/activity/BaseActivity;", "B", "Landroidx/viewbinding/ViewBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "activityLauncher", "Lcom/lam2000/base_module/activity/BetterActivityResult;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "getActivityLauncher", "()Lcom/lam2000/base_module/activity/BetterActivityResult;", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "lastClickTime", "", "permissionComplete", "Lkotlin/Function1;", "", "", "progressDialog", "Lcom/lam2000/base_module/dialog/DialogLoading;", "viewException", "", "Landroid/view/View;", "getViewException", "()[Landroid/view/View;", "aVoidDoubleClick", "hideLoading", "initData", "initListener", "initView", "isAcceptManagerStorage", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestPermission", "complete", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/String;)V", "requestPermissionStorage", "result", "setAppActivityFullScreenOver", "activity", "Landroidx/fragment/app/FragmentActivity;", "setStatusBarHomeTransparent", "setWindowFlag", "Landroid/app/Activity;", "bits", "on", "showDialogDiscard", "showHideLoading", "isShow", "showLoading", "toast", "content", "viewBinding", "base-module_debug"})
public abstract class BaseActivity<B extends androidx.viewbinding.ViewBinding> extends androidx.appcompat.app.AppCompatActivity {
    protected B binding;
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> permissionComplete;
    private long lastClickTime = 0L;
    private com.lam2000.base_module.dialog.DialogLoading progressDialog;
    @org.jetbrains.annotations.NotNull()
    private final com.lam2000.base_module.activity.BetterActivityResult<android.content.Intent, androidx.activity.result.ActivityResult> activityLauncher = null;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final B getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.activity.BetterActivityResult<android.content.Intent, androidx.activity.result.ActivityResult> getActivityLauncher() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.view.View[] getViewException() {
        return null;
    }
    
    protected abstract void initView();
    
    protected abstract void initData();
    
    protected abstract void initListener();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract B viewBinding();
    
    private final void showLoading() {
    }
    
    public final void requestPermissionStorage(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> result) {
    }
    
    private final void hideLoading() {
    }
    
    public final void showHideLoading(boolean isShow) {
    }
    
    public final boolean aVoidDoubleClick() {
        return false;
    }
    
    public final void toast(@org.jetbrains.annotations.Nullable()
    java.lang.String content) {
    }
    
    public void requestPermission(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> complete, @org.jetbrains.annotations.NotNull()
    java.lang.String... permissions) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    protected boolean isAcceptManagerStorage() {
        return false;
    }
    
    public void setStatusBarHomeTransparent(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
    }
    
    protected final void showDialogDiscard(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> result) {
    }
    
    public void setAppActivityFullScreenOver(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity activity) {
    }
    
    public void setWindowFlag(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, int bits, boolean on) {
    }
}