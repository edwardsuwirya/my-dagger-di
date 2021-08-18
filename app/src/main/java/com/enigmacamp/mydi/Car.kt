package com.enigmacamp.mydi

import android.util.Log

class Car(private val engine: Engine) {
    fun run() {
        Log.d("CarDI", "run: ${engine.startEngine()}")
    }

    fun parking() {
        Log.d("CarDI", "run: ${engine.stopEngine()}")
    }
}