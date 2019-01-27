package com.mroz.mateusz.moduleweatherapp.dagger.module

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.mroz.mateusz.moduleweatherapp.api.WeatherApi
import com.mroz.mateusz.moduleweatherapp.api.adapter_factory.LiveDataCallAdapterFactory
import com.mroz.mateusz.moduleweatherapp.util.BASE_URL
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module(includes = [OkHttpClientModule::class])
class WeatherRetrofitModule {

    @Provides
    fun weatherApi(retrofit: Retrofit) = retrofit.create(WeatherApi::class.java)

    @Provides
    fun retrofit(okHttpClient: OkHttpClient, gsonConverterFactory: GsonConverterFactory): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .addConverterFactory(gsonConverterFactory)
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
            .build()
    }

    @Provides
    fun gson() = GsonBuilder().create()

    @Provides
    fun gsonConvertFactory(gson: Gson) = GsonConverterFactory.create(gson)
}