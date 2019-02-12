package com.mroz.mateusz.moduleweatherapp.weather_view.model

data class CurrentWeather(
    var currentlyWeatherDetails: CurrentlyWeatherDetails,
    var latitude: Double,
    var longitude: Double,
    var timezone: String
)