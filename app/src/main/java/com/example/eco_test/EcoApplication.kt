package com.example.eco_test

import android.app.Application
import com.lam2000.base_module.utils.PreferencesUtils
import com.example.eco_test.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class EcoApplication : Application() {
    override fun onCreate() {
        super.onCreate()
//        EzApplication()
        PreferencesUtils.init(this)
        setupKoin()
    }


    private fun setupKoin() {
        startKoin {
            androidContext(this@EcoApplication)
            modules(
                appModule
            )
        }
    }
}