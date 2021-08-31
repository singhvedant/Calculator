package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var mainView :TextView
    lateinit var addView: TextView
    lateinit var operView: TextView

    var Number: Int = 0
    var Answer: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainView = findViewById(R.id.textViewMain)
        addView = findViewById(R.id.textViewAdd)
        operView = findViewById(R.id.textViewOper)


    }



    var oper:Char = '+'

    fun Btnpress(num: Int) {
        if(oper == '='){
            
        }
        Number = (Number*10)+num
        mainView.text = "$Number"
    }
    fun operate(str: Char){
        when(oper) {
            '+' -> Answer += Number
            '-' -> Answer -= Number
            '*' -> Answer *= Number
            '/' -> Answer /= Number
        }
        Number = 0

        operView.text = "$oper"
        addView.text = "$Answer"
        mainView.text = """0"""
        oper = str

    }
    fun btn0(view:View) {
        Btnpress(0)
    }

    fun btn1(view:View) {
        Btnpress(1)
    }

    fun btn2(view:View) {
        Btnpress(2)
    }

    fun btn3(view:View) {
        Btnpress(3)
    }

    fun btn4(view:View) {
        Btnpress(4)
    }

    fun btn5(view:View) {
        Btnpress(5)
    }

    fun btn6(view:View) {
        Btnpress(6)
    }

    fun btn7(view:View) {
        Btnpress(7)
    }

    fun btn8(view:View) {
        Btnpress(8)
    }

    fun btn9(view:View) {
        Btnpress(9)
    }
    fun CE(view: View){
        mainView.text = "0"
        addView.text = ""
        operView.text=""""""
        Number = 0
        Answer = 0
    }
    fun add (view:View){
        operate('+')
    }
    fun sub (view:View){
        operate('-')
    }
    fun mul (view:View){
        operate('*')
    }
    fun div (view:View){
        operate('/')
    }
    fun eql (view:View){
        operate('=')

        mainView.text = Answer.toString()
        addView.text = """"""
        operView.text = """"""
    }



}