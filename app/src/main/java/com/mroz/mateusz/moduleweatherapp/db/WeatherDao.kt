package com.mroz.mateusz.moduleweatherapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.mroz.mateusz.moduleweatherapp.weather_view.models.entity.*

@Dao
interface WeatherDao {
    @Insert(onConflict = REPLACE)
    fun insertWeather(weatherForecast: WeatherForecast):Long

    @Insert(onConflict = REPLACE)
    fun insertDailyWeather(dailyWeather: DailyWeather): Long

    @Insert(onConflict = REPLACE)
    fun insertDailyWeatherDetails(dailyWeatherDetails: DailyWeatherDetails)

    @Insert(onConflict = REPLACE)
    fun insertHourlyWeather(hourlyWeather: HourlyWeather): Long

    @Insert(onConflict = REPLACE)
    fun insertHourlyWeatherDetails(hourlyWeatherDetails: HourlyWeatherDetails)

    @Insert(onConflict = REPLACE)
    fun insertAlerts(alerts: Alerts)

    @Query("SELECT * FROM current_weather " +
            "INNER JOIN daily_weather ON current_weather.id = daily_weather.weather_id " +
            "INNER JOIN daily_weather_details ON daily_weather.daily_id = daily_weather_details.daily_weather_id "  +
            "INNER JOIN hourly_weather ON current_weather.id = hourly_weather.weather_id " +
            "INNER JOIN hourly_weather_details ON hourly_weather.hourly_id = hourly_weather_details.hourly_weather_id " +
            //"INNER JOIN alerts ON current_weather.id = alerts.weather_id " +
            "WHERE current_weather.id = :weatherId")
    fun findWeather(weatherId: Long): LiveData<WeatherForecast>

    @Query("SELECT * FROM daily_weather INNER JOIN daily_weather_details " +
            "ON daily_weather.daily_id = daily_weather_details.daily_weather_id")
    fun getDailyWeather(): DailyWeather
}
