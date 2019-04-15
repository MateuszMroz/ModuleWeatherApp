package com.mroz.mateusz.moduleweatherapp.weather_view.models.entity

import androidx.room.*

@Entity(
    tableName = "hourly_weather_details",
    indices = [Index("hourly_weather_id")],
    foreignKeys = [ForeignKey(
        entity = HourlyWeather::class,
        parentColumns = ["hourly_id"],
        childColumns = ["hourly_weather_id"],
        onUpdate = ForeignKey.CASCADE,
        onDelete = ForeignKey.CASCADE
    )]
)
data class HourlyWeatherDetails(
    @ColumnInfo(name = "hourly_details_id")
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    @ColumnInfo(name = "apparent_temperature")
    var apparentTemperature: Double = .0,
    @ColumnInfo(name = "cloud_cover")
    var cloudCover: Double = .0,
    @ColumnInfo(name = "dew_point")
    var dewPoint: Double = .0,
    var humidity: Double = .0,
    var icon: String = "",
    var ozone: Double = .0,
    @ColumnInfo(name = "precip_intensity")
    var precipIntensity: Double = .0,
    @ColumnInfo(name = "precip_probability")
    var precipProbability: Double = .0,
    @ColumnInfo(name = "precip_type")
    var precipType: String = "",
    var pressure: Double = .0,
    var summary: String = "",
    var temperature: Double = .0,
    var time: Int = 0,
    @ColumnInfo(name = "uv_index")
    var uvIndex: Int = 0,
    var visibility: Double = .0,
    @ColumnInfo(name = "wind_bearing")
    var windBearing: Int = 0,
    @ColumnInfo(name = "wind_gust")
    var windGust: Double = .0,
    @ColumnInfo(name = "wind_speed")
    var windSpeed: Double = .0
) {
    @ColumnInfo(name = "hourly_weather_id")
    var hourlyWeatherId: Long = 0L
}
