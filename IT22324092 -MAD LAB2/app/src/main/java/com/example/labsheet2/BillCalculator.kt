package com.example.labsheet2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BillCalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bill_calculator)
        val etUnits: EditText = findViewById(R.id.etUnits)
        val btnCalculate: Button = findViewById(R.id.btnCalculate)
        val tvResult: TextView = findViewById(R.id.tvResult)

        btnCalculate.setOnClickListener {
            val unitsText = etUnits.text.toString()
            if (unitsText.isNotEmpty()) {
                val units = unitsText.toInt()
                val fixedCharge = 150.0
                val unitCost = 29.0
                val vat = 0.15

                var bill = fixedCharge + (units * unitCost)
                bill += bill * vat // add VAT

                tvResult.text = "Electricity Bill: %.2f LKR".format(bill)
            } else {
                tvResult.text = "Please enter units!"
            }
            }
    }
}