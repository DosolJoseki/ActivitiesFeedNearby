package com.home.joseki.activitiesfeednearby.di.providers

import com.home.joseki.activitiesfeednearby.data.ICityGPSSource
import com.home.joseki.activitiesfeednearby.repositories.ILocationRepository
import com.home.joseki.activitiesfeednearby.repositories.LocationRepository
import javax.inject.Inject
import javax.inject.Provider

class LocalRepositoryProvider @Inject constructor(
    private val iCityGPSSource: ICityGPSSource
): Provider<ILocationRepository> {
    override fun get(): ILocationRepository = LocationRepository(iCityGPSSource)
}