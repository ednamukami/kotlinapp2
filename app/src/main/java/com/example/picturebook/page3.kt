package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page3 : AppCompatActivity() {
    lateinit var btnprev2: Button
    lateinit var btnnext3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
        castViews4()
        onClick4()
        castViews5()
        onClick5()
    }
    fun castViews4(){
        btnprev2=findViewById(R.id.btnprev2)

    }



    fun onClick4() {
        btnprev2.setOnClickListener {
            var intent = Intent(baseContext, page2::class.java)
            startActivity(intent)
        }
    }

    fun castViews5(){
        btnnext3=findViewById(R.id.btnnext3)

    }
    fun onClick5() {
        btnnext3.setOnClickListener {
            var intent = Intent(baseContext, page4::class.java)
            startActivity(intent)
        }
    }

}