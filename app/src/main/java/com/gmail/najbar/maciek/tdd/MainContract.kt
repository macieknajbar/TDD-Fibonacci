package com.gmail.najbar.maciek.tdd

interface MainContract {

    interface ShowResultsView {

        /**
         * Opens results screen and passes number.
         *
         * @param   number Passed value.
         */
        fun openResultsFor(number: Int)
    }
}