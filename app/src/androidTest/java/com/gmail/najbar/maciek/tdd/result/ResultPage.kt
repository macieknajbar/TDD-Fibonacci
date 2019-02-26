package com.gmail.najbar.maciek.tdd.result

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import com.gmail.najbar.maciek.tdd.R
import org.hamcrest.CoreMatchers.allOf

object ResultPage {

    fun confirmTitleDisplayed() {
        onView(withId(R.id.title))
                .check(matches(isDisplayed()))
    }

    fun confirmSees(value: Int) {
        onView(allOf(
                withId(R.id.result),
                withText(value.toString())
        )).check(matches(isDisplayed()))
    }
}




