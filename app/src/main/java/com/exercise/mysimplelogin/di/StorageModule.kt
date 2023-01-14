package com.exercise.mysimplelogin.di

import android.content.Context
import com.exercise.mysimplelogin.SessionManager
import dagger.Module
import dagger.Provides

@Module
class StorageModule {
    @Provides
    fun provideSessionManager(context: Context): SessionManager = SessionManager(context)
}