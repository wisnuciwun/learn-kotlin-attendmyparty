package com.learnkotlin.attendmyparty.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.learnkotlin.attendmyparty.DINNER_PACKAGE
import com.learnkotlin.attendmyparty.FIRST_MUSIC
import com.learnkotlin.attendmyparty.R
import kotlinx.android.synthetic.main.activity_dinner_packages.*

class DinnerPackages : AppCompatActivity() {
    var selectedDinner: String = ""
    var musicsList = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dinner_packages)
        musicsList = intent.getStringExtra(FIRST_MUSIC).toString();
        Log.d("coba", musicsList)

        button_finish.setOnClickListener {
            val finishActivity = Intent(this, EndRegistrationActivity::class.java)
            finishActivity.putExtra(FIRST_MUSIC, musicsList)
            finishActivity.putExtra(DINNER_PACKAGE, selectedDinner)
            startActivity(finishActivity)
        }
    }

    fun onHandleChooseDinner(view: View) {
        when (view.id) {
            btn_opt_1.id -> {
                btn_opt_2.isChecked = false
                btn_opt_3.isChecked = false
                selectedDinner = btn_opt_1.text.toString()
            }
            btn_opt_2.id -> {
                btn_opt_1.isChecked = false
                btn_opt_3.isChecked = false
                selectedDinner = btn_opt_2.text.toString()
            }
            btn_opt_3.id -> {
                btn_opt_1.isChecked = false
                btn_opt_2.isChecked = false
                selectedDinner = btn_opt_3.text.toString()
            }
        }
    }
}