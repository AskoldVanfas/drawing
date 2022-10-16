package com.example.drawing.feature.screen.di

import com.example.drawing.feature.screen.ui.ScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val drawModule = module{
    viewModel{
        ScreenViewModel()
    }
}