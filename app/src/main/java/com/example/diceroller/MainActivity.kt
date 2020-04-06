package com.example.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Getting the Roll Button
//        binding.rollButton.setOnClickListener {
//            rollDice()
//        }
    }

//    private fun rollDice() {
//        val randomInt = Random().nextInt(6) + 1
//
//        // Getting the image resource
//        val drawableResource = when (randomInt) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//
//        // Populating the image resource
//        binding.diceImage.setImageResource(drawableResource)
//    }


}
