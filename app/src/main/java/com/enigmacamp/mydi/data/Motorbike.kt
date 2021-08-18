package com.enigmacamp.mydi.data

import android.util.Log
import com.enigmacamp.mydi.di.annotation.GasolineType
import javax.inject.Inject

class Motorbike @Inject constructor(@GasolineType private val engine: Engine) : Vehicle {
    override val vehicleName = "Motorbike"

    override fun run() {
        Log.d("CarDI", "run: motorbike ${engine.startEngine()}")
    }

    override fun parking() {
        Log.d("CarDI", "run: motorbike ${engine.stopEngine()}")
    }
}