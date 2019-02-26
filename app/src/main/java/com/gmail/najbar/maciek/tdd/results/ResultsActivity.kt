package com.gmail.najbar.maciek.tdd.results

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.gmail.najbar.maciek.tdd.R
import com.gmail.najbar.maciek.tdd.results.presenter.CalculateFibonacciPresenter
import com.gmail.najbar.maciek.tdd.results.usecase.CalculateFibonacci
import com.gmail.najbar.maciek.tdd.results.usecase.CalculateFibonacciImpl
import com.gmail.najbar.maciek.tdd.utils.viewId

class ResultsActivity : AppCompatActivity(),
        ResultsContract.CalculateFibonacciView {

    private val result: TextView by viewId { R.id.result }

    private val calculateFibonacci: CalculateFibonacci =
            CalculateFibonacciImpl(CalculateFibonacciPresenter(this))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        calculateFibonacci.forValue(intent.getIntExtra(EXTRA_NUMBER, 0))
    }

    override fun displayResults(value: Int) {
        result.text = value.toString()
    }

    companion object {
        const val EXTRA_NUMBER = "EXTRA_NUMBER"
    }
}




