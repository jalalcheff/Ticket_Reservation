package com.example.ticketreservation.compasible

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ticketreservation.ui.theme.black
import com.example.ticketreservation.ui.theme.movieBackgroundCard
import com.example.ticketreservation.ui.theme.white
import com.teckiti.R

@Composable
fun ItemCardMovie(image: Int) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 8.dp),
    ) {
        Card(
            modifier = Modifier
                .height(364.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp)),
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "movie image",
                contentScale = ContentScale.FillBounds,
                )
        }
        VerticalSpacer(space = 16)
        Row {
            Image(
                painter = painterResource(id = R.drawable.baseline_watch_later_24),
                contentDescription = "movie time",
                modifier = Modifier.padding(horizontal = 8.dp),
            )
            Text(
                text = "2h 23m",
                color = black
                )
        }
        Text(
            text = "Fantastic Beast: The secret of Dumbledore",
            fontSize = 24.sp,
            color = black,
            textAlign = TextAlign.Center
        )
    }
}
@Preview(widthDp = 360 , heightDp = 620)
@Composable
fun PreviewItemCard(){
    ItemCardMovie(R.drawable.img)
}