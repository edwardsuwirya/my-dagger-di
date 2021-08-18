package com.enigmacamp.mydi

import android.app.Application
import com.enigmacamp.mydi.data.Car

class BaseApplication : Application() {
    val newTechCar = Car(CarEngineContainer.electricalEngine)
    val car = Car(CarEngineContainer.gasolineEngine)
}