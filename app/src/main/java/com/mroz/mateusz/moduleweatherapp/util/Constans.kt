package com.mroz.mateusz.moduleweatherapp.util

import java.util.*


//si system and language=pl
//https://api.darksky.net/forecast/618b54b6d4a3fcb802ca0a78bb602728/37.8267,-122.4233?units=si&lang=pl
const val TIMEOUT: Long = 15
const val WEATHER_KEY = "618b54b6d4a3fcb802ca0a78bb602728"
const val BASE_URL: String = "https://api.darksky.net/forecast/$WEATHER_KEY/"
const val SI_SYSTEM = "si"
var _language = Locale.getDefault().language ?: "en"
//const val LANGUAGE: String = _language

