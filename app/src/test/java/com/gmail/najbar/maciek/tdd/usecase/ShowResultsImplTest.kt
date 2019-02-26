package com.gmail.najbar.maciek.tdd.usecase

import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

class ShowResultsImplTest {

    private val presenter = mock(ShowResults.Presenter::class.java)

    @Test fun `presents result screen to user`() {
        val number = 6
        val showResults = ShowResultsImpl(presenter)

        showResults.forValue(number)

        verify(presenter).presentResultsScreenFor(number)
    }
}


