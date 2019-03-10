package com.mroz.mateusz.moduleweatherapp.weather_view.models.entity

import androidx.room.*
import com.google.gson.annotations.SerializedName

@Entity(tableName = "daily_weather")
data class DailyWeather(
    @ColumnInfo(name = "daily_id")
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    //list dailyWeatherDetails
    @Ignore
    @SerializedName("data")
    var dailyDetailPojos: List<DailyWeatherDetails>? = null,
    var icon: String? = null,
    var summary: String? = null
)