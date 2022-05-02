package com.lnmcode.galleryapp.presentation.ui

import android.app.Application
import android.content.Context
import com.lnmcode.galleryapp.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class BaseApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@BaseApplication)
            modules(appModule)
        }

        Timber.plant(Timber.DebugTree())
    }

}