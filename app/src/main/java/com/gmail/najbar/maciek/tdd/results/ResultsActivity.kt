package com.gmail.najbar.maciek.tdd.results

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.gmail.najbar.maciek.tdd.R

class ResultsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)
    }

    companion object {
        const val EXTRA_NUMBER = "EXTRA_NUMBER"
    }
}




