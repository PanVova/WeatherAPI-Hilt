package com.example.weatherapi.di

import com.example.weatherapi.data.WeatherAPI
import com.example.weatherapi.data.WeatherGatewayImpl
import com.example.weatherapi.domain.gateway.WeatherGateway
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class GatewayModule {
    @Provides
    fun provideWeatherGateway(weatherAPI: WeatherAPI): WeatherGateway =
        WeatherGatewayImpl(weatherAPI)
}