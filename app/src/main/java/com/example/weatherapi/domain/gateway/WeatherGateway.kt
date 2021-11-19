package com.example.weatherapi.domain.gateway

import com.example.weatherapi.data.model.City
import com.example.weatherapi.data.model.WeatherCity
import kotlinx.coroutines.flow.Flow

interface WeatherGateway {
     fun getListOfCities(query: String): Flow<List<City>>
     fun getCity(city: Int): Flow<WeatherCity>
}