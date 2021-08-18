package com.enigmacamp.mydi.di

import com.enigmacamp.mydi.data.Engine
import com.enigmacamp.mydi.data.GasolineEngine
import dagger.Module
import dagger.Provides

@Module
class EngineModule {
    @Provides
    fun provideGasolineEngine(): Engine = GasolineEngine()
}