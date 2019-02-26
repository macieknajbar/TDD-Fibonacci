package com.gmail.najbar.maciek.tdd.results

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gmail.najbar.maciek.tdd.R
import com.gmail.najbar.maciek.tdd.results.usecase.CalculateFibonacci

class ResultsActivity : AppCompatActivity() {

    private lateinit var calculateFibonacci: CalculateFibonacci

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        calculateFibonacci.forValue(intent.getIntExtra(EXTRA_NUMBER, 0))
    }

    companion object {
        const val EXTRA_NUMBER = "EXTRA_NUMBER"
    }
}




