package com.home.joseki.activitiesfeednearby.di.providers

import com.home.joseki.activitiesfeednearby.repositories.IRssRepository
import com.home.joseki.activitiesfeednearby.repositories.RssRepository
import com.home.joseki.activitiesfeednearby.web.api.IRedditApi
import javax.inject.Inject
import javax.inject.Provider

class RssRepositoryProvider @Inject constructor(
    private val iRedditApi: IRedditApi
): Provider<IRssRepository> {
    override fun get(): IRssRepository = RssRepository(iRedditApi)
}