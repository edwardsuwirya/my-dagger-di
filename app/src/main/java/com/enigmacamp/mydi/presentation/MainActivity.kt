package com.enigmacamp.mydi.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enigmacamp.mydi.BaseApplication
import com.enigmacamp.mydi.data.Car
import com.enigmacamp.mydi.data.ElectricalEngine
import com.enigmacamp.mydi.R

class MainActivity : AppCompatActivity() {
    private lateinit var car: Car
    private lateinit var newCar: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        If you’re the boss of a company,
        would you prefer doing all the things yourself or delegate the tasks?
         */
        car = (application as BaseApplication).car
        car.run()
        car.parking()

        newCar = (application as BaseApplication).newTechCar
        newCar.run()
        newCar.parking()

    }


}