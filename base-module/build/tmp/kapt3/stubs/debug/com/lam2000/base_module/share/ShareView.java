package com.lam2000.base_module.share;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\rH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/lam2000/base_module/share/ShareView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/lam2000/base_module/databinding/ShareViewBinding;", "shareProvider", "Lkotlin/Function1;", "Lcom/lam2000/base_module/share/ShareFileDelegate;", "", "getShareProvider", "()Lkotlin/jvm/functions/Function1;", "setShareProvider", "(Lkotlin/jvm/functions/Function1;)V", "initListener", "initViews", "base-module_debug"})
public final class ShareView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final com.lam2000.base_module.databinding.ShareViewBinding binding = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.lam2000.base_module.share.ShareFileDelegate, kotlin.Unit> shareProvider;
    
    public ShareView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ShareView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attributeSet) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.lam2000.base_module.share.ShareFileDelegate, kotlin.Unit> getShareProvider() {
        return null;
    }
    
    public final void setShareProvider(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.lam2000.base_module.share.ShareFileDelegate, kotlin.Unit> p0) {
    }
    
    private final void initViews() {
    }
    
    private final void initListener() {
    }
}