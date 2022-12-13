package com.iteqno.splashgram.data.source.local.entity

import com.google.gson.annotations.SerializedName

data class UrlsEntity(

    @field:SerializedName("small")
    val small: String,

    @field:SerializedName("thumb")
    val thumb: String,

    @field:SerializedName("raw")
    val raw: String,

    @field:SerializedName("regular")
    val regular: String,

    @field:SerializedName("full")
    val full: String
)