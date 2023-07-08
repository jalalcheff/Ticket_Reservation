package com.example.ticketreservation.utils

import com.example.ticketreservation.viewModel.MovieEntity
import com.teckiti.R


object MoviesFakeData {
    val movies = listOf(
       MovieEntity(
           name = "mavka",
           url = R.drawable.img,
           description = "Mavka - a soul of the Forest - faces an impossible choice between love and her duty as guardian to the Heart of the Forest, when she falls in love with a human - the talented young musician Lukash. Our story is about the magical power of love. That kind of love that enables human nature to find the magic within and reveals abilities and qualities that empower a person to reach beyond possible and to hold against evil and human vice. Written by FILM.UA\n",
           time = "1h 39m"
           ),
        MovieEntity(
            name = "Little Mermaid",
            url = R.drawable.img_1,
            description = "A young reporter and his niece discover a beautiful and enchanting creature they believe to be the real little mermaid.\n",
            time = "1h 25m"
        ),
        MovieEntity(
            name = "John Wick",
            url = R.drawable.img_2,
            description = "John Wick uncovers a path to defeating The High Table. But before he can earn his freedom, Wick must face off against a new enemy with powerful alliances across the globe and forces that turn old friends into foes.",
            time = "2h 49m"
        ),
    )
}
