package com.enigmacamp.mydi.data.vehicle.engine

class GasolineEngine() : Engine {
    val capacity = 100
    override val engineName = "Gasoline Engine"

    override fun startEngine() = "$engineName Started (cap:$capacity)"

    override fun stopEngine() = "$engineName Stop (cap:$capacity)"
}