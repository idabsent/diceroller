package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.os.Bundle

import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.roll_button)
        rollImage1 = findViewById(R.id.roll_image_1)
        rollImage2 = findViewById(R.id.roll_image_2)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val rollResource1 = getResourceID()
        val rollResource2 = getResourceID()

        rollImage1.setImageResource(rollResource1)
        rollImage2.setImageResource(rollResource2)

    }

    private fun getResourceID() : Int {
        return when(Random.nextInt(6)){
            0 -> R.drawable.dice_1
            1 -> R.drawable.dice_2
            2 -> R.drawable.dice_3
            3 -> R.drawable.dice_4
            4 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private lateinit var rollButton: Button
    private lateinit var rollImage1: ImageView
    private lateinit var rollImage2: ImageView
}