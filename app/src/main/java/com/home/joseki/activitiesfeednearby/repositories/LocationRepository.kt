package com.home.joseki.activitiesfeednearby.repositories

import android.location.Location
import com.home.joseki.activitiesfeednearby.data.ICityGPSSource
import io.reactivex.Maybe
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class LocationRepository @Inject constructor(
    private val source: ICityGPSSource
): ILocationRepository {
    override fun getGpsLocation(): Maybe<Location> =
        source.getGpsLocation()
            .subscribeOn(Schedulers.io())

}