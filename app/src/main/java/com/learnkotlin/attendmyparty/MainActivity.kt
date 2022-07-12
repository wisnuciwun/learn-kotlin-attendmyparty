package com.learnkotlin.attendmyparty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //this is one of lifecycle, first render
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        member_name.text = "..."
    }
}