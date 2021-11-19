package com.example.weatherapi.presentation.city

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapi.data.model.WeatherCity
import com.example.weatherapi.domain.useCase.GetWeatherCityUseCase
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CityViewModel @Inject constructor(
    private val getWeatherCityUseCase: GetWeatherCityUseCase
) : ViewModel() {


    private val _data = MutableLiveData<WeatherCity>()
    val data: LiveData<WeatherCity> = _data

    fun getCity(city: Int) {
        viewModelScope.launch {
            getWeatherCityUseCase.loadCity(city).collect {
                _data.postValue(it)
            }
        }

    }
}


