package com.enigmacamp.mydi.di.vehicle

import com.enigmacamp.library.RubberWheelImpl
import com.enigmacamp.library.Wheels
import com.enigmacamp.mydi.di.annotation.VehicleScope
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Provides
    @VehicleScope
    fun provideWheels(): Wheels {
        val rubberWheelImpl = RubberWheelImpl()
        rubberWheelImpl.wheelCount = 4
        return rubberWheelImpl
    }
}
