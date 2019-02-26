package com.gmail.najbar.maciek.tdd.utils

import android.content.Intent
import android.support.test.rule.ActivityTestRule

class TestUtil(private val rule: ActivityTestRule<*>) {

    fun launchActivity() {
        rule.launchActivity(Intent())
    }
}





