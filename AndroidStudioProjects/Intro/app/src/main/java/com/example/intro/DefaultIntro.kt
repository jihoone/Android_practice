package com.example.intro

import android.location.Location
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.intro.AppIntro
import com.example.intro.AppIntroFragment
import com.github.appintro.example.R

class DefaultIntro : AppIntro() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addSlide(AppIntroFragment.newInstance(
                "First",
                "시작 화면",
                imageDrawable = R.drawable.picture4
        ))

        addSlide(AppIntroFragment.newInstance(
                "Second",
                "어플에 대해서",
                imageDrawable = R.drawable.picture5
        ))

        addSlide(AppIntroFragment.newInstance(
                "Third",
                "어플의 기능은",
                imageDrawable = R.drawable.picture6
        ))

        addSlide(AppIntroFragment.newInstance(
                "Finally",
                "회원가입 하러가기",
                imageDrawable = R.drawable.picture7
        ))
    }

    public override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        finish()
    }

    public override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        finish()
    }
}