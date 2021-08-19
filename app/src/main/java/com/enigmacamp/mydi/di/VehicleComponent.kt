package com.enigmacamp.mydi.di

import com.enigmacamp.mydi.di.annotation.CarType
import com.enigmacamp.mydi.di.annotation.MotorbikeType
import com.enigmacamp.mydi.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [VehicleModule::class,
        EngineModule::class,
        WheelsModule::class]
)
interface VehicleComponent {
    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun engineCapacity(capacity: Int): Builder

        @BindsInstance
        fun carPlate(@CarType plateNumber: String): Builder

        @BindsInstance
        fun motorPlate(@MotorbikeType plateNumber: String): Builder

        fun build(): VehicleComponent
    }
}