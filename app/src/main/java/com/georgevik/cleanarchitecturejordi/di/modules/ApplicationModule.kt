package com.georgevik.cleanarchitecturejordi.di.modules

import android.content.Context
import android.content.res.Resources
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {

    @Provides
    fun provideResources(context: Context): Resources {
        return context.resources
    }
}