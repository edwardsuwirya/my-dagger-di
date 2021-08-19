package com.enigmacamp.mydi.di.vehicle

import com.enigmacamp.mydi.data.vehicle.engine.DieselEngine
import com.enigmacamp.mydi.data.vehicle.engine.ElectricalEngine
import com.enigmacamp.mydi.data.vehicle.engine.Engine
import com.enigmacamp.mydi.data.vehicle.engine.GasolineEngine
import com.enigmacamp.mydi.di.annotation.DieselType
import com.enigmacamp.mydi.di.annotation.ElectricalType
import com.enigmacamp.mydi.di.annotation.GasolineType
import com.enigmacamp.mydi.di.annotation.VehicleScope
import dagger.Module
import dagger.Provides

@Module
class EngineModule {
    @Provides
    @GasolineType
    @VehicleScope
    fun provideGasolineEngine(capacity: Int): Engine = GasolineEngine(capacity)

    @Provides
    @ElectricalType
    @VehicleScope
    fun provideElectricalEngine(capacity: Int): Engine = ElectricalEngine(capacity)

    @Provides
    @DieselType
    @VehicleScope
    fun provideDieselEngine(capacity: Int): Engine = DieselEngine(capacity)
}