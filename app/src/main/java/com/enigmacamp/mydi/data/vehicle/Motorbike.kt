package com.enigmacamp.mydi.data.vehicle

import android.util.Log
import com.enigmacamp.mydi.data.vehicle.engine.Engine
import com.enigmacamp.mydi.di.annotation.GasolineType
import com.enigmacamp.mydi.di.annotation.MotorbikeType
import javax.inject.Inject

class Motorbike @Inject constructor(
    @GasolineType private val engine: Engine,
    @MotorbikeType val plate:String
) : Vehicle {
    override val vehicleName = "Motorbike"
    override fun run() {
        Log.d("CarDI", "run:$vehicleName ($plate) motorbike ${engine.startEngine()}")
    }

    override fun parking() {
        Log.d("CarDI", "run:$vehicleName ($plate) motorbike ${engine.stopEngine()}")
    }
}