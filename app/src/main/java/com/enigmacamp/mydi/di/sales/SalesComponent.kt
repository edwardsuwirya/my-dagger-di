package com.enigmacamp.mydi.di.sales

import com.enigmacamp.mydi.data.sales.Sales
import com.enigmacamp.mydi.di.annotation.SalesScope
import dagger.Component

@SalesScope
@Component(modules = [SalesModule::class])
interface SalesComponent {
    val sales: Sales
}