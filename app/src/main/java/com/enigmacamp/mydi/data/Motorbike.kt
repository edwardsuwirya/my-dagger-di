package com.enigmacamp.mydi.data

import android.util.Log
import javax.inject.Inject

class Motorbike @Inject constructor(private val engine: GasolineEngine) {
    fun run() {
        Log.d("CarDI", "run: motorbike ${engine.startEngine()}")
    }

    fun parking() {
        Log.d("CarDI", "run: motorbike ${engine.stopEngine()}")
    }
}