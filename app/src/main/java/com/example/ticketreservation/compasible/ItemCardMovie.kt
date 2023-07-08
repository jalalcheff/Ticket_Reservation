package com.example.ticketreservation.compasible

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
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
fun ItemCardMovie(image: Int, imageSize: Float) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
            Card(
                modifier = Modifier
                    .height(364.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp))
                    .graphicsLayer {
                        scaleX = imageSize
                        scaleY = imageSize
                    },
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
                    painter = painterResource(id = R.drawable.clock),
                    colorFilter = ColorFilter.tint(Color.Gray),
                    contentDescription = "movie time",
                    modifier = Modifier
                        .padding(horizontal = 8.dp)

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
        VerticalSpacer(space = 16)
        Row() {
            TypeOfMoviesSelector(
                container = Color.Unspecified,
                content = black,
                contentText = "Fantasy",
                strokeColor = Color.Gray
            )
            TypeOfMoviesSelector(
                container = Color.Unspecified,
                content = black,
                contentText = "Adventure",
                strokeColor = Color.Gray
            )
        }

    }
}
@Preview(widthDp = 360 , heightDp = 620)
@Composable
fun PreviewItemCard(){
    ItemCardMovie(R.drawable.img,0f)
}