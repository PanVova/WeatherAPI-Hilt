package com.example.weatherapi.data

import com.example.weatherapi.data.model.CityResponse
import com.example.weatherapi.data.model.WeatherCityResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WeatherAPI {
    @GET("/api/location/search/?")
    suspend fun getListOfCities(@Query("query") query: String): List<CityResponse>

    @GET("/api/location/{location_id}/")
    suspend fun getCity(@Path("location_id") city: Int): WeatherCityResponse
}