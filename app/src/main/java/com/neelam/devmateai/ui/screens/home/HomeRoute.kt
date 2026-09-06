package com.neelam.devmateai.ui.screens.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeRoute() {


    val viewModel : HomeViewModel = viewModel()

    val uiState by viewModel.uiState.collectAsState()

    HomeContent(uiState.isThinking , onEvent = {
        viewModel.onEvent(HomeEvent.AskAi)
    })


}

@Preview(showBackground = true)
@Composable
fun HomeRoutePreview() {
    HomeRoute()
}

