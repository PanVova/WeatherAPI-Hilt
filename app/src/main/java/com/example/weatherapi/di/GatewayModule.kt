package com.example.weatherapi.di

import com.example.weatherapi.data.WeatherAPI
import com.example.weatherapi.data.WeatherGatewayImpl
import com.example.weatherapi.domain.gateway.WeatherGateway
import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides

@Module
@ContributesTo(AppComponent::class)
class GatewayModule {
    @Provides
    fun provideWeatherGateway(weatherAPI: WeatherAPI): WeatherGateway = WeatherGatewayImpl(weatherAPI)
}