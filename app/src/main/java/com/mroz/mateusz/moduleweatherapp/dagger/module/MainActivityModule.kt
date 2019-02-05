package com.mroz.mateusz.moduleweatherapp.dagger.module

import com.mroz.mateusz.moduleweatherapp.weather_view.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = [FragmentBuilderModule::class])
    abstract fun contributeMainActivity(): MainActivity
}