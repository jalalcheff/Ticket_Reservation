package com.example.ticketreservation.viewModel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.ticketreservation.uiState.HomeScreenUiState
import com.example.ticketreservation.uiState.MovieDetailsUiState
import com.example.ticketreservation.uiState.toUiState
import com.example.ticketreservation.utils.MoviesFakeData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

class MovieDetailsViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle
): ViewModel(){
    private val _state = MutableStateFlow<MovieDetailsUiState>(MovieDetailsUiState())
    val state = _state.asStateFlow()
    val args: String = checkNotNull(savedStateHandle["name"])
    init {
        fetchDataByName()
    }

    private fun fetchDataByName() {
        MoviesFakeData.movies.forEach{movie->
            if (movie.name == args)
                _state.update {
                    it.copy(
                        url = movie.url,
                        name = movie.name,
                        time = movie.time,
                        description = movie.description
                    )
                }
        }
    }
    fun onClickCard(id: Int){

    }
}