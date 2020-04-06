package com.example.diceroller

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.diceroller.databinding.DiceFragmentBinding

class DiceFragment : Fragment() {

    private lateinit var binding: DiceFragmentBinding

    private lateinit var viewModel: DiceViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.dice_fragment, container, false)

        viewModel = ViewModelProvider(this).get(DiceViewModel::class.java)
        binding.diceViewModel = viewModel
        // Adding the live data to the DataBinding
        binding.lifecycleOwner = this

        return binding.root
    }
}