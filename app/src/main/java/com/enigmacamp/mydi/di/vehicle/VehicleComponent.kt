package com.enigmacamp.mydi.di.vehicle

import com.enigmacamp.mydi.data.vehicle.Vehicle
import com.enigmacamp.mydi.di.annotation.CarType
import com.enigmacamp.mydi.di.annotation.MotorbikeType
import com.enigmacamp.mydi.di.annotation.VehicleScope
import com.enigmacamp.mydi.di.data.DataComponent
import dagger.BindsInstance
import dagger.Component

@VehicleScope
@Component(
    modules = [
        VehicleModule::class,
        EngineModule::class,
        WheelsModule::class
    ], dependencies = [DataComponent::class]
)
interface VehicleComponent {
    @CarType
    fun car(): Vehicle

    @MotorbikeType
    fun motorBike(): Vehicle
}