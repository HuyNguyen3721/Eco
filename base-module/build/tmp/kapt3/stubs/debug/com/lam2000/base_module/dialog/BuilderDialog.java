package com.lam2000.base_module.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u00105\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030#H&J\u0014\u00106\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J0\u00107\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u001e\b\u0002\u0010!\u001a\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030#\u0012\u0004\u0012\u00020\u0013\u0018\u00010\"JH\u00108\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u001926\b\u0002\u0010+\u001a0\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010#\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010-\u0012\u0004\u0012\u00020\u0013\u0018\u00010,J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\u001c\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u00104\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u00010\u0019R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR0\u0010!\u001a\u0018\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030#\u0012\u0004\u0012\u00020\u0013\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001c\u0010(\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u001dRH\u0010+\u001a0\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010#\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00010-\u0012\u0004\u0012\u00020\u0013\u0018\u00010,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001b\"\u0004\b4\u0010\u001d\u00a8\u00069"}, d2 = {"Lcom/lam2000/base_module/dialog/BuilderDialog;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "canOnTouchOutside", "", "getCanOnTouchOutside", "()Z", "setCanOnTouchOutside", "(Z)V", "cancelable", "getCancelable", "setCancelable", "getContext", "()Landroid/content/Context;", "setContext", "dismissDialogListener", "Lkotlin/Function0;", "", "getDismissDialogListener", "()Lkotlin/jvm/functions/Function0;", "setDismissDialogListener", "(Lkotlin/jvm/functions/Function0;)V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "negativeButton", "getNegativeButton", "setNegativeButton", "negativeButtonListener", "Lkotlin/Function1;", "Lcom/lam2000/base_module/dialog/BaseDialog;", "getNegativeButtonListener", "()Lkotlin/jvm/functions/Function1;", "setNegativeButtonListener", "(Lkotlin/jvm/functions/Function1;)V", "positiveButton", "getPositiveButton", "setPositiveButton", "positiveButtonListener", "Lkotlin/Function2;", "Ljava/util/HashMap;", "getPositiveButtonListener", "()Lkotlin/jvm/functions/Function2;", "setPositiveButtonListener", "(Lkotlin/jvm/functions/Function2;)V", "title", "getTitle", "setTitle", "build", "onDismissListener", "onSetNegativeButton", "onSetPositiveButton", "base-module_debug"})
public abstract class BuilderDialog {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String positiveButton;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String negativeButton;
    private boolean cancelable = true;
    private boolean canOnTouchOutside = true;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function2<? super com.lam2000.base_module.dialog.BaseDialog<?, ?>, ? super java.util.HashMap<java.lang.String, java.lang.Object>, kotlin.Unit> positiveButtonListener;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.lam2000.base_module.dialog.BaseDialog<?, ?>, kotlin.Unit> negativeButtonListener;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> dismissDialogListener;
    
    public BuilderDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPositiveButton() {
        return null;
    }
    
    public final void setPositiveButton(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNegativeButton() {
        return null;
    }
    
    public final void setNegativeButton(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getCancelable() {
        return false;
    }
    
    public final void setCancelable(boolean p0) {
    }
    
    public final boolean getCanOnTouchOutside() {
        return false;
    }
    
    public final void setCanOnTouchOutside(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function2<com.lam2000.base_module.dialog.BaseDialog<?, ?>, java.util.HashMap<java.lang.String, java.lang.Object>, kotlin.Unit> getPositiveButtonListener() {
        return null;
    }
    
    public final void setPositiveButtonListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super com.lam2000.base_module.dialog.BaseDialog<?, ?>, ? super java.util.HashMap<java.lang.String, java.lang.Object>, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.lam2000.base_module.dialog.BaseDialog<?, ?>, kotlin.Unit> getNegativeButtonListener() {
        return null;
    }
    
    public final void setNegativeButtonListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.lam2000.base_module.dialog.BaseDialog<?, ?>, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getDismissDialogListener() {
        return null;
    }
    
    public final void setDismissDialogListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.dialog.BuilderDialog setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.dialog.BuilderDialog setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.dialog.BuilderDialog setCancelable(boolean cancelable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.dialog.BuilderDialog setCanOnTouchOutside(boolean canOnTouchOutside) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.dialog.BuilderDialog onSetPositiveButton(@org.jetbrains.annotations.Nullable()
    java.lang.String positiveButton, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super com.lam2000.base_module.dialog.BaseDialog<?, ?>, ? super java.util.HashMap<java.lang.String, java.lang.Object>, kotlin.Unit> positiveButtonListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.dialog.BuilderDialog onSetNegativeButton(@org.jetbrains.annotations.Nullable()
    java.lang.String negativeButton, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.lam2000.base_module.dialog.BaseDialog<?, ?>, kotlin.Unit> negativeButtonListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.lam2000.base_module.dialog.BuilderDialog onDismissListener(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> dismissDialogListener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.lam2000.base_module.dialog.BaseDialog<?, ?> build();
}