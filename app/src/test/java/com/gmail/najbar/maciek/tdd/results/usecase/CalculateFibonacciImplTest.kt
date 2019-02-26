package com.gmail.najbar.maciek.tdd.results.usecase

import com.gmail.najbar.maciek.tdd.utils.fib
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

class CalculateFibonacciImplTest {

    private val presenter = mock(CalculateFibonacci.Presenter::class.java)

    @Test fun `presents result to user`() {
        val number = 6
        val calculateFibonacci = CalculateFibonacciImpl(presenter)

        calculateFibonacci.forValue(number)

        verify(presenter).presentResults(fib(number))
    }
}




