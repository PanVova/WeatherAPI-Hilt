package com.example.weatherapi.data

import com.example.weatherapi.data.model.City
import com.example.weatherapi.data.model.WeatherCity
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WeatherAPI {
    @GET("/api/location/search/?")
    suspend fun getData(@Query("query") resourceName: String): List<City>

    @GET("/api/location/{location_id}/")
    suspend fun getCity(@Path("location_id") resourceName: Int): WeatherCity
}