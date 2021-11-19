package com.example.weatherapi.data

import com.example.weatherapi.data.model.City
import com.example.weatherapi.data.model.WeatherCity
import com.example.weatherapi.domain.gateway.WeatherGateway
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class WeatherGatewayImpl(private val weatherAPI: WeatherAPI) : WeatherGateway {
    override fun getListOfCities(query: String): Flow<List<City>> {
        return flow { emit(weatherAPI.getListOfCities(query)) }
    }

    override fun getCity(city: Int): Flow<WeatherCity> {
        return flow { emit(weatherAPI.getCity(city)) }
    }
}