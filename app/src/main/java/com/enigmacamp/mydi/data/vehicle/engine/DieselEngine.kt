package com.enigmacamp.mydi.data.vehicle.engine

class DieselEngine() : Engine {
    val capacity = 100
    override val engineName = "Diesel Engine"

    override fun startEngine() = "$engineName Started (cap:$capacity)"

    override fun stopEngine() = "$engineName Stop (cap:$capacity)"
}