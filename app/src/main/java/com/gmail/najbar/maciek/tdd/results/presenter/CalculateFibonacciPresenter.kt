package com.gmail.najbar.maciek.tdd.results.presenter

import com.gmail.najbar.maciek.tdd.results.ResultsContract
import com.gmail.najbar.maciek.tdd.results.usecase.CalculateFibonacci

class CalculateFibonacciPresenter(
        private val view: ResultsContract.CalculateFibonacciView)
    : CalculateFibonacci.Presenter {

    override fun presentResults(fib: Int) {
        view.displayResults(fib)
    }
}



