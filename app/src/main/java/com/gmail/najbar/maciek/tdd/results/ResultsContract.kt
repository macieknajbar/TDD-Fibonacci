package com.gmail.najbar.maciek.tdd.results

interface ResultsContract {

    interface CalculateFibonacciView {

        /**
         * Displays result on the screen.
         *
         * @param   value Result
         */
        fun displayResults(value: Int)
    }
}