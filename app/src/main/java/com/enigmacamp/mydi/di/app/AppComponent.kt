package com.enigmacamp.mydi.di.app

import com.enigmacamp.mydi.BaseApplication
import com.enigmacamp.mydi.di.annotation.AppScope
import com.enigmacamp.mydi.di.data.DataComponent
import com.enigmacamp.mydi.di.presentation.ActivitiesModule
import com.enigmacamp.mydi.di.sales.SalesComponent
import com.enigmacamp.mydi.di.vehicle.VehicleComponent
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@AppScope
@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivitiesModule::class
    ], dependencies = [SalesComponent::class, VehicleComponent::class]
)
interface AppComponent : AndroidInjector<BaseApplication> {
}