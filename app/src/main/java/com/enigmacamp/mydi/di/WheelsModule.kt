package com.enigmacamp.mydi.di

import com.enigmacamp.library.RubberWheelImpl
import com.enigmacamp.library.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Provides
    fun provideWheels(): Wheels {
        val rubberWheelImpl = RubberWheelImpl()
        rubberWheelImpl.wheelCount = 4
        return rubberWheelImpl
    }
}
