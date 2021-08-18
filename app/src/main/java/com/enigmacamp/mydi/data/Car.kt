package com.enigmacamp.mydi.data

import android.util.Log
import com.enigmacamp.mydi.di.annotation.DieselType
import com.enigmacamp.mydi.di.annotation.ElectricalType
import javax.inject.Inject
import javax.inject.Named

class Car @Inject constructor(@ElectricalType private val engine: Engine) : Vehicle {
    override val vehicleName = "Car"

    override fun run() {
        Log.d("CarDI", "run: ${engine.startEngine()}")
    }

    override fun parking() {
        Log.d("CarDI", "run: ${engine.stopEngine()}")
    }
}