package com.example.ex10_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondActivity : AppCompatActivity() {
    lateinit var btnSecond:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnSecond = findViewById(R.id.btnSecond)
        btnSecond.setOnClickListener {
            finish()
        }
    }
}