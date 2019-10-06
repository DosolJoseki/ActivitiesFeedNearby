package com.home.joseki.activitiesfeednearby.fragments

import android.location.Location
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.home.joseki.activitiesfeednearby.R
import com.home.joseki.activitiesfeednearby.adapters.ScrollViewAdapter
import com.home.joseki.activitiesfeednearby.di.Scopes
import com.home.joseki.activitiesfeednearby.interactors.IMainFragmentInteractor
import com.home.joseki.activitiesfeednearby.model.Children
import com.home.joseki.activitiesfeednearby.model.RedditFeed
import kotlinx.android.synthetic.main.main_fragment.*
import toothpick.Toothpick
import kotlin.random.Random
import java.text.SimpleDateFormat
import java.util.*

class MainFragment : Fragment(), OnMapReadyCallback {
    private lateinit var presenter: MainFragmentPresenter
    private lateinit var googleMap: GoogleMap
    var isInitialazed: Boolean = false
    private var scrollViewAdapter = ScrollViewAdapter()

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()

        private const val ZOOM = 10f
        private const val DURATION_MS = 1000
        private const val DISTANCE_MIN = -0.09
        private const val DISTANCE_MAX = 0.09
        private const val DT_PATTERN = "HH:mm:ss"
    }

    override fun onMapReady(map: GoogleMap) {
        googleMap = map
        googleMap.mapType = GoogleMap.MAP_TYPE_NORMAL
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.main_fragment, container, false)

        val mMapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mMapFragment.getMapAsync(this)

        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val scope = Toothpick.openScope(Scopes.APP)
        Toothpick.inject(this, scope)
        presenter = MainFragmentPresenter(
            this,
            scope.getInstance(IMainFragmentInteractor::class.java)
        )
        BottomSheetBehavior.from(bottomSheet).state = BottomSheetBehavior.STATE_HIDDEN
    }

    private fun getRndNearbyLocation(location: Location): LatLng {
        return LatLng(
            location.latitude.plus(DISTANCE_MIN + Random.nextFloat() * (DISTANCE_MAX - DISTANCE_MIN)),
            location.longitude.plus(DISTANCE_MIN + Random.nextFloat() * (DISTANCE_MAX - DISTANCE_MIN))
        )
    }

    fun setMapPins(redditFeed: RedditFeed, location: Location) {
        googleMap.clear()

        val googlePlex = CameraPosition.builder()
            .target(LatLng(location.latitude, location.longitude))
            .zoom(ZOOM)
            .build()

        googleMap.animateCamera(
            CameraUpdateFactory.newCameraPosition(googlePlex),
            DURATION_MS,
            null
        )

        fabToLocation.setOnClickListener {
            googleMap.animateCamera(
                CameraUpdateFactory.newCameraPosition(googlePlex),
                DURATION_MS,
                null
            )
        }

        val map = mutableMapOf<Marker, Children>()

        for (e in redditFeed.data!!.children!!.iterator()) {
            map[googleMap.addMarker(
                MarkerOptions()
                    .position(getRndNearbyLocation(location))
            )] = e
        }

        googleMap.setOnMarkerClickListener {
            setSheet(map[it]!!)
        }

        isInitialazed = true
    }

    private fun setSheet(children: Children): Boolean {
        children.data.let {
            tvFeedName.text = it!!.title
            tvFeedName.contentDescription = it.title
            val formatter = SimpleDateFormat(DT_PATTERN, Locale.GERMAN)
            val calendar = Calendar.getInstance()
            calendar.timeInMillis = it.createdUtc.substring(0, it.createdUtc.indexOf('.')).toLong()
            formatter.format(calendar.time)

            tvFeedTime.text = formatter.format(calendar.time).toString()

            scrollViewAdapter.clearItems()
            for (x in 0..2) {
                scrollViewAdapter.addItem(x.toString())
            }
            scrollLayout.adapter = scrollViewAdapter
            BottomSheetBehavior.from(bottomSheet).state = BottomSheetBehavior.STATE_EXPANDED
            scrollViewAdapter.notifyScroll()
        }

        return false
    }
}