package com.mroz.mateusz.moduleweatherapp.weather_view.models.entity

import androidx.room.*
import com.google.gson.annotations.SerializedName

@Entity(tableName = "hourly_weather",
    indices = [Index("weather_id", unique = true)],
    foreignKeys = [
        ForeignKey(
            entity = WeatherForecast::class,
            parentColumns = ["id"],
            childColumns = ["weather_id"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        )
    ]
)
data class HourlyWeather(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "hourly_id")
    var id: Long = 0L,
    @Ignore
    @SerializedName("data")
    var hourlyDetails: List<HourlyWeatherDetails>? = null,
    var icon: String = "",
    var summary: String = ""
) {
    @ColumnInfo(name = "weather_id")
    var weatherId: Long = 0L
}
