package com.home.joseki.activitiesfeednearby.web.api

import com.home.joseki.activitiesfeednearby.model.RedditFeed
import io.reactivex.Single
import retrofit2.http.GET

interface IRedditApi {
    @GET("subreddit.json")
    fun getFeed(): Single<RedditFeed>
}