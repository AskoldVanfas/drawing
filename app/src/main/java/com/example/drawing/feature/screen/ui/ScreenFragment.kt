package com.example.drawing.feature.screen.ui

import androidx.fragment.app.Fragment
import com.example.drawing.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class ScreenFragment: Fragment(R.layout.screen_fragment) {
    private val viewModel by viewModel<ScreenViewModel>()
}