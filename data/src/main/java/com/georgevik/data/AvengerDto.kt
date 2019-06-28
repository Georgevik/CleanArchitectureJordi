package com.georgevik.data

import com.google.gson.annotations.SerializedName

data class AvengerDto constructor(
    @SerializedName("name") val name: String?,
    @SerializedName("picture") val picture: String?,
    @SerializedName("age") val age: Int?
)