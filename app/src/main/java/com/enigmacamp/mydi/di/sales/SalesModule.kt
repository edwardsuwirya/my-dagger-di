package com.enigmacamp.mydi.di.sales

import com.enigmacamp.mydi.data.sales.Sales
import com.enigmacamp.mydi.data.sales.VehicleSales
import com.enigmacamp.mydi.di.annotation.SalesScope
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class SalesModule {
    @Binds
    @SalesScope
    abstract fun bindsSales(vehicleSales: VehicleSales): Sales
}