package com.mroz.mateusz.moduleweatherapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mroz.mateusz.moduleweatherapp.weather_view.models.Alerts

@Database (
    entities = [Alerts::class],
    version = 1,
    exportSchema = false
)
abstract class WeatherDb: RoomDatabase() {
    abstract fun getWeatherDao(): WeatherDao
}