package com.mroz.mateusz.moduleweatherapp.weather_view.models.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.mroz.mateusz.moduleweatherapp.weather_view.models.poj.HourlyWeatherPojo

data class WeatherForecastPojo(
    var latitude: Double,
    var longitude: Double,
    var timezone: String,
    @SerializedName("currently")
    var weatherForecastDetailsPojo: WeatherForecastDetailsPojo,
    @SerializedName("hourly")
    var hourlyWeather: HourlyWeatherPojo,
    @SerializedName("daily")
    var dailyWeatherPojo: DailyWeatherPojo,
    @SerializedName("alerts")
    var alertsPojo: List<AlertsPojo>
)

