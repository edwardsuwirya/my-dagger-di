package com.enigmacamp.mydi.di.data

import com.enigmacamp.mydi.di.annotation.CarType
import com.enigmacamp.mydi.di.annotation.MotorbikeType
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class])
interface DataComponent {
    @CarType
    fun carPlate(): String

    @MotorbikeType
    fun motorPlate(): String

    fun capcity(): Int
}