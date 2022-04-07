package com.lam2000.base_module.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u001f\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH$\u00a2\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u001aH$J\b\u0010\"\u001a\u00020\u001aH$J\b\u0010#\u001a\u00020\u001aH$J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001a\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010*\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010,R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/lam2000/base_module/fragment/BaseFragment;", "B", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "()V", "activityLauncher", "Lcom/lam2000/base_module/activity/BetterActivityResult;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "getActivityLauncher", "()Lcom/lam2000/base_module/activity/BetterActivityResult;", "baseActivity", "Lcom/lam2000/base_module/activity/BaseActivity;", "getBaseActivity", "()Lcom/lam2000/base_module/activity/BaseActivity;", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "lastClickTime", "", "aVoidDoubleClick", "", "backPress", "", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;", "initData", "initListener", "initView", "onCreateView", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "toast", "content", "", "base-module_debug"})
public abstract class BaseFragment<B extends androidx.viewbinding.ViewBinding> extends androidx.fragment.app.Fragment {
    protected B binding;
    private long lastClickTime = 0L;
    @org.jetbrains.annotations.NotNull()
    private final com.lam2000.base_module.activity.BetterActivityResult<android.content.Intent, androidx.activity.result.ActivityResult> activityLauncher = null;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final B getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.lam2000.base_module.activity.BetterActivityResult<android.content.Intent, androidx.activity.result.ActivityResult> getActivityLauncher() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected abstract void initView();
    
    protected abstract void initData();
    
    protected abstract void initListener();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract B getViewBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container);
    
    @org.jetbrains.annotations.Nullable()
    protected final com.lam2000.base_module.activity.BaseActivity<?> getBaseActivity() {
        return null;
    }
    
    public final void toast(@org.jetbrains.annotations.Nullable()
    java.lang.String content) {
    }
    
    public final void backPress() {
    }
    
    public final boolean aVoidDoubleClick() {
        return false;
    }
}