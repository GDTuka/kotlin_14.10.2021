package com.example.a14102021.data.model

data class CurrentWeather(
    val temperature: Double,
    val time: String,
    val weathercode: Int,
    val winddirection: Int,
    val windspeed: Double
)