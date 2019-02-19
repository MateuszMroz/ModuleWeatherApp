package com.mroz.mateusz.moduleweatherapp.weather_view.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    tableName = "hourly_weather_id",
    foreignKeys = [ForeignKey(
        entity = HourlyWeather::class,
        parentColumns = ["hourly_id"],
        childColumns = ["hourly_weather_id"],
        onUpdate = ForeignKey.CASCADE,
        onDelete = ForeignKey.CASCADE,
        deferred = true
    )]
)
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
) {
    @ColumnInfo(name = "hourly_weather_id")
    var hourlyWeatherId: Long = 0
}