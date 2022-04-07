package com.example.eco_test.di

import com.example.eco_test.viewmodel.SongViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModule = module {
    single { SongViewModel(androidApplication()) }
}