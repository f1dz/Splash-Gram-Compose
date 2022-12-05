package com.iteqno.splashgram.data.model

data class Photo(
    val id: String,
    val color: String,
    val createdAt: String,
    val description: String?,
    val likedByUser: Boolean = false,
    val urls: Urls,
    val downloads: Int,
    val width: Int,
    val location: Location?,
    val user: User,
    val views: Int,
    val height: Int,
    val likes: Int,
    var isLoved: Boolean
)