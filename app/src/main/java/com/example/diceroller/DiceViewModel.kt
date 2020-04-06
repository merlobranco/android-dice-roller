package com.example.diceroller

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class DiceViewModel : ViewModel() {
    private val _randomInt = MutableLiveData<Int>()
    val randomInt: LiveData<Int>
        get() = _randomInt

    init {
        Log.i("DiceViewModel", "GameViewModel created!")
        _randomInt.value= 0
    }

    fun rollDice() {
        _randomInt.value = Random().nextInt(6) + 1
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("DiceViewModel", "GameViewModel destroyed!")
    }
}