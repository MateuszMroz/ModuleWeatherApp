package com.mroz.mateusz.moduleweatherapp.weather_view.models.entity

import androidx.room.*

@Entity(
    tableName = "daily_weather_details",
    indices = [Index("daily_weather_id")],
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
    @ColumnInfo(name = "daily_weather_details_id")
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    @ColumnInfo(name = "apparent_temperature_high")
    var apparentTemperatureHigh: Double = .0,
    @ColumnInfo(name = "apparent_temperature_high_time")
    var apparentTemperatureHighTime: Int = 0,
    @ColumnInfo(name = "apparent_temperature_low")
    var apparentTemperatureLow: Double = .0,
    @ColumnInfo(name = "apparent_temperature_low_time")
    var apparentTemperatureLowTime: Int = 0,
    @ColumnInfo(name = "apparent_temperature_max")
    var apparentTemperatureMax: Double = .0,
    @ColumnInfo(name = "apparent_temperature_max_time")
    var apparentTemperatureMaxTime: Int = 0,
    @ColumnInfo(name = "apparent_temperature_min")
    var apparentTemperatureMin: Double = .0,
    @ColumnInfo(name = "apparent_temperature_min_time")
    var apparentTemperatureMinTime: Int = 0,
    @ColumnInfo(name = "cloud_cover")
    var cloudCover: Double = .0,
    @ColumnInfo(name = "dew_point")
    var dewPoint: Double = .0,
    var humidity: Double = .0,
    var icon: String? = null,
    @ColumnInfo(name = "moon_phase")
    var moonPhase: Double = .0,
    var ozone: Double = .0,
    @ColumnInfo(name = "precip_intensity")
    var precipIntensity: Double = .0,
    @ColumnInfo(name = "precip_intensity_max")
    var precipIntensityMax: Double = .0,
    @ColumnInfo(name = "precip_intensity_max_time")
    var precipIntensityMaxTime: Int = 0,
    @ColumnInfo(name = "precip_probability")
    var precipProbability: Double = .0,
    @ColumnInfo(name = "precip_type")
    var precipType: String? = null,
    var pressure: Double = .0,
    var summary: String? = null,
    @ColumnInfo(name = "sunrise_time")
    var sunriseTime: Int = 0,
    @ColumnInfo(name = "sunset_time")
    var sunsetTime: Int = 0,
    @ColumnInfo(name = "temperature_high")
    var temperatureHigh: Double = .0,
    @ColumnInfo(name = "temperature_high_time")
    var temperatureHighTime: Int = 0,
    @ColumnInfo(name = "temperature_low")
    var temperatureLow: Double = .0,
    @ColumnInfo(name = "temperature_low_time")
    var temperatureLowTime: Int = 0,
    @ColumnInfo(name = "temperature_max")
    var temperatureMax: Double = .0,
    @ColumnInfo(name = "temperature_max_time")
    var temperatureMaxTime: Int = 0,
    @ColumnInfo(name = "temperature_min")
    var temperatureMin: Double = .0,
    @ColumnInfo(name = "temperature_min_time")
    var temperatureMinTime: Int = 0,
    var time: Int = 0,
    @ColumnInfo(name = "uv_index")
    var uvIndex: Int = 0,
    @ColumnInfo(name = "uv_index_time")
    var uvIndexTime: Int = 0,
    var visibility: Double = .0,
    @ColumnInfo(name = "wind_bearing")
    var windBearing: Int = 0,
    @ColumnInfo(name = "wind_gust")
    var windGust: Double = .0,
    @ColumnInfo(name = "wind_gust_time")
    var windGustTime: Int = 0,
    @ColumnInfo(name = "wind_speed")
    var windSpeed: Double = .0
) {
    @ColumnInfo(name = "daily_weather_id")
    var dailyWeatherId: Long = 0L
}

