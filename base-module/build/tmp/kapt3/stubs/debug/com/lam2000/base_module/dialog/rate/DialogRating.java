package com.lam2000.base_module.dialog.rate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001f B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\fH\u0002J\u0016\u0010\u001d\u001a\u00020\u00142\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ\b\u0010\u001e\u001a\u00020\u0014H\u0016R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00028TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006!"}, d2 = {"Lcom/lam2000/base_module/dialog/rate/DialogRating;", "Lcom/lam2000/base_module/dialog/BaseDialog;", "Lcom/lam2000/base_module/databinding/BaseDialogRateAppBinding;", "Lcom/lam2000/base_module/dialog/rate/DialogRating$ExtendBuilder;", "context", "Landroid/content/Context;", "extendBuilder", "(Landroid/content/Context;Lcom/lam2000/base_module/dialog/rate/DialogRating$ExtendBuilder;)V", "listener", "Lcom/lam2000/base_module/listener/EzItemListener;", "Lcom/lam2000/base_module/dialog/rate/DialogRatingState;", "starPoint", "", "stars", "", "Landroid/widget/ImageView;", "viewBinding", "getViewBinding", "()Lcom/lam2000/base_module/databinding/BaseDialogRateAppBinding;", "animationEnd", "", "animationStart", "initListener", "initView", "rateResult", "isGood", "", "rating", "vote", "setListener", "show", "Companion", "ExtendBuilder", "base-module_debug"})
public class DialogRating extends com.lam2000.base_module.dialog.BaseDialog<com.lam2000.base_module.databinding.BaseDialogRateAppBinding, com.lam2000.base_module.dialog.rate.DialogRating.ExtendBuilder> {
    @org.jetbrains.annotations.NotNull()
    public static final com.lam2000.base_module.dialog.rate.DialogRating.Companion Companion = null;
    private static final int COUNT_ACTION_SHOW = 2;
    private com.lam2000.base_module.listener.EzItemListener<com.lam2000.base_module.dialog.rate.DialogRatingState> listener;
    private final java.util.List<android.widget.ImageView> stars = null;
    private int starPoint = 0;
    
    public DialogRating(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.dialog.rate.DialogRating.ExtendBuilder extendBuilder) {
        super(null, null);
    }
    
    @java.lang.Override()
    public void show() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.lam2000.base_module.databinding.BaseDialogRateAppBinding getViewBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void initView() {
    }
    
    public void animationStart() {
    }
    
    public void animationEnd() {
    }
    
    private final void rating(int vote) {
    }
    
    private final void rateResult(boolean isGood) {
    }
    
    @java.lang.Override()
    protected void initListener() {
    }
    
    public final void setListener(@org.jetbrains.annotations.Nullable()
    com.lam2000.base_module.listener.EzItemListener<com.lam2000.base_module.dialog.rate.DialogRatingState> listener) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0013H\u0016J\u0010\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0010\u001a\u00020\u00002\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/lam2000/base_module/dialog/rate/DialogRating$ExtendBuilder;", "Lcom/lam2000/base_module/dialog/BuilderDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "hardShow", "", "getHardShow", "()Z", "setHardShow", "(Z)V", "listener", "Lcom/lam2000/base_module/listener/EzItemListener;", "Lcom/lam2000/base_module/dialog/rate/DialogRatingState;", "getListener", "()Lcom/lam2000/base_module/listener/EzItemListener;", "setListener", "(Lcom/lam2000/base_module/listener/EzItemListener;)V", "build", "Lcom/lam2000/base_module/dialog/BaseDialog;", "base-module_debug"})
    public static final class ExtendBuilder extends com.lam2000.base_module.dialog.BuilderDialog {
        @org.jetbrains.annotations.Nullable()
        private com.lam2000.base_module.listener.EzItemListener<com.lam2000.base_module.dialog.rate.DialogRatingState> listener;
        private boolean hardShow = false;
        
        public ExtendBuilder(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.lam2000.base_module.listener.EzItemListener<com.lam2000.base_module.dialog.rate.DialogRatingState> getListener() {
            return null;
        }
        
        public final void setListener(@org.jetbrains.annotations.Nullable()
        com.lam2000.base_module.listener.EzItemListener<com.lam2000.base_module.dialog.rate.DialogRatingState> p0) {
        }
        
        public final boolean getHardShow() {
            return false;
        }
        
        public final void setHardShow(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.lam2000.base_module.dialog.BaseDialog<?, ?> build() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lam2000.base_module.dialog.rate.DialogRating.ExtendBuilder setListener(@org.jetbrains.annotations.Nullable()
        com.lam2000.base_module.listener.EzItemListener<com.lam2000.base_module.dialog.rate.DialogRatingState> listener) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.lam2000.base_module.dialog.rate.DialogRating.ExtendBuilder setHardShow(boolean hardShow) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/lam2000/base_module/dialog/rate/DialogRating$Companion;", "", "()V", "COUNT_ACTION_SHOW", "", "base-module_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}