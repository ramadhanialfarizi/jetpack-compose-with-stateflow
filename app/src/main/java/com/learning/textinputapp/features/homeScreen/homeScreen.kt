package com.learning.textinputapp.features.homeScreen

import android.text.Layout.Alignment
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.learning.textinputapp.features.homeScreen.controller.HomeScreenController
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier



class HomeScreen : ComponentActivity() {
    @Composable
    fun homeCounterComponent(viewModel: HomeScreenController = viewModel()) {
        val count by viewModel.count.collectAsState()

        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Count: $count")
            Button(onClick = { viewModel.increment() }) {
                Text("Increment")
            }
            Button(onClick = { viewModel.decrement() }) {
                Text("Decrement")
            }
        }
    }

    @Composable
    fun homeScreen() {
        Box  {
            homeCounterComponent()
        }
    }
}