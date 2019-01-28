package com.mroz.mateusz.moduleweatherapp.dagger

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.mroz.mateusz.moduleweatherapp.ModuleWeatherApplication
import com.mroz.mateusz.moduleweatherapp.dagger.component.DaggerAppComponent
import dagger.android.AndroidInjection
import dagger.android.support.HasSupportFragmentInjector


object AppInjector {
    fun init(moduleWeatherApplication: ModuleWeatherApplication) {
        DaggerAppComponent
            .builder()
            .application(moduleWeatherApplication)
            .build()
            .inject(moduleWeatherApplication)

        moduleWeatherApplication.registerActivityLifecycleCallbacks(object: Application.ActivityLifecycleCallbacks {
            override fun onActivityPaused(p0: Activity?) {

            }

            override fun onActivityResumed(p0: Activity?) {}

            override fun onActivityStarted(p0: Activity?) {}

            override fun onActivityDestroyed(p0: Activity?) {}

            override fun onActivitySaveInstanceState(p0: Activity?, p1: Bundle?) {}

            override fun onActivityStopped(p0: Activity?) {}

            override fun onActivityCreated(p0: Activity?, p1: Bundle?) {}
        })
    }

    private fun handleActivity(activity: Activity) {
        if(activity is HasSupportFragmentInjector) AndroidInjection.inject(activity)
        if (activity is FragmentActivity) { }
    }
}