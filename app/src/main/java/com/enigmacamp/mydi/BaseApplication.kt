package com.enigmacamp.mydi

import com.enigmacamp.mydi.di.app.DaggerAppComponent
import com.enigmacamp.mydi.di.data.DaggerDataComponent
import com.enigmacamp.mydi.di.data.DataComponent
import com.enigmacamp.mydi.di.sales.DaggerSalesComponent
import com.enigmacamp.mydi.di.sales.SalesComponent
import com.enigmacamp.mydi.di.vehicle.DaggerVehicleComponent
import com.enigmacamp.mydi.di.vehicle.VehicleComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class BaseApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
            .salesComponent(provideSalesComponent())
            .vehicleComponent(provideVehicleComponent())
            .build()
    }

    private fun provideDataComponent() = DaggerDataComponent.create()

    private fun provideSalesComponent() = DaggerSalesComponent.create()

    private fun provideVehicleComponent() =
        DaggerVehicleComponent.builder().dataComponent(provideDataComponent()).build()


}