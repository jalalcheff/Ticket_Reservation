package com.example.ticketreservation.uiState

import com.example.ticketreservation.viewModel.MovieEntity

data class MovieDetailsUiState (
    val name: String = "",
    val url: Int = 0,
    val description: String = "",
    val time: String = "",
    )
fun MovieEntity.toUiState(): MovieDetailsUiState{
    return MovieDetailsUiState(
        name = this.name,
        url = this.url,
        description = this.description,
        time = this.time
    )
}