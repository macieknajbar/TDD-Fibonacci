package com.gmail.najbar.maciek.tdd.usecase

class ShowResultsImpl(
        private val presenter: ShowResults.Presenter) : ShowResults {

    override fun forValue(number: Int) {
        presenter.presentResultsScreenFor(number)
    }
}



