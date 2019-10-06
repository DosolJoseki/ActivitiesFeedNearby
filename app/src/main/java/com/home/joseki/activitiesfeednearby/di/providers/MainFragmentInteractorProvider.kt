package com.home.joseki.activitiesfeednearby.di.providers

import com.home.joseki.activitiesfeednearby.interactors.IMainFragmentInteractor
import com.home.joseki.activitiesfeednearby.interactors.MainFragmentInteractor
import com.home.joseki.activitiesfeednearby.repositories.ILocationRepository
import com.home.joseki.activitiesfeednearby.repositories.IRssRepository
import javax.inject.Inject
import javax.inject.Provider

class MainFragmentInteractorProvider @Inject constructor(
    private val rssRepository: IRssRepository,
    private val locationRepository: ILocationRepository
): Provider<IMainFragmentInteractor> {
    override fun get(): IMainFragmentInteractor = MainFragmentInteractor(rssRepository, locationRepository)
}