package com.mroz.mateusz.moduleweatherapp.repository

import androidx.lifecycle.LiveData
import com.mroz.mateusz.moduleweatherapp.api.ApiResponse
import com.mroz.mateusz.moduleweatherapp.api.Resource
import com.mroz.mateusz.moduleweatherapp.api.WeatherApi
import com.mroz.mateusz.moduleweatherapp.db.WeatherDao
import com.mroz.mateusz.moduleweatherapp.executor.AppExecutors
import com.mroz.mateusz.moduleweatherapp.weather_view.models.entity.WeatherForecast
import com.mroz.mateusz.moduleweatherapp.weather_view.models.pojo.WeatherForecastPojo
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class WeatherRepository @Inject constructor(
    private val appExecutors: AppExecutors,
    private val weatherDao: WeatherDao,
    private val weatherApi: WeatherApi
) {
    fun loadWeather(latitude: Double, longitude: Double): LiveData<Resource<WeatherForecast>> {
        return object: NetworkBoundResource<WeatherForecast, WeatherForecast>(appExecutors) {
            override fun saveCallResult(item: WeatherForecast) {}

            override fun shouldFetch(data: WeatherForecast?) = data == null

            override fun shouldUpdate(data: WeatherForecast?) = data == null

            override fun loadFromDb(): LiveData<WeatherForecast> = weatherDao.findWeather()

            override fun createCall(): LiveData<ApiResponse<WeatherForecast>> = weatherApi.getWeather(latitude, longitude)

        }.asLiveData()
    }
}