package com.lam2000.base_module.photopicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eJ.\u0010\u0015\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0018\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000b\u0012\u0004\u0012\u00020\u00130\u0019J\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001b0\u001aJ\u0006\u0010\u001c\u001a\u00020\u0013J\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t\u00a8\u0006\u001e"}, d2 = {"Lcom/lam2000/base_module/photopicker/PickerViewModel;", "Lcom/lam2000/base_module/viewmodel/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "dirCurrentLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/lam2000/base_module/photopicker/PhotoDirectory;", "getDirCurrentLiveData", "()Landroidx/lifecycle/MutableLiveData;", "dirsLiveData", "", "getDirsLiveData", "photosLiveData", "Lcom/lam2000/base_module/photopicker/Photo;", "getPhotosLiveData", "photosSelectedLiveData", "getPhotosSelectedLiveData", "addPhotoSelected", "", "photo", "autoRotatePhoto", "data", "Landroid/net/Uri;", "result", "Lkotlin/Function1;", "Landroidx/lifecycle/LiveData;", "", "loadImages", "removePhoto", "base-module_debug"})
public final class PickerViewModel extends com.lam2000.base_module.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.lam2000.base_module.photopicker.PhotoDirectory>> dirsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.lam2000.base_module.photopicker.PhotoDirectory> dirCurrentLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.lam2000.base_module.photopicker.Photo>> photosSelectedLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.lam2000.base_module.photopicker.Photo>> photosLiveData = null;
    
    public PickerViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.lam2000.base_module.photopicker.PhotoDirectory>> getDirsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.lam2000.base_module.photopicker.PhotoDirectory> getDirCurrentLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.lam2000.base_module.photopicker.Photo>> getPhotosSelectedLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.lam2000.base_module.photopicker.Photo>> getPhotosLiveData() {
        return null;
    }
    
    public final void loadImages() {
    }
    
    public final void autoRotatePhoto(@org.jetbrains.annotations.NotNull()
    java.util.List<android.net.Uri> data, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<android.net.Uri>, kotlin.Unit> result) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.lam2000.base_module.photopicker.Photo>> getPhotosLiveData() {
        return null;
    }
    
    public final void addPhotoSelected(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.photopicker.Photo photo) {
    }
    
    public final void removePhoto(@org.jetbrains.annotations.NotNull()
    com.lam2000.base_module.photopicker.Photo photo) {
    }
}