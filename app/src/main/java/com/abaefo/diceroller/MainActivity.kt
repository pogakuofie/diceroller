package com.abaefo.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abaefo.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        var reset = false

        binding.rollButton.setOnClickListener() {
            binding.message.text = (1..6).random().toString()
        }
    }
}