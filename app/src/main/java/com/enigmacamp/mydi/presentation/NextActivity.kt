package com.enigmacamp.mydi.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.enigmacamp.mydi.R
import com.enigmacamp.mydi.data.Vehicle
import com.enigmacamp.mydi.di.annotation.CarType
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class NextActivity : DaggerAppCompatActivity() {
    @Inject
    @CarType
    lateinit var car: Vehicle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        Log.d("MyDI", "onCreate-Next: $car")
    }
}