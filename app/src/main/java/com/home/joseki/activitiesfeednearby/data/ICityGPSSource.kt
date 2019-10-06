package com.home.joseki.activitiesfeednearby.data

import android.Manifest
import android.location.Location
import androidx.annotation.RequiresPermission
import io.reactivex.Maybe

interface ICityGPSSource {
    @RequiresPermission(allOf = [Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION])
    fun getLastLocation(): Location?

    fun getGpsLocation(): Maybe<Location>
}