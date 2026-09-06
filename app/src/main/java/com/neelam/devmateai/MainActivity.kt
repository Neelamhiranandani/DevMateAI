package com.neelam.devmateai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.neelam.devmateai.ui.screens.home.HomeRoute
import com.neelam.devmateai.ui.theme.DevMateAITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DevMateAITheme {

                    HomeRoute()

            }
        }
    }
}

