package com.gmail.najbar.maciek.tdd

import android.support.test.rule.ActivityTestRule
import com.gmail.najbar.maciek.tdd.result.ResultPage
import com.gmail.najbar.maciek.tdd.utils.TestUtil
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule val rule = ActivityTestRule(MainActivity::class.java)

    private val util = TestUtil(rule)

    @Test fun userFindsCalculatedFibonacciResult() {
        util.launchActivity()

        MainPage.putsNumber(7)
        MainPage.hitsEnter()

        ResultPage.confirmTitleDisplayed()
        ResultPage.confirmSees(13)
    }
}




