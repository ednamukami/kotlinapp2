package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page2 : AppCompatActivity() {
    lateinit var btnprev1: Button
    lateinit var btnnext2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        castViews2()
        onClick2()
        castViews3()
        onClick3()
    }
    fun castViews2(){
        btnprev1=findViewById(R.id.btnprev1)
    }

    fun onClick2() {
        btnprev1.setOnClickListener {
            var intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
    }

    fun castViews3(){
        btnnext2=findViewById(R.id.btnnext2)

    }
    fun onClick3() {
        btnnext2.setOnClickListener {
            var intent = Intent(baseContext, page3::class.java)
            startActivity(intent)
        }
    }

}