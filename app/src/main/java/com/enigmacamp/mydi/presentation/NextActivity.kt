package com.enigmacamp.mydi.presentation

import android.os.Bundle
import android.util.Log
import com.enigmacamp.mydi.R
import com.enigmacamp.mydi.data.sales.Sales
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class NextActivity : DaggerAppCompatActivity() {
//    @Inject
//    @CarType
//    lateinit var car: Vehicle

    @Inject
    lateinit var vehicleSales: Sales

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
//        Log.d("MyDI", "onCreate-Next: $car")
        Log.d("MyDI", "onCreate-Next: $vehicleSales")
    }
}