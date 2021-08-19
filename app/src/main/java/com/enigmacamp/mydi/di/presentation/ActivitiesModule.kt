package com.enigmacamp.mydi.di.presentation

import com.enigmacamp.mydi.di.sales.SalesModule
import com.enigmacamp.mydi.di.annotation.SalesScope
import com.enigmacamp.mydi.presentation.MainActivity
import com.enigmacamp.mydi.presentation.NextActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesModule {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun contributeNextActivity(): NextActivity
}