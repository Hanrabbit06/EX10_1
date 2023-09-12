package com.example.ex10_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    lateinit var btnMain : Button
    lateinit var rg : RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMain = findViewById(R.id.btnMain)
        rg = findViewById(R.id.radioGroup)

        btnMain.setOnClickListener {
            var intent = Intent(applicationContext, secondActivity::class.java)
            if(rg.checkedRadioButtonId === R.id.rbSecond){

                intent = Intent(applicationContext, secondActivity::class.java)
            }else{
                intent = Intent(applicationContext,ThirdActivity::class.java)
            }
            startActivity(intent)
        }
    }
}