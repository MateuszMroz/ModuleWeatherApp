package com.mroz.mateusz.moduleweatherapp.weather_view.models.entity

import androidx.room.*
import com.google.gson.annotations.SerializedName

@Entity(tableName = "current_weather",
    indices = [Index("main_hourly_id", "main_daily_id", "main_alert_id")],
    foreignKeys = [
        ForeignKey (
            entity = Alerts::class,
            parentColumns = ["alert_id"],
            childColumns = ["main_alert_id"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE,
            deferred = true),
        ForeignKey(
            entity = DailyWeather::class,
            parentColumns = ["daily_id"],
            childColumns = ["main_daily_id"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE,
            deferred = true),
        ForeignKey(
            entity = HourlyWeather::class,
            parentColumns = ["hourly_id"],
            childColumns = ["main_hourly_id"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE,
            deferred = true)
    ]
)
data class WeatherForecast (
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "weather_id")
    var id: Long = 0,
    var latitude: Double = 0.0,
    var longitude: Double = 0.0,
    var timezone: String = "",
    @SerializedName("currently")
    @Embedded(prefix = "current_weather_")
    var weatherForecastDetails: WeatherForecastDetails? = null,
    @Ignore
    @SerializedName("hourly")
    var hourlyWeather: HourlyWeather? = null,
    @Ignore
    @SerializedName("daily")
    var dailyWeather: DailyWeather? = null,
    @Ignore
    @SerializedName("alerts")
    var alerts: List<Alerts>? = null

) {
    //hourlyWeather
    @ColumnInfo(name = "main_hourly_id")
    var hourlyId: Long = 0L
    //dailyWeather
    @ColumnInfo(name = "main_daily_id")
    var dailyId: Long = 0L
    //alerts
    @ColumnInfo(name = "main_alert_id")
    var alertId: Long = 0L

}