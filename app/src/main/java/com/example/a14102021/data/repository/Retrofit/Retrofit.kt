package com.example.a14102021.data.repository.Retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory




class Retrofitimp {
    val BaseUrl = "https://api.open-meteo.com/v1/forecast?latitude=55.54&longitude=37.55&hourly=temperature_2m"
    fun getRetrofit(): Retrofit? {
        val retrofit = Retrofit.Builder()
            .baseUrl(BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }

}