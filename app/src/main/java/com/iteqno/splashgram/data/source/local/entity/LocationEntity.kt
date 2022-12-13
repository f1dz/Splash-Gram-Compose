package com.iteqno.splashgram.data.source.local.entity

import com.google.gson.annotations.SerializedName

data class LocationEntity(

    @field:SerializedName("country")
    val country: String?,

    @field:SerializedName("city")
    val city: String?,

    @field:SerializedName("name")
    val name: String?,

    @field:SerializedName("title")
    val title: String?
)