package com.enigmacamp.mydi.data.vehicle.engine

class ElectricalEngine(val capacity: Int) : Engine {
    override val engineName = "Electrical Engine"

    override fun startEngine() = "$engineName Started (cap:$capacity)"

    override fun stopEngine() = "$engineName Stop (cap:$capacity)"
}