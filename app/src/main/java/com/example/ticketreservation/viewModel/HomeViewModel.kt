package com.example.ticketreservation.viewModel

import androidx.lifecycle.ViewModel
import com.example.ticketreservation.uiState.HomeScreenUiState
import com.example.ticketreservation.utils.MoviesFakeData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class HomeViewModel: ViewModel() {
    private val _state = MutableStateFlow<HomeScreenUiState>(HomeScreenUiState())
    val state = _state.asStateFlow()
    init {
        fetchImages()
    }

    private fun fetchImages() {
        _state.update { it.copy(movie = MoviesFakeData.movies) }
    }
    fun onClickCard(id: Int){

    }

}