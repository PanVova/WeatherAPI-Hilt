package com.example.weatherapi.presentation.city

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapi.domain.gateway.WeatherGateway
import com.example.weatherapi.domain.model.WeatherCity
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CityViewModel @Inject constructor(
    private val gateway: WeatherGateway,
) : ViewModel() {

    private val _data = MutableLiveData<WeatherCity>()
    val data: LiveData<WeatherCity> = _data

    fun getCity(city: Int) {
        viewModelScope.launch {
            gateway.getCity(city).collect {
                _data.postValue(it)
            }
        }
    }
}


