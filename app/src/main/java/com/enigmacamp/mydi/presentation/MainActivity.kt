package com.enigmacamp.mydi.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enigmacamp.mydi.BaseApplication
import com.enigmacamp.mydi.data.Car
import com.enigmacamp.mydi.R
import com.enigmacamp.mydi.data.Motorbike
import com.enigmacamp.mydi.di.DaggerVehicleComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    //    private lateinit var motorbike: Motorbike
    @Inject
    lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        motorbike = DaggerVehicleComponent.create().getMotorBike()
//        motorbike.run()
//        motorbike.parking()

        DaggerVehicleComponent.create().inject(this)
        car.run()
        car.parking()

    }


}