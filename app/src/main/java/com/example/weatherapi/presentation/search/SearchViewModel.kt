package com.example.weatherapi.presentation.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapi.domain.gateway.WeatherGateway
import com.example.weatherapi.domain.model.City
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SearchViewModel @Inject constructor(
    private val gateway: WeatherGateway,
) : ViewModel() {

    private val _data = MutableLiveData<List<City>>()
    val data: LiveData<List<City>> = _data

    fun getCities(query: String) {
        viewModelScope.launch {
            gateway.getListOfCities(query)
                .catch {
                    Timber.e(it)
                }
                .collect {
                    _data.postValue(it)
                }
        }
    }
}


