package com.mroz.mateusz.moduleweatherapp.weather_view.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "hourly_weather",
    foreignKeys = [ForeignKey(
        entity = WeatherForecast::class,
        parentColumns = ["weather_id"],
        childColumns = ["weather_forecast_id"],
        onUpdate = ForeignKey.CASCADE,
        onDelete = ForeignKey.CASCADE,
        deferred = true
    )]
)
data class HourlyWeather(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "hourly_id")
    var id: Long,
    var `details`: List<HourlyWeatherDetails>,
    var icon: String,
    var summary: String
) {
    @ColumnInfo(name = "weather_forecast_id")
    var weatherForecastID: Long = 0
}