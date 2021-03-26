package com.handeekin.PageTrackingPractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*
import kotlinx.android.synthetic.main.activity_main.*

class a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        pageAButton.setOnClickListener {

            val intent = Intent(this@a,b::class.java)
            finish()
            startActivity(intent)
        }
    }
}