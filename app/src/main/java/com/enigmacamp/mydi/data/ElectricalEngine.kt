package com.enigmacamp.mydi.data

class ElectricalEngine : Engine {
    override val engineName = "Electrical Engine"

    override fun startEngine() = "$engineName Started"

    override fun stopEngine() = "$engineName Stop"
}