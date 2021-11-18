package com.example.weatherapi.presentation.search

import androidx.lifecycle.ViewModel
import com.example.weatherapi.data.model.City
import com.example.weatherapi.domain.useCase.GetWeatherCitiesUseCase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SearchViewModel @Inject constructor(
    private val getWeatherCitiesUseCase: GetWeatherCitiesUseCase,
) : ViewModel() {

    fun getCities(query: String): Flow<List<City>> {
        val flow = flow {
            val result = getWeatherCitiesUseCase.loadCities(query)
            emit(result)
        }
        return flow
    }
}


