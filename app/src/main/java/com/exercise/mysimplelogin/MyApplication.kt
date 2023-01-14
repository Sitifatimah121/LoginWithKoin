package com.exercise.mysimplelogin

import android.app.Application
import com.exercise.mysimplelogin.di.AppComponent
import com.exercise.mysimplelogin.di.DaggerAppComponent

open class MyApplication : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(
            applicationContext
        )
    }
}