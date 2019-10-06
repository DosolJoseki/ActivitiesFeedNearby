package com.home.joseki.activitiesfeednearby

import com.home.joseki.activitiesfeednearby.di.navigation.MainRouter
import com.home.joseki.activitiesfeednearby.di.navigation.Screens
import io.reactivex.disposables.CompositeDisposable

class MainActivityPresenter(
    router: MainRouter
) {
    private val compositeDisposable = CompositeDisposable()

    init {
        router.navigateTo(Screens.MainScreen)
    }

    fun onDestroy() {
        compositeDisposable.clear()
    }
}