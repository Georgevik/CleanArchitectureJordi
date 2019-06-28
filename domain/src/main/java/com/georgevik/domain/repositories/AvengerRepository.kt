package com.georgevik.domain.repositories

import com.georgevik.domain.Avenger
import io.reactivex.Single

interface AvengerRepository {
    fun requestAvengers(): Single<List<Avenger>>
}