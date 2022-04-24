package com.example.weatherapi.domain.model

data class WeatherCity(
    var consolidatedWeather: List<Day>,
    var title: String,
)