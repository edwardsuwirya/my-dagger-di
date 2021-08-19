package com.enigmacamp.mydi.presentation

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.enigmacamp.mydi.R
import com.enigmacamp.mydi.data.vehicle.Vehicle
import com.enigmacamp.mydi.di.annotation.CarType
import com.enigmacamp.mydi.di.annotation.MotorbikeType
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    @Inject
    @CarType
    lateinit var car: Vehicle

    @Inject
    @MotorbikeType
    lateinit var motorbike: Vehicle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        DaggerVehicleComponent.create().inject(this)
//        DaggerVehicleComponent
//            .builder()
//            .engineModule(EngineModule(100))
//            .build()
//            .inject(this)

//        vehicleComponent.inject(this)
//        Cara panjang
//        (application as BaseApplication).vehicleComponent.inject(this)

        car.run()
        car.parking()

        motorbike.run()
        motorbike.parking()

        Log.d("MyDI", "onCreate: $car")
        Log.d("MyDI", "onCreate: $motorbike")

        val intent = Intent(this, NextActivity::class.java)
        startActivity(intent)

    }


}