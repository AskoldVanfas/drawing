package com.example.drawing.feature.screen.ui

import androidx.constraintlayout.motion.utils.ViewState
import com.example.drawing.base.BaseViewModel
import androidx.lifecycle.viewModelScope
import com.example.drawing.base.Event

class ScreenViewModel():BaseViewModel<ViewState>(){
    override fun initialViewState(): ViewState {
        TODO("Not yet implemented")
    }

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        TODO("Not yet implemented")
    }
}