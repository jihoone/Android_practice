package com.github.appintro.example.ui

import androidx.annotation.StringRes
import com.github.appintro.example.R
import com.github.appintro.example.ui.default.DefaultIntro

data class IntroEntry(
        @StringRes val title: Int,
        @StringRes val description: Int,
        val activityClass: Class<*>
)

val defaultEntries = listOf(
        IntroEntry(R.string.default_intro_title, R.string.default_intro, DefaultIntro::class.java)
)

