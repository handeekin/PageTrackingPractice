package com.handeekin.PageTrackingPractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*
import kotlinx.android.synthetic.main.activity_b.*

class b : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        pageBButton.setOnClickListener {

            val intent = Intent(this@b,y::class.java)
            finish()
            startActivity(intent)
        }
    }
}