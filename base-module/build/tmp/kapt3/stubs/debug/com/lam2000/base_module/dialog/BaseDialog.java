package com.lam2000.base_module.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0015\u0012\u0006\u0010\u0006\u001a\u00028\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0016H\u0014J4\u0010(\u001a\u00020&2*\u0010)\u001a&\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0006\u0012\u0004\u0018\u00010,0*j\u0012\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0006\u0012\u0004\u0018\u00010,`-H\u0014J\b\u0010.\u001a\u00020&H$J\b\u0010/\u001a\u00020&H\u0016J\u0012\u00100\u001a\u00020&2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\b\u00103\u001a\u00020&H\u0016R\u001c\u0010\n\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u00028\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001a8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0016\u0010!\u001a\u0004\u0018\u00010\u001a8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u001cR\u0012\u0010#\u001a\u00028\u0000X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\f\u00a8\u00064"}, d2 = {"Lcom/lam2000/base_module/dialog/BaseDialog;", "BD", "Landroidx/viewbinding/ViewBinding;", "B", "Lcom/lam2000/base_module/dialog/BuilderDialog;", "Landroid/app/Dialog;", "builder", "context", "Landroid/content/Context;", "(Lcom/lam2000/base_module/dialog/BuilderDialog;Landroid/content/Context;)V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "getBuilder", "()Lcom/lam2000/base_module/dialog/BuilderDialog;", "setBuilder", "(Lcom/lam2000/base_module/dialog/BuilderDialog;)V", "Lcom/lam2000/base_module/dialog/BuilderDialog;", "container", "Landroid/view/View;", "getContainer", "()Landroid/view/View;", "message", "Landroid/widget/TextView;", "getMessage", "()Landroid/widget/TextView;", "negativeButton", "getNegativeButton", "positiveButton", "getPositiveButton", "title", "getTitle", "viewBinding", "getViewBinding", "handleClickNegativeButton", "", "view", "handleClickPositiveButton", "data", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "initListener", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "show", "base-module_debug"})
public abstract class BaseDialog<BD extends androidx.viewbinding.ViewBinding, B extends com.lam2000.base_module.dialog.BuilderDialog> extends android.app.Dialog {
    @org.jetbrains.annotations.NotNull()
    private B builder;
    public BD binding;
    
    public BaseDialog(@org.jetbrains.annotations.NotNull()
    B builder, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final B getBuilder() {
        return null;
    }
    
    public final void setBuilder(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract BD getViewBinding();
    
    @org.jetbrains.annotations.NotNull()
    public final BD getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    BD p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void show() {
    }
    
    public void initView() {
    }
    
    protected abstract void initListener();
    
    @org.jetbrains.annotations.Nullable()
    protected android.widget.TextView getPositiveButton() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected android.widget.TextView getNegativeButton() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected android.widget.TextView getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected android.widget.TextView getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected android.view.View getContainer() {
        return null;
    }
    
    protected void handleClickNegativeButton(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    protected void handleClickPositiveButton(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.Object> data) {
    }
}