package com.home.joseki.activitiesfeednearby.model

import com.google.gson.annotations.SerializedName

data class RedditFeed(
    @SerializedName("data")
    var data: Data? = null,
    @SerializedName("kind")
    var kind: String = ""
)