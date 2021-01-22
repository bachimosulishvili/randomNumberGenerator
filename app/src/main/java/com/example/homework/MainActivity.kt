package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){
        randomNumberButton.setOnClickListener {
            val number:Int = randomNumber()

            d("ButtonClicked", "$number")

            if (number > 0 && number % 5 == 0) {YesOrNo.text = "Yes"}
            else {YesOrNo.text = "No"}

            randomNumber.text = number.toString()

        }
    }
    private fun randomNumber(): Int {
        return (-100..100).random() 
    }

}
