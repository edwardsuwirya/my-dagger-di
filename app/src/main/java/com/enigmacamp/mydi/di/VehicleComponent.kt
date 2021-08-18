package com.enigmacamp.mydi.di

import com.enigmacamp.mydi.presentation.MainActivity
import dagger.Component

@Component(modules = [VehicleModule::class, EngineModule::class])
interface VehicleComponent {
    fun inject(activity: MainActivity)
}