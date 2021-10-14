package com.example.a14102021.data.network

import com.example.a14102021.data.model.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET

const val BASEURL = "https://api.open-meteo.com/v1/forecast?latitude=55.54&longitude=37.55&hourly=temperature_2m"

interface WeatherService{

    @GET("")
    fun getCurrentWeather(): Call<WeatherResponse>

}