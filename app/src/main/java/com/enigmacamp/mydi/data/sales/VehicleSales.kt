package com.enigmacamp.mydi.data.sales

import android.util.Log
import javax.inject.Inject

class VehicleSales @Inject constructor() : Sales {
    override fun saleSomething() {
        Log.d("CarDI", "saleSomething: ")
    }
}