package com.neelam.devmateai.ui.screens.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUIState())
    val uiState : StateFlow<HomeUIState> = _uiState



//    fun onAskClick( ){
//        _uiState.value = _uiState.value.copy(
//            isThinking = !_uiState.value.isThinking
//        )
//    }

    fun onEvent(event : HomeEvent){
       when(event) {
           HomeEvent.AskAi -> {
               _uiState.value = _uiState.value.copy(
                   isThinking = !_uiState.value.isThinking
               )
           }
       }

    }
}