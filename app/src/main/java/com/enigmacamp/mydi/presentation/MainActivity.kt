package com.enigmacamp.mydi.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enigmacamp.mydi.BaseApplication
import com.enigmacamp.mydi.R
import com.enigmacamp.mydi.data.*
import com.enigmacamp.mydi.di.DaggerVehicleComponent
import com.enigmacamp.mydi.di.EngineModule
import com.enigmacamp.mydi.di.annotation.CarType
import com.enigmacamp.mydi.di.annotation.GasolineType
import com.enigmacamp.mydi.di.annotation.MotorbikeType
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
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
        DaggerVehicleComponent
            .builder()
            .engineModule(EngineModule(100))
            .build()
            .inject(this)
        car.run()
        car.parking()

        motorbike.run()
        motorbike.parking()

    }


}