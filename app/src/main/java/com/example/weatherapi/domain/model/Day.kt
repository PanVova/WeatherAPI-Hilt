package com.example.weatherapi.domain.model

data class Day(
    var weatherStateName: String,
    var weatherStateAbbr: String,
    var applicableDate: String,
    var minTemp: Float,
    var maxTemp: Float,
)