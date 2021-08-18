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
    fun provideGasolineEngine(): Engine = GasolineEngine()

    @Provides
    @ElectricalType
    fun provideElectricalEngine(): Engine = ElectricalEngine()

    @Provides
    @DieselType
    fun provideDieselEngine(): Engine = DieselEngine()
}