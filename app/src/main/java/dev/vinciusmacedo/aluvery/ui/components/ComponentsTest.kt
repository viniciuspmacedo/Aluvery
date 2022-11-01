package dev.vinciusmacedo.aluvery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun CustomPreview() {
    Column(
        modifier = Modifier
            .padding(all = 8.dp)
            .background(color = Color.Blue)
            .padding(all = 8.dp)
            .fillMaxSize()
    ) {
        Text(text = "Texto 7")
        Text(text = "Texto 8")
        Row(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 8.dp)
                .background(color = Color.Green)
                .fillMaxWidth(0.8f)
        ) {
            Text(text = "Texto 9")
            Text(text = "Texto 10")
        }
        Box(
            modifier = Modifier
                .width(220.dp)
                .padding(all = 10.dp)
                .background(color = Color.Red)
                .padding(top = 5.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(8.dp)
                    .background(color = Color.Cyan)
                    .padding(9.dp)
                    .background(color = Color.White)
                    .fillMaxSize()
            ) {
                Text(text = "Texto 11")
                Text(text = "Texto 12")
            }
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .background(color = Color.White)
                    .padding(9.dp)
                    .background(color = Color.Yellow)
            ) {
                Text(text = "Texto13")
                Text(text = "Texto14")
            }

        }
    }
}
