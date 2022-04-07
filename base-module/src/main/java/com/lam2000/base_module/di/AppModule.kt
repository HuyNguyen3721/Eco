package com.lam2000.base_module.di


import com.lam2000.base_module.photopicker.PickerViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val baseModule = module {
    single { PickerViewModel(androidApplication()) }
}