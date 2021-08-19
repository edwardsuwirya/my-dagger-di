package com.enigmacamp.mydi.di.vehicle

import com.enigmacamp.mydi.BaseApplication
import com.enigmacamp.mydi.di.presentation.ActivitiesModule
import com.enigmacamp.mydi.di.annotation.CarType
import com.enigmacamp.mydi.di.annotation.MotorbikeType
import com.enigmacamp.mydi.di.annotation.VehicleScope
import com.enigmacamp.mydi.di.sales.SalesComponent
import com.enigmacamp.mydi.di.sales.SalesModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@VehicleScope
@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivitiesModule::class,
        VehicleModule::class,
        EngineModule::class,
        WheelsModule::class
    ], dependencies = [SalesComponent::class]
)
interface VehicleComponent : AndroidInjector<BaseApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun engineCapacity(capacity: Int): Builder

        @BindsInstance
        fun carPlate(@CarType plateNumber: String): Builder

        @BindsInstance
        fun motorPlate(@MotorbikeType plateNumber: String): Builder

        fun salesComponent(salesComponent: SalesComponent): Builder

        fun build(): VehicleComponent
    }
}