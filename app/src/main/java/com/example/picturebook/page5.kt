package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page5 : AppCompatActivity() {
    lateinit var btnprev4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)
        castViews8()
        onClick8()

    }
    fun castViews8(){
        btnprev4=findViewById(R.id.btnprev4)

    }
    fun onClick8() {
        btnprev4.setOnClickListener {
            var intent = Intent(baseContext, page4::class.java)
            startActivity(intent)
        }
    }


}