package com.mroz.mateusz.moduleweatherapp.weather_view.model

data class HourlyWeatherDetails(
    var apparentTemperature: Double,
    var cloudCover: Double,
    var dewPoint: Double,
    var humidity: Double,
    var icon: String,
    var ozone: Double,
    var precipIntensity: Double,
    var precipProbability: Double,
    var precipType: String,
    var pressure: Double,
    var summary: String,
    var temperature: Double,
    var time: Int,
    var uvIndex: Int,
    var visibility: Double,
    var windBearing: Int,
    var windGust: Double,
    var windSpeed: Double
)