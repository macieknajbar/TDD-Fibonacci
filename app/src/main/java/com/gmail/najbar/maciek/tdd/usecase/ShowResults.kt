package com.gmail.najbar.maciek.tdd.usecase

interface ShowResults {

    /**
     * Triggers use case.
     *
     * @param   number Input data.
     */
    fun forValue(number: Int)

    interface Presenter {

        /**
         * Presents results screen to user.
         *
         * @param   number Passed input data.
         */
        fun presentResultsScreenFor(number: Int)
    }
}