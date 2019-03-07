package com.sorokinoleg.randomizer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val rollButton = findViewById<Button>(R.id.rollButton)

        rollButton.setOnClickListener {
            val rand = Random.nextInt(seekBar.progress + 1)
            resultTextView.text = rand.toString()
        }
    }
}
