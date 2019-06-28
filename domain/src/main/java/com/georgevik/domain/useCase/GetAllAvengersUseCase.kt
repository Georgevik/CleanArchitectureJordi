package com.georgevik.domain.useCase

import com.georgevik.base.UseCaseBase
import com.georgevik.domain.Avenger
import com.georgevik.domain.repositories.AvengerRepository
import io.reactivex.Single
import javax.inject.Inject

class GetAllAvengersUseCase @Inject constructor(
    private val repository: AvengerRepository
) : UseCaseBase<Unit, Single<List<Avenger>>>() {

    override fun run(param: Unit): Single<List<Avenger>> = repository.requestAvengers()
}