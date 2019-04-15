package com.mroz.mateusz.moduleweatherapp.api

import androidx.lifecycle.LiveData
import com.mroz.mateusz.moduleweatherapp.weather_view.models.entity.WeatherForecast
import retrofit2.http.GET
import retrofit2.http.Path


interface WeatherApi {
    @GET("{latitude},{longitude}?units=si&lang=pl")
    fun getWeather(
        @Path("latitude")latitude:Double,
        @Path("longitude")longitude:Double
    ): LiveData<ApiResponse<WeatherForecast>>
}