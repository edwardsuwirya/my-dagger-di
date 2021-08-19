package com.enigmacamp.mydi.data.vehicle

import android.util.Log
import com.enigmacamp.library.Wheels
import com.enigmacamp.mydi.data.vehicle.engine.Engine
import com.enigmacamp.mydi.di.annotation.CarType
import com.enigmacamp.mydi.di.annotation.ElectricalType
import javax.inject.Inject

class Car @Inject constructor(
    @ElectricalType private val engine: Engine,
    private val wheels: Wheels,
    @CarType val plate: String
) : Vehicle {
    override val vehicleName = "Car"
    override fun run() {
        Log.d(
            "CarDI", "run: $vehicleName ($plate) ${engine.startEngine()} " +
                    "${wheels.assembleWheel()}"
        )
    }

    override fun parking() {
        Log.d(
            "CarDI",
            "run: $vehicleName ($plate) ${engine.stopEngine()} ${wheels.assembleWheel()}"
        )
    }
}