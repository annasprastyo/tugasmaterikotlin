package com.example.tugasmaterikotlin

class Konstanta {
    //deklarasi dalam java
    // final Sting namaVariabel = "contoh variabel"
    companion object{
        var jkVariable = ""
        fun setjkVariable(jkVariable: String){
            this.jkVariable= jkVariable
        }
        fun getjkVariable() : String{
            return jkVariable
        }

        var setterGetternama = ""
            get() = field
            set(value){
                field = value
            }
    }
}