package com.mroz.mateusz.moduleweatherapp

import android.app.Activity
import android.app.Application
import com.mroz.mateusz.moduleweatherapp.dagger.AppInjector
import com.mroz.mateusz.moduleweatherapp.util.ReleaseTree
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import timber.log.Timber
import javax.inject.Inject


class ModuleWeatherApplication: Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

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

        AppInjector.init(this)
    }

    override fun activityInjector() = dispatchingAndroidInjector
}