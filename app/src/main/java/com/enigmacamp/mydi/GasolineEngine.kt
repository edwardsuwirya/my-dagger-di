package com.enigmacamp.mydi

class GasolineEngine : Engine {
    override val engineName = "Gasoline Engine"

    override fun startEngine() = "$engineName Started"

    override fun stopEngine() = "$engineName Stop"
}