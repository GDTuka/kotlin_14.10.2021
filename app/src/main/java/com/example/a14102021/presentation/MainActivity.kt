package com.example.a14102021.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a14102021.R
import com.example.a14102021.data.model.WeatherResponse
import com.example.a14102021.data.network.WeatherService
import com.example.a14102021.data.repository.Retrofit.Retrofitimp
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*

class MainActivity : AppCompatActivity() {

    val retrofitimp = Retrofitimp()

    val retrofit = retrofitimp.getRetrofit()
    val service = retrofit?.create(WeatherService::class.java)
    val call = service?.getCurrentWeather()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (call != null) {
            call.enqueue(object : Callback<WeatherResponse> {
                override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {
                    if (response.code() == 200) {
                        textView1.text = "Температура сейчас ${response.body().current_weather.temperature.toString()}"
                    }
                }
                override fun onFailure(call: Call<WeatherResponse>, t: Throwable) {

                }
            })
        }

    }

    }


