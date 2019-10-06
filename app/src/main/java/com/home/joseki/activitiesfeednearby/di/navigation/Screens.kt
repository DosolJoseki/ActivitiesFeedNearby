package com.home.joseki.activitiesfeednearby.di.navigation

import androidx.fragment.app.Fragment
import com.home.joseki.activitiesfeednearby.fragments.MainFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

object Screens {
    object MainScreen : SupportAppScreen() {
        override fun getFragment(): Fragment = MainFragment.newInstance()
    }
}