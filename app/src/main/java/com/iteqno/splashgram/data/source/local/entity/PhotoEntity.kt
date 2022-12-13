package com.iteqno.splashgram.data.source.local.entity

import androidx.annotation.NonNull
import androidx.room.*
import retrofit2.Converter

@Entity(tableName = "photo")
@TypeConverters(Converter::class)
data class PhotoEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: String,

    @ColumnInfo(name = "color")
    val color: String,

    @ColumnInfo(name = "created_at")
    val createdAt: String,

    @ColumnInfo(name = "description")
    val description: String? = "",

    @ColumnInfo(name = "liked_by_user")
    val likedByUser: Boolean = false,

    @Embedded(prefix = "urls_")
    val urls: UrlsEntity,

    @ColumnInfo(name = "downloads")
    val downloads: Int = 0,

    @ColumnInfo(name = "width")
    val width: Int = 0,

    @Embedded(prefix = "location_")
    var location: LocationEntity?,

    @Embedded(prefix = "user_")
    val user: UserEntity,

    @ColumnInfo(name = "views")
    val views: Int = 0,

    @ColumnInfo(name = "height")
    val height: Int = 0,

    @ColumnInfo(name = "likes")
    val likes: Int = 0,

    @ColumnInfo(name = "isLoved")
    var isLoved: Boolean = false
)