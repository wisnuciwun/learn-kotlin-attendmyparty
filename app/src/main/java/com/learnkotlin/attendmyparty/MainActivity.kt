package com.learnkotlin.attendmyparty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var memberName:String = ""
    val partyMate = arrayListOf<String>("Jeremy", "Dave", "Marvin", "Lexy", "Cindy")
    override fun onCreate(savedInstanceState: Bundle?) { //this is one of lifecycle, first render
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        member_name.text = "..."

        btn_join.setOnClickListener{
            var timeNow = SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(Date())
            val randomize = java.util.Random()
            val randomPartyMate = randomize.nextInt(partyMate.count())
            memberName = input_member_name.text.toString()
            member_name.text = "Welcome ${input_member_name.text} !"
            time_attend.text = "You came at ${timeNow}"
            mate_name.text = "Well, you'll take time with ${partyMate[randomPartyMate]}"
            input_member_name.text.clear()
        }

        btn_leave.setOnClickListener {
            var timeNow = SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(Date())
            Toast.makeText(applicationContext, "Bye ${memberName}, you left at ${timeNow}", Toast.LENGTH_SHORT).show()
            member_name.text = "..."
            memberName = ""
            time_attend.text = ""
            mate_name.text = ""
        }
    }
}