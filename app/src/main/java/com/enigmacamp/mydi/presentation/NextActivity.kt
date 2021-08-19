package com.enigmacamp.mydi.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.enigmacamp.mydi.R
import com.enigmacamp.mydi.data.Vehicle
import com.enigmacamp.mydi.di.DaggerVehicleComponent
import com.enigmacamp.mydi.di.annotation.CarType
import com.enigmacamp.mydi.vehicleComponent
import javax.inject.Inject

class NextActivity : AppCompatActivity() {
    @Inject
    @CarType
    lateinit var car: Vehicle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        vehicleComponent.inject(this)
        Log.d("MyDI", "onCreate-Next: $car")
    }
}