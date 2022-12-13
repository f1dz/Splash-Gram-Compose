package com.iteqno.splashgram.ui.common

import com.iteqno.splashgram.domain.model.Photo

sealed class UiState<out T: Any?> {

    object Loading : UiState<Nothing>()

    data class Success<out T: Any>(val data: List<Photo>?) : UiState<T>()

    data class Error(val errorMessage: String) : UiState<Nothing>()
}