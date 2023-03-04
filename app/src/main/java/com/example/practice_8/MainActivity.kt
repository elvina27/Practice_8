package com.example.practice_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AllExamples = findViewById<TextView>(R.id.txtAllExamples)
        NumberRight = findViewById<TextView>(R.id.txtNumberRight)
        NumberFalse = findViewById<TextView>(R.id.txtNumberFalse)
        TimeMin = findViewById<TextView>(R.id.txtTimeMin)
        TimeMax = findViewById<TextView>(R.id.txtTimeMax)
        TimeAverage = findViewById<TextView>(R.id.txtTimeAverage)
        PrecentageCorrectAnswers = findViewById<TextView>(R.id.txtPrecentageCorrectAnswers)
        FirstOperand = findViewById<TextView>(R.id.txtFirstOperand)
        Ooperation = findViewById<TextView>(R.id.txtOperation)
        SecondOperand = findViewById<TextView>(R.id.txtSecondOperand)
        Result = findViewById<TextView>(R.id.txtResult)
        Right = findViewById<Button>(R.id.btnRight)
        False = findViewById<Button>(R.id.btnFalse)
        Start = findViewById<Button>(R.id.btnStart)
    }
    lateinit var AllExamples: TextView
    lateinit var NumberRight: TextView
    lateinit var NumberFalse: TextView
    lateinit var TimeMin: TextView
    lateinit var TimeMax: TextView
    lateinit var TimeAverage: TextView
    lateinit var PrecentageCorrectAnswers: TextView
    lateinit var FirstOperand: TextView
    lateinit var Ooperation: TextView
    lateinit var SecondOperand: TextView
    lateinit var Result: TextView
    lateinit var Right: Button
    lateinit var False: Button
    lateinit var Start: Button

    var i: Int = 0
    var j: Int = 0

    fun btnRightClick(view: View) {
        Right.isEnabled = false
        False.isEnabled = false
        Start.isEnabled = true

        var random = Random
        //первый операнд
        var FirstNumRand = random.nextInt(10,100)
        FirstOperand.setText("" + FirstNumRand)
        //операция
        val RandOperat = arrayOf("+","-","*","/")
        var Rand = RandOperat.random()
        if(Rand == "/")
        {
            if ((FirstOperand.text.toString().toInt() % SecondOperand.text.toString().toInt()) != 0)
            {
                Rand = "+"
                FirstOperand.text = ((FirstOperand.text.toString().toInt() / SecondOperand.text.toString()
                    .toInt() * SecondOperand.text.toString().toInt()).toString())
                SecondOperand.text = (SecondOperand.text.toString().toInt()).toString()
            }
        }
        Ooperation.text = Rand
        //второй операнд
        var SecondNumRand = random.nextInt(10,100)
        SecondOperand.setText("" + SecondNumRand)
        //результат
        var ResultRand = random.nextInt(1,2)
        if (ResultRand == 1){
            if (Result.text.toString().isEmpty())
                return
        }
           // Result.text = (FirstOperand.text.toString().toInt()) + (Ooperation.text.toString()) + (SecondOperand.text.toString().toInt())
            when (Ooperation.text.toString()) {
                "+" -> {
                    if ((FirstOperand.text.toString().toInt() + SecondNumRand.text.toString().toInt()) == Result.text.toString().toInt()
                    ) {
                        i++
                    } else {
                        j++
                    }
                }
                "-" -> {
                    if ((FirstOperand.text.toString().toInt() - SecondNumRand.text.toString().toInt()) == Result.text.toString().toInt()
                    ) {
                        i++
                    } else {
                        j++
                    }
                }
                "*" -> {
                    if ((FirstOperand.text.toString().toInt() * SecondNumRand.text.toString()
                            .toInt()) == Result.text.toString().toInt()
                    ) {
                        i++
                    } else {
                        j++
                    }
                }
                "/" -> {
                    if ((FirstOperand.text.toString().toInt() / SecondNumRand.text.toString()
                            .toInt()) == Result.text.toString().toInt()
                    ) {
                        i++
                    } else {
                        j++
                    }
                }
            }
    }
}


1 2

        if (ch==1){
          c=a+b
        }else
        {

        }
