package com.enigmacamp.mydi.di.data

import com.enigmacamp.mydi.di.annotation.CarType
import com.enigmacamp.mydi.di.annotation.MotorbikeType
import dagger.Module
import dagger.Provides

@Module
class DataModule {
    @Provides
    @CarType
    fun provideCarPlate(): String = "B1234ABC"

    @Provides
    @MotorbikeType
    fun provideMotorPlate(): String = "DK1112OP"

    @Provides
    fun provideCapacity(): Int = 13
}