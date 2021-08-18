package com.enigmacamp.mydi

import com.enigmacamp.mydi.data.DieselEngine
import com.enigmacamp.mydi.data.ElectricalEngine
import com.enigmacamp.mydi.data.GasolineEngine

object CarEngineContainer {
    val electricalEngine = ElectricalEngine()
    val dieselEngine = DieselEngine()
    val gasolineEngine = GasolineEngine()
}