package com.example.weatherapi.data

import com.example.weatherapi.di.AppScope
import com.example.weatherapi.domain.gateway.WeatherGateway
import com.example.weatherapi.domain.model.City
import com.example.weatherapi.domain.model.WeatherCity
import com.squareup.anvil.annotations.ContributesBinding
import com.squareup.anvil.annotations.ContributesTo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@ContributesBinding(AppScope::class)
class WeatherGatewayImpl @Inject constructor(
        private val weatherAPI: WeatherAPI
) : WeatherGateway {
    override fun getListOfCities(query: String): Flow<List<City>> {
        return flow {
            emit(
                    weatherAPI.getListOfCities(query).map { cityResponse ->
                        cityResponse.toDomain()
                    }
            )
        }
    }

    override fun getCity(city: Int): Flow<WeatherCity> {
        return flow {
            emit(
                    weatherAPI.getCity(city).toDomain()
            )
        }
    }
}