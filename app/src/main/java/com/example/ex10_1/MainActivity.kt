package com.example.ex10_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnMain : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMain = findViewById(R.id.btnMain)
        btnMain.setOnClickListener {
            var intent = Intent(applicationContext,secondActivity::class.java)
            startActivity(intent)
        }
    }
}