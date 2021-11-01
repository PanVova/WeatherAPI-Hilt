package com.example.weatherapi.di

import com.example.weatherapi.domain.gateway.WeatherGateway
import com.example.weatherapi.domain.useCase.GetWeatherCitiesUseCase
import com.example.weatherapi.domain.useCase.GetWeatherCityUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCasesModule {
    @Singleton
    @Provides
    fun provideGetWeatherCityUseCase(weatherGateway: WeatherGateway): GetWeatherCityUseCase {
        return GetWeatherCityUseCase(weatherGateway)
    }

    @Singleton
    @Provides
    fun provideGetWeatherCitiesUseCase(weatherGateway: WeatherGateway): GetWeatherCitiesUseCase {
        return GetWeatherCitiesUseCase(weatherGateway)
    }
}
