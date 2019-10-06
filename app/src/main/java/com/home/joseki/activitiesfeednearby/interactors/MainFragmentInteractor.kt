package com.home.joseki.activitiesfeednearby.interactors

import android.location.Location
import com.home.joseki.activitiesfeednearby.model.RedditFeed
import com.home.joseki.activitiesfeednearby.repositories.ILocationRepository
import com.home.joseki.activitiesfeednearby.repositories.IRssRepository
import io.reactivex.Maybe
import io.reactivex.Single
import javax.inject.Inject

class MainFragmentInteractor @Inject constructor(
    private val rssRepository: IRssRepository,
    private val locationRepository: ILocationRepository
): IMainFragmentInteractor {
    override fun getGpsLocation(): Maybe<Location> =
        locationRepository.getGpsLocation()

    override fun getFeed(): Single<RedditFeed> =
        rssRepository.getFeed()
}