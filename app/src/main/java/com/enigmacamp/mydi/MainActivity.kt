package com.enigmacamp.mydi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val electricalEngine = ElectricalEngine()
        val myCar = Car(electricalEngine)
        myCar.run()
        myCar.parking()
    }
}