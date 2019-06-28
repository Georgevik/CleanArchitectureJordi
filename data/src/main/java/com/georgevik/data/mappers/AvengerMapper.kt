package com.georgevik.data.mappers

import androidx.arch.core.util.Function
import com.georgevik.base.util.toURL
import com.georgevik.data.AvengerDto
import com.georgevik.domain.Avenger
import javax.inject.Inject

class AvengerMapper @Inject constructor() : Function<AvengerDto, Avenger> {

    override fun apply(input: AvengerDto?): Avenger? {
        try {
            requireNotNull(input) { "AvengerDto cannot be null" }
            requireNotNull(input.name) { "AvengerDto.name cannot be null" }
            requireNotNull(input.age) { "AvengerDto.age cannot be null" }
        } catch (e: Exception) {
            return null
        }

        return Avenger(
            input.name,
            input.age,
            input.picture?.toURL()
        )
    }


}