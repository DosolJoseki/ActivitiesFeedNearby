package com.home.joseki.activitiesfeednearby.di

import com.home.joseki.activitiesfeednearby.data.ICityGPSSource
import com.home.joseki.activitiesfeednearby.di.providers.CityGpsSourseProvider
import toothpick.config.Module

class SourceModule: Module() {
    init {
        bind(ICityGPSSource::class.java).toProvider(CityGpsSourseProvider::class.java).providesSingletonInScope()
    }
}