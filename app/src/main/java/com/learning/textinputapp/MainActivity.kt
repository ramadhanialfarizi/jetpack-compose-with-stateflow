package com.learning.textinputapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.learning.textinputapp.features.homeScreen.HomeScreen
import com.learning.textinputapp.features.splashscreen.SplashScreen
import com.learning.textinputapp.ui.theme.TextInputAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextInputAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    SplashScreen().Greeting(name = "Android")
                    HomeScreen().homeScreen()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TextInputAppTheme {
//        SplashScreen().Greeting(name = "Android")
        HomeScreen().homeScreen()
    }
}