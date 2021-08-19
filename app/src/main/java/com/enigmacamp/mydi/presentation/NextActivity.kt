package com.enigmacamp.mydi.presentation

import android.os.Bundle
import android.util.Log
import com.enigmacamp.mydi.R
import com.enigmacamp.mydi.data.sales.Sales
import com.enigmacamp.mydi.data.vehicle.Vehicle
import com.enigmacamp.mydi.di.annotation.CarType
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class NextActivity : DaggerAppCompatActivity() {
    @Inject
    @CarType
    lateinit var car: Vehicle

    @Inject
    lateinit var vehicleSales: Sales

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        car.run()
        car.parking()
        vehicleSales.saleSomething()
        Log.d("MyDI", "onCreate-Next: $car")
        Log.d("MyDI", "onCreate-Next: $vehicleSales")
    }
}