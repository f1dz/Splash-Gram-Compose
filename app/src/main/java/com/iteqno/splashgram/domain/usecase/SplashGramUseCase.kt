package com.iteqno.splashgram.domain.usecase

import com.iteqno.splashgram.data.source.Resource
import com.iteqno.splashgram.domain.model.Photo
import kotlinx.coroutines.flow.Flow

interface SplashGramUseCase {
    fun getAllPhoto(query: String = ""): Flow<Resource<List<Photo>>>
    fun getLovedPhotos(): Flow<List<Photo>>
    fun setLovedPhoto(photo: Photo, state: Boolean)
}