package com.ptoto.arfood

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ptoto.arfood.ui.screen.MainScreen
import com.ptoto.arfood.ui.theme.ARFoodTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ARFoodTheme {
                MainScreen()
            }
        }
    }
}

