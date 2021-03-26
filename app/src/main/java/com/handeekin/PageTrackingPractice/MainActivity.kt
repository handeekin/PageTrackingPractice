package com.handeekin.PageTrackingPractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        topButton.setOnClickListener {

            val intent = Intent(this@MainActivity,a::class.java)
            startActivity(intent)
        }
        bottomButton.setOnClickListener {

            val intent = Intent(this@MainActivity,x::class.java)
            startActivity(intent)
        }


    }
}