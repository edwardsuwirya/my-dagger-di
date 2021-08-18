package com.enigmacamp.mydi.data

class GasolineEngine : Engine {
    override val engineName = "Gasoline Engine"

    override fun startEngine() = "$engineName Started"

    override fun stopEngine() = "$engineName Stop"
}