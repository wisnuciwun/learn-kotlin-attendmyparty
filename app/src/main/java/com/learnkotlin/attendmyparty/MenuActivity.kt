package com.learnkotlin.attendmyparty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MenuActivity : LifecycleActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun onHandleChangePage(view: View){
        // view: View is important to show next page

        val dinnerActivity = Intent(this, DinnerPackages::class.java)
        startActivity(dinnerActivity)
    }
}