package com.georgevik.data

import io.reactivex.Single
import javax.inject.Inject

class DataSourceAvengers @Inject constructor() {

    private val dummyData = listOf(
        AvengerDto("IronMan", null, 45),
        AvengerDto("Black Widow", "badUrl", 33),
        AvengerDto(
            "Spiderman",
            "https://www.mezcotoyz.com/mas_assets/cache/image/e/d/e/3806.Jpg",
            22
        ),
        AvengerDto(
            "Black Panther",
            "https://www.sideshow.com/storage/product-images/903380/black-panther_marvel_gallery_5c4cfd0a1ea88.jpg",
            33
        )
    )

    fun retrieveAvengers(): Single<List<AvengerDto>> = Single.create {
        it.onSuccess(dummyData)
    }
}