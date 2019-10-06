package com.home.joseki.activitiesfeednearby.model

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("modhash")
    val modhash: String = "",
    @SerializedName("dist")
    val dist: Int = 0,
    @SerializedName("children")
    val children: List<Children>? = null,
    @SerializedName("after")
    val after: String = "",
    @SerializedName("before")
    val before: String = ""
)