package com.example.weatherapi.data.model

data class WeatherCityResponse(
    var consolidated_weather: List<DayResponse>,
    var title: String,
)