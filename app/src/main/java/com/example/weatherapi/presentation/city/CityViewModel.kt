package com.example.weatherapi.presentation.city

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapi.data.model.WeatherCity
import com.example.weatherapi.domain.useCase.GetWeatherCityUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CityViewModel @Inject constructor(
    private val getWeatherCityUseCase: GetWeatherCityUseCase
) : ViewModel() {

    private val _city = MutableLiveData<WeatherCity>()
    val city: LiveData<WeatherCity> = _city

    fun getCity(city: Int) {
        CoroutineScope(Dispatchers.IO).launch {
            val result = getWeatherCityUseCase.loadCity(city)
            _city.postValue(result)
        }
    }
}


