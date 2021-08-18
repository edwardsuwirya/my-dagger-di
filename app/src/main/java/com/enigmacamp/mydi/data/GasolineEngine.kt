package com.enigmacamp.mydi.data

import com.enigmacamp.mydi.data.Engine

class GasolineEngine : Engine {
    override val engineName = "Gasoline Engine"

    override fun startEngine() = "$engineName Started"

    override fun stopEngine() = "$engineName Stop"
}