package com.gmail.najbar.maciek.tdd.utils

import android.app.Activity
import android.view.View

fun <T: View> Activity.viewId(id: () -> Int) = object : Lazy<T> {
    override val value: T
        get() = findViewById(id.invoke())

    override fun isInitialized(): Boolean = findViewById<T>(id.invoke()) != null
}