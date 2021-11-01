package com.example.weatherapi.presentation.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapi.data.model.City
import com.example.weatherapi.domain.useCase.GetWeatherCitiesUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SearchViewModel @Inject constructor(
    private val getWeatherCitiesUseCase: GetWeatherCitiesUseCase,
) : ViewModel() {

    private val _data = MutableLiveData<List<City>>()
    val data: LiveData<List<City>> = _data

    fun getCities(query: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val result = getWeatherCitiesUseCase.loadCities(query)
            _data.postValue(result)
        }
    }
}


