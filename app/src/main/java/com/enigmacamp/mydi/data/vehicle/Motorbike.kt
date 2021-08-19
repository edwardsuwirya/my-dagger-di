package com.enigmacamp.mydi.data.vehicle

import android.util.Log
import com.enigmacamp.mydi.data.vehicle.engine.Engine
import com.enigmacamp.mydi.di.annotation.GasolineType
import com.enigmacamp.mydi.di.annotation.MotorbikeType
import javax.inject.Inject

class Motorbike @Inject constructor(
    @GasolineType private val engine: Engine,
) : Vehicle {
    override val vehicleName = "Motorbike"
val plate=""
    override fun run() {
        Log.d("CarDI", "run:$vehicleName ($plate) motorbike ${engine.startEngine()}")
    }

    override fun parking() {
        Log.d("CarDI", "run:$vehicleName ($plate) motorbike ${engine.stopEngine()}")
    }
}