package com.enigmacamp.mydi.data.vehicle.engine

class GasolineEngine(val capacity: Int) : Engine {
    override val engineName = "Gasoline Engine"

    override fun startEngine() = "$engineName Started (cap:$capacity)"

    override fun stopEngine() = "$engineName Stop (cap:$capacity)"
}