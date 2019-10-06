package com.home.joseki.activitiesfeednearby

import android.content.Context
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.home.joseki.activitiesfeednearby.di.*
import com.home.joseki.activitiesfeednearby.di.api.ApiModule
import timber.log.Timber
import toothpick.Scope
import toothpick.Toothpick
import toothpick.configuration.Configuration

class App: MultiDexApplication() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Toothpick.setConfiguration(Configuration.forDevelopment())
            Timber.plant(Timber.DebugTree())
        }
        val appScope: Scope = Toothpick.openScope(Scopes.APP)
        appScope.installModules(AppModule(this), ApiModule(), NavigationModule(), ProviderModule(), RepositoryModule(), SourceModule())
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}