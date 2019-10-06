package com.home.joseki.activitiesfeednearby.fragments

import android.location.Location
import com.home.joseki.activitiesfeednearby.interactors.IMainFragmentInteractor
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import timber.log.Timber

class MainFragmentPresenter(
    private val view: MainFragment,
    private val interactor: IMainFragmentInteractor
) {
    private var compositeDisposable = CompositeDisposable()

    init {
        if (!view.isInitialazed)
            compositeDisposable.add(
                interactor.getGpsLocation()
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                        {
                            getFeed(it)
                        },
                        {
                            Timber.e(it)
                        }
                    )
            )
    }

    private fun getFeed(location: Location){
        compositeDisposable.add(
            interactor.getFeed()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {
                        view.setMapPins(it, location)
                    },
                    {
                        Timber.e(it)
                    }
                )
        )
    }
}