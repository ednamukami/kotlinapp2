package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page4 : AppCompatActivity() {
    lateinit var btnprev3: Button
    lateinit var btnnext4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        castViews6()
        onClick6()
        castViews7()
        onClick7()
    }

    fun castViews6(){
        btnprev3=findViewById(R.id.btnprev3)

    }
    fun onClick6() {
        btnprev3.setOnClickListener {
            var intent = Intent(baseContext, page3::class.java)
            startActivity(intent)
        }
    }

    fun castViews7(){
        btnnext4=findViewById(R.id.btnnext4)

    }
    fun onClick7() {
        btnnext4.setOnClickListener {
            var intent = Intent(baseContext, page5::class.java)
            startActivity(intent)
        }
    }
}