package com.mroz.mateusz.moduleweatherapp.dagger.component

import android.app.Application
import com.mroz.mateusz.moduleweatherapp.ModuleWeatherApplication
import com.mroz.mateusz.moduleweatherapp.dagger.module.DbModule
import com.mroz.mateusz.moduleweatherapp.dagger.module.MainActivityModule
import com.mroz.mateusz.moduleweatherapp.dagger.module.WeatherRetrofitModule
import com.mroz.mateusz.moduleweatherapp.dagger.viewModel.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    WeatherRetrofitModule::class,
    DbModule::class,
    ViewModelModule::class,
    MainActivityModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    fun inject(moduleWeatherApplication: ModuleWeatherApplication)
}