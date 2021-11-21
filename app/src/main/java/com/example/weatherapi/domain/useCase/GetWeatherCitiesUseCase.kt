package com.example.weatherapi.domain.useCase

import com.example.weatherapi.data.model.City
import com.example.weatherapi.domain.gateway.WeatherGateway
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetWeatherCitiesUseCase @Inject constructor(private val weatherGateway: WeatherGateway) {
    fun loadCities(query: String): Flow<List<City>> {
        return weatherGateway.getListOfCities(query)
    }
}