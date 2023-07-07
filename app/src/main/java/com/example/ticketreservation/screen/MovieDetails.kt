package com.example.ticketreservation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.triStateToggleable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.ticketreservation.compasible.ChipWithIcon
import com.example.ticketreservation.compasible.ItemActorRecycler
import com.example.ticketreservation.compasible.RationOfMovieDetails
import com.example.ticketreservation.compasible.TypeOfMoviesSelector
import com.example.ticketreservation.compasible.VerticalSpacer
import com.example.ticketreservation.ui.theme.orange
import com.example.ticketreservation.viewModel.HomeViewModel
import com.teckiti.R
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun MovieDetails(viewModel: HomeViewModel = hiltViewModel()){
    val state = viewModel.state.collectAsState()
Column() {
    Box(
        modifier = Modifier
            .height(400.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "movie background",
            contentScale = ContentScale.FillBounds
            )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
                .padding(horizontal = 16.dp)
        ) {
            ChipWithIcon(
                container = Color.DarkGray,
                content = Color.White,
                contentText = "",
                strokeColor = Color.DarkGray,
                icon = R.drawable.close_circle
            )
            ChipWithIcon(
                container = Color.DarkGray,
                content = Color.White,
                contentText = " 2h 23m",
                strokeColor = Color.DarkGray,
                icon = R.drawable.clock
            )
        }

    }
    Card(
        modifier = Modifier
            .weight(1f)
            .fillMaxSize(),
        colors = CardDefaults
            .cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(top = 16.dp)
        ) {
            
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            RationOfMovieDetails(
                rate = "6.8",
                rateBase = "/10",
                title = "IMDb"
            )
            RationOfMovieDetails(
                rate = "63",
                rateBase = "%",
                title = "Rotten Tomatoes"
            )
            RationOfMovieDetails(
                rate = "4",
                rateBase = "/10",
                title = "IGN"
            )
        }
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                text = "Fantastic Beast: The Secret of Dumbledore",
                fontWeight = FontWeight.SemiBold,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                TypeOfMoviesSelector(
                    container = Color.Unspecified,
                    content = Color.Black,
                    contentText = "Fantasy",
                    strokeColor = Color.Black
                )
                TypeOfMoviesSelector(
                    container = Color.Unspecified,
                    content = Color.Black,
                    contentText = "Adventure",
                    strokeColor = Color.Black
                )
            }
            VerticalSpacer(space = 16)
            LazyRow(
                modifier = Modifier.padding(start = 16.dp)
            ){
                items(state.value.imageResource){
                    ItemActorRecycler(imageResource = it)
                }
            }
            Text(
                text = stringResource(R.string.professor_albusim),
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .padding(top = 16.dp)
                )
            VerticalSpacer(space = 16)
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(orange)
            ) {
                Text(
                    text = "Booking"
                    )
            }

        }

    }
}
}

@Composable
@Preview(widthDp = 360 , heightDp = 800)
fun PreviewMovieDetails(){
    MovieDetails()
}