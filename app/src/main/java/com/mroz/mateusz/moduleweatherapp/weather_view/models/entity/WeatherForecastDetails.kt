package com.mroz.mateusz.moduleweatherapp.weather_view.models.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "weather_forecast_details")
data class WeatherForecastDetails(
    @ColumnInfo(name = "apparent_temperature")
    var apparentTemperature: Double,
    @ColumnInfo(name = "cloud_cover")
    var cloudCover: Double,
    @ColumnInfo(name = "dew_point")
    var dewPoint: Double,
    var humidity: Double,
    var icon: String,
    @ColumnInfo(name = "nearest_storm_distance")
    var nearestStormDistance: Int,
    var ozone: Double,
    @ColumnInfo(name = "precip_intensity")
    var precipIntensity: Double,
    @ColumnInfo(name = "precip_intensity_error")
    var precipIntensityError: Double,
    @ColumnInfo(name = "precip_probability")
    var precipProbability: Double,
    @ColumnInfo(name = "precip_type")
    var precipType: String,
    var pressure: Double,
    var summary: String,
    var temperature: Double,
    var time: Int,
    @ColumnInfo(name = "uv_index")
    var uvIndex: Int,
    var visibility: Double,
    @ColumnInfo(name = "wind_bearing")
    var windBearing: Int,
    @ColumnInfo(name = "wind_gust")
    var windGust: Double,
    @ColumnInfo(name = "wind_speed")
    var windSpeed: Double
)
