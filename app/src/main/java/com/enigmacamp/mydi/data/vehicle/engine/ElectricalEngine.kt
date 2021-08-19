package com.enigmacamp.mydi.data.vehicle.engine

class ElectricalEngine() : Engine {
    val capacity = 100
    override val engineName = "Electrical Engine"

    override fun startEngine() = "$engineName Started (cap:$capacity)"

    override fun stopEngine() = "$engineName Stop (cap:$capacity)"
}