package com.mroz.mateusz.moduleweatherapp.weather_view.models

import androidx.room.*


@Entity(tableName = "current_weather")
data class WeatherForecast(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "weather_id")
    var id: Long,
    var latitude: Double,
    var longitude: Double,
    var timezone: String,
    @ColumnInfo(name = "current_weather_details")
    @Embedded(prefix = "current_weather_")
    var weatherForecastDetails: WeatherForecastDetails,
    @Ignore
    var hourlyWeather: HourlyWeather,
    @Ignore
    var dailyWeather: DailyWeather,
    @Ignore
    var alerts: Alerts
)