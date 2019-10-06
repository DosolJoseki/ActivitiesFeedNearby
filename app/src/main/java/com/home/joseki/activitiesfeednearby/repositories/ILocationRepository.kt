package com.home.joseki.activitiesfeednearby.repositories

import android.location.Location
import io.reactivex.Maybe

interface ILocationRepository {
    fun getGpsLocation(): Maybe<Location>
}