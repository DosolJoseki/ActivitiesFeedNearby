package com.home.joseki.activitiesfeednearby.model

import com.google.gson.annotations.SerializedName

data class Children(
    @SerializedName("data")
    var data: ChildData? = null,
    @SerializedName("kind")
    var kind: String = ""
)