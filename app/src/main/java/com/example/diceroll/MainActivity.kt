package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn : Button = findViewById(R.id.btnRoll)

        rollBtn.setOnClickListener {
                      rollDice()
        }
    }
    fun rollDice() {
        val dice1 = Dice(6)
        val dice1Roll = dice1.roll()
        val diceImage : ImageView = findViewById(R.id.diceImage)
        val drawables = when (dice1Roll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawables)
        diceImage.contentDescription = dice1Roll.toString()

        val dice2 = Dice(6)
        val dice2Roll = dice2.roll_2()
        val diceImage2 : ImageView = findViewById(R.id.diceImage_2)
        val drawables2 = when (dice2Roll){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage2.setImageResource(drawables2)
        diceImage2.contentDescription = dice2Roll.toString()

    }

    class Dice (private val sides: Int) {
        fun roll() : Int{
            return(1..sides).random()
        }
        fun roll_2() : Int{
            return(1..sides).random()
        }
    }
}