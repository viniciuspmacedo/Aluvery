package dev.vinciusmacedo.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Surface
import dev.vinciusmacedo.aluvery.ui.screens.HomeScreen
import dev.vinciusmacedo.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                Surface {
                    HomeScreen()
                }
            }
        }
    }
}





