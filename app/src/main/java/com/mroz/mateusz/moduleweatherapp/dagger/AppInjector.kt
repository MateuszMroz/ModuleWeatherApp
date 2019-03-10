package com.mroz.mateusz.moduleweatherapp.dagger

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import com.mroz.mateusz.moduleweatherapp.ModuleWeatherApplication
import com.mroz.mateusz.moduleweatherapp.dagger.component.DaggerAppComponent
import dagger.android.AndroidInjection
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.HasSupportFragmentInjector


object AppInjector {
    fun init(moduleWeatherApplication: ModuleWeatherApplication) {
        DaggerAppComponent
            .builder()
            .application(moduleWeatherApplication)
            .build()
            .inject(moduleWeatherApplication)
        moduleWeatherApplication.registerActivityLifecycleCallbacks(object: Application.ActivityLifecycleCallbacks{
            override fun onActivityPaused(activity: Activity?) {
            }

            override fun onActivityResumed(activity: Activity?) {

            }

            override fun onActivityStarted(activity: Activity?) {
            }

            override fun onActivityDestroyed(activity: Activity?) {
            }

            override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
            }

            override fun onActivityStopped(activity: Activity?) {
            }

            override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
                handleActivity(activity!!)
            }

        })
    }

    private fun handleActivity(activity: Activity) {
        if(activity is HasSupportFragmentInjector) AndroidInjection.inject(activity)
        if (activity is FragmentActivity) {
            activity.supportFragmentManager
                .registerFragmentLifecycleCallbacks(object : FragmentManager.FragmentLifecycleCallbacks() {
                    override fun onFragmentCreated(
                        fm: FragmentManager,
                        f: Fragment,
                        savedInstanceState: Bundle?
                    ) {
                        super.onFragmentCreated(fm, f, savedInstanceState)
                        if (f is Injectable) {
                            AndroidSupportInjection.inject(f)
                        }
                    }
                }, true)
        }
    }
}