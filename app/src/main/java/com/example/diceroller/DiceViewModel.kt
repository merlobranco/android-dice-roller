package com.example.diceroller

import android.util.Log
import androidx.lifecycle.ViewModel
import java.util.*

class DiceViewModel : ViewModel() {
    var randomInt = 0

    init {
        Log.i("DiceViewModel", "GameViewModel created!")
    }

    fun rollDice() {
        randomInt = Random().nextInt(6) + 1
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("DiceViewModel", "GameViewModel destroyed!")
    }
}