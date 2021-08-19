package com.enigmacamp.mydi.di

import com.enigmacamp.mydi.data.Car
import com.enigmacamp.mydi.data.Motorbike
import com.enigmacamp.mydi.data.Vehicle
import com.enigmacamp.mydi.di.annotation.CarType
import com.enigmacamp.mydi.di.annotation.MotorbikeType
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class VehicleModule {
    @Binds
    @CarType
    @Singleton
    abstract fun bindsCar(car: Car): Vehicle

    @Binds
    @MotorbikeType
    @Singleton
    abstract fun bindsMotorbike(motorbike: Motorbike): Vehicle
}