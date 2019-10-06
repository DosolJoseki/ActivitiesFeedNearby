package com.home.joseki.activitiesfeednearby.interactors

import android.location.Location
import com.home.joseki.activitiesfeednearby.model.RedditFeed
import io.reactivex.Maybe
import io.reactivex.Single

interface IMainFragmentInteractor {
    fun getFeed(): Single<RedditFeed>
    fun getGpsLocation(): Maybe<Location>
}