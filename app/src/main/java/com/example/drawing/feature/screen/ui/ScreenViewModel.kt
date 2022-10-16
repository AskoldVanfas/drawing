package com.example.drawing.feature.screen.ui

import com.example.drawing.base.BaseViewModel
import androidx.lifecycle.viewModelScope
import com.example.drawing.base.Event
import com.example.drawing.feature.screen.tools.Tool
import com.example.drawing.feature.screen.tools.ToolItem

class ScreenViewModel() : BaseViewModel<ViewState>() {
    override fun initialViewState(): ViewState {
        return ViewState(
            tools = listOf(ToolItem(Tool.LINE, false), ToolItem(Tool.DOTTED, false)),
        )
    }

    override suspend fun reduce(event: Event, previousState: ViewState): ViewState? {
        return when (event) {
            is UiEvent.SelectedItem -> {
                previousState.copy(tools = previousState.tools.map {
                    if (it == event.item) {
                    it.copy(isSelected = !event.item.isSelected)
                    }else it
                })
            }
            else -> {
                null
            }
        }
    }
}