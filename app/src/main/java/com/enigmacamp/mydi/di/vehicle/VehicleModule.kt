package com.enigmacamp.mydi.di.vehicle

import com.enigmacamp.mydi.data.vehicle.Car
import com.enigmacamp.mydi.data.vehicle.Motorbike
import com.enigmacamp.mydi.data.vehicle.Vehicle
import com.enigmacamp.mydi.di.annotation.CarType
import com.enigmacamp.mydi.di.annotation.MotorbikeType
import com.enigmacamp.mydi.di.annotation.VehicleScope
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class VehicleModule {
    @Binds
    @CarType
    @VehicleScope
    abstract fun bindsCar(car: Car): Vehicle

    @Binds
    @MotorbikeType
    @VehicleScope
    abstract fun bindsMotorbike(motorbike: Motorbike): Vehicle
}