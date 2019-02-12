package com.mroz.mateusz.moduleweatherapp.weather_view.model

data class HourlyWeather(
    var `details`: List<HourlyWeatherDetails>,
    var icon: String,
    var summary: String
)