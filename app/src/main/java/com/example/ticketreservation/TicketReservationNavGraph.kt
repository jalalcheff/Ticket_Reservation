package com.example.ticketreservation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.ticketreservation.screen.HomeScreen
import com.example.ticketreservation.screen.MovieDetails

@Composable
fun TicketReservationNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route){
        composable(Screen.HomeScreen.route){
         //   HomeScreen(navController = navController)
        }
        composable(
            Screen.MovieDetails.route,
            arguments = listOf(
                navArgument("movieName"){ NavType.StringType }
            )
        ){
         //   MovieDetails(navController)
        }
    }
}