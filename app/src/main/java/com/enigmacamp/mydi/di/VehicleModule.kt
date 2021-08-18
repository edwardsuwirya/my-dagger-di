package com.enigmacamp.mydi.di

import com.enigmacamp.mydi.data.Car
import com.enigmacamp.mydi.data.Motorbike
import com.enigmacamp.mydi.data.Vehicle
import com.enigmacamp.mydi.di.annotation.CarType
import com.enigmacamp.mydi.di.annotation.MotorbikeType
import dagger.Binds
import dagger.Module

@Module
abstract class VehicleModule {
    @Binds
    @CarType
    abstract fun bindsCar(car: Car): Vehicle

    @Binds
    @MotorbikeType
    abstract fun bindsMotorbike(motorbike: Motorbike): Vehicle
}