package com.mroz.mateusz.moduleweatherapp.dagger.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mroz.mateusz.moduleweatherapp.viewModelFactory.WeatherViewModelFactory
import com.mroz.mateusz.moduleweatherapp.weather_view.main_page.WeatherMainPageViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(WeatherMainPageViewModel::class)
    abstract fun bindWeatherMainPageViewModel(viewModel: WeatherMainPageViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: WeatherViewModelFactory): ViewModelProvider.Factory
}