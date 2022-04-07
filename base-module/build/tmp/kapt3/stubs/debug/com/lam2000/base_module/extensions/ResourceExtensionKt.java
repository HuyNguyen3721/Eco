package com.lam2000.base_module.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0001\u001a\u0014\u0010\u0007\u001a\u00020\b*\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u0001\u00a8\u0006\u000b"}, d2 = {"retrieveColor", "", "Landroid/content/Context;", "colorRes", "retrieveDrawable", "Landroid/graphics/drawable/Drawable;", "drawableRes", "setFont", "", "Landroid/widget/TextView;", "resId", "base-module_debug"})
public final class ResourceExtensionKt {
    
    /**
     * Set typography to this TextView
     *
     * @param resId font style resource id
     */
    public static final void setFont(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setFont, @androidx.annotation.StyleRes()
    int resId) {
    }
    
    /**
     * Get color from color resource
     *
     * @param colorRes color resource id
     * @return color
     */
    @androidx.annotation.ColorInt()
    public static final int retrieveColor(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$retrieveColor, @androidx.annotation.ColorRes()
    int colorRes) {
        return 0;
    }
    
    /**
     * Get drawable from drawable resource
     *
     * @param drawableRes drawable resource id
     * @return drawable
     */
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.Drawable retrieveDrawable(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$retrieveDrawable, @androidx.annotation.DrawableRes()
    int drawableRes) {
        return null;
    }
}