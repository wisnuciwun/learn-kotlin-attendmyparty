package com.learnkotlin.attendmyparty.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.learnkotlin.attendmyparty.DINNER_PACKAGE
import com.learnkotlin.attendmyparty.FIRST_MUSIC
import com.learnkotlin.attendmyparty.R
import kotlinx.android.synthetic.main.activity_end_registration.*

class EndRegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_registration)

        val musicsList = intent.getStringExtra(FIRST_MUSIC)
        val dinnerPackage = intent.getStringExtra(DINNER_PACKAGE)

        loading_text.text = "Preparing your $dinnerPackage while listening $musicsList"
    }
}