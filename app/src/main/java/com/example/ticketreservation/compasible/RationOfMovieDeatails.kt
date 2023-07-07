package com.example.ticketreservation.compasible

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RationOfMovieDetails(
    rate: String,
    rateBase: String,
    title: String
){
    Column() {
        Row(
            modifier = Modifier.padding(bottom = 4.dp)
        ) {
            Text(
                text = rate,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = rateBase,
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Gray
            )
        }
        Text(
            text = title,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            color = Color.Gray,
        )
    }
}