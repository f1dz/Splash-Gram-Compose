package com.iteqno.splashgram.data.source.local.entity

import com.google.gson.annotations.SerializedName

data class UserEntity(

    @field:SerializedName("last_name")
    val lastName: String?,

    @field:SerializedName("bio")
    val bio: String?,

    @field:SerializedName("profile_image")
    val profileImage: ProfileImageEntity,

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("first_name")
    val firstName: String,

    @field:SerializedName("username")
    val username: String
)