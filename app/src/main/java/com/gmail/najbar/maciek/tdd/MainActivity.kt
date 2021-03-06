package com.gmail.najbar.maciek.tdd

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import com.gmail.najbar.maciek.tdd.presenter.ShowResultsPresenter
import com.gmail.najbar.maciek.tdd.results.ResultsActivity
import com.gmail.najbar.maciek.tdd.usecase.ShowResults
import com.gmail.najbar.maciek.tdd.usecase.ShowResultsImpl
import com.gmail.najbar.maciek.tdd.utils.viewId

class MainActivity : AppCompatActivity(), MainContract.ShowResultsView {

    private val inputNumber: EditText by viewId { R.id.input_number }
    private val enter: Button by viewId { R.id.enter }

    private val showResults: ShowResults =
            ShowResultsImpl(ShowResultsPresenter(this))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enter.setOnClickListener {
            val number = inputNumber.text.toString().toInt()
            showResults.forValue(number)
        }
    }

    override fun openResultsFor(number: Int) {
        val intent = Intent(this, ResultsActivity::class.java)
                .putExtra(ResultsActivity.EXTRA_NUMBER, number)
        startActivity(intent)
    }
}



