package com.example.ticketreservation.screen

import android.annotation.SuppressLint
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.ticketreservation.compasible.ItemCardMovie
import com.example.ticketreservation.compasible.TypeOfMoviesSelector
import com.example.ticketreservation.ui.theme.orange
import com.example.ticketreservation.ui.theme.white
import com.example.ticketreservation.viewModel.HomeViewModel


@SuppressLint("SuspiciousIndentation")
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel(),
) {
    var imageIndex by remember{ mutableStateOf(0) }
    val state by viewModel.state.collectAsState()
    var imageResource by remember{ mutableStateOf(state.movie[imageIndex].url) }

    val pagerState = rememberPagerState()
    Box() {

           Image(
               painter = painterResource(id = imageResource),
               contentDescription = "backgroundImage",
               modifier = Modifier
                   .height(300.dp)
                   .blur(40.dp)
                   .fillMaxWidth(),
               contentScale = ContentScale.Crop
               )
        Column() {
            Row(
                Modifier.padding(top = 68.dp).fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                TypeOfMoviesSelector(
                    container = orange,
                    content = white,
                    contentText = "Now Showing",
                    textModifier = Modifier.padding(8.dp)
                )
                TypeOfMoviesSelector(
                    container = Color.Unspecified,
                    content = white,
                    contentText = "Coming Soon",
                    textModifier = Modifier.padding(8.dp)
                )
            }
            HorizontalPager(
                contentPadding = PaddingValues(horizontal = 60.dp, vertical = 16.dp),
                pageCount = state.movie.size,
                state = pagerState,
                pageSize = PageSize.Fill
            ) {
                imageIndex = pagerState.currentPage
                val pageOffset =
                    (pagerState.currentPage - it) + pagerState.currentPageOffsetFraction
                val imageSize by animateFloatAsState(
                    targetValue = if (pageOffset != 0.0f) 0.75f else 1f,
                )
                ItemCardMovie(
                    state.movie[it].url,
                    state.movie[it].name,
                    imageSize,
                    state.movie[it].time
                )
            }
        }
        LaunchedEffect(key1 = imageIndex ){
            imageResource = state.movie[imageIndex].url
        }
    }

    }



@Preview(widthDp = 360, heightDp = 620)
@Composable
fun PreviewHomeScreen(){
    HomeScreen()
}
