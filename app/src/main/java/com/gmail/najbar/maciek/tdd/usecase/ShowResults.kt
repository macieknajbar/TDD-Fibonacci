package com.gmail.najbar.maciek.tdd.usecase

interface ShowResults {

    /**
     * Triggers use case.
     */
    fun forValue(number: Int)

    interface Presenter {

        /**
         * Presents results screen to user.
         */
        fun presentResultsScreenFor(number: Int)
    }
}