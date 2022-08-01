package com.learnkotlin.attendmyparty.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.learnkotlin.attendmyparty.FIRST_MUSIC
import com.learnkotlin.attendmyparty.R
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : LifecycleActivity() {
    var listMusic = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        toggleButton1.setOnClickListener {
            if (toggleButton1.isChecked) {
                listMusic.add(toggleButton1.text.toString())
            } else {
                listMusic.removeAt(listMusic.indexOf(toggleButton1.text))
            }
        }

        toggleButton2.setOnClickListener {
            if (toggleButton2.isChecked) {
                listMusic.add(toggleButton2.text.toString())
            } else {
                listMusic.removeAt(listMusic.indexOf(toggleButton2.text))
            }
        }

        toggleButton3.setOnClickListener {
            if (toggleButton3.isChecked) {
                listMusic.add(toggleButton3.text.toString())
            } else {
                listMusic.removeAt(listMusic.indexOf(toggleButton3.text))
            }
        }

        toggleButton4.setOnClickListener {
            if (toggleButton4.isChecked) {
                listMusic.add(toggleButton4.text.toString())
            } else {
                listMusic.removeAt(listMusic.indexOf(toggleButton4.text))
            }
        }

        toggleButton5.setOnClickListener {
            if (toggleButton5.isChecked) {
                listMusic.add(toggleButton5.text.toString())
            } else {
                listMusic.removeAt(listMusic.indexOf(toggleButton5.text))
            }
        }
    }

    fun onHandleChangePage(view: View) {
        // view: View is important to show next page
        if (listMusic.isNotEmpty()) {
            val dinnerActivity = Intent(this, DinnerPackages::class.java)
            dinnerActivity.putExtra(FIRST_MUSIC, listMusic[0])
            startActivity(dinnerActivity)
        } else {
            Toast.makeText(this, "Please select music", Toast.LENGTH_SHORT).show()
        }

    }
}