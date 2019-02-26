package com.gmail.najbar.maciek.tdd.results.usecase

import com.gmail.najbar.maciek.tdd.utils.fib

class CalculateFibonacciImpl(
        private val presenter: CalculateFibonacci.Presenter) : CalculateFibonacci {

    override fun forValue(number: Int) {
        presenter.presentResults(fib(number))
    }
}



