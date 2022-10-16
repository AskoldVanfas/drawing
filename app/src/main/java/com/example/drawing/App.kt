package com.example.drawing

import android.app.Application
import com.example.drawing.feature.screen.di.drawModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext

class App : Application(){
    override fun onCreate(){
        super.onCreate()

        GlobalContext.startKoin {
            // Koin Android logger
            androidLogger()
            //inject Android context
            androidContext(this@App)
            // use modules
            modules(drawModule)
        }
    }

}