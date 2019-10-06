package com.home.joseki.activitiesfeednearby.di

import com.home.joseki.activitiesfeednearby.di.providers.LocalRepositoryProvider
import com.home.joseki.activitiesfeednearby.di.providers.RssRepositoryProvider
import com.home.joseki.activitiesfeednearby.repositories.ILocationRepository
import com.home.joseki.activitiesfeednearby.repositories.IRssRepository
import toothpick.config.Module

class RepositoryModule: Module() {
    init {
        bind(ILocationRepository::class.java).toProvider(LocalRepositoryProvider::class.java).providesSingletonInScope()
        bind(IRssRepository::class.java).toProvider(RssRepositoryProvider::class.java).providesSingletonInScope()
    }
}