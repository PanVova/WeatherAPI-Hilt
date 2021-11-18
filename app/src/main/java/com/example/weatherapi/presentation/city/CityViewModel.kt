package com.example.weatherapi.presentation.city

import androidx.lifecycle.ViewModel
import com.example.weatherapi.data.model.WeatherCity
import com.example.weatherapi.domain.useCase.GetWeatherCityUseCase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CityViewModel @Inject constructor(
    private val getWeatherCityUseCase: GetWeatherCityUseCase
) : ViewModel() {

    fun getCity(city: Int): Flow<WeatherCity> = flow {
        val result = getWeatherCityUseCase.loadCity(city)
        emit(result)
    }
}


