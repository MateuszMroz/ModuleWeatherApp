package com.mroz.mateusz.moduleweatherapp.api.interceptor

import com.mroz.mateusz.moduleweatherapp.util.WEATHER_KEY
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthorizationInterceptor @Inject constructor() :Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val original = chain.request()
        val requestBuilder = original.newBuilder()
            .header("key", WEATHER_KEY)

        val request = requestBuilder.build()
        return chain.proceed(request)
    }
}