package com.mroz.mateusz.moduleweatherapp.weather_view.models.poj

import com.google.gson.annotations.SerializedName
import com.mroz.mateusz.moduleweatherapp.weather_view.models.pojo.HourlyWeatherDetailsPojo

class HourlyWeatherPojo {
    var id: Long = 0L
    @SerializedName("data")
    var hourlyDetails: List<HourlyWeatherDetailsPojo>? = null
    var icon: String? = null
    var summary: String? = null
}