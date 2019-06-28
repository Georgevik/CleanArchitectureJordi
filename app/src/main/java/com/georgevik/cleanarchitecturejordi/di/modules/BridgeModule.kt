package com.georgevik.cleanarchitecturejordi.di.modules

import com.georgevik.cleanarchitecturejordi.bridge.ListAvengersBridgeImpl
import com.georgevik.list_avengers.ListAvengersBridge
import dagger.Binds
import dagger.Module

@Module
interface BridgeModule {

    @Binds
    fun bindListAvengersBridge(bridge: ListAvengersBridgeImpl): ListAvengersBridge

}