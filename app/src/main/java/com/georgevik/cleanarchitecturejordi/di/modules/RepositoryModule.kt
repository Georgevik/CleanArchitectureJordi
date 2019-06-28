package com.georgevik.cleanarchitecturejordi.di.modules

import com.georgevik.data.repositories.AvengerRepositoryImpl
import com.georgevik.domain.repositories.AvengerRepository
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {

    @Binds
    fun bindAvengerRepository(repository: AvengerRepositoryImpl): AvengerRepository

}