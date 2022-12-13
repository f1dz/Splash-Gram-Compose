package com.iteqno.splashgram.ui.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iteqno.splashgram.domain.model.Photo
import com.iteqno.splashgram.domain.usecase.SplashGramUseCase
import com.iteqno.splashgram.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class HomeViewModel(private val splashGramUseCase: SplashGramUseCase) : ViewModel() {

    private val _uiState: MutableStateFlow<UiState<List<Photo>>> = MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<List<Photo>>>
        get() = _uiState

    fun getAllPhotos(){
        viewModelScope.launch {
            splashGramUseCase.getAllPhoto()
                .catch {
                    _uiState.value = UiState.Error(it.message.toString())
                }
                .collect { photos ->
                    _uiState.value = UiState.Success(photos.data)
                }
        }
    }

}