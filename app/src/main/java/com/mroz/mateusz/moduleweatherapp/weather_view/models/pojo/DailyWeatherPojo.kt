package com.mroz.mateusz.moduleweatherapp.weather_view.models.pojo

import com.google.gson.annotations.SerializedName

class DailyWeatherPojo {
    @SerializedName("data")
    var dailyDetailPojos: List<DailyWeatherDetailsPojo>? = null
    var icon: String = ""
    var summary: String = ""
}