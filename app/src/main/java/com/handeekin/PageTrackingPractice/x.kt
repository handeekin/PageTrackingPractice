package com.handeekin.PageTrackingPractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_b.*
import kotlinx.android.synthetic.main.activity_x.*

class x : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_x)

        pageXButton.setOnClickListener {

            val intent = Intent(this@x,y::class.java)
            finish()
            startActivity(intent)
        }
    }
}