package dev.vinciusmacedo.aluvery

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vinciusmacedo.aluvery.ui.theme.Purple200
import dev.vinciusmacedo.aluvery.ui.theme.Purple500
import dev.vinciusmacedo.aluvery.ui.theme.Purple700
import dev.vinciusmacedo.aluvery.ui.theme.Teal200


@Preview(
    name = "challenge1",
    showBackground = true
)
@Composable
fun ChallengeCompose() {

    Row(
        modifier = Modifier
            .width(300.dp)
            .height(100.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.25f)
                .fillMaxHeight()
                .background(color = Color.Blue)
        )
        Column {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.LightGray)
                    .padding(10.dp),
                text = "Test 1"
            )
            Text(
                modifier = Modifier
                    .padding(all = 10.dp),
                text = "Test 2"
            )
        }
    }
}


@Preview(
    name = "challenge2",
    showBackground = true
)
@Composable
fun ChallengeCompose2() {
    Surface(
        shape = RoundedCornerShape(15.dp),
        elevation = 4.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
        ) {
            val imageSize = 100.dp
            Box(
                modifier = Modifier
                    .background(brush = Brush.verticalGradient(listOf(Purple700, Purple200)))
                    .width(imageSize)
                    .fillMaxHeight()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier
                        .offset(x = imageSize / 2)
                        .align(Alignment.Center)
                        .size(imageSize)
                        .clip(shape = CircleShape)
                        .border(
                            BorderStroke(
                                2.dp,
                                brush = Brush.verticalGradient(listOf(Purple200, Purple700))
                            ), CircleShape
                        )
                )
            }

            Spacer(
                modifier = Modifier
                    .width(imageSize / 2)
                    .fillMaxHeight()
            )
            Box(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxHeight()
                    .padding(16.dp)
                    .align(Alignment.CenterVertically)
            ) {
                Column {
                    Text(
                        text = LoremIpsum(50).values.first(),
                        maxLines = 6,
                        overflow = TextOverflow.Ellipsis,
                        lineHeight = 20.sp
                    )
                }

            }
        }
    }
}
@Composable
fun ScrollingProductItem(productDescription: String = "") {

    Surface(
        shape = RoundedCornerShape(15.dp),
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier
                .height(250.dp)
                .width(200.dp)
                .verticalScroll(rememberScrollState())
        ) {
            val imageSize = 100.dp
            Box(
                modifier = Modifier
                    .background(
                        brush = Brush.horizontalGradient(colors = listOf(Purple500, Teal200))
                    )
                    .fillMaxWidth()
                    .height(100.dp)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier
                        .offset(y = imageSize / 2)
                        .size(imageSize)
                        .align(Alignment.BottomCenter)
                        .clip(shape = CircleShape)

                )
            }

            Spacer(modifier = Modifier.height(imageSize / 2))

            Column(modifier = Modifier.padding(all = 16.dp)) {
                Text(
                    modifier = Modifier.padding(bottom = 8.dp),
                    text = LoremIpsum(20).values.first(),
                    fontWeight = FontWeight(700),
                    fontSize = 18.sp,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 2
                )
                Text(
                    text = "R$ 14,99",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )

            }
            if (productDescription.isNotBlank()) {
                Text(
                    text = productDescription,
                    modifier = Modifier
                        .background(color = Purple500)
                        .padding(16.dp)
                        .fillMaxWidth()
                )
            }
        }
    }
}
