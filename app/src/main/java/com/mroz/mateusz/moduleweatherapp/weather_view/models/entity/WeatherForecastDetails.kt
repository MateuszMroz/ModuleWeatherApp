package com.mroz.mateusz.moduleweatherapp.weather_view.models.entity

import androidx.room.ColumnInfo

data class WeatherForecastDetails(
    var time: Int = 0,
    var summary: String = "",
    var icon: String = "",
    @ColumnInfo(name = "precip_intensity")
    var precipIntensity: Double = .0,
    @ColumnInfo(name = "precip_probability")
    var precipProbability: Double = .0,
    var temperature: Double = .0,
    @ColumnInfo(name = "apparent_temperature")
    var apparentTemperature: Double = .0,
    @ColumnInfo(name = "dew_point")
    var dewPoint: Double = .0,
    var humidity: Double = .0,
    var pressure: Double = .0,
    @ColumnInfo(name = "wind_speed")
    var windSpeed: Double = .0,
    @ColumnInfo(name = "wind_bearing")
    var windBearing: Int = 0,
    @ColumnInfo(name = "wind_gust")
    var windGust: Double = .0,
    @ColumnInfo(name = "cloud_cover")
    var cloudCover: Double = .0,
    @ColumnInfo(name = "uv_index")
    var uvIndex: Int = 0,
    var visibility: Double = .0,
    var ozone: Double?
)
