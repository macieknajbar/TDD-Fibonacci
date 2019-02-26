package com.gmail.najbar.maciek.tdd.results.presenter

import com.gmail.najbar.maciek.tdd.results.ResultsContract
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

class CalculateFibonacciPresenterTest {

    private val view = mock(ResultsContract.CalculateFibonacciView::class.java)

    @Test fun `displays fib result to user`() {
        val number = 123
        val presenter = CalculateFibonacciPresenter(view)

        presenter.presentResults(number)

        verify(view).displayResults(number)
    }
}