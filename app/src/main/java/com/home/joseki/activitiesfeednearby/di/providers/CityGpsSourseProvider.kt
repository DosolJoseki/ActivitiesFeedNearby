package com.home.joseki.activitiesfeednearby.di.providers

import android.content.Context
import com.home.joseki.activitiesfeednearby.data.CityGPSSource
import com.home.joseki.activitiesfeednearby.data.ICityGPSSource
import javax.inject.Inject
import javax.inject.Provider

class CityGpsSourseProvider @Inject constructor(
    private val context: Context
):Provider<ICityGPSSource> {
    override fun get(): ICityGPSSource = CityGPSSource(context)
}