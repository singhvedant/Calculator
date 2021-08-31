package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var mainView :TextView = findViewById(R.id.textViewMain)
    var addView: TextView = findViewById(R.id.textViewAdd)
    var operView: TextView = findViewById(R.id.textViewOper)
    var oper:Char = '+'

    fun Btnpress(num: Int) {
        var text: Int = Integer.parseInt(mainView.text as String) * 10
        text += num
        mainView.text = "$num"
    }
    fun operate(str: Char){
        var mainViewNum = Integer.parseInt(mainView.text as String)
        var ansViewNum = Integer.parseInt(addView.text as String)
        when(oper) {
            '+' -> ansViewNum += mainViewNum
            '-' -> ansViewNum -= mainViewNum
            '*' -> ansViewNum *= mainViewNum
            '/' -> ansViewNum /= mainViewNum
        }
        oper = str
        operView.text = "$oper"
        addView.text = "$ansViewNum"
        mainView.text = """0"""

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
        addView.text = "0"
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
        operate('+')
        mainView.text = addView.text
        addView.text = """0"""
    }



}