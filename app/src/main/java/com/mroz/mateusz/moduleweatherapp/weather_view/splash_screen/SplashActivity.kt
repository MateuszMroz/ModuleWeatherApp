package com.mroz.mateusz.moduleweatherapp.weather_view.splash_screen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.mroz.mateusz.moduleweatherapp.R
import com.mroz.mateusz.moduleweatherapp.weather_view.MainActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

    }

    @SuppressLint("ResourceType")
    override fun onResume() {
        super.onResume()
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()

    }


}
