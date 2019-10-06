package com.home.joseki.activitiesfeednearby.repositories

import com.home.joseki.activitiesfeednearby.model.RedditFeed
import io.reactivex.Single

interface IRssRepository {
    fun getFeed(): Single<RedditFeed>
}