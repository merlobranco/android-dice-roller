package com.example.diceroller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.diceroller.databinding.DiceFragmentBinding

class DiceFragment : Fragment() {

    private lateinit var binding: DiceFragmentBinding

    private lateinit var viewModel: DiceViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.dice_fragment, container, false)

        viewModel = ViewModelProvider(this).get(DiceViewModel::class.java)
        binding.diceViewModel = viewModel

        viewModel.randomInt.observe(viewLifecycleOwner, Observer { newValue ->
            updateImage(newValue)
        })

        return binding.root
    }

    private fun updateImage(value: Int) {
        if (value == 0)
            return

        // Getting the image resource
        val drawableResource = when (value) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Populating the image resource
        binding.diceImage.setImageResource(drawableResource)
    }
}