package com.georgevik.cleanarchitecturejordi.di

import com.georgevik.cleanarchitecturejordi.AvengerApplication
import com.georgevik.cleanarchitecturejordi.di.modules.ApplicationModule
import com.georgevik.cleanarchitecturejordi.di.modules.BridgeModule
import com.georgevik.cleanarchitecturejordi.di.modules.RepositoryModule
import com.georgevik.list_avengers.ListAvengersComponent
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [ApplicationModule::class, RepositoryModule::class, BridgeModule::class])
interface ApplicationComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: AvengerApplication): Builder

        fun buildAppComponent(): ApplicationComponent
    }

    fun plus(): ListAvengersComponent
}