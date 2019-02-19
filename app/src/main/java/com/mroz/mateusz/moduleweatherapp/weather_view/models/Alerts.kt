package com.mroz.mateusz.moduleweatherapp.weather_view.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "user",
    foreignKeys = [ForeignKey(
        entity = WeatherForecast::class,
        parentColumns = ["weather_id"],
        childColumns = ["weather_forecast_id"],
        onDelete = ForeignKey.CASCADE,
        onUpdate = ForeignKey.CASCADE,
        deferred = true
    )]
)
data class Alerts(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "alert_id")
    var id:Long,
    var description: String,
    var expires: Int,
    var time: Int,
    var title: String,
    var uri: String
) {
    @ColumnInfo(name = "weather_forecast_id")
    var weatherForecastId:Long = 0
}

