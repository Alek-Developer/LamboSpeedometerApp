package com.gsixacademy.android.lambospeedometerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        supportActionBar?.hide() - raboti i so aktiven ActionBar/hide !!
//        Implementacija na kod za SplashActivity - Screen !! (od 17 do 21 linija)
        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        },4500)


    }

}