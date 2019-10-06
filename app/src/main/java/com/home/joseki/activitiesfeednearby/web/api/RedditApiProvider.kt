package com.home.joseki.activitiesfeednearby.web.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject
import javax.inject.Provider

class RedditApiProvider @Inject constructor(
    private val okHttpClient: OkHttpClient
): Provider<IRedditApi> {

    companion object {
        private const val BASE_URL: String = "http://reddit.com/r/"
    }

    override fun get(): IRedditApi = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build().create(IRedditApi::class.java)
}