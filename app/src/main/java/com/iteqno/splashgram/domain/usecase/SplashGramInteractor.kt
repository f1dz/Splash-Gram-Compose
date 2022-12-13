package com.iteqno.splashgram.domain.usecase

import com.iteqno.splashgram.domain.model.Photo
import com.iteqno.splashgram.domain.repository.ISplashGramRepository

class SplashGramInteractor(private val splashGramRepository: ISplashGramRepository) : SplashGramUseCase {
    override fun getAllPhoto(query: String) = splashGramRepository.getAllPhoto(query)

    override fun getLovedPhotos() = splashGramRepository.getLovedPhotos()

    override fun setLovedPhoto(photo: Photo, state: Boolean) = splashGramRepository.setLovedPhoto(photo, state)

}