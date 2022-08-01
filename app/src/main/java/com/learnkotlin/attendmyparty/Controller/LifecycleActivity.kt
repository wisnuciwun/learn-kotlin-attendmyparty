package com.learnkotlin.attendmyparty.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

open class LifecycleActivity : AppCompatActivity() {
    val tryMe = "Lifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(tryMe, "${javaClass.simpleName} this is onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(tryMe, "${javaClass.simpleName} this is onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(tryMe, "${javaClass.simpleName} this is onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(tryMe, "${javaClass.simpleName} this is onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(tryMe, "${javaClass.simpleName} this is onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(tryMe, "${javaClass.simpleName} this is onDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d(tryMe, "${javaClass.simpleName} this is onRestart")
        super.onRestart()
    }

}