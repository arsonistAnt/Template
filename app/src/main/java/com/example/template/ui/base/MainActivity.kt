package com.example.template.ui.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.template.R
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.plant(Timber.DebugTree())
        setContentView(R.layout.activity_main)
    }
}
