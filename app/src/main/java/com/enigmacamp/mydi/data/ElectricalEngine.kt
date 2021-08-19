package com.enigmacamp.mydi.data

class ElectricalEngine(private val capacity: Int) : Engine {
    override val engineName = "Electrical Engine"

    override fun startEngine() = "$engineName Started (cap:$capacity)"

    override fun stopEngine() = "$engineName Stop (cap:$capacity)"
}