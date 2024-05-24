package com.learning.textinputapp.features.homeScreen.controller

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeScreenController : ViewModel() {
    private val _count = MutableStateFlow(0)
    val count: StateFlow<Int> = _count

    fun increment() {
        _count.value++
    }

    fun decrement() {
        _count.value--
    }
}