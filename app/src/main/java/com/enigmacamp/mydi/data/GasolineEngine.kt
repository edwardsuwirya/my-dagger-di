package com.enigmacamp.mydi.data

import javax.inject.Inject

class GasolineEngine @Inject constructor() : Engine {
    override val engineName = "Gasoline Engine"

    override fun startEngine() = "$engineName Started"

    override fun stopEngine() = "$engineName Stop"
}