package com.mroz.mateusz.moduleweatherapp.dagger.module

import android.app.Application
import android.app.AuthenticationRequiredException
import com.mroz.mateusz.moduleweatherapp.api.interceptor.AuthorizationInterceptor
import com.mroz.mateusz.moduleweatherapp.util.TIMEOUT
import com.mroz.mateusz.moduleweatherapp.util.WEATHER_KEY
import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber
import java.io.File
import java.util.concurrent.TimeUnit

@Module
class OkHttpClientModule {
    @Provides
    fun okHttpClient(
        cache:Cache,
        httpLoggingInterceptor: HttpLoggingInterceptor,
        authorizationInterceptor: AuthorizationInterceptor
    ): OkHttpClient {
        return OkHttpClient()
            .newBuilder()
            .cache(cache)
            .readTimeout(TIMEOUT, TimeUnit.SECONDS)
            .writeTimeout(TIMEOUT, TimeUnit.SECONDS)
            .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
            .addInterceptor(httpLoggingInterceptor)
            .addNetworkInterceptor(authorizationInterceptor)
            .build()
    }

    @Provides
    fun cache(file:File): Cache = Cache(file, 10 * 1024 *1024)

    @Provides
    fun file(app: Application): File {
        val file = File(app.cacheDir, "HttpCache")
        file.mkdirs()
        return file
    }

    @Provides
    fun httpLoggingInterceptor(): HttpLoggingInterceptor {
        var httpLoggingInterceptor = HttpLoggingInterceptor(HttpLoggingInterceptor.Logger { message -> Timber.d(message) })
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return httpLoggingInterceptor
    }

    @Provides
    fun authorizationInterceptor(): AuthorizationInterceptor = AuthorizationInterceptor()

}