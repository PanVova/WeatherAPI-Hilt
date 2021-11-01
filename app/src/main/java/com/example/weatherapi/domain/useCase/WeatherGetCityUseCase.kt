package com.example.weatherapi.domain.useCase

import com.example.weatherapi.data.model.WeatherCity
import com.example.weatherapi.domain.gateway.WeatherGateway

class WeatherGetCityUseCase(private val weatherGateway: WeatherGateway) {
    suspend fun loadCity(city: Int): WeatherCity {
        return weatherGateway.getCity(city)
    }
}