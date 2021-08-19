package com.enigmacamp.mydi.data.vehicle.engine

interface Engine {
    val engineName: String
    fun startEngine(): String
    fun stopEngine(): String
}