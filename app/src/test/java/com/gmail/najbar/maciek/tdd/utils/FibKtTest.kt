package com.gmail.najbar.maciek.tdd.utils

import org.junit.Assert.assertEquals
import org.junit.Test

class FibKtTest {

    @Test fun `fib 1`() {
        assertEquals(1, fib(1))
    }

    @Test fun `fib 2`() {
        assertEquals(1, fib(2))
    }

    @Test fun `fib 3`() {
        assertEquals(2, fib(3))
    }
}






