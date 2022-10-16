package com.example.drawing.feature.screen.ui

import android.graphics.Color
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import com.example.drawing.R
import com.example.drawing.feature.screen.tools.Item
import com.example.drawing.feature.screen.tools.Tool
import com.example.drawing.feature.screen.tools.ToolItem
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegate

fun toolAdapterDelegate(itemClickedListener : (ToolItem) -> Unit) = adapterDelegate<ToolItem,Item>(R.layout.image_item) {

    // This is the initializer block where you initialize the ViewHolder.
    // Its called one time only in onCreateViewHolder.
    // this is where you can call findViewById() and setup click listeners etc.

    val toolImage : ImageView = findViewById(R.id.toolIcon)
    toolImage.setOnClickListener{ itemClickedListener(item) } // Item is automatically set for you. It's set lazily though (set in onBindViewHolder()). So only use it for deferred calls like clickListeners.


    bind { diffPayloads -> // diffPayloads is a List<Any> containing the Payload from your DiffUtils
        // This is called anytime onBindViewHolder() is called
        toolImage.setImageResource(item.tool.icon)

        if (item.isSelected){
            findViewById<ConstraintLayout>(R.id.layout).setBackgroundColor(Color.argb(255, 255, 0, 0))
        }
        else {
            findViewById<ConstraintLayout>(R.id.layout).setBackgroundColor(Color.argb(255, 255, 255, 255))
        }
    }
}