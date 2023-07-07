package com.example.ticketreservation.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.ticketreservation.compasible.ItemCardMovie
import com.example.ticketreservation.compasible.TypeOfMoviesSelector
import com.example.ticketreservation.compasible.VerticalSpacer
import com.example.ticketreservation.ui.theme.movieBackgroundCard
import com.example.ticketreservation.ui.theme.orange
import com.example.ticketreservation.ui.theme.white
import com.example.ticketreservation.viewModel.HomeViewModel
import com.teckiti.R


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsState()
    Column(
        modifier = Modifier
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        movieBackgroundCard,
                        white
                    ),
                    startY = 0f,
                    endY = 500f
                )
            )
    ) {
       VerticalSpacer(space = 32)
        Row(
            horizontalArrangement = Arrangement.Center,
            modifier =
            Modifier.fillMaxWidth(),
        ) {
           TypeOfMoviesSelector(
               container = orange,
               content = white,
               contentText = stringResource(R.string.now_showing)
           )
            TypeOfMoviesSelector(
                container = Color.Unspecified,
                content = white,
                contentText = stringResource(R.string.coming_soon)
            )
        }
        VerticalSpacer(space = 16)
        HorizontalPager(
            contentPadding = PaddingValues(64.dp),
            pageCount = state.imageResource.size,
            pageNestedScrollConnection = PagerDefaults.pageNestedScrollConnection(orientation = Orientation.Horizontal)
        ){
                ItemCardMovie(state.imageResource[it])

        }

    }
}

@Preview(widthDp = 360, heightDp = 620)
@Composable
fun PreviewHomeScreen(){
    HomeScreen()
}