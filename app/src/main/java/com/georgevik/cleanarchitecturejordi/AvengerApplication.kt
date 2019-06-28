package com.georgevik.cleanarchitecturejordi

import android.app.Application
import com.georgevik.cleanarchitecturejordi.di.ApplicationComponent
import com.georgevik.cleanarchitecturejordi.di.DaggerApplicationComponent
import com.georgevik.list_avengers.ListAvengersComponent

class AvengerApplication : Application(), ListAvengersComponent.Provider {
    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder().application(this).buildAppComponent()
    }

    override fun provide(): ListAvengersComponent {
        return applicationComponent.plus()
    }


}