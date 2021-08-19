package com.enigmacamp.mydi.data.vehicle.engine

class DieselEngine(val capacity: Int) : Engine {
    override val engineName = "Diesel Engine"

    override fun startEngine() = "$engineName Started (cap:$capacity)"

    override fun stopEngine() = "$engineName Stop (cap:$capacity)"
}