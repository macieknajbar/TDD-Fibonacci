package com.gmail.najbar.maciek.tdd.results.usecase

interface CalculateFibonacci {

    /**
     * Triggers Fibonacci calculations for provided param.
     *
     * @param   number Input data.
     */
    fun forValue(number: Int)

    interface Presenter {

        /**
         * Presents fibonacci's result.
         *
         * @param   fib Fibonacci's result.
         */
        fun presentResults(fib: Int)
    }
}