package com.enigmacamp.mydi

import android.app.Application
import com.enigmacamp.mydi.di.DaggerVehicleComponent
import com.enigmacamp.mydi.di.VehicleComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class BaseApplication : Application(), HasAndroidInjector {
    @Inject
    lateinit var dispatchAndroidInjector: DispatchingAndroidInjector<Any>
    override fun onCreate() {
        super.onCreate()
        DaggerVehicleComponent.builder()
            .engineCapacity(45)
            .carPlate("B1111TKI")
            .motorPlate("BK1234UW")
            .build().inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchAndroidInjector
}