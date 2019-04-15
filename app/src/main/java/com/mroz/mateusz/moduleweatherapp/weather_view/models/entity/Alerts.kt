package com.mroz.mateusz.moduleweatherapp.weather_view.models.entity

import androidx.room.*

@Entity(tableName = "alerts",
    indices = [Index("weather_id", unique = true)],
    foreignKeys = [ForeignKey(
        entity = WeatherForecast::class,
        parentColumns = ["id"],
        childColumns = ["weather_id"],
        onDelete = ForeignKey.CASCADE,
        onUpdate = ForeignKey.CASCADE,
        deferred = true
    )]
)
data class Alerts(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "alert_id")
    var id:Long = 0,
    var description: String = "",
    var expires: Int = 0,
    var time: Int = 0,
    var title: String = "",
    var uri: String = ""
) {
    @ColumnInfo(name = "weather_id")
    var weatherId:Long = 0L
}
