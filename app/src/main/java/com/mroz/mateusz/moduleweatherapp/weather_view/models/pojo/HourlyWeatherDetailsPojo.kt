package com.mroz.mateusz.moduleweatherapp.weather_view.models.pojo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

class HourlyWeatherDetailsPojo {
    var apparentTemperature: Double = .0
    var cloudCover: Double = .0
    var dewPoint: Double = .0
    var humidity: Double = .0
    var icon: String = ""
    var ozone: Double = .0
    var precipIntensity: Double = .0
    var precipProbability: Double = .0
    var precipType: String = ""
    var pressure: Double = .0
    var summary: String = ""
    var temperature: Double = .0
    var time: Int = 0
    var uvIndex: Int = 0
    var visibility: Double = .0
    var windBearing: Int = 0
    var windGust: Double = .0
    var windSpeed: Double = .0
}