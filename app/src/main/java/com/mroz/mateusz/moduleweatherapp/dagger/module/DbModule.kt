package com.mroz.mateusz.moduleweatherapp.dagger.module

import android.app.Application
import androidx.room.Room
import com.mroz.mateusz.moduleweatherapp.db.WeatherDao
import com.mroz.mateusz.moduleweatherapp.db.WeatherDb
import dagger.Module
import dagger.Provides

@Module
class DbModule {

    @Provides
    fun provideDb(app: Application): WeatherDb {
        return Room
            .databaseBuilder(app, WeatherDb::class.java, "weather.db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun provideWeatherDao(db: WeatherDb): WeatherDao {
        return db.getWeatherDao()
    }
}