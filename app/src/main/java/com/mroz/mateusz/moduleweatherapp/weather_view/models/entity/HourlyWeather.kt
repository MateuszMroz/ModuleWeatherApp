package com.mroz.mateusz.moduleweatherapp.weather_view.models.entity

import androidx.room.*
import com.google.gson.annotations.SerializedName

@Entity(tableName = "hourly_weather")
data class HourlyWeather(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "hourly_id")
    var id: Long = 0L,
    //list HourlyWeatherDetails
    @Ignore
    @SerializedName("data")
    var hourlyDetails: List<HourlyWeatherDetails>? = null,
    var icon: String? = null,
    var summary: String? = null
)