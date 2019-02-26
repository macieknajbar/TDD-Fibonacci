package com.gmail.najbar.maciek.tdd.utils





fun fib(number: Int): Int {
    if (number == 1) {
        return 1
    }
    if (number == 0) {
        return 0
    }
    return fib(number - 1) +
            fib(number - 2)
}





















