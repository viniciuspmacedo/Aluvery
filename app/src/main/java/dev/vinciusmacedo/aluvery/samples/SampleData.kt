package dev.vinciusmacedo.aluvery.samples

import dev.vinciusmacedo.aluvery.R
import dev.vinciusmacedo.aluvery.model.Product
import java.math.BigDecimal

val sampleProducts = listOf<Product>(

    Product(
        name = "Hamburguer",
        price = BigDecimal("14.99"),
        image = R.drawable.burger
    ),
    Product(
        name = "Fritas",
        price = BigDecimal("10.00"),
        image = R.drawable.fries
    ),

    Product(
        name = "Pizza",
        price = BigDecimal("35.89"),
        image = R.drawable.pizza
    )
)