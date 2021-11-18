package com.example.weatherapi.data

import com.example.weatherapi.data.model.City
import com.example.weatherapi.data.model.WeatherCity
import com.example.weatherapi.domain.gateway.WeatherGateway
import kotlinx.coroutines.flow.Flow

class WeatherGatewayImpl(private val weatherAPI: WeatherAPI): WeatherGateway {
    override suspend fun getListOfCities(query: String): List<City> {
        return weatherAPI.getListOfCities(query)
    }

    override suspend fun getCity(city: Int): WeatherCity {
        return weatherAPI.getCity(city)
    }
}