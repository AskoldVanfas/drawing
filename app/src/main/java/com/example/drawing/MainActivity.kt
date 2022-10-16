package com.example.drawing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.drawing.feature.screen.ui.ScreenFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.container , ScreenFragment()).commit()

    }
}
