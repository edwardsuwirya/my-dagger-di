package com.enigmacamp.mydi.di

import com.enigmacamp.mydi.data.Motorbike
import dagger.Component

@Component
interface VehicleComponent {
    fun getMotorBike(): Motorbike
}