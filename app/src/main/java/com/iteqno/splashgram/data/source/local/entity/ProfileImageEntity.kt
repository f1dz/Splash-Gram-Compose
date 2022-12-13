package com.iteqno.splashgram.data.source.local.entity

import com.google.gson.annotations.SerializedName

data class ProfileImageEntity(

    @field:SerializedName("small")
    val small: String = "",

    @field:SerializedName("large")
    val large: String = "",

    @field:SerializedName("medium")
    val medium: String = ""
)