package com.mroz.mateusz.moduleweatherapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mroz.mateusz.moduleweatherapp.weather_view.models.entity.*

@Database (
    entities = [Alerts::class,
        DailyWeather::class,
        DailyWeatherDetails::class,
        HourlyWeather::class,
        HourlyWeatherDetails::class,
        WeatherForecast::class],
    version = 16,
    exportSchema = false
)
abstract class WeatherDb: RoomDatabase() {
    abstract fun getWeatherDao(): WeatherDao
}