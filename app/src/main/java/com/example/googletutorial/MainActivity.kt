package com.example.googletutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var diceOneImage : ImageView
    lateinit var diceTwoImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
        diceOneImage = findViewById(R.id.dice_one_image)
        diceTwoImage = findViewById(R.id.dice_two_image)

        rollButton.setOnClickListener { rollDice() }
    }
    private fun rollDice(){

        diceOneImage.setImageResource(getRandomDiceImage())
        diceTwoImage.setImageResource(getRandomDiceImage())
    }
    private fun getRandomDiceImage(): Int {
        val randomInt = (1..6).random()

         return when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

    }
}

