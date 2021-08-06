package com.yaseen.carousell.daynight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import com.yaseen.carousell.daynight.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btnTheme.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_NO)
        }
        setContentView(binding.root)

    }
}
