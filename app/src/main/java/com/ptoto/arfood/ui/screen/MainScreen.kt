package com.ptoto.arfood.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ptoto.arfood.ui.components.Menu

@Composable
fun MainScreen()
{
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            val currentModel = remember {
                mutableStateOf("burger")
            }
            ARScreen(currentModel.value)
            Menu(modifier = Modifier.align(Alignment.BottomCenter)) {
                currentModel.value = it
            }

        }
    }
}