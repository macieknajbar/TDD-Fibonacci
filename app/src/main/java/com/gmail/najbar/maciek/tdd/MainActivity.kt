package com.gmail.najbar.maciek.tdd

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.gmail.najbar.maciek.tdd.usecase.ShowResults
import com.gmail.najbar.maciek.tdd.utils.viewId

class MainActivity : AppCompatActivity() {

    private val enter: Button by viewId { R.id.enter }

    private lateinit var showResults: ShowResults

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enter.setOnClickListener {
            showResults.now()
        }
    }
}



