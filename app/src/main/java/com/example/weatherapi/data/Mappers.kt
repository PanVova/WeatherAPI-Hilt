package com.example.weatherapi.data

import com.example.weatherapi.data.model.CityResponse
import com.example.weatherapi.data.model.DayResponse
import com.example.weatherapi.data.model.WeatherCityResponse
import com.example.weatherapi.domain.model.City
import com.example.weatherapi.domain.model.Day
import com.example.weatherapi.domain.model.WeatherCity

fun CityResponse.toDomain(): City {
    return City(
        name = name,
        lattLong = latt_long,
        id = woeid,
        locationType = location_type
    )
}

fun DayResponse.toDomain(): Day {
    return Day(
        weatherStateName,
        weatherStateAbbr,
        applicableDate,
        minTemp,
        maxTemp
    )
}

fun WeatherCityResponse.toDomain(): WeatherCity {
    return WeatherCity(
        consolidatedWeather = consolidated_weather.map { it.toDomain() },
        title = title
    )
}
