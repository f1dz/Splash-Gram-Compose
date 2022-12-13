package com.iteqno.splashgram.domain.model

data class User(
    val lastName: String?,
    val bio: String?,
    val profileImage: ProfileImage,
    val name: String,
    val firstName: String,
    val username: String
)