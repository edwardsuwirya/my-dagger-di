package com.enigmacamp.mydi.di

import com.enigmacamp.mydi.data.Motorbike
import com.enigmacamp.mydi.presentation.MainActivity
import dagger.Component

@Component(modules = [EngineModule::class])
interface VehicleComponent {
    fun getMotorBike(): Motorbike
    fun inject(activity: MainActivity)
}