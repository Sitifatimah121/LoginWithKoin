package com.exercise.mysimplelogin.di

import android.content.Context
import com.exercise.mysimplelogin.HomeActivity
import com.exercise.mysimplelogin.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [StorageModule::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: HomeActivity)
}