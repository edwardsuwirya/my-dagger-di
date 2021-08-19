package com.enigmacamp.mydi

import com.enigmacamp.mydi.di.DaggerVehicleComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class BaseApplication : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerVehicleComponent.builder()
            .engineCapacity(45)
            .carPlate("B1111TKI")
            .motorPlate("BK1234UW")
            .build()
    }


}