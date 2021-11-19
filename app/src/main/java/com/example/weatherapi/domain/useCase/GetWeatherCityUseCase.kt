package com.example.weatherapi.domain.useCase

import com.example.weatherapi.data.model.WeatherCity
import com.example.weatherapi.domain.gateway.WeatherGateway
import kotlinx.coroutines.flow.Flow

class GetWeatherCityUseCase(private val weatherGateway: WeatherGateway) {
    fun loadCity(city: Int): Flow<WeatherCity> {
        return weatherGateway.getCity(city)
    }
}