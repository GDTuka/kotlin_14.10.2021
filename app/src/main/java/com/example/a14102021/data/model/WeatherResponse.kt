package com.example.a14102021.data.model

data class WeatherResponse(
    val current_weather: CurrentWeather,
    val elevation: Double,
    val generationtime_ms: Double,
    val hourly: Hourly,
    val hourly_units: HourlyUnits,
    val latitude: Double,
    val longitude: Double,
    val utc_offset_seconds: Int
)