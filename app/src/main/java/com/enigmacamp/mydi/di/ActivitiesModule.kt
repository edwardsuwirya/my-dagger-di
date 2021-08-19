package com.enigmacamp.mydi.di

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