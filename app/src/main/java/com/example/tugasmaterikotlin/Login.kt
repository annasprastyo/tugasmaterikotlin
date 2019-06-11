package com.example.tugasmaterikotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.login.*

class Login : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    var jenis = arrayOf("L", "P")
    var textView_msg: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        textView_msg = this.msg

        spinner!!.setOnItemSelectedListener(this)
        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, jenis)
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner!!.setAdapter(aa)

        btn_masuk.setOnClickListener {
            Konstanta.setterGetternama = username.text.toString()
            Konstanta.setjkVariable(spinner.selectedItem.toString())
            var jenis = Konstanta.getjkVariable()
            if (username.text.toString().equals("")){
                Toast.makeText(this, "username tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }else{
//                Toast.makeText(this, jenis , Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }

    override fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {
        textView_msg!!.text = "Pilihan : "+jenis[position]
    }

    override fun onNothingSelected(arg0: AdapterView<*>) {

    }
}