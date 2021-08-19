package com.enigmacamp.mydi.data

class DieselEngine(private val capacity: Int) : Engine {
    override val engineName = "Diesel Engine"

    override fun startEngine() = "$engineName Started (cap:$capacity)"

    override fun stopEngine() = "$engineName Stop (cap:$capacity)"
}