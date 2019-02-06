package com.mroz.mateusz.moduleweatherapp.weather_view.splash_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mroz.mateusz.moduleweatherapp.R
import com.mroz.mateusz.moduleweatherapp.weather_view.MainActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
    }


    override fun onResume() {
        super.onResume()
        // delete splash screen from back stack
        // way without navigation architecture
        var intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        finish()
    }


}
