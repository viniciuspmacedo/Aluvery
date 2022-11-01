package dev.vinciusmacedo.aluvery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.vinciusmacedo.aluvery.samples.sampleProducts
import dev.vinciusmacedo.aluvery.ui.components.ProductSection

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Spacer(modifier = Modifier)
        ProductSection("Promoções", sampleProducts)
        ProductSection("Doces", sampleProducts)
        ProductSection("Bebidas", sampleProducts)
        Spacer(modifier = Modifier)
    }

}


@Preview(
    name = "AppPreview",
    showSystemUi = true
)
@Composable
fun AppPreview() {
    HomeScreen()
}
