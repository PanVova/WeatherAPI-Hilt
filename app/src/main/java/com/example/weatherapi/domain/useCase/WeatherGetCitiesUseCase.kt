package com.example.weatherapi.domain.useCase

import com.example.weatherapi.data.model.City
import com.example.weatherapi.domain.gateway.WeatherGateway

class WeatherGetCitiesUseCase(private val weatherGateway: WeatherGateway) {
    suspend fun loadCities(query: String): List<City> {
        return weatherGateway.getListOfCities(query)
    }
}