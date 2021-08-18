package com.enigmacamp.mydi

interface Engine {
    val engineName: String
    fun startEngine(): String
    fun stopEngine(): String
}