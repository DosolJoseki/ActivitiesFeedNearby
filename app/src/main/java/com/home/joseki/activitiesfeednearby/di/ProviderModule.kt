package com.home.joseki.activitiesfeednearby.di

import com.home.joseki.activitiesfeednearby.di.providers.MainFragmentInteractorProvider
import com.home.joseki.activitiesfeednearby.interactors.IMainFragmentInteractor
import toothpick.config.Module

class ProviderModule: Module() {
    init {
        bind(IMainFragmentInteractor::class.java).toProvider(MainFragmentInteractorProvider::class.java).providesSingletonInScope()
    }
}