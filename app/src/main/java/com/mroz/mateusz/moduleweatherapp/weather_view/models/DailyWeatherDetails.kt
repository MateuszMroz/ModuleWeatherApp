package com.mroz.mateusz.moduleweatherapp.weather_view.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    tableName = "hourly_weather_id",
    foreignKeys = [ForeignKey(
        entity = DailyWeather::class,
        parentColumns = ["daily_id"],
        childColumns = ["daily_weather_id"],
        onUpdate = ForeignKey.CASCADE,
        onDelete = ForeignKey.CASCADE,
        deferred = true
    )]
)
data class DailyWeatherDetails(
    var apparentTemperatureHigh: Double,
    var apparentTemperatureHighTime: Int,
    var apparentTemperatureLow: Double,
    var apparentTemperatureLowTime: Int,
    var apparentTemperatureMax: Double,
    var apparentTemperatureMaxTime: Int,
    var apparentTemperatureMin: Double,
    var apparentTemperatureMinTime: Int,
    var cloudCover: Double,
    var dewPoint: Double,
    var humidity: Double,
    var icon: String,
    var moonPhase: Double,
    var ozone: Double,
    var precipIntensity: Double,
    var precipIntensityMax: Double,
    var precipIntensityMaxTime: Int,
    var precipProbability: Double,
    var precipType: String,
    var pressure: Double,
    var summary: String,
    var sunriseTime: Int,
    var sunsetTime: Int,
    var temperatureHigh: Double,
    var temperatureHighTime: Int,
    var temperatureLow: Double,
    var temperatureLowTime: Int,
    var temperatureMax: Double,
    var temperatureMaxTime: Int,
    var temperatureMin: Double,
    var temperatureMinTime: Int,
    var time: Int,
    var uvIndex: Int,
    var uvIndexTime: Int,
    var visibility: Int,
    var windBearing: Int,
    var windGust: Double,
    var windGustTime: Int,
    var windSpeed: Double
) {
    @ColumnInfo(name = "daily_weather_id")
    var dailyWeatherId: Long = 0
}

