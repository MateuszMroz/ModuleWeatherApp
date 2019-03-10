package com.mroz.mateusz.moduleweatherapp.weather_view.main_page

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.mroz.mateusz.moduleweatherapp.api.Resource
import com.mroz.mateusz.moduleweatherapp.repository.WeatherRepository
import com.mroz.mateusz.moduleweatherapp.util.AbsentLiveData
import com.mroz.mateusz.moduleweatherapp.weather_view.models.entity.WeatherForecast
import javax.inject.Inject

class WeatherMainPageViewModel @Inject constructor(repository: WeatherRepository): ViewModel() {

    private val _coordinates = MutableLiveData<Coordinates>()

    val weather: LiveData<Resource<WeatherForecast>> =  Transformations
        .switchMap(_coordinates) {coordinates ->
            if(coordinates == null) AbsentLiveData.create()
            else repository.loadWeather(coordinates.latitude, coordinates.longitude)
        }

    fun setLocation(coordinates: Coordinates) {
        if(_coordinates.value != coordinates) {
           _coordinates.value = coordinates
        }
    }

    data class Coordinates(val latitude: Double, val longitude: Double)
}