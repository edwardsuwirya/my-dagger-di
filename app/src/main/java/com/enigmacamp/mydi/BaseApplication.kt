package com.enigmacamp.mydi

import com.enigmacamp.mydi.di.sales.DaggerSalesComponent
import com.enigmacamp.mydi.di.sales.SalesComponent
import com.enigmacamp.mydi.di.vehicle.DaggerVehicleComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class BaseApplication : DaggerApplication() {
    private lateinit var salesComponent: SalesComponent
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        salesComponent = DaggerSalesComponent.create()
        return DaggerVehicleComponent.builder()
            .engineCapacity(45)
            .carPlate("B1111TKI")
            .motorPlate("BK1234UW").salesComponent(salesComponent)
            .build()
    }


}