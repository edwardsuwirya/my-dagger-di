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
    private lateinit var salesComponent: SalesComponent
    private lateinit var vehicleComponent: VehicleComponent
    private lateinit var dataComponent: DataComponent
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        dataComponent = DaggerDataComponent.create()
        salesComponent = DaggerSalesComponent.create()
        vehicleComponent = DaggerVehicleComponent.builder().dataComponent(dataComponent).build()
        return DaggerAppComponent.builder()
            .salesComponent(salesComponent)
            .vehicleComponent(vehicleComponent)
            .build()
    }


}