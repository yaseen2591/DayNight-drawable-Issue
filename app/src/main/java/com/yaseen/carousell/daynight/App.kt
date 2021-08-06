package com.yaseen.carousell.daynight

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        //To reproduce this issue Keep you System theme to DARK MODE and check the icon color it's picked from wrong resources
        // FORCE App to Run on Light MODE
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}