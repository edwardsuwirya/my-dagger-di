package com.enigmacamp.mydi.data

interface Engine {
    val engineName: String
    fun startEngine(): String
    fun stopEngine(): String
}