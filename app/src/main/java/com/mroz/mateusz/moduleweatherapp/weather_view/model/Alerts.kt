package com.mroz.mateusz.moduleweatherapp.weather_view.model

data class Alerts(
    var description: String,
    var expires: Int,
    var time: Int,
    var title: String,
    var uri: String
)