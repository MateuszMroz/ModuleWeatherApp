package com.mroz.mateusz.moduleweatherapp.dagger.component

import android.app.Application
import com.mroz.mateusz.moduleweatherapp.ModuleWeatherApplication
import dagger.BindsInstance
import dagger.Component

@Component
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(moduleWeatherApplication: ModuleWeatherApplication)
}