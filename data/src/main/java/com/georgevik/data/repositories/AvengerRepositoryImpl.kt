package com.georgevik.data.repositories

import com.georgevik.data.DataSourceAvengers
import com.georgevik.data.mappers.AvengerMapper
import com.georgevik.domain.Avenger
import com.georgevik.domain.repositories.AvengerRepository
import io.reactivex.Single
import javax.inject.Inject

class AvengerRepositoryImpl @Inject constructor(
    private val dataSourceAvengers: DataSourceAvengers,
    private val mapper: AvengerMapper
) : AvengerRepository {

    override fun requestAvengers(): Single<List<Avenger>> = dataSourceAvengers
        .retrieveAvengers()
        .map { it.mapNotNull(mapper::apply) }
}