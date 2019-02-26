package com.gmail.najbar.maciek.tdd.presenter

import com.gmail.najbar.maciek.tdd.MainContract
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

class ShowResultsPresenterTest {

    private val view = mock(MainContract.ShowResultsView::class.java)

    @Test fun `opens results screen`() {
        val number = 7
        val presenter = ShowResultsPresenter()

        presenter.presentResultsScreenFor(number)

        verify(view).openResultsFor(number)
    }
}




