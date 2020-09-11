package default

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.project_intro.AppIntro
import com.example.project_intro.AppIntroFragment
import com.example.project_intro.R


class Intro {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addSlide(AppIntroFragment.newInstance(
            "Welcome!",
            "This is a demo of the AppIntro library, with a custom background on each slide!",
            imageDrawable = R.drawable.picture
        ))

        addSlide(AppIntroFragment.newInstance(
            "Clean App Intros",
            "This library offers developers the ability to add clean app intros at the start of their apps.",
            imageDrawable = R.drawable.picture1
        ))

        addSlide(AppIntroFragment.newInstance(
            "Simple, yet Customizable",
            "The library offers a lot of customization, while keeping it simple for those that like simple.",
            imageDrawable = R.drawable.picture2
        ))

        addSlide(AppIntroFragment.newInstance(
            "Explore",
            "Feel free to explore the rest of the library demo!",
            imageDrawable = R.drawable.picture3
        ))
}