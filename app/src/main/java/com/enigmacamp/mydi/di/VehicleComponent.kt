package com.enigmacamp.mydi.di

import com.enigmacamp.mydi.di.annotation.CarType
import com.enigmacamp.mydi.di.annotation.MotorbikeType
import com.enigmacamp.mydi.presentation.MainActivity
import com.enigmacamp.mydi.presentation.NextActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [VehicleModule::class,
        EngineModule::class,
        WheelsModule::class]
)
interface VehicleComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: NextActivity)

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