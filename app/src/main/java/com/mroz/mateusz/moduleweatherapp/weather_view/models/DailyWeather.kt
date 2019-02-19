package com.mroz.mateusz.moduleweatherapp.weather_view.models

import androidx.room.*

@Entity(
    tableName = "hourly_weather",
    foreignKeys = [ForeignKey(
        entity = WeatherForecast::class,
        parentColumns = ["weather_id"],
        childColumns = ["daily_weather_id"],
        onUpdate = ForeignKey.CASCADE,
        onDelete = ForeignKey.CASCADE,
        deferred = true
    )]
)
data class DailyWeather(
    @ColumnInfo(name = "daily_id")
    @PrimaryKey(autoGenerate = true)
    var id: Long,
    var `data`: List<DailyWeatherDetails>,
    var icon: String,
    var summary: String
) {
    @ColumnInfo(name = "daily_weather_id")
    var dailyWeatherId: Long = 0
}