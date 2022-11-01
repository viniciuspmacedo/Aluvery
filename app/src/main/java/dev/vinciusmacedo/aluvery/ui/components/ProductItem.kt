package dev.vinciusmacedo.aluvery.ui.components

import dev.vinciusmacedo.aluvery.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vinciusmacedo.aluvery.extensions.toBrazilianCurrency
import dev.vinciusmacedo.aluvery.model.Product
import dev.vinciusmacedo.aluvery.ui.theme.Purple500
import dev.vinciusmacedo.aluvery.ui.theme.Teal200
import java.math.BigDecimal

@Composable
fun ProductItem(product: Product) {

    Surface(
        shape = RoundedCornerShape(15.dp),
        elevation = 4.dp
    ) {
        Column(
            modifier = Modifier
                .height(250.dp)
                .width(200.dp)
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
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = product.image),
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
                    text = product.name,
                    fontWeight = FontWeight(700),
                    fontSize = 18.sp,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 2
                )
                Text(
                    text = product.price.toBrazilianCurrency(),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }

        }
    }
}

@Preview(
    name = "ProductItem",
    showBackground = true
)
@Composable
fun ProductItemPreview() {
    ProductItem(
        Product(
            name = LoremIpsum(50).values.first(),
            price = BigDecimal("14.99"),
            image = R.drawable.placeholder
        )
    )
}
