package com.example.ticketreservation.compasible

import android.widget.GridLayout.Alignment
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.teckiti.R

@Composable
fun ChipWithIcon(
    container: Color,
    content: Color,
    contentText: String,
    strokeColor:Color = Color.White,
    icon: Int
){
    Row(
    ) {
        Card(
            colors = CardDefaults.cardColors(
                containerColor = container.copy(alpha = 0.8f),
                contentColor = content,
            ),
            border = BorderStroke(
                1.dp,
                color = strokeColor.copy(alpha = 0.2f)
            )
        ) {
            Box(
            ) {

            Row() {
                Image(
                    painter = painterResource(id =icon),
                    contentDescription = "chip with icon",
                    colorFilter = ColorFilter.tint(Color.White)
                )
            Text(
                text = contentText,
                modifier = Modifier.padding(
                    vertical = 4.dp,
                )
            )

            }
            }

        }

    }
}
@Composable
@Preview
fun PreviewChipWithIcon(){
    ChipWithIcon(
        container = Color.White,
        content = Color.Black,
        contentText = "2h 23m",
        strokeColor = Color.DarkGray,
        icon = R.drawable.clock

    )
}