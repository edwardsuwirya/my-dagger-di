package com.enigmacamp.mydi

class ElectricalEngine : Engine {
    override val engineName = "Electrical Engine"

    override fun startEngine() = "$engineName Started"

    override fun stopEngine() = "$engineName Stop"
}