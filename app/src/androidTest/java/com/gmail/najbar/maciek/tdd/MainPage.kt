package com.gmail.najbar.maciek.tdd

import android.support.test.espresso.Espresso.closeSoftKeyboard
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.matcher.ViewMatchers.withId

object MainPage {

    fun putsNumber(number: Int) {
        onView(withId(R.id.input_number))
                .perform(typeText(number.toString()))
    }

    fun hitsEnter() {
        closeSoftKeyboard()
        onView(withId(R.id.enter))
                .perform(click())
    }
}




