package com.mroz.mateusz.moduleweatherapp.weather_view.model

data class DailyWeather(
    var `data`: List<DaileWeatherDetails>,
    var icon: String,
    var summary: String
)