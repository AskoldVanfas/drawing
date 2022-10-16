package com.example.drawing.feature.screen.ui

import com.example.drawing.base.Event
import com.example.drawing.feature.screen.tools.Tool
import com.example.drawing.feature.screen.tools.ToolItem

data class ViewState(
    val tools: List<ToolItem>,
)

sealed class UiEvent : Event{
    data class SelectedItem (val item: ToolItem) : UiEvent()
}

