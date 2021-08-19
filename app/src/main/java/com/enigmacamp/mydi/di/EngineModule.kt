package com.enigmacamp.mydi.di

import com.enigmacamp.mydi.data.DieselEngine
import com.enigmacamp.mydi.data.ElectricalEngine
import com.enigmacamp.mydi.data.Engine
import com.enigmacamp.mydi.data.GasolineEngine
import com.enigmacamp.mydi.di.annotation.DieselType
import com.enigmacamp.mydi.di.annotation.ElectricalType
import com.enigmacamp.mydi.di.annotation.GasolineType
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class EngineModule {
    @Provides
    @GasolineType
    fun provideGasolineEngine(capacity: Int): Engine = GasolineEngine(capacity)

    @Provides
    @ElectricalType
    fun provideElectricalEngine(capacity: Int): Engine = ElectricalEngine(capacity)

    @Provides
    @DieselType
    fun provideDieselEngine(capacity: Int): Engine = DieselEngine(capacity)
}