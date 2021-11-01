package com.example.weatherapi.presentation.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapi.domain.useCase.GetWeatherCitiesUseCase
import com.example.weatherapi.domain.useCase.GetWeatherCityUseCase
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SearchViewModel @Inject constructor(
    private val getWeatherCitiesUseCase: GetWeatherCitiesUseCase,
    private val getWeatherCityUseCase: GetWeatherCityUseCase
) : ViewModel() {

    private val _data = MutableLiveData<String>()
    val data: LiveData<String> = _data

    init {

    }
}


