package com.mroz.mateusz.moduleweatherapp

import android.app.Application
import com.mroz.mateusz.moduleweatherapp.util.ReleaseTree
import timber.log.Timber


class ModuleWeatherApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG) {
            Timber.plant(object: Timber.DebugTree() {
                override fun createStackElementTag(element: StackTraceElement): String? {
                    return super.createStackElementTag(element) + ": " + element.lineNumber
                }
            })
        } else {
            Timber.plant(ReleaseTree())
        }
    }
}