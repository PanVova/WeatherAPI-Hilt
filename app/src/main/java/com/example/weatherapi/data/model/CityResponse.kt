package com.example.weatherapi.data.model

import com.google.gson.annotations.SerializedName

data class CityResponse(
    @SerializedName("title")
    var name: String,

    @SerializedName("location_type")
    var location_type: String,

    @SerializedName("woeid")
    var woeid: Int,

    @SerializedName("latt_long")
    var latt_long: String,
)