package com.mroz.mateusz.moduleweatherapp.weather_view.models.entity

import androidx.room.*
import com.google.gson.annotations.SerializedName

@Entity(tableName = "current_weather")
data class WeatherForecast (
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,
    var latitude: Double = 0.0,
    var longitude: Double = 0.0,
    var timezone: String = "",
    @SerializedName("currently")
    @Embedded(prefix = "current_")
    var weatherForecastDetails: WeatherForecastDetails? = null,
    @Ignore
    @SerializedName("daily")
    var dailyWeather: DailyWeather? = null,
    @Ignore
    @SerializedName("hourly")
    var hourlyWeather: HourlyWeather? = null,
    @Ignore
    @SerializedName("alerts")
    var alerts: List<Alerts>? = null
)
