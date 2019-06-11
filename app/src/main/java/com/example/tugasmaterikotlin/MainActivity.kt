package com.example.tugasmaterikotlin

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nama.text = Konstanta.setterGetternama
        when(Konstanta.getjkVariable()){
            "L" -> nama.setTextColor(Color.GREEN )
            "P" -> nama.setTextColor(Color.MAGENTA )
        }
        btn_logout.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
            finish()
        }
    }
}
