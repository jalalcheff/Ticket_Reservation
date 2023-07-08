package com.example.ticketreservation

sealed class Screen(val route: String) {
    object HomeScreen : Screen("first screen")
    object MovieDetails : Screen("second screen")
}