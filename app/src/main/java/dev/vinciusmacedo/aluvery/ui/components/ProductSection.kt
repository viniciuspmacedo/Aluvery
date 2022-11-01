package dev.vinciusmacedo.aluvery.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vinciusmacedo.aluvery.model.Product
import dev.vinciusmacedo.aluvery.samples.sampleProducts

@Composable
fun ProductSection(title: String, products: List<Product>) {
    Column {
        Text(
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
            modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)
        )
        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(modifier = Modifier)
            for (p in products){
                ProductItem(product = p)
            }
            Spacer(modifier = Modifier)
        }
    }
}

@Preview(
    name = "ProductSection",
    showBackground = true
)
@Composable
fun ProductSectionPreview() {
    ProductSection("Promoções", sampleProducts)
}
