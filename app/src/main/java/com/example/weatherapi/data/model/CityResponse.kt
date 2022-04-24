package com.example.weatherapi.data.model

data class CityResponse(
    var title: String,
    var location_type: String,
    var woeid: Int,
    var latt_long: String,
)