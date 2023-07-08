package com.example.ticketreservation.screen

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.ticketreservation.Screen

fun NavGraphBuilder.HomeRoute(navController: NavController){
    composable(
            route = Screen.HomeScreen.route,
            arguments = listOf(
                navArgument("movieName"){ NavType.StringType }
            )
    ){
        //MovieDetails(navController)
    }
}