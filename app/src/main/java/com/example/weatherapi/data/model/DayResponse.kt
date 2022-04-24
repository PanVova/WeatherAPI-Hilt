package com.example.weatherapi.data.model

data class DayResponse(
    var weather_state_name: String,
    var weather_state_abbr: String,
    var applicable_date: String,
    var min_temp: Float,
    var max_temp: Float,
)

