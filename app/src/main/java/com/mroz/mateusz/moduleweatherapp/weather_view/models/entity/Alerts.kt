package com.mroz.mateusz.moduleweatherapp.weather_view.models.entity

import androidx.room.*

@Entity(
    tableName = "alerts",
    indices = [Index("weather_forecast_id")],
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
    var id:Long = 0,
    var description: String? = null,
    var expires: Int = 0,
    var time: Int = 0,
    var title: String? = null,
    var uri: String? = null
) {
    @ColumnInfo(name = "weather_forecast_id")
    var weatherForecastId:Long = 0L
}

