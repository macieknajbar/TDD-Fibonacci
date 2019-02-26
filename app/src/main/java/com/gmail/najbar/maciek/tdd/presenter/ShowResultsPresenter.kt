package com.gmail.najbar.maciek.tdd.presenter

import com.gmail.najbar.maciek.tdd.MainContract
import com.gmail.najbar.maciek.tdd.usecase.ShowResults

class ShowResultsPresenter(
        private val view: MainContract.ShowResultsView) : ShowResults.Presenter {

    override fun presentResultsScreenFor(number: Int) {
        view.openResultsFor(number)
    }
}



