package com.gmail.najbar.maciek.tdd.utils





fun fib(number: Int): Int {
    if (number == 1) {
        return 1
    }
    if (number == 0) {
        return 0
    }

    var oneBeforePrev = 0
    var prev = 1
    var result = 0
    for (i in 1 until number) {
        result = prev + oneBeforePrev
        oneBeforePrev = prev
        prev = result
    }
    return result
}





















