package com.example.laboratorio03moviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private var result: Double = 0.0

    private lateinit var moneyTextView: TextView
    private lateinit var fiveCentsImage: ImageView
    private lateinit var tenCentsImage: ImageView
    private lateinit var quarterImage: ImageView
    private lateinit var dollarImage: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding()
        setOnClickListeners()
    }

    private fun binding() {
        moneyTextView = findViewById(R.id.money_value_text_view)
        fiveCentsImage = findViewById(R.id.five_cents_image_view)
        tenCentsImage = findViewById(R.id.ten_cents_image_view)
        quarterImage = findViewById(R.id.quarter_image_view)
        dollarImage = findViewById(R.id.dollar_image_view)
    }

    private fun setOnClickListeners() {
        fiveCentsImage.setOnClickListener {add(0.05)}
        tenCentsImage.setOnClickListener {add(0.10)}
        quarterImage.setOnClickListener {add(0.25)}
        dollarImage.setOnClickListener {add(1.0)}
    }

    private fun add (value: Double){
        result += value
        val round = (result * 1000.0).roundToInt().toDouble() / 1000.0

        moneyTextView?.text = round.toString()
    }
}