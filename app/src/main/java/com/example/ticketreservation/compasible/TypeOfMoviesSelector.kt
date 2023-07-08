package com.example.ticketreservation.compasible

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.ticketreservation.ui.theme.movieBackgroundCard
import com.example.ticketreservation.ui.theme.orange
import com.example.ticketreservation.ui.theme.white

@Composable
fun TypeOfMoviesSelector(
    container: Color,
    content: Color,
    contentText: String,
    strokeColor:Color = Color.White,
    cardModifier: Modifier = Modifier.padding(end = 8.dp),
    textModifier:Modifier = Modifier.padding(
        vertical = 4.dp,
        horizontal = 16.dp
    )
    ){
    Card(
        colors = CardDefaults.cardColors(
            containerColor = container,
            contentColor = content,
        ),
        modifier = cardModifier,
        border = BorderStroke(
            1.dp,
            color = strokeColor.copy(alpha = 0.2f)
            )
    ) {
        Text(
            text = contentText,
            modifier = textModifier
        )
    }
}