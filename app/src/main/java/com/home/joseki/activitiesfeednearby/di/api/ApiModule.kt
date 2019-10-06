package com.home.joseki.activitiesfeednearby.di.api

import com.facebook.stetho.okhttp3.StethoInterceptor
import com.home.joseki.activitiesfeednearby.web.api.IRedditApi
import com.home.joseki.activitiesfeednearby.web.api.RedditApiProvider
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import toothpick.config.Module

class ApiModule: Module() {
    init {
        bind(OkHttpClient::class.java).toInstance(
            OkHttpClient.Builder()
                .addNetworkInterceptor(StethoInterceptor())
                .addInterceptor(HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY })
                .build())
        bind(IRedditApi::class.java).toProvider(RedditApiProvider::class.java).providesSingletonInScope()
    }
}