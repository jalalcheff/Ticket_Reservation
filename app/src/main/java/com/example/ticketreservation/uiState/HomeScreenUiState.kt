package com.example.ticketreservation.uiState

import com.example.ticketreservation.viewModel.MovieEntity

data class HomeScreenUiState (
    val movie: List<MovieEntity> = emptyList()
        )