package com.home.joseki.activitiesfeednearby.repositories

import com.home.joseki.activitiesfeednearby.model.RedditFeed
import com.home.joseki.activitiesfeednearby.web.api.IRedditApi
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class RssRepository @Inject constructor(
    private val api: IRedditApi
): IRssRepository {
    override fun getFeed(): Single<RedditFeed> =
        api.getFeed()
            .subscribeOn(Schedulers.io())
}