package com.example.drawing.feature.screen.tools

import androidx.annotation.DrawableRes
import com.example.drawing.R


enum class Tool(@DrawableRes val icon: Int) {
    LINE(R.drawable.ic_baseline_minimize_24),
    DOTTED(R.drawable.ic_baseline_linear_scale_24);
}