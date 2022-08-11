package com.example.weatherapi

import android.app.Application
import com.example.weatherapi.di.AppComponent
import com.example.weatherapi.di.DaggerAppComponent
import timber.log.Timber

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        component = DaggerAppComponent.factory().create()
    }

    companion object {
        lateinit var component: AppComponent
    }
}