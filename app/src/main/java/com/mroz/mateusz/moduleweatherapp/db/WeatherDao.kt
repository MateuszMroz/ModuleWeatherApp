package com.mroz.mateusz.moduleweatherapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.mroz.mateusz.moduleweatherapp.weather_view.models.entity.WeatherForecast

@Dao
interface WeatherDao {
    @Query("SELECT * FROM current_weather")
    fun findWeather(): LiveData<WeatherForecast>
}