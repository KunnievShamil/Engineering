package com.example.engineering.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.engineering.MainActivity
import com.example.engineering.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_SplashScreen)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed(object : Runnable{
            override fun run() {
                startActivity(Intent(this@SplashActivity,MainActivity::class.java))
            }

        },1500)
    }
}