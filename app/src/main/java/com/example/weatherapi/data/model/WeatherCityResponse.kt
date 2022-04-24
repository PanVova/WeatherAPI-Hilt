package com.example.weatherapi.data.model

import com.google.gson.annotations.SerializedName

data class WeatherCityResponse(
    @SerializedName("consolidated_weather")
    var consolidated_weather: List<DayResponse>,
    @SerializedName("title")
    var title: String
)