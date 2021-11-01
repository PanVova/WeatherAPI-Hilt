package com.example.weatherapi.domain.gateway

import com.example.weatherapi.data.model.City
import com.example.weatherapi.data.model.WeatherCity

interface WeatherGateway {
    suspend fun getListOfCities(query: String): List<City>
    suspend fun getCity(city: Int): WeatherCity
}