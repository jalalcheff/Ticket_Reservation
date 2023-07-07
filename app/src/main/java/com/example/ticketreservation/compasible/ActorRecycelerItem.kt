package com.example.ticketreservation.compasible

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ItemActorRecycler(
    imageResource: Int
){
    Image(
        painter = painterResource(id = imageResource),
        contentDescription = "actorImage", contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .size(60.dp)
            .clip(CircleShape)
        )
    Spacer(modifier = Modifier.width(4.dp))
}