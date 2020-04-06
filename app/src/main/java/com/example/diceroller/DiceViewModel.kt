package com.example.diceroller

import android.util.Log
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    init {
        Log.i("DiceViewModel", "GameViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("DiceViewModel", "GameViewModel destroyed!")
    }
}