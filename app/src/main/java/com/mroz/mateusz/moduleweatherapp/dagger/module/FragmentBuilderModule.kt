package com.mroz.mateusz.moduleweatherapp.dagger.module

import com.mroz.mateusz.moduleweatherapp.weather_view.main_page.WeatherMainPage
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuilderModule {
    @ContributesAndroidInjector
    abstract fun contributeMainWeatherPage(): WeatherMainPage
}