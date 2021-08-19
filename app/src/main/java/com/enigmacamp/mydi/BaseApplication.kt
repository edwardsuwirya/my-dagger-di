package com.enigmacamp.mydi

import android.app.Activity
import android.app.Application
import com.enigmacamp.mydi.data.Car
import com.enigmacamp.mydi.di.DaggerVehicleComponent
import com.enigmacamp.mydi.di.VehicleComponent

class BaseApplication : Application() {
    lateinit var vehicleComponent: VehicleComponent

    override fun onCreate() {
        super.onCreate()
        vehicleComponent = DaggerVehicleComponent.builder()
            .engineCapacity(45)
            .carPlate("B1111TKI")
            .motorPlate("BK1234UW")
            .build()
    }
}

val Activity.vehicleComponent: VehicleComponent
    get() {
        return (application as BaseApplication).vehicleComponent
    }